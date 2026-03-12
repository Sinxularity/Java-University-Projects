import java.util.Scanner;

class Week11_API1_68011212008 
{
	Scanner scan=new Scanner(System.in);
	String input()
	{
		
		String word;
		
		System.out.print("Input : ");
		word=scan.nextLine();
		
		return word;
	}
	
	
	String process(char arry[])
	{
		String result="";
		System.out.println("============================================");
		for (int i=0;i<arry.length ;i++ )
		{
			boolean x=Character.isUpperCase(arry[i]);
			if (x==true)
			{
				result+=Character.toLowerCase(arry[i]);
			}
			else
			{
				result+=Character.toUpperCase(arry[i]);
			}
		}
		return result;
	}
	
	
	
	public static void main(String[] args) 
	{
		Week11_API1_68011212008 obj=new Week11_API1_68011212008();
		String word=obj.input();
		char arry[]=word.toCharArray();
		String result=obj.process(arry);
		System.out.println(result);
		
	}
}
