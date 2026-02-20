import java.util.Scanner;

class Week9_Method1_68011212008 
{
	int getXY()
	{
		Scanner scan=new Scanner(System.in);
		
		int xy;
		System.out.print(": ");
		xy=scan.nextInt();
		
		return xy;
	}
	
		double setSide(double x, double x2 ,double y , double y2)
		{
			double side = Math.sqrt((Math.pow(x-x2,2))+(Math.pow(y-y2,2)));
			return side;
		}
			
			double setS(double A , double B , double C)
			{
				double S = (A+B+C)/2;
				return S;
			}
			
				double setArea(double S , double A , double B , double C )
				{
					double area =Math.sqrt(S*(S-A)*(S-B)*(S-C));
					return area;
				}
					
					void print(double S , double area , double A , double B , double C)
					{	
						System.out.printf("A(Q,W) = %.3f\n",A);
						System.out.printf("B(W,E) = %.3f\n",B);
						System.out.printf("C(E,Q) = %.3f\n",C);
						System.out.printf("Area = %.3f\n",area);
						System.out.printf("S = %.3f\n",S);
					}
	
	
	public static void main(String[] args) 
	{
		Week9_Method1_68011212008 obj = new Week9_Method1_68011212008();
		double sideA,sideB,sideC,S,area;
		
		int x [] = new int[3];
		int y [] = new int[3];
		
		for (int i=0;i<x.length ;i++ )
		{
			System.out.printf("x%d",i+1);
			x[i]=obj.getXY();
			System.out.printf("y%d",i+1);
			y[i]=obj.getXY();
		}
		
		System.out.println("=======================");
		
		
			sideA=obj.setSide(x[0],x[1],y[0],y[1]);
			sideB=obj.setSide(x[1],x[2],y[1],y[2]);
			sideC=obj.setSide(x[0],x[2],y[0],y[2]);
			S=obj.setS(sideA,sideB,sideC);
			area=obj.setArea(S,sideA,sideB,sideC);
			obj.print(S,area,sideA,sideB,sideC);
		
			
	}
}
