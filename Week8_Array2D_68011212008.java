import java.util.*;

class Week8_Array2D_68011212008
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int M,K;
		
		System.out.print("Input Row : ");
		M=scan.nextInt();
		
		System.out.print("Input Column : ");
		K=scan.nextInt();
		
		int num[][]=new int[M][K];
		int num2[][]=new int[K][M];
		int sum1[]=new int[M+K];
		int sum2[]=new int[M+K];
		
		System.out.println("================================");
		
		for (int k=0 ;k<M ;k++ )
		{
			for (int i=0;i<K ;i++ )
			{
				
				num[k][i]=(int)((Math.random()*10)+1);
				num2[i][k]=num[k][i];
				sum1[k]=sum1[k]+num[k][i];
			}
			
		}
		

		
		for (int o=0;o<M ;o++ )
		{
			for (int j=0;j<K ;j++ )
		  {
			System.out.printf("%d\t",num[o][j]);
		  }
		  System.out.println(">"+" "+sum1[o]);
		  
		}
		
		
		for (int o=0;o<K ;o++ )
		{
			for (int j=0;j<M ;j++ )
		  {
			
			sum2[o]=sum2[o]+num2[o][j];
			
		  }
		  
		System.out.printf("v\t");
		  
		}
		System.out.println();
		
		
			for (int j=0;j<K ;j++ )
		  {
			
			System.out.printf("%d\t",sum2[j]);
			
		  }
		System.out.println();
		
	}
}