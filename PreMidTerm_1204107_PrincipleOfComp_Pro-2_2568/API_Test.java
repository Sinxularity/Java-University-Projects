import java.util.*;
class API_Test
{
    Scanner scan=new Scanner(System.in);
    
    String read()
    {
        String sample=" ";
        System.out.print("Sample Input : ");
        sample=scan.next();
        
        return sample;
    }
    
    int cutting(String sample)
    {
        
        char cut[]=new char[sample.length()];
        String cutting=sample.replaceAll("[^0-9]","");
        cut=cutting.toCharArray();
        int toInt[] = new int[cut.length];
        int sum=0;
        for (int i=0;i<cut.length;i++)
        {
            toInt[i] =Integer.valueOf(String.valueOf(cut[i]));
            sum=sum+toInt[i];
        }
        return sum;
    }
    
    void print(int result)
    {
        System.out.println(result);
    }
    
    public static void main(String[] args)
    {
        API_Test obj =new API_Test();
    String sample=" ";
    int result; 
    sample=obj.read();
    result = obj.cutting(sample);
    obj.print(result);
   
    }

}