import java.util.*;

class API_Test2
{
    Scanner scan=new Scanner(System.in);
    
    String read()
    {
        String input;
        
        System.out.print("Input : ");
        input=scan.next();
        
        return input;
    }
    
    void process(String input)
    {
        char cutting[]=new char[input.length()];
        cutting=input.toCharArray();
        for (int i=0;i<cutting.length;i++)
        {
            if (i%2==0)
            {
                cutting[i]=Character.toUpperCase(cutting[i]);
            }
            else
            {
                cutting[i]=Character.toLowerCase(cutting[i]);
            }
            
            System.out.print(cutting[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        API_Test2 obj=new API_Test2();
        String input;
        String result;
        
        input=obj.read();
        obj.process(input);
    }
}