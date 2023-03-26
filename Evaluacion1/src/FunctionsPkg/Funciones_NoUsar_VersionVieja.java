package FunctionsPkg;

//import java.io.IOException;
import java.util.Scanner;

public class Funciones_NoUsar_VersionVieja {
    
    //1 FACTORIAL
    public int Factorial(int n){
        if(n<0){
            n*=-1;
        }
        if(n==0){
            return 1;
        }
        else{
            return n* Factorial(n-1);
        }// va reduciendo el numero hasta llegar al numero 1   
    }
    
    //2 PRIMOS Y COMPUESTOS
    public void PriComp(){
        int num, cont, primos=0, compuestos=0;
        Scanner Keyboard = new Scanner(System.in);
        
        do{
            do{
                System.out.print("Ingrese un numero o ingrese '0' para salir: ");
                num = Keyboard.nextInt(); 
            }while(num<0);
            
            cont=0;
            
            //verificar si es primo (cont == 2) o si es compuesto (cont > 2)
            for(int i=1; i<=num; i++){
                if(num%i==0){
                    cont++;
                }
            }
            
            if(cont==2 || cont == 1){
                primos++;
                System.out.println("Es primo");
            }
            else if(cont > 2){
                compuestos++;
                System.out.println("Es compuesto");
            }
            
        }while(num>0);
        if(primos != 0 || compuestos != 0){
            System.out.println("Primos: "+primos+"\nCompuestos: "+compuestos);
        }
        else{
            System.out.println("Has salido del programa");
        }
        
    }
    
    //3 NUMEROS REALES E IMAGINARIOS (ECUACION DE 2DO GRADO)
    public void Ecuacion(double a, double b, double c){
        double discrimi = b*b-4*a*c;
    
        if(discrimi>=0){
            double x1 = (-b+ Math.sqrt(discrimi))/(2*a);
            double x2 = (-b-Math.sqrt(discrimi))/(2*a);
            System.out.println("No hay valores imaginarios en esta operacion y sus valores son: ");
            System.out.println("El valor de x1 es = " +x1 );
            System.out.println("El valor de x2 es = " +x2 );
        }
    
        else{
            double reales = -b / (2*a);
            double imagin= Math.sqrt(-discrimi) / ( 2 * a);
            System.out.println("Los numeros imaginarios de esta ecuacion son:"+imagin);
            System.out.println("Los numeros reales de esta ecuacion son:"+reales);
        }
    }
    
    //4 MINIMI COMUN MULTIPLO
    public int Mcm(int []numbers){
        int product,mcm = 0, residue;
        
        for (int i = 0; i < 3; i++)
        {
            //Determinamos el primer termino como el mcm de el mismo
            if (i == 0){
                mcm = numbers[i];
                //product = numbers[i];
            
            //para los siguientes calculamos el mcm del mcm anterior con el numero actual sucesivamente
            } else {
                product = mcm * numbers[i];
                
                do{
                    residue = mcm%numbers[i];
                    mcm = numbers[i];
                    numbers[i] = residue;
                }while(residue != 0);
                
                mcm = product / mcm;
            }
            
        }
        return mcm;
    }
    
    //4.5 MAXIMO COMUN DIVISOR
    public  int Mcd(int []numbers){
        int mcd = 0;
        int residue;
        
        for (int i = 0; i < 3; i++)
        {
            //Determinamos el primer termino como el mcd de el mismo
            if (i == 0)
            {
                mcd = numbers[i];
            }
            else
            {
                do
                {
                    residue = mcd % numbers[i];
                    mcd = numbers[i];
                    numbers[i] = residue;
                } while (residue != 0);
            }
        }
        return mcd;
    }
    
    //5 DESGLOSE DE BILLETE
    public double Cajero(double monto){
        
        int[]billetes={500,200,100,50,20,10};
        double[]monedas ={5.0, 2.0, 1.0, 0.5};      
        System.out.println("Desglose de "+monto+ ":");
        
        for (int i=0; i<billetes.length;i++){ 
        int numbilletes =(int)(monto / billetes[i]);
        if(numbilletes>0){ 
         System.out.println(numbilletes+"billetes de"+billetes[i]);
         monto -=numbilletes*billetes[i];   
        }        
        }
        
          for (int i=0; i<monedas.length;i++){ 
        int nummonedas =(int)(monto / monedas[i]);
        if(nummonedas>0){ 
         System.out.println(nummonedas+"monedas de"+monedas[i]);
         monto -=nummonedas*monedas[i];   
        }        
        }
         return 0;
        
        
        }
    
    //6 PILA DINAMICA
    
    
    //LIMPIAR PANTALLA
    public void Clear(int n){
        for (int i = 0; i < n; i++)
            System.out.println();
    }
    
    /*public static void clearScreen() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    } catch (IOException | InterruptedException ex) {
        System.out.println("Error al limpiar la pantalla: " + ex.getMessage());
    }
}*/
    
}
