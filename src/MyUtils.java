import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public abstract class MyUtils{
	private static Dimension panelDimensions = new Dimension();
	private static ArrayList<String> words = new ArrayList<>();
	private static HashMap<String, Color> colorMap = new HashMap<>();
	
	// Customize bar-width, max bar-height, and the seed for the random colors
	private final static int BAR_WIDTH = 10;
	private final static int MAX_BAR_HEIGHT = 800;
	private final static long SEED = 123456;
	
	public static void processFile(String fileName) {
		try {
			// Get a handle on the file
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			// Read the file line by line
			StringBuilder sb = new StringBuilder();
			String line;
			while(( line = br.readLine()) != null) {
				sb.append(line);
			}
			
			// Extract the words out of the lines
			String[] splitWords = sb.toString().split("[ .,\\\"':;?!\\n]");
			Random r = new Random(SEED);
			for(String word : splitWords) {
				if(word.length() != 0) {
					words.add(word.toLowerCase());
					
					if(colorMap.get(word) == null)
						colorMap.put(word, new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
				}
			}
			
			// Sort the words by length
			words.sort(new StringLengthComparator());
		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void printSortedWords() {
		for(String word : words) {
			System.out.println(word);
		}
	}

	public static void drawCurve(Graphics g) {
		int maxWordLength = words.get(words.size() - 1).length();
		float ratio = MAX_BAR_HEIGHT / maxWordLength;
		
		Point currentP = new Point(0, 0);
		for(String word : words) {
			int barHeight = (int) (word.length() * ratio);
			currentP.y = MAX_BAR_HEIGHT - barHeight;
			
			g.setColor(colorMap.get(word));
			g.fillRect(currentP.x, currentP.y, BAR_WIDTH, barHeight);
			g.setColor(Color.BLACK);
			g.drawRect(currentP.x, currentP.y, BAR_WIDTH, barHeight);
			
			currentP.x += BAR_WIDTH;
		}
	}

	public static Dimension getPreferredSize() {
		return new Dimension(BAR_WIDTH * words.size(), MAX_BAR_HEIGHT);
	}

	public static ArrayList<String> getSortedWords() {
		return words;
	}
	
}
