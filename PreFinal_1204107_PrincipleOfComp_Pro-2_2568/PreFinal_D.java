import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;


class PreFinal_D
{
    String readFile()
    {
        StringBuilder sb=new StringBuilder();
        try {
            BufferedReader input=new BufferedReader(new FileReader("DInput.txt"));
            for (;;)
            {
                String x=input.readLine();
                if(x == null) break;
                sb.append(x);
            }
            
            input.close();

            } 
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException er)
        {
            System.out.println(er.getMessage());
        }
        catch (NullPointerException err)
        {
            System.out.println(err.getMessage());
        }
        String line=sb.toString();

        

        return line;
    }    


    double process(String input)
    {   

        String[]digit=input.split("[\\+\\-\\*\\/\\%]");
        String [] lw=new String[digit.length];
        StringBuilder StrNum=new StringBuilder();
        StringBuilder StrNum2=new StringBuilder();
        
        
        int i=0;
        for (String num : digit)
        { 
            lw[i]=num.toLowerCase();
            i++;
        }
        
        try 
        {
            String [] Set1=lw[0].split("[\\s]");
            String [] Set2=lw[1].split("[\\s]");

            for (String setOne : Set1)
                    {
                        if(setOne.equals("zero")) StrNum.append("0");
                            else if(setOne.equals("one")) StrNum.append("1");
                                else if(setOne.equals("two")) StrNum.append("2");
                                    else if(setOne.equals("three")) StrNum.append("3");
                                        else if(setOne.equals("four")) StrNum.append("4");
                                            else if(setOne.equals("five")) StrNum.append("5");
                                                else if(setOne.equals("six")) StrNum.append("6");
                                                    else if(setOne.equals("seven")) StrNum.append("7");
                                                        else if(setOne.equals("eight")) StrNum.append("8");
                                                            else if(setOne.equals("nine")) StrNum.append("9");
                                                                
                    }

            for (String setTwo : Set2)
                    {
                        if(setTwo.equals("zero")) StrNum2.append("0");
                            else if(setTwo.equals("one")) StrNum2.append("1");
                                else if(setTwo.equals("two")) StrNum2.append("2");
                                    else if(setTwo.equals("three")) StrNum2.append("3");
                                    else if(setTwo.equals("four")) StrNum2.append("4");
                                            else if(setTwo.equals("five")) StrNum2.append("5");
                                                else if(setTwo.equals("six")) StrNum2.append("6");
                                                    else if(setTwo.equals("seven")) StrNum2.append("7");
                                                        else if(setTwo.equals("eight")) StrNum2.append("8");
                                                            else if(setTwo.equals("nine")) StrNum2.append("9");
                                                                
                    }

            
        }
                catch (IndexOutOfBoundsException er) 
                {
                System.out.println(er.getMessage());
                }
                catch (NumberFormatException err)
                {
                System.out.println(err.getMessage());
                }

        
            
        
        int num1,num2;
        double result=0.0;
        ;
        try {
        num1=Integer.parseInt(String.valueOf(StrNum));
        num2=Integer.parseInt(String.valueOf(StrNum2));

            PrintWriter fOut=new PrintWriter(new BufferedWriter(new FileWriter("DOutput.txt",true)));

            if (num2==0)
            {
                System.out.println("Cant Divine ZERO!!");
            }
            else
            {
                if(input.contains("+")) 
                {
                    
                    result=(double)num1+(double)num2;
                    System.out.printf("%d + %d = %.0f",num1,num2,result);
                    fOut.printf("%d + %d = %.0f",num1,num2,result);
                }
                    else if(input.contains("-"))
                    {
                        result=(double)num1-(double)num2;
                        System.out.printf("%d - %d = %.0f",num1,num2,result);
                        fOut.printf("%d - %d = %.0f",num1,num2,result);
                    }
                        else if(input.contains("*")) 
                        {
                            result=(double)num1*(double)num2;
                            System.out.printf("%d * %d = %.0f",num1,num2,result);
                            fOut.printf("%d * %d = %.0f",num1,num2,result);
                        }
                            else if(input.contains("/"))
                            {
                                result=(double)num1/(double)num2;
                                System.out.printf("%d / %d = %.0f",num1,num2,result);
                                fOut.printf("%d / %d = %.0f",num1,num2,result);
                                
                            }
                                else if(input.contains("%")) 
                                {
                                    result=(double)num1%(double)num2;
                                    System.out.printf("%d %% %d = %.0f",num1,num2,result);
                                    fOut.printf("%d %% %d = %.0f",num1,num2,result);
                                }
            }
                

            fOut.close();

        } catch (IOException er) {
            System.out.println(er.getMessage());
        }
        catch (NumberFormatException err)
        {
            System.out.println(err.getMessage());
        }
        
        return result;
       
        
    }

    void toLetter(double num)
    {
        try {
            PrintWriter fOut=new PrintWriter(new BufferedWriter(new FileWriter("DOutput.txt",true)));
            System.out.println();
            int toInt=(int)num;
            String []cutting=(String.valueOf(toInt)).split("");
            for (String cut : cutting)
            {
                 if(cut.equals("0"))
                    {   
                    System.out.print("zero ");
                    fOut.write("zero ");
                    }
                        else if(cut.equals("1"))
                        {
                            System.out.print("one ");
                            fOut.write("one ");
                        }
                            else if(cut.equals("2"))
                            {
                                System.out.print("two ");
                                fOut.write("two ");
                            }     
                                else if(cut.equals("3"))
                                {
                                    System.out.print("three ");
                                    fOut.write("three ");
                                }  
                                    else if(cut.equals("4"))
                                    {
                                        System.out.print("four ");
                                        fOut.write("four ");
                                    } 
                                        else if(cut.equals("5"))
                                        {
                                            System.out.print("five ");
                                            fOut.write("five ");
                                        }  
                                            else if(cut.equals("6"))
                                            {
                                                System.out.print("six ");
                                                fOut.write("six ");
                                            }  
                                                else if(cut.equals("7"))
                                                {
                                                    System.out.print("seven ");
                                                    fOut.write("seven ");
                                                }  
                                                    else if(cut.equals("8"))
                                                    {
                                                        System.out.print("eight ");
                                                        fOut.write("eight ");
                                                    }  
                                                            else if(cut.equals("9"))
                                                            {
                                                                System.out.print("nine ");
                                                                fOut.write("nine ");
                                                            }  
                                                                else if(cut.equals("-"))
                                                                {
                                                                    System.out.print("minus ");
                                                                    fOut.write("minus ");
                                                                }

            }

            fOut.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void main(String[] args)
    {
        PreFinal_D  obj=new PreFinal_D ();
        String input=obj.readFile();
        double result=obj.process(input);
        obj.toLetter(result);
    }
}
