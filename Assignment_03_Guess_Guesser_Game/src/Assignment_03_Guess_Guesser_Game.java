import java.util.*;
//creating Guesser class
class Guesser
{
   int GuessNumber;
   int GuessNumber()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Guesser kindly Guess A Number: ");
	   int n=sc.nextInt();
	   GuessNumber=n;
	   return GuessNumber;
   }
}  
//creating A player class
class Player 
{
   int GuessNumber;
   int GuessNumber()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Player kindly Guess A Number: ");
	   int n=sc.nextInt();
	   GuessNumber=n;
	   return GuessNumber;
   }
}  
//creating an umpire class
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;     
	int numFromPlayer2;
	int numFromPlayer3;
// for storing number from guesser	
	void collectFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.GuessNumber();
	}
	// for storing number from player1		
	void numFromPlayer1()
	{
		Player p=new Player();
		numFromPlayer1=p.GuessNumber();
	}
	// for storing number from player2	
	void numFromPlayer2()
	{
		Player p=new Player();
		numFromPlayer2=p.GuessNumber();
	}
	// for storing number from player2
	void numFromPlayer3()
	{
		Player p=new Player();
		numFromPlayer3=p.GuessNumber();
	}
	// for comparing numbers and looping until atleast one players win
	void compare() 
	{
		if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
		{
			System.out.println("All Players Are Winner");
		}
		else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2 )
		{
			System.out.println("Player1 & Player2 Are Winner");
		}
		else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer3 )
		{
			System.out.println("Player1 & Player3 Are Winner");
		}
		else if(numFromGuesser==numFromPlayer1 )
		{
			System.out.println("Player1 Is The Winner");
		}
		else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 )
		{
			System.out.println("Player2 & Player3 Are Winner");
	    }
		else if(numFromGuesser==numFromPlayer2  )
		{
			System.out.println("Player2 is Winner");
	    }
		else if(numFromGuesser==numFromPlayer3  )
		{
			System.out.println("Player3 is Winner");
	    }
		else if(numFromGuesser!=numFromPlayer1 && numFromGuesser!=numFromPlayer2 && numFromGuesser!=numFromPlayer3)
		{
			System.out.println("All Players lost The Game");
			System.out.println("Replay The Game");
			collectFromGuesser();// again calling methods to store and compare numbers until atleast one player  wins
			numFromPlayer1();
			numFromPlayer2();
			numFromPlayer3();
			compare();
	    }
}
	
}

public class Assignment_03_Guess_Guesser_Game {

	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.collectFromGuesser();
		u.numFromPlayer1();
		u.numFromPlayer2();
		u.numFromPlayer3();
		u.compare();
		
	}

}
