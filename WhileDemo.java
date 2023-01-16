import java.util.Scanner;

public class WhileDemo extends Looping {
	
	
	public void demo2()
	{
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Table Number You Want");
		
		int table = scan.nextInt();
		
switch(table) {
		
		case 11 : 
			System.out.println("Table of 11 ");
			int a=1;
			while (a<=10) {
				System.out.println("-->"+ a*11);
				a++;
			}
				break;
				
		case 12 : 
				System.out.println("Table of 12 ");
				int b=1;
				while (b<=10) {
					System.out.println("-->"+ b*12);
					b++;
				}
					break;	
		case 13 : 
			System.out.println("Table of 13 ");
			int c=1;
			while (c<=10) {
				System.out.println("-->"+ c*13);
				c++;
			}
				break;	
		case 14 : 
			System.out.println("Table of 14 ");
			int d=1;
			while (d<=10) {
				System.out.println("-->"+ d*14);
				d++;
			}
				break;		
				
		case 15 : 
			System.out.println("Table of 15 ");
			int e=1;
			while (e<=10) {
				System.out.println("-->"+ e*15);
				e++;
			}
				break;	
			default :
				System.out.println("You Enter Wrong Value");
			}

	
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		WhileDemo d1 = new WhileDemo();
		
		   
		d1.Demo();
	    d1.demo2();
		
	}
}


