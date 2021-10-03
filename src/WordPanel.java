import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WordPanel extends JPanel{
	private final int PANEL_WIDTH = 250;
	
	public WordPanel(ArrayList<String> words) {
		this.setPreferredSize(new Dimension(PANEL_WIDTH, MyUtils.getPreferredSize().height));
		
		// Text area
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("monospaced", Font.BOLD, 18));
		textArea.append("----------");
		for(String word : MyUtils.getSortedWords()) {
			textArea.append("\n" + word);
		}
		
		textArea.setPreferredSize(new Dimension(PANEL_WIDTH, MyUtils.getPreferredSize().height));
		this.add(textArea);
		
		// Scroll pane
		JScrollPane scrollPane = new JScrollPane(textArea);
		this.add(scrollPane);
	}
}
