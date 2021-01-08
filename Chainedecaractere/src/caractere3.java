import java.util.Scanner;
/*
*Author : riannasmuk7-Jan-2021
*Date : 7-Jan-2021
*/


public class caractere3
	{

		public static void main(String[] args)
			{
				
				
				int n, counter = 0;
				String a= new String ();
		        String b= new String();
			
				
				Scanner sc = new Scanner(System.in);
				n=sc.nextInt();
				a=sc.nextLine();
				b=sc.nextLine();
				
				
		
			for (int i = 0; n < b.length(); ++i) 
			{
				if(a.charAt(i) == b.charAt(i) && a.charAt(i) == 'C')
				{
					++counter;
				}
			}
		        
			System.out.println(counter);
	

	}

	}
