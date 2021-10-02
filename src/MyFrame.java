import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private final String FRAME_TITLE = "Oulipo";
	private final Dimension FRAME_DIMENSIONS = new Dimension(1000, 800);
	
	public MyFrame() {
		this.setTitle(FRAME_TITLE);
		this.setSize(FRAME_DIMENSIONS);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		this.show();
	}

	public static void main(String[] args) { new MyFrame(); }

}
