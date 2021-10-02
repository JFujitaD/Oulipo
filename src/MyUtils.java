import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public abstract class MyUtils{
	private static ArrayList<String> words = new ArrayList<>();
	
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
			StringTokenizer tokenizer = new StringTokenizer(sb.toString(), " ");
			while(tokenizer.hasMoreTokens()) {
				String word = tokenizer.nextToken();
				words.add(word.toLowerCase().replaceAll("[.,\\-';]", ""));
			}
			
			// Sort the words by length
			words.sort(new MyStringComparator());
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
		
	}
}
