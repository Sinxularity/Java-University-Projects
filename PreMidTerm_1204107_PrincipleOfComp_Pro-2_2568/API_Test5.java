import java.util.*;

class API_Test5
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
        double num1,num2,result=0.0;
         if (input.contains("*"))
            {
                String numAry[]=input.split("\\*");
                num1=Double.parseDouble(numAry[0]);
                num2=Double.parseDouble(numAry[1]);
                
                result = num1 * num2;
            }
        else if (input.contains("+"))
            {
                String numAry[]=input.split("\\+");
                num1=Double.parseDouble(numAry[0]);
                num2=Double.parseDouble(numAry[1]);
                
                result = num1 + num2;
            }
        else if (input.contains("-"))
            {
                String numAry[]=input.split("-");
                num1=Double.parseDouble(numAry[0]);
                num2=Double.parseDouble(numAry[1]);
                
                result = num1 - num2;
            }
        else if (input.contains("/"))
            {
                String numAry[]=input.split("/");
                num1=Double.parseDouble(numAry[0]);
                num2=Double.parseDouble(numAry[1]);
                
                result = num1 / num2;
            }
        else if (input.contains("%"))
            {
                String numAry[]=input.split("\\%");
                num1=Double.parseDouble(numAry[0]);
                num2=Double.parseDouble(numAry[1]);
                
                result = num1 % num2;
            }
            
            
            System.out.printf("%.3f\t",result);
        
    }
    
    public static void main(String[] agrs)
    {
        String input;
        
        API_Test5 obj=new API_Test5();
        input=obj.read();
        obj.process(input);
    }
}