package game;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JButton;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Frame() {
		// Main options
		this.setTitle("Schiffeversenken");
		this.setSize(1280, 720);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setContentPane(new JPanel());
		this.setLayout(null);
		this.setResizable(false);
		
		// Listeners
		this.addMouseListener(new MouseHandler());
		
		// PlayArea
		//this.setContentPane(playField);
		PlayArea playField = new PlayArea(this, 100);
		this.getContentPane().add(playField);
		
		playField.setBackground(Color.yellow);
		
		// Buttons
		
	}
	
	
}
