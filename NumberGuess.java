package numberguess;
import java.util.*;
class NumberGuess
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		Random rand= new Random();
		int attempt,MaxAttempt=10,num,Gnum,score=0;
		char ch;
		do {
			System.out.println("I have Choosen the number.");
			num=rand.nextInt(1,100);
			for(attempt=1;attempt<=MaxAttempt;attempt++)
			{
				System.out.println("Guess the Number:");
				Gnum=sc.nextInt();
				if(Gnum==num)
				{
					System.out.println("\uD83C\uDF89");
					System.out.println("Congratulations!You Guessed the number in "+attempt+" attempts");
					score+=(MaxAttempt*2)-attempt+1;
					break;
				}
				else if (num>Gnum)
				{
					System.out.println("Too Low.Try Again!");
					System.out.println("\uD83D\uDE41");
				}
				else
				{
					System.out.println("Too High.Try Again!");
					System.out.println("\uD83D\uDE41");
				}
			}
			if(attempt==MaxAttempt+1)
			{
				System.out.println("Sorry,You have used all your attempts.");
				System.out.println("\uD83D\uDE41");
			}
			System.out.println("Do you want to play again?(Y/N)");
			ch=sc.next().charAt(0);
			if(ch=='N'||ch=='n')
			{
				break;
			}
		}while(true);
		System.out.println("Game Over!");
		System.out.println("Score:"+score);
		sc.close();
	}
}