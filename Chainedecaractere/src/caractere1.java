import java.util.Scanner;
/*
*Author : Rianna Smuk
*Date : 7-Jan-2021
*/
public class caractere1
	{

		public static void main(String[] args)
			{
                Scanner sc=new Scanner(System.in);
                String nom= sc.nextLine();
				char [] a=nom.toCharArray();
				int cpt=0;
				int count=0;
				for (int i = 0; i < a.length; i++) 
				{
					if((a[i]==':')&&(a[i+1]=='-')&&(a[i+2]==')'))
					cpt++;
				}
				
				for (int i = 0; i < a.length; i++) 
				{
					if((a[i]==':')&&(a[i+1]=='-')&&(a[i+2]=='('))
						count++;
				}
				
				if(count<cpt)
					System.out.println("Joyeuses");
				else 
					if(count>cpt)
						System.out.println("Triste");
					else
						if((count==cpt)&& (count>0))
							System.out.println("Incertaine");
						else
							System.out.println("Aucune");
				
				sc.close();
				
				
				
				

			}

	}

