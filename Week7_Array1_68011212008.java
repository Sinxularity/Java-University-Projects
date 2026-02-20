import java.util.*;

class Week7_Array1_68011212008 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int unit,A=0,B=0,C=0,D=0,F=0;
		double avgM=0,avgF=0,avgS=0;
		int sumM=0,sumF=0,sumS=0;
		
		
		System.out.print("Input Unit : ");
		unit=scan.nextInt();
		System.out.println("======================");
		
		String name[] = new String[unit];
		int mid[] = new int [unit];
		int fin[] = new int [unit];
		char grade[] = new char [unit];
		int sum[] = new int [unit];
		
		
		
		for (int j=0;j<unit ;j++ )
		{
			System.out.print("Input Name : ");
			name[j]=scan.next();
			System.out.print("Input Midterm : ");
			mid[j]=scan.nextInt();
			System.out.print("Input Final : ");
			fin[j]=scan.nextInt();
			System.out.println("======================");
			sum[j]=mid[j]+fin[j];
			sumS=sumS+sum[j];
			sumM=sumM+mid[j];
			sumF=sumF+fin[j];
			
		}
		
		for (int o=0;o<unit ;o++ )
		{
			if (sum[o]>=80)
			{
				grade[o]='A';
				A=A+1;
			}
			else if (sum[o]>=70)
			{
				grade[o]='B';
				B=B+1;
			}
			else if (sum[o]>=60)
			{
				grade[o]='C';
				C=C+1;
			}
			else if (sum[o]>=50)
			{
				grade[o]='D';
				D=D+1;
			}
			else 
			{
				grade[o]='F';
				F=F+1;
			}
			
			
		}
		
		int maxM=mid[0];
		int minM=mid[0];
		int maxF=fin[0];
		int minF=fin[0];
		int maxS=sum[0];
		int minS=sum[0];
		
		
		for (int p=0;p<unit ;p++ )
		{
			if (mid[p]>maxM)
			{
				maxM=mid[p];
			}
			else if (mid[p]<minM)
			{
				minM=mid[p];
			}
		}
		
		for (int t=0;t<unit ;t++ )
		{
			if (mid[t]>maxF)
			{
				maxF=fin[t];
			}
			else if (mid[t]<minF)
			{
				minF=fin[t];
			}
		}
		
		for (int y=0;y<unit ;y++ )
		{
			if (sum[y]>maxS)
			{
				maxS=sum[y];
			}
			else if (sum[y]<minS)
			{
				minS=sum[y];
			}
		}
		
		avgM=(double)sumM/(double)unit;
		avgF=(double)sumF/(double)unit;
		avgS=(double)sumS/(double)unit;
		
		
		
		System.out.printf("NAME\t");
			
		for (String N : name )
		{
			System.out.printf("%s\t ",N);
		}
		
		System.out.println();
		System.out.printf("MIDTERM\t ");
			
		for (int M : mid )
		{
			System.out.printf("%d\t ",M);
		}
		
		System.out.println();
		System.out.printf("FINAL\t ");
		
		for (int Fi : fin )
		{
			System.out.printf("%d\t ",Fi);
		}
		
		System.out.println();
		System.out.printf("SUM\t ");
		
		for (int S : sum )
		{
			System.out.printf("%d\t ",S);
		}
		
		System.out.println();
		System.out.printf("GRADE\t ");
		
		for (char G : grade )
		{
			System.out.printf(" %c\t ",G);
		}
		
		System.out.println();
		System.out.println("======================");
		System.out.printf("\tMID\tFIN\tSUM");
			
		
		System.out.println();
		System.out.printf("MAX\t%d\t%d\t%d\n",maxM,maxF,maxS);
		System.out.printf("MIN\t%d\t%d\t%d\n",minM,minF,minS);
		System.out.printf("Average\t%.2f\t%.2f\t%.2f\n",avgM,avgF,avgS);
		
		System.out.println("======================");
	    
		
		
		System.out.print("A : "+A+" : ");
		System.out.printf("\"");
		for (int l=0;l<unit ;l++ )
		{
			if (grade[l]=='A')
			{
				System.out.printf(name[l]+",");
			}
			
		}
		if(A>0)
			{
				System.out.printf("\b");
			}
			
		
		System.out.printf("\"");
		
		
		System.out.println();
		
		System.out.print("B : "+B+" : ");
		System.out.printf("\"");
		for (int l=0;l<unit ;l++ )
		{
			if (grade[l]=='B')
			{
				System.out.printf(name[l]+",");
			}
		}
		if(B>0)
			{
				System.out.printf("\b");
			}
			
		System.out.printf("\"");
		
		
		System.out.println();
		
		System.out.print("C : "+C+" : ");
		System.out.printf("\"");
		for (int l=0;l<unit ;l++ )
		{
			if (grade[l]=='C')
			{
				System.out.printf(name[l]+",");
			}
		}
		if(C>0)
			{
				System.out.printf("\b");
			}
		System.out.printf("\"");
		
		
		System.out.println();
		
		System.out.print("D : "+D+" : ");
		System.out.printf("\"");
		for (int l=0;l<unit ;l++ )
		{
			if (grade[l]=='D')
			{
				System.out.printf(name[l]+",");
			}
		}
		if(D>0)
			{
				System.out.printf("\b");
			}
		System.out.printf("\"");
		
		
		System.out.println();
		
		System.out.print("F : "+F+" : ");
		System.out.printf("\"");
		for (int l=0;l<unit ;l++ )
		{
			if (grade[l]=='F')
			{
				System.out.printf(name[l]+",");
			}
		}
		if(F>0)
			{
				System.out.printf("\b");
			}
		System.out.printf("\"");
		
		
		System.out.println();
		
	}
}
