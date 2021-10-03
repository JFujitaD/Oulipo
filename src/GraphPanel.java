import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphPanel extends JPanel{
	private final Color PANEL_BACKGROUND = Color.DARK_GRAY;
	
	public GraphPanel() {
		this.setBackground(PANEL_BACKGROUND);
		
		// Process the file and sort the words into an array list
		MyUtils.processFile("static/poem.txt");
		
		this.setPreferredSize(MyUtils.getPreferredSize());
		
		// For command line usage only
		MyUtils.printSortedWords();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Hand off drawing to MyUtils
		MyUtils.drawGraph(g);
		
		
	}
	
}
