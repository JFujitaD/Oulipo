import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WordPanel extends JPanel{
	private static JLabel label = new JLabel("----------");
	private final Color PANEL_BACKGROUND = Color.BLACK;
	private final Font FONT = new Font("Sans-Serif", Font.BOLD, 32);
	private final int PANEL_HEIGHT = 50;

	
	public WordPanel() {
		this.setPreferredSize(new Dimension(MyUtils.getPreferredSize().width, PANEL_HEIGHT));
		this.setBackground(PANEL_BACKGROUND);
		
		// Label
		label.setFont(FONT);
		
		this.add(label);
	}
	
	public static void relabel(String word) {
		label.setText(word);
	}
}
