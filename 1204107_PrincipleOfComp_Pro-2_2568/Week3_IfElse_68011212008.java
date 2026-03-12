import java.util.Scanner;

class Week3_IfElse_68011212008
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int market_value;
		double rice,sell_rice,TON_rice,requit,all_money,original=15;;
		
		System.out.print("Input Market Value : ");
		market_value=scan.nextInt();
		
		System.out.print("Input Rice Total (TON): ");
		rice=scan.nextDouble();
		
		TON_rice=rice*1000;
		sell_rice=TON_rice*market_value;
		
		if(market_value>15)
		{
			requit=TON_rice*0.0073;
		}
		else
		{
			requit=TON_rice*3.25;
		}
		all_money=requit+sell_rice;
		
		System.out.println("====================================");
		System.out.printf("%-9s %20.2f TON\n","Rice Total",rice);
		System.out.println("************************************");
		System.out.printf("%-9s %26s\n","ITEM","BTH.");
		System.out.printf("%-9s %19.3f\n","Insurance price",original);
		System.out.printf("%-9s %22.3f\n","Market Value",(double)market_value);
		System.out.printf("%-9s %22.3f\n","Selling Rice",sell_rice);
		System.out.printf("%-9s %22.3f\n","Requit Value",requit);
		System.out.printf("%-9s %25.3f\n","All Money",all_money);
	}
}