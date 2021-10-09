
public class Bar {
	private static int count = 0;
	
	public String word;
	public int x;
	public int y;
	public int width;
	public int height;
	public int id;
	
	public Bar(String word, int x, int y, int width, int height) {
		this.word = word;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		this.id = ++count;
	}
}
