import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private final String FRAME_TITLE = "Oulipo";
	
	public MyFrame() {
		this.setTitle(FRAME_TITLE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.add(new GraphPanel(), BorderLayout.CENTER);
		//this.add(new WordPanel(MyUtils.getSortedWords()), BorderLayout.WEST);
		
		this.pack();
		this.show();
	}

	public static void main(String[] args) { new MyFrame(); }

}
