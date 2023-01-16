import java.util.Scanner;

public class Looping {
	
	public void Demo()
	{
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Table Number You Want");
		
		int table= scan.nextInt();
		
		switch(table) {
		
		case 1 : 
			
			System.out.println("Table of 1 ");
			int i=1;
			do{
				System.out.println("->" + i*1);
				i++;
			
		}
			while(i<=10);
			break;
			
		case 2:
			System.out.println("Table of 2 ");
			int j=1;
			do{
				System.out.println("->" + j*2);
				j++;
			
		}
			while(j<=10);
			break;
			
		case 3:
			System.out.println("Table of 3 ");
			int h=1;
			do{
				System.out.println("->" + h*3);
				h++;
			
		}
			while(h<=10);
			break;
		case 4:
			System.out.println("Table of 4 ");
			int c=1;
			do{
				System.out.println("->" + c*4);
				c++;
			
		}
			while(c<=10);
			break;
			
		case 5:
			System.out.println("Table of 5 ");
			int d=1;
			do{
				System.out.println("->" + d*5);
				d++;
			
		}
			while(d<=10);
			break;
			
		case 6:
			System.out.println("Table of 6 ");
			int e=1;
			do{
				System.out.println("->" + e*6);
				e++;
			
		}
			while(e<=10);
			break;
			
		case 7:
			System.out.println("Table of 7 ");
			int f=1;
			do{
				System.out.println("->" + f*7);
				f++;
			
		}
			while(f<=10);
			break;
			
		case 8:
			System.out.println("Table of 8 ");
			int g=1;
			do{
				System.out.println("->" + g*8);
				g++;
			
		}
			while(g<=10);
			break;
		case 9:
			System.out.println("Table of 9 ");
			int x=1;
			do{
				System.out.println("->" + x*9);
				x++;
			
		}
			while(x<=10);
			break;
			
		case 10:
			System.out.println("Table of 10 ");
			int y=1;
			do{
				System.out.println("->" + y*10);
				y++;
			
		}
			while(y<=10);	
			break;
		default:
			System.out.println("You Enter the Wrong Value");
			
		}
		}

}
