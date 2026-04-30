import java.util.*;

class API_Test6
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
        String lower=input.toLowerCase();
        char check[]=lower.toCharArray();
        if(check[0]==check[input.length()-1])
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    
    public static void main(String[] args)
    {
        String input;
        API_Test6 obj=new API_Test6();
        input=obj.read();
        obj.process(input);
    }
}