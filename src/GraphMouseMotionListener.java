import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class GraphMouseMotionListener implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {
		Bar b = MyUtils.getBar(e.getPoint());
		
		if(b != null) {
			System.out.println(b.word);
		}
	}

	

}
