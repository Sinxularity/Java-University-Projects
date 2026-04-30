import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileWriter;



class PreFinal_C
{

    String readFile()
    {
        String line;
        String read="";

        try {
            
            BufferedReader input=new BufferedReader(new FileReader("CInput.txt"));
            for (;;)
            {
                line=input.readLine();
                if(line == null) break;
                read=read+line;
            }
            
            

        } catch (FileNotFoundException er) {
            System.out.println(er.getMessage());
        }
        catch (IOException err){
            System.out.println(err.getMessage());
        }

        return read;
        
    }


    String[] process(String input)
    {
    int lower=0,upper=0,digit=0,line=0;
        try {
            
            BufferedReader Buff=new BufferedReader(new FileReader("CInput.txt"));
            while ((Buff.readLine())!= null) line=line+1;

            String cutting=input.replaceAll("[\\s]", "");
            char [] toCh=cutting.toCharArray();
            
            for (char CH : toCh)
            {
                if (Character.isLetterOrDigit(CH))
                {
                    if(Character.isLowerCase(CH)) lower=lower+1;
                        else if(Character.isUpperCase(CH)) upper=upper+1;
                            else if(Character.isDigit(CH)) digit=digit+1; 
                }
                
                
            }
        } 
            catch (IOException e) 
            {
             System.out.println(e.getMessage());
            }
            String[] result={String.valueOf(upper),String.valueOf(lower),String.valueOf(digit),String.valueOf(line)};
            return result;
    }

    void write(String[] result)
    {
        try {
            PrintWriter fOut=new PrintWriter(new BufferedWriter(new FileWriter("COutput.txt")));
            
            fOut.write(result[0]+"\t"+"Upper Case"+"\n");
                System.out.println(result[0]+"\t"+"Upper Case");
            fOut.write(result[1]+"\t"+"Lower Case"+"\n");
                System.out.println(result[1]+"\t"+"Lower Case");
            fOut.write(result[2]+"\t"+"Digit"+"\n");
                System.out.println(result[2]+"\t"+"Digit");
            fOut.write(result[3]+"\t"+"Line"+"\n");
                System.out.println(result[3]+"\t"+"Line");
            fOut.close();
        } catch (IOException er) {
            System.out.println(er.getMessage());
        }
        
    }
    public static void main(String[] args)
    {
        PreFinal_C obj=new PreFinal_C();
        String Str=obj.readFile();
        String result[]=obj.process(Str);
        obj.write(result);
    }    
}
