import java.util.Scanner;

class Week5_Loop1_68011212008
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		String grade;
		int num,ig=0,unit=0,ig_unit=0,sum_u=0,sum_igu=0,j;
		double gpax;
		
		System.out.print("Input N : ");
		num=scan.nextInt();
		
		
		
		for (j=1;j<=num;j=j+1)
		{
		System.out.print("Input Grade : ");
		grade=scan.next();
		
		System.out.print("Input Unit : ");
		unit=scan.nextInt();
			
			switch (grade)
			{
			case "A": case "a":
				ig=4;
				ig_unit=ig*unit;
				sum_igu=sum_igu+ig_unit;
				sum_u=sum_u+unit;
				break;
			case "B": case "b":
				ig=3;
				ig_unit=ig*unit;
				sum_igu=sum_igu+ig_unit;
				sum_u=sum_u+unit;
				break;
			case "C": case "c":
				ig=2;
				ig_unit=ig*unit;
				sum_igu=sum_igu+ig_unit;
				sum_u=sum_u+unit;
				break;
			case "D": case "d":
				ig=1;
				ig_unit=ig*unit;
				sum_igu=sum_igu+ig_unit;
				sum_u=sum_u+unit;
				break;
			case "F": case "f":
				ig=0;
				ig_unit=ig*unit;
				sum_igu=sum_igu+ig_unit;
				sum_u=sum_u+unit;
				break;
			default:
			}
		
			
			
		
		}
		gpax=(double)sum_igu/(double)sum_u;
		System.out.println("====================================");
		System.out.println("Sum Unit : "+sum_u);
		System.out.println("Sum IG*Unit : "+sum_igu);
		System.out.printf("GPAX : %.3f\n",gpax);
	}
}