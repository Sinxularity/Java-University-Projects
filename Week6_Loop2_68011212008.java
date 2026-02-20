import java.util.Scanner;

class  Week6_Loop2_68011212008
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int s,m,h;
		int i=0,o=0,p=0;
		
		System.out.print("HH : ");
		h=scan.nextInt();
		
		System.out.print("MM : ");
		m=scan.nextInt();
		
		System.out.print("SS : ");
		s=scan.nextInt();
		
		System.out.printf("HH:\tMM:\tSS:\n");
		for (; ; )
		{
			
			
			try
			{
				Thread.sleep(1000); // 1000 ms = 1 sec
			}
			catch (InterruptedException k){}
			
			System.out.printf("\r%d\t%d\t%d ",i,o,p);
			
			
			if (p==60)
			{
				o=o+1;
				p=0;
				continue;
			}
			if(o==60)
			{
				i=i+1;
				o=0;
				continue;
			}
			else if(i==h && o==m && p==s)
			{
				break;
			}
			p=p+1;
			
		}
			System.out.println();
			System.out.println("TIME OUT!");
		
	}
}
