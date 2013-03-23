
// Programmer name: Zolisa Welani

public class GuessGame{

	public static void main(String[] args){

	}
	
	public void input(){
		// Onke name the secret number with a variable secret;
		int lowerbound, upperbound;
		Scanner input = new Scanner(System.in);

		System.out.println("Guess the number between 1 and 500");
		int attempt = new input.nextInt();

		if (attempt == secret){
			System.out.println("You very good buddy! Your guess is correct.");
		}
		else{
			if (attempt < secret){
				System.out.println("The number you have entered is lower than the secret number");		
				lowerbound  = attempt;			
				tryAgain(lowerbound);			
			}
			if (attempt > secret){
				System.out.println("The number you have entered is higher than the secret number");
				upperbound = attempt;
				tryAgain(upperbound);			
			}
			
		}

	}

	public void tryAgain(int bound){
		System.out.println("Guess the number between ");
	}

}
