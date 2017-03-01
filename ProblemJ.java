import java.util.HashSet;
import java.util.Scanner;

public class ProblemJ {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int inputs = console.nextInt();
		for (int i = 0; i < inputs; i++) {
			HashSet<String> uniques = new HashSet<String>();
			int num = console.nextInt();
			for(int j = 0; j < num; j++) {
				uniques.add(console.next());
			}
			System.out.println(uniques.size());
		}
		console.close();
	}
}