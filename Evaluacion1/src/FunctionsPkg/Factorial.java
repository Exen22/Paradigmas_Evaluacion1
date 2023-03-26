package FunctionsPkg;

public class Factorial {
    private long num;
    
    public Factorial(long _num)//constructor
    {
        num = _num;
    }
    
    public void process()//getter
    {  
        long aux = 1;
       for (int i = 1; i<= num;i++)
       {
            aux *= i;
            //System.out.println(aux);
       }
       num = aux;
    }
    
    public long show()//setter
    {
         return num;
    }
}   
