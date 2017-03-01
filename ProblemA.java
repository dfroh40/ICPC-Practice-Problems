import java.util.*;

public class ProblemA {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		ArrayList<String> winners = new ArrayList<String>(cases);
		for(int i = 0; i < cases; i++){
			int inputs = input.nextInt();
			int sum = 0;
			int max = 0;
			int candidateNum = 0;
			boolean multWin = false;
			for(int j = 0; j < inputs; j++){
				int votes = input.nextInt();
				sum += votes;
				if(votes > max){
					max = votes;
					candidateNum = j + 1;
					multWin = false;
				} else if(max == votes){
					multWin = true;
				}
			}
			if(multWin){
				winners.add("no winner");
			} else if(((1.0 * max)/sum) > 0.5){
				winners.add("majority winner " + candidateNum);
			} else {
				winners.add("minority winner " + candidateNum);
			}
		}
		for(String i : winners){
			System.out.println(i);
		}
		input.close();
	}
}
