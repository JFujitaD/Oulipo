import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	private Color PANEL_BACKGROUND = Color.BLACK;
	
	public MyPanel() {
		this.setBackground(PANEL_BACKGROUND);
		
		MyUtils.processFile("static/poem.txt");
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Hand off drawing to FileUtils
		MyUtils.drawCurve(g);
	}
	
}
