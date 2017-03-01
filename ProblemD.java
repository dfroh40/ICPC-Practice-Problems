import java.util.ArrayList;
import java.util.Scanner;

public class ProblemD {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int inputs = console.nextInt();
		for (int i = 0; i < inputs; i++) {
			double ingred = console.nextInt();
			double port = console.nextInt();
			double des = console.nextInt();
			ArrayList<Ingredient> list = new ArrayList<Ingredient>();
			Ingredient main = new Ingredient();
			for (int j = 0; j < ingred; j++) {
				String name = console.next();
				double weight = console.nextDouble();
				double percent = console.nextDouble();
				Ingredient next = new Ingredient(name, weight, percent);
				list.add(next);
				if(next.percent == 100.0) {
					main = next;
				}
			}
			double scalingFactor = des/port;
			main.weight *= scalingFactor;
			for(Ingredient j: list) {
				if(!j.equals(main)) {
					j.weight = j.percent * main.weight/100;
				}
			}
			System.out.println("Recipe # " + (i+1));
			for(int k = 0; k < list.size(); k++) {
				System.out.print(list.get(k).name + " ");
				System.out.printf("%.1f", list.get(k).weight);
				System.out.println();
			}
			for(int l = 0; l < 40; l++) {
				System.out.print("-");
			}
			System.out.println();
		}
		console.close();
	}
}
