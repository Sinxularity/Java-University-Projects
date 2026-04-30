import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.io.IOException;

class PreFinal_B
{
    
    
    LinkedHashMap<String, Integer> writeInput()
    {
        LinkedHashMap <String,Integer> hashM=new LinkedHashMap<String,Integer>();
        try {
            String animal;
            int value;
            Scanner sc=new Scanner(System.in);
            PrintWriter fOut=new PrintWriter(new BufferedWriter(new FileWriter("BInput.txt"))) ;

            for (;;)
            {
                
                System.out.print("Animal : ");
                animal=sc.next();


                if(animal.equals("stop")) break;
                    else if (hashM.containsKey(animal)) 
                        {
                            value=hashM.get(animal);
                            hashM.put(animal,value+1);
                        }
                else hashM.put(animal,1);

                
                fOut.write(animal+"\t");
            }
            fOut.close();
            
            
        } catch (IOException er) {
            System.out.println(er.getMessage());
        }
        
        return hashM;
        


    }


    void process(LinkedHashMap <String,Integer> animal)
    {
        try {
            PrintWriter fOut=new PrintWriter(new BufferedWriter(new FileWriter("BOutput.txt")));
            System.out.println(animal.size()+" Animal");
            fOut.write(animal.size()+" Animal\n");
            

            for (String animalKey : animal.keySet())
            {
                int animalValue=animal.get(animalKey);
                System.out.println(animalKey+"\t"+animalValue);
                fOut.write(animalKey+"\t"+animalValue+"\n");
            }
            fOut.close();


        } catch (IOException er) {
            System.out.println(er.getMessage());
        }
        



    }
    public static void main(String[] args)
    {
        PreFinal_B obj=new PreFinal_B();
        LinkedHashMap <String,Integer> result=obj.writeInput();
        obj.process(result);
    }
}