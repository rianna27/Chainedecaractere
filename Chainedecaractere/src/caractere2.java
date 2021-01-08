import java.util.Scanner;
/*
*Author : Rianna Smuk 
*Date : 6-Jan-2021
*/
public class caractere2
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int line=sc.nextInt();
				
				for (int i = 0; i < line; i++) 
				{
					System.out.println("Ecris un entier positif inferieur à 80, suivi d’un espace, suivi d’un caractere autre qu’un espace. ");
					int a=sc.nextInt();
					String s=sc.next();
					
				for (int j = 0; j< a; j++) 
				{
					System.out.print(s);
				}
				
			}

	}
}

