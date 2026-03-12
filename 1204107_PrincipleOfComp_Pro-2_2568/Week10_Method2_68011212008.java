import java.util.Scanner;

class Week10_Method2_68011212008
{
	Scanner scan=new Scanner(System.in);
	int N()
	{
		int x;
		System.out.print("N : ");
		x=scan.nextInt();
		
		return x;
	}
	
	char[][] underscore(int x,int y)
	{
		char l[][] = new char[x][y];
		for (int i=0;i<l.length;i++ )
		{
			for (int j=0;j<l[0].length ;j++ )
			{
				l[i][j]='_';
			}
		}
		
		return l;
	}
	
	char xo()
	{
		char x;
		System.out.print("Input O/X : ");
		x=scan.next().charAt(0);
		
		return x;
	}
	
	
	
	
	int changeRow()
	{
		int x;
		System.out.print("Input Row : ");
		x=scan.nextInt();
		
		return x;
	}
	
	int changeCol()
	{
		int y;
		System.out.print("input Column : ");
		y=scan.nextInt();
		
		return y;
	}
	
	
	
	void change(char d[][],char num,int x, int y)
	{
		d[x][y]=num;
	}
	
	
	void printArr(char array[][])
	{
		for (int i=0;i<array.length ;i++ )
		{
			for (int j=0;j<array[0].length ;j++ )
			{
				System.out.printf(array[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}
	void print(char num[][])
		
	{
		for (int i=0;i<num.length ;i++ )
		{
			for (int j=0;j<num[0].length ;j++ )
			{
				System.out.printf(num[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}
	public static void main(String[] args) 
	{
		int n,x,y;
		char xo=' ';
		char Cnum;
		
		Week10_Method2_68011212008 obj=new Week10_Method2_68011212008();
		n=obj.N();
		
		
		
		char num[][] = new char[n][n];
		num=obj.underscore(n,n);
		obj.printArr(num);
		
		for (int i=0; ;i++ )
		{
			
			xo=obj.xo();
			if (xo=='E' || xo=='e')
			{
				break;
			}
			
			x=obj.changeRow();
			y=obj.changeCol();
			
			if(x < 0 || x>=n || y<0 || y>=n)
			{
				System.out.println("----------------------------------------");
				System.out.println("!!Out of length. Try Again!!");
				System.out.println("----------------------------------------");
				continue;
			}
			
			if (num[x][y]!='_')
			{
				System.out.println("----------------------------------------");
				System.out.println("!!Do not enter the same position. Try Again!!");
				System.out.println("----------------------------------------");
				continue;
			}
			
			obj.change(num,xo,x,y);
			obj.print(num);
			
			
			
		}
		
		
		
	}
}
