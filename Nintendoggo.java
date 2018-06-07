import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Nintendoggo {
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, imagePanel, menuPanelPts, menuPanelName;
	JLabel titleNameLabel, mainTextLabel, imageLabel, dogNameLabel, dogNewlyNamed, pointsLabel, pointsLabelNumber;
	Font titleFont = new Font("Bradley Hand", Font.PLAIN, 70);
	Font normalFont = new Font("Bradley Hand", Font.PLAIN, 28);
	JButton startButton, choice1, choice2, choice3, choice4;
	ImageIcon image;

	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();


	public static void main(String[] args) {
		new Nintendoggo();
	}
	public Nintendoggo(){
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.lightGray);
		window.setLayout(null);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 250);
		titleNamePanel.setBackground(Color.lightGray);
		titleNameLabel = new JLabel("nintendoggo!");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);	
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.lightGray);
		
		startButton = new JButton("bark");
		startButton.setBackground(Color.lightGray);
		startButton.setForeground(Color.black);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		window.setVisible(true);

	}
	public void createGameScreen() {
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(200, 15, 400, 80);
		mainTextPanel.setBackground(Color.lightGray);
		mainTextLabel = new JLabel("adopt a pupper!");
		mainTextLabel.setForeground(Color.white);
		mainTextLabel.setFont(new Font("Bradley Hand", Font.PLAIN, 50));
		con.add(mainTextPanel);
		mainTextPanel.add(mainTextLabel);

		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(50, 450, 700, 40);
		choiceButtonPanel.setBackground(Color.lightGray);
		choiceButtonPanel.setLayout(new GridLayout(1,4));
		con.add(choiceButtonPanel);

		choice1 = new JButton("corgi");
		choice1.setBackground(Color.lightGray);
		choice1.setForeground(Color.black);
		choice1.setFont(normalFont);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);

		choice2 = new JButton("pug");
		choice2.setBackground(Color.lightGray);
		choice2.setForeground(Color.black);
		choice2.setFont(normalFont);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);

		choice3 = new JButton("samoyed");
		choice3.setBackground(Color.lightGray);
		choice3.setForeground(Color.black);
		choice3.setFont(normalFont);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		
		choice4 = new JButton("husky");
		choice4.setBackground(Color.lightGray);
		choice4.setForeground(Color.black);
		choice4.setFont(normalFont);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);

		imagePanel = new JPanel();
		imagePanel.setBounds(50, 100, 700, 300);
		imagePanel.setBackground(Color.lightGray);
		imageLabel = new JLabel();
		image = new ImageIcon("crogi.png");
		imageLabel.setIcon(image);
		imagePanel.add(imageLabel);
		con.add(imagePanel);
		
	}
	public void playerSetup(String dogChosen) {
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		// *****************imagePanel: change images to only the chosen dog
		choiceButtonPanel.setVisible(false);

		mainTextPanel.remove(mainTextLabel);
		mainTextPanel.setBounds(100, 15, 600, 80);
		mainTextLabel = new JLabel("give your new " + dogChosen + " a name!");
		mainTextLabel.setForeground(Color.white);
		mainTextLabel.setFont(new Font("Bradley Hand", Font.PLAIN, 40));
		mainTextPanel.add(mainTextLabel);

		JTextField nameTextField = new JTextField(20);
		nameTextField.setBounds(250, 450, 300, 40);
		con.add(nameTextField);

		nameTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String input = nameTextField.getText();
				newlyNamed(input);
			}
		});

	}
	public void newlyNamed(String dogNewlyNamed) {
		titleNamePanel.setVisible(true);
		startButtonPanel.setVisible(false);
		choiceButtonPanel.setVisible(false);
		mainTextPanel.setVisible(false);

		/* cover up the TextField with titleNamePanel */
		titleNamePanel.setBounds(250, 450, 300, 40);
		titleNamePanel.setBackground(Color.lightGray);
		titleNameLabel.setText("");

		//********************imagePanel: a single dog

		menuPanelPts = new JPanel();
		menuPanelPts.setBounds(5, 5, 100, 80);
		menuPanelPts.setBackground(Color.red);

		menuPanelName = new JPanel();
		menuPanelName.setBounds(695, 5, 100, 80);
		menuPanelName.setBackground(Color.red);


	}
	public class TitleScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			createGameScreen();
		}
	}
	public class ChoiceHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String dogChoice = event.getActionCommand();
			if (dogChoice.equals("c1")) {
				playerSetup("corgi");
			}
			if (dogChoice.equals("c2")) {
				playerSetup("pug");
			}
			if (dogChoice.equals("c3")) {
				playerSetup("samoyed");
			}
			if (dogChoice.equals("c4")) {
				playerSetup("husky");
			}
		}
	}

}
