import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Nintendoggo {
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Bradley Hand", Font.PLAIN, 70);
	Font normalFont = new Font("Bradley Hand", Font.PLAIN, 28);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	// ChoiceHandler choiceHandler = new ChoiceHandler();


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
		// startButton.setFocusPainted(false);
		
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
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);

		mainTextArea = new JTextArea();
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);

		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(50, 450, 700, 40);
		choiceButtonPanel.setBackground(Color.lightGray);
		choiceButtonPanel.setLayout(new GridLayout(1,4));
		con.add(choiceButtonPanel);

		choice1 = new JButton("corgi");
		choice1.setBackground(Color.lightGray);
		choice1.setForeground(Color.black);
		choice1.setFont(normalFont);
		choiceButtonPanel.add(choice1);

		choice2 = new JButton("pug");
		choice2.setBackground(Color.lightGray);
		choice2.setForeground(Color.black);
		choice2.setFont(normalFont);
		choiceButtonPanel.add(choice2);

		choice3 = new JButton("samoyed");
		choice3.setBackground(Color.lightGray);
		choice3.setForeground(Color.black);
		choice3.setFont(normalFont);
		choiceButtonPanel.add(choice3);
		
		choice4 = new JButton("husky");
		choice4.setBackground(Color.lightGray);
		choice4.setForeground(Color.black);
		choice4.setFont(normalFont);
		choiceButtonPanel.add(choice4);
		
	}
	public class TitleScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			createGameScreen();
		}
	}

}