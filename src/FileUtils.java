import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public abstract class FileUtils{
	private static ArrayList<String> words = new ArrayList<>();
	
	public static void processFile(String fileName) {
		try {
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			StringBuilder sb = new StringBuilder();
			String line;
			while(( line = br.readLine()) != null) {
				sb.append(line);
			}
			
			StringTokenizer tokenizer = new StringTokenizer(sb.toString(), " ");
			while(tokenizer.hasMoreTokens()) {
				words.add(tokenizer.nextToken());
			}
		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
