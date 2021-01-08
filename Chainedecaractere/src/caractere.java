import java.util.Scanner;
/*
 *Author : Rianna Smuk
 *Date : 6-Jan-2021
 */
public class caractere
{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Combien de 3 point est ce que les Ananas ont marquer ?");
				int A3=sc.nextInt();
				System.out.println("Combien de 2 point est ce que les Ananas ont marquer ?");
				int A2=sc.nextInt();
				System.out.println("Combien de 1 point est ce que les Ananas ont marquer ?");
				int A1=sc.nextInt();
				System.out.println("Combien de 3 point est ce que les Bananes ont marquer ?");
				int B3=sc.nextInt();
				System.out.println("Combien de 2 point est ce que les Bananes ont marquer ?");
				int B2=sc.nextInt();
				System.out.println("Combien de 1 point est ce que les Bananes ont marquer ?");
				int B1=sc.nextInt();
				int sommeA=(A3 * 3)+(A2 * 2)+(A1);
				int sommeB=(B3 * 3)+(B2 * 2)+(B1);
				if(sommeA<sommeB) {System.out.println("B");}
				else
					if(sommeA>sommeB) {System.out.println("A");}
					else
						if(sommeA==sommeB) {System.out.println("T");}
			}

}

