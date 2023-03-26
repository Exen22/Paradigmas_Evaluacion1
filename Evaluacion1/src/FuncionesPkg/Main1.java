/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesPkg;

import java.util.Scanner;


public class Main1 {
    
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
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ValidF _validF = new ValidF();//objeto de la clase para validar flotantes
        String user,password;
        int attempts = 0,option;
       
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
        
        do
        {
            //Solo he implementado tres opciones
            System.out.print("\n\t\t Menu \n\n");
            System.out.print("\n\t 1. Factorial de un numero");
            System.out.print("\n\t 2. MCM y MCD de 3 nuemros");
            System.out.print("\n\t 3. Primos y Compuestos");
            System.out.print("\n\t 4. Ecuacion de 2do grado");
            System.out.print("\n\n Ingrese el numero correspondiente a la opcion: ");
            option = (int) _validF.validate();
            
            if (option < 1 || option > 6)
            {
                System.out.println("\n Opcion invalida intente de nuevo");
                clear(20);
            }
        }while(option < 1 || option > 6);
        /*
        switch(option)
            {
                case 1:
                    
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
                        numbers[i] = _validInt.validate();
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
            }*/
    }
    
}
