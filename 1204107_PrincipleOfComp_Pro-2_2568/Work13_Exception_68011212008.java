import java.util.*;

class Work13_Exception_68011212008
{
	
	String read()
	{
		
		for (; ; )
		{
			try
			{
				Scanner scan=new Scanner(System.in);
				String input;
		
				System.out.print("Input : ");
				input=scan.nextLine();
				
				return input;
			}
				catch (NoSuchElementException err)
				{
					System.out.println(err.getMessage());
				}
		}
		
		
		
		
	}
	
	String cutOut(String data)
	{
		String cut=data.replaceAll("[^0-9]","");
		return cut;
	}
	
	int process(String cut)
	{

		char cutting[]=cut.toCharArray();
		int toInt[]=new int[cut.length()];
		int sum=0;
		
			for (int i=0;i<cutting.length;i++ )
			{
				toInt[i]=Integer.valueOf(String.valueOf(cutting[i]));
				sum=sum+toInt[i];
			}
		
		return sum;
	}
	
	int checkSum(int sum)
	{
		System.out.println(sum);
		
		return sum;
		
	}
	
	void print(int data , String cut)
	{
		double avg=(double)data/((String.valueOf(data)).length()+1);
		System.out.printf("%d\t%.1f\n",data,avg);
	}
	
	
	public static void main(String[] args) 
	{
		Work13_Exception_68011212008 obj=new Work13_Exception_68011212008();
		int sum=0;
		int result=0;
		String input=obj.read();
		String cut=obj.cutOut(input);
		try
		{
			sum=obj.process(cut);
		}
		catch (NumberFormatException errr)
		{
			System.out.println(errr.getMessage());
		}
		System.out.printf("Sum\tAverage\n");
		int div = cut.length();
		for (; ; )
		{
			if (sum>=10)
			{
				
				double avg=(double)sum/div;
				System.out.printf("%d\t%.1f\n",sum,avg);
				sum=obj.process(String.valueOf(sum));
				div = 2;
			}
			else
			{
				break;
			}
		}

		obj.print(sum,cut);
			
			
		
		
		 
		
		
		
	}
}
