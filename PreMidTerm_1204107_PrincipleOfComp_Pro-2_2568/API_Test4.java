import java.util.*;

class API_Test4
{
    Scanner scan=new Scanner(System.in);
    String read()
    {
        String input;
        System.out.print("Input : ");
        input=scan.nextLine();
        
        return input;
    }
    
    void process(String input)
    {
        String cutting[]=input.split(" ");
        
        for (int i=0;i<cutting.length;i++)
        {
            char arry[]=cutting[i].toCharArray();
            for (char ary : arry)
            {
                System.out.print((int)ary);
            }
            if(i < cutting.length-1)
            {
                System.out.print("+");
            }
            
            
        }
        System.out.printf("\b");
        
    }
    
    
    public static void main(String[] args)
    {
        String input;
        API_Test4 obj=new API_Test4();
        input=obj.read();
        obj.process(input);
    }
}
