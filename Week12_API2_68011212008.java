import java.util.*;

class Week12_API2_68011212008 
{
	Scanner scan=new  Scanner(System.in);
	
	String readIDcode()
	{
		
		String code="";
		System.out.print("ID Card : ");
		code=scan.nextLine();
		
		
		return code;
	}	
	
	String cutting(String code)
	{	
		String idcode=code.replaceAll("[-\\s+]", "");
		
		return idcode;
	}
		
	
	 void process()
	{
		int sum=0;
		String code=readIDcode();
		String idcode=cutting(code);
		String[] arry = idcode.split("");
		int IDcode[] = new int[arry.length];
	for (int i=0;i<arry.length;i++) 
		{
			IDcode[i]=Integer.valueOf(arry[i]);
			System.out.printf("%d ",IDcode[i]);
		}
		System.out.println();
		int j=IDcode.length;
		int result[]=new int[IDcode.length];
		for (int i=0;i<IDcode.length ;i++ )
		{
			result[i]=IDcode[i]*j;
			j--;
			
			
			if (j==0)
			{
				break;
			}
			sum=sum+result[i];
			System.out.printf("%d ",result[i]);
		}
		
		System.out.println();
		for (int i=0;i<result.length-1 ;i++ )
		{
		
			System.out.printf("%d+",result[i]);
		}
		System.out.printf("\b=%d\n",sum);
		
		int mod=sum%11;
		
		System.out.printf("%d %% 11 = %d\n",sum,mod);
		
		int moded=(11-mod)%10;
		
		System.out.printf("11 - %d = %d\n",mod,moded);
	
		if (moded==IDcode[12])
		{
			System.out.printf("%s : True\n",code);
		}
		else
		{
			System.out.printf("%s : False\n",code);
		}
			
	}
		

	public static void main(String[] args) 
	{
		Week12_API2_68011212008 obj=new Week12_API2_68011212008();
		obj.process();
	}

}
