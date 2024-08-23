import java.util.Scanner;
public class Tarefa1 
{
	public static int Soma ( int x, int y )
	{
		return x + y;
	}
	public static void main ( String[] args )
	{
		Scanner scanf = new Scanner ( System.in );
		System.out.println ( "Digite o primeiro numero: " );
		int s1 = scanf.nextInt ( );
		System.out.println ( "Digite o segundo numero: " );
		int s2 = scanf.nextInt ( );
		System.out.println ( "Soma: " + Soma );
	}
}