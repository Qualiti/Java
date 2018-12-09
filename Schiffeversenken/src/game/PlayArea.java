package game;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlayArea extends JPanel{
	private static final long serialVersionUID = 1L;
	private int padding;
	private JFrame window;

	public PlayArea(JFrame mainWindow, int dist) {
		window = mainWindow;
		padding = dist;
		
		Dimension wSize = window.getSize();
		this.setLocation(padding, padding);
		this.setSize(wSize.width - padding, wSize.height - padding);
	}
}
