import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

class Work15_FILE_68011212008 
{
	
	String readName()
	{
			Scanner scan=new Scanner(System.in);
			System.out.print("Input Name :");
		    String x=scan.nextLine();
		    return x;
	}
	String readCode()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Input Code :");
		String x=scan.nextLine();
		return x;
	}
	int readMid()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Input Midterm :");
		int x=scan.nextInt();
		return x;
	}
	int readFin()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Input Final :");
		int x=scan.nextInt();
		return x;
	}
	
	
	int processScore(int mid,int fin)
	{
		int score=mid+fin;
		
		return score;
	}
	
	char processGrade(int score)
	{
		if (score>=80) return 'A';
		else if (score>=70) return 'B';
		else if (score>=60) return 'C';
		else if (score>=50) return 'D';
		else return 'F';
		
	}
	
	String processDate()
	{
		String fmt="d MMM yy-hh:mm";
		Locale thaiLocale = new Locale("th", "TH");
		SimpleDateFormat f= new SimpleDateFormat(fmt,thaiLocale);
		
		Date dt=new Date();
		
		String x=f.format(dt);
		return x;
	}
	
	
	void output()
	{
		
		
		try
		{
			

			PrintWriter wrtF=new PrintWriter (new BufferedWriter(new FileWriter("Work15.txt")));
			wrtF.write("NO.\tNAME\tCODE\t\tMIDTERM\tFINALE\tSCORE\tGRADE\tDATE\n");
			int i=1;
			for (; ;)
			{
				
				
				String name = readName();
				if (name.equals("stop")) break;
				wrtF.write(i+"\t"+name+"\t");
				
					
				String code = readCode();
				if (code.equals("stop")) break;
				wrtF.write(code+"\t");
				

				int mid = readMid();
				if (String.valueOf(mid).equals("stop")) break;
				wrtF.write(String.valueOf(mid)+"\t");
				

				int fin = readFin();
				if (String.valueOf(fin).equals("stop")) break;
				wrtF.write(String.valueOf(fin)+"\t");
				

				int score = processScore(mid, fin);
				if (String.valueOf(score).equals("stop")) break;
				wrtF.write(String.valueOf(score)+"\t");
				

				char grade = processGrade(score);
				wrtF.write(grade+"\t");
				

				String date= processDate();
				wrtF.write(date+"\t\n");


				i++;
				System.out.println();
			}
			System.out.println("--- Save Complete ---");
			wrtF.close();
		}
		catch (IOException err){}
		
	}
	
	void close()
	{
		try
		{
			PrintWriter wrtF=new PrintWriter (new BufferedWriter(new FileWriter("Work15.xls")));
			wrtF.close();
		}
		catch (IOException errr)
		{
		}
		
	}
	
	public static void main(String[] args) 
	{
		Work15_FILE_68011212008 obj=new Work15_FILE_68011212008 ();
		obj.output();
			
	}
}
