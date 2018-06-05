import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Nintendoggo {
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Bradley Hand", Font.PLAIN, 70);
	Font normalFont = new Font("Arial", Font.PLAIN, 28);
	JButton startButton;
	// JTextArea mainTextArea;
	
	// TitleScreenHandler tsHandler = new TitleScreenHandler();
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
		
		startButton = new JButton("START");
		startButton.setBackground(Color.lightGray);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		// startButton.addActionListener(tsHandler);
		// startButton.setFocusPainted(false);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		window.setVisible(true);

	}

}