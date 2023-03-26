
package FunctionsPkg;

import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Menu1 {
    
    public static boolean login(String user, String password)
    {   
        if (user.equals("Admin") && password.equals("1234"))
            return true;
        else{
            System.out.println("\n Usuario o Contraseña incorrecto \n");
            return false;
        }
    }
    public static void clear(int n){
        for (int i = 0; i < n; i++)
            System.out.println();
    }
    
                                            //No se pa que es throws pero se agrego automaticamente cuando agregré
                                           //el thread.sleep() tengo que investigar
    public static void main(String[] args) throws InterruptedException {
       
        Scanner keyboard = new Scanner(System.in);
        ValidF _validF = new ValidF();//objeto de la clase para validar flotantes
        String user,password,key;
        int attempts = 0;
        
        
        do{
           System.out.print("\n\n\t\t Inicio Sesion");
           System.out.print("\t\n Usuario: ");
           user = keyboard.nextLine();
           System.out.print("\t\n Contraseña: ");
           password = keyboard.nextLine();
           
           attempts++;
           //Tengo que decirle al usuario en que se equivoco
           if(attempts == 3 && !login(user,password))
           {
               clear(20);
               System.out.print("Ha superado el limite de intentos de inicio de sesion. Reinicie el programa para volver a intentar\n\n");
               System.exit(0);
           }

        }while(attempts != 3 && !login(user,password));
       
       clear(18);
       do{
            //keyboard.nextLine();//limpiar scanner
            do{
                

                //Solo he implementado tres opciones
                System.out.print("\n\t\t Menu \n\n");
                System.out.print("\n\t Factorial de un numero -> F");
                System.out.print("\n\t MCM y MCD de 3 nuemros -> M");
                System.out.print("\n\t Primos y Compuestos -> P");
                System.out.print("\n\t Ecuacion de 2do grado -> E");
                System.out.print("\n\n Ingrese la letra correspondiente a la opcion: ");
                key = keyboard.nextLine();
           
                //convertir en mayuscula si la letra ingresada es miniscula
                key = key.toUpperCase();
           
                //.charAt() devuelve el caracter que le pedimos por parametro
                if (key.charAt(0) != 'F' && key.charAt(0) != 'M' && key.charAt(0) != 'P' && key.charAt(0) != 'E') {
                    System.out.print("\n\n Opcion invalida intente de nuevo");
                    Thread.sleep(2000);//toma una espera de 2 segundos
                    clear(20);
                }
            }while(key.charAt(0) != 'F' && key.charAt(0) != 'M' && key.charAt(0) != 'P' && key.charAt(0) != 'E');
       
            switch(key.charAt(0))
            {
                case 'F':
                    
                    long num;
                    clear(10);
                    do{
                        System.out.print("\n\n\t Factorial de un numero \n\n");
                        System.out.print("\n\n Ingrese un numero: ");
                        num = (int) _validF.validate();
                        
                        if (num < 0)
                            System.out.println("\n Es imposible calcular el factorial de un numero negativo. Intente de nuevo");
                        
                    }while(num < 0);
                    
                    Factorial F = new Factorial(num);
                    F.process();
                    System.out.print("\n\n Factorial de "+ num + ": "+ F.show() +"\n\n");
                   
                    break;
               
                case 'M':
                    int []numbers = new int[3];
               
               
                    System.out.print("\n\n\n\n\t MCM y MCD de 3 numueros\n\n");
                    System.out.print("\n\n Ingrese los numeros \n\n");
               
                    for (int i = 0; i < 3; i++)
                    {
                        System.out.print("\n Numero " + (i+1) + ": ");
                        numbers[i] = (int) _validF.validate();
                       //numbersAux[i] = numbers[i];
                    }
                    
                    McmandMcd mcmAndmcd = new McmandMcd(numbers);
                    
                    System.out.print("\n\n El M.C.M es: " + mcmAndmcd.mcm() );
                    System.out.print("\n El M.C.D es: " + mcmAndmcd.mcd());
                    
                    break;
                    
                case 'P':
                    System.out.println("\n\n Numeros Primos y Compuestos \n\n");
                    Primos _primo = new Primos(2);
                    _primo.process();
                    break;
                    
                case 'E':
                    
                    double a,b,c;
                    System.out.println("\n\n Ecuacion cuadratica \n");
                    System.out.print("\n Ingrese el valor de a: ");
                    a = _validF.validate();
                    System.out.print("\n Ingrese el valor de b: ");
                    b = _validF.validate();
                    System.out.print("\n Ingrese el valor de c: ");
                    c = _validF.validate();
                    QuadraticEc ecuation = new QuadraticEc(a,b,c);
                    ecuation.process();
            }        
            
            
            System.out.println("\n\n Desea volver al menu?");
            System.out.println("\n Si -> S");
            System.out.println(" No -> Otro Caracter");
            System.out.print("\n Ingrese: ");
            
            key = keyboard.nextLine();
            //convertir en mayuscula si la letra ingresada es miniscula
            key = key.toUpperCase();
            
       }while(key.charAt(0) == 'S');
       
        System.out.println("\n\n\nazucar");  
    }
}
