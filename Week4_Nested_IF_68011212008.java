import java.util.Scanner;

class Week4_Nested_IF_68011212008
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String day,mounth;
		int date,num,mod;
		
		System.out.print("Input Number : ");
		num=scan.nextInt();
		
		day="";
		date=num;
		mod=num%7;
		
		if(num<=31)
		{
			mounth="JAN";
			switch(mod)
			{
				case 0:
					day="MON";
					break;
				case 1:
					day="TUE";
					break;
				case 2:
					day="WED";
					break;
				case 3:
					day="THR";
					break;
				case 4:
					day="FRI";
					break;
				case 5:
					day="SAT";
					break;
				case 6:
					day="SUN";
					break;
			}
			
				
				
		}
		else if(num<=59)
		{
			date=num-31;
			mounth="FEB";
			switch(mod)
			{
				case 0:
					day="MON";
					break;
				case 1:
					day="TUE";
					break;
				case 2:
					day="WED";
					break;
				case 3:
					day="THR";
					break;
				case 4:
					day="FRI";
					break;
				case 5:
					day="SAT";
					break;
				case 6:
					day="SUN";
					break;
			}
		}
		else
			{
				date=num-59;
				mounth="MAR";
				switch(mod)
				{
				case 0:
					day="MON";
					break;
				case 1:
					day="TUE";
					break;
				case 2:
					day="WED";
					break;
				case 3:
					day="THR";
					break;
				case 4:
					day="FRI";
					break;
				case 5:
					day="SAT";
					break;
				case 6:
					day="SUN";
					break;
				}
			}
		
		System.out.println("=====================================");	
		System.out.printf("%s\t%s\t%s\t%s\n","Number","Day","Mounth","Date");
		System.out.printf("%d\t%s\t%s\t%d\n",num,day,mounth,date);
	}
	
	
}