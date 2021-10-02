import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	private final Color PANEL_BACKGROUND = Color.LIGHT_GRAY;
	private final Color BAR_BACKGROUND = Color.BLUE;
	
	public MyPanel() {
		this.setBackground(PANEL_BACKGROUND);
		
		MyUtils.processFile("static/poem.txt");
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Hand off drawing to MyUtils
		MyUtils.drawCurve(g, BAR_BACKGROUND);
	}
	
}
