import java.util.*;

class API_Test3
{
    Scanner scan=new Scanner(System.in);
    
    String read()
    {
        String input;
        System.out.print("Sample Input : ");
        input=scan.next();
        
        return input;
    }
    
    void process(String input)
    {
        String cutting[]=input.split("/"); 
        for (String cut : cutting) //for (ชนิดข้อมูล ชื่อตัวแปรชั่วคราว : ชื่อ Array ที่ต้องการอ่าน)}
        {
        String result[]=cut.split(",");
        
        System.out.println(result[0]+"\t"+result[1]);
        }
    }
    
    public static void main(String[] args)
    {
        String input;
        API_Test3 obj= new API_Test3();
        input=obj.read();
        obj.process(input);
    }
}