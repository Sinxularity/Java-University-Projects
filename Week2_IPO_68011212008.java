import java.util.Scanner;

class Work2_IPO_68011212008
{
	public static void main(String[] args) 
	{
		double pi=3.14159265358979,weight,lenght,pay,area,fence,radius,circle,rectangle;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Input Weight : ");
		weight=scan.nextDouble();
		
		System.out.print("Input Lenght : ");
		lenght=scan.nextDouble();
		
		radius=weight/2;
		circle=pi*(radius*radius);
		rectangle=lenght*weight;
		area=circle+rectangle;
		pay=area*25.25;
		fence=(2*(pi*radius))+(lenght*2);
		
		System.out.println("===================");
		System.out.printf("Lenght : "+"%d\n",(int)lenght);
		System.out.printf("Weight : "+"%d\n",(int)weight);
		System.out.printf("Area : "+"%.7f\n",(float)area);
		System.out.printf("Pay : "+"%.7f\n",(float)pay);
		System.out.printf("Fence : "+"%.5f\n",(float)fence);
		
	}
}
