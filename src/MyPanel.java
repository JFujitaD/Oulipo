import java.awt.Color;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	private Color PANEL_BACKGROUND = Color.BLACK;
	
	public MyPanel() {
		this.setBackground(PANEL_BACKGROUND);
		
		FileUtils.processFile("static/poem.txt");
	}
}
