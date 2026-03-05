import java.util.*;

class Work14_Collection_68011212008 
{
	String readName()
	{
		Scanner scan=new Scanner(System.in);
		String name;
		System.out.print("Name (\"Stop\" ---> Exit): ");
		name=scan.nextLine();
		
		return name;
	}
	
	int readMid()
	{
		Scanner scan=new Scanner(System.in);
		int mid;
		System.out.print("Midterm : ");
		mid=scan.nextInt();
		
		return mid;
	}
	
	
	int readFin()
	{
		Scanner scan=new Scanner(System.in);
		int fin;
		System.out.print("Finale : ");
		fin=scan.nextInt();
		
		return fin;
	}
	
	
	void process(ArrayList <Integer>midterm,ArrayList <Integer>finale,ArrayList <Integer>score,ArrayList <Character>grade)
	{
		for (int i=0;i<midterm.size() ;i++ )
		{
			score.add(midterm.get(i)+finale.get(i));
			if (score.get(i)>=80)
			{
				grade.add('A');
			}
			else if(score.get(i)>=70)
			{
				grade.add('B');
			}
			else if(score.get(i)>=60)
			{
				grade.add('C');
			}
			else if(score.get(i)>=50)
			{
				grade.add('D');
			}
			else 
			{
				grade.add('F');
			}
		}
	}
	
	void print(ArrayList <String>name,ArrayList <Integer>midterm,ArrayList <Integer>finale,ArrayList <Integer>score,ArrayList <Character>grade)
	{
		
		System.out.printf("Name\tMidterm\tFinale\tScore\tGrade\n");
		for (int i=0;i<name.size() ;i++ )
		{
			System.out.print(name.get(i)+"\t"+midterm.get(i)+"\t"+finale.get(i)+"\t"+score.get(i)+"\t"+grade.get(i)+"\n");
		}	
		
	}
	
	
	public static void main(String[] args) 
	{
		Work14_Collection_68011212008 obj=new Work14_Collection_68011212008();
		String nam;
		int mid,fin,sco;
		char gra;
		ArrayList <String>name=new ArrayList<String>();
		ArrayList <Integer>midterm=new ArrayList<Integer>();
		ArrayList <Integer>finale=new ArrayList<Integer>();
		ArrayList <Integer>score=new ArrayList<Integer>();
		ArrayList <Character>grade=new ArrayList<Character>();
		
		for (; ; )
		{
			nam=obj.readName();
		    name.add(nam);
			if (name.get(name.size()-1).equals("Stop"))
			{
				name.remove(name.get(name.size()-1));
				
				break;
			}
			mid=obj.readMid();
			midterm.add(mid);
			fin=obj.readFin();
			finale.add(fin);
		}
		
		obj.process(midterm,finale,score,grade);
		obj.print(name,midterm,finale,score,grade);
		
		
		
		
	}
}
