import java.util.Comparator;

public class MyStringComparator implements Comparator<String>{
	@Override
	public int compare(String a, String b) {
		if(a.length() < b.length())
			return -1;
		else if(a.length() > b.length())
			return 1;
		else
			return 0;
	}
}