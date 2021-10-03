import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private final String FRAME_TITLE = "Oulipo";
	
	public MyFrame() {
		this.setTitle(FRAME_TITLE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(new MyPanel());
		
		this.pack();
		this.show();
	}

	public static void main(String[] args) { new MyFrame(); }

}
