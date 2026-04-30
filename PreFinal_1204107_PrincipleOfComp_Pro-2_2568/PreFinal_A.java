
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
 
 
 
 class PreFinal_A 
{
    String readFile()
    {
        String str="";
        char ch;
        try 
        {
            int x;
           FileInputStream fIn=new FileInputStream("AInput.txt");
           while(true)
           {
                x=fIn.read();
                if(x==-1) break;
                ch=(char)x;
                str=str+ch;

           }
           fIn.close();
          
           
        }
        
        catch (IOException er)
        {
            System.out.println(er.getMessage());
        }
        return str;
    }

    void writeFile(String input)
    {
        try 
        {

        FileOutputStream fOut=new FileOutputStream("AOutput.txt");
        char cut[]=new char[input.length()];
        cut=input.toCharArray();
        
        for (int i=0;i<cut.length;i++)
        {
            
             if(cut[i]=='+' || cut[i]==' ')
                {
                
                fOut.write("+".getBytes());
                }

            else
                {
               
               String strValue = String.valueOf((int)cut[i]);
                fOut.write(strValue.getBytes());
                
                }
        }
            System.out.println();
            fOut.close();



        } 
        catch (IOException er) 
        {
            System.out.println(er.getMessage());
        }
        
}
    public static void main(String[] args)
    {
        PreFinal_A obj=new PreFinal_A();
        String input=obj.readFile();
        obj.writeFile(input);
    }
}
