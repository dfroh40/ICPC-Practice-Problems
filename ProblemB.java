import java.util.Scanner;

public class ProblemB {
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int inputs = console.nextInt();
		for(int i = 0; i < inputs; i++){
			Card c = new Card(1,2);
		}
	}
	
	public class Card {
		public int p;
		public int q;
		
		public Card(int p, int q){
			this.p = p;
			this.q = q;
		}
		
		public boolean compareTo(Card c) {
			return (this.p == c.p || this.q == c.q);
		}
		
		public boolean playable() {
			
		}
	}
}
