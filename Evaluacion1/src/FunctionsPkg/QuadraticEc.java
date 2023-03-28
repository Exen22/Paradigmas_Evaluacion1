package FunctionsPkg;


import static java.lang.Double.isNaN;
import static java.lang.Math.sqrt;

public class QuadraticEc {

    private double a,b,c;
    private double x1,x2;
    
    public QuadraticEc(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void process()
    {
         double raiz = b*b-4*a*c;
    
        if(!isNaN(sqrt(b*b-4*a*c))){
            x1 = (-b + sqrt(raiz))/(2*a);
            x2 = (-b - sqrt(raiz))/(2*a);
            System.out.print("\n No hay valores imaginarios en esta operacion y sus valores son: ");
            System.out.print("\n El valor de x1 es = " +x1 );
            System.out.print("\n El valor de x2 es = " +x2 );
        }
    
        else{
         
            System.out.print("\n Se ha detectado un numero imaginario, la ecuacion no tiene solucion");
            System.out.print("\n Numero imaginario: √"+raiz);
        } 
        
    }
}
