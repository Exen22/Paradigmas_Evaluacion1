/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

//import java.util.Scanner;
import library.ValidF;

public class Menu {

   
    public static void main(String[] args) {
        
        int num;
        boolean band;//variable bandera usada para confirmar salida
       // Scanner keyboard = new Scanner(System.in);
        ValidF valid = new ValidF();//objeto para validar
        
        Pila<Integer> pila = new Pila<>();
        
        do
        {
            band = true;

            //Menu de opciones
            System.out.println("\n\t\t Menu Pila\n\n");
            System.out.print("\t 1: Agregar elemento en la pila");
            System.out.print("\n\t 2: Eliminar elemento de la pila");
            System.out.print("\n\t 3: Ver elementos en la pila");
            System.out.print("\n\t 4: Modificar elemento en la pila");
            System.out.print("\n\t 5: Vaciar pila");
            System.out.print("\n\t Otro: salir del programa");
            System.out.print("\n\n\t Ingrese: ");
            num = (int) valid.validate();
            
            switch(num)
            {
                case 1: 
                    
                    System.out.println("\n\n\n\n\n\n\t Guardar elementos en la pila");
                    
                    do{
                        
                        do{
                            System.out.print("\n\n Ingrese numero entre 1-9: ");
                            num = (int) valid.validate();
                            
                            if (num < 1 || num > 9)
                                System.out.println("\n Solo se aceptan numeros entre 1-9");
                        }while(num < 1 || num > 9);
                        
                        pila.push(num);
                        System.out.print("\n\n Numero "+ pila.getLastvalueDate() + " Agregado correctamente \n");
                        
                        
                        System.out.println("\n\n Desea ingresar otro numero?");
                        System.out.print("\n\n Ingrese 0 para volver a ingresar un numero: ");
                        num = (int) valid.validate();
               
                                
                    }while(num == 0);
                    
                    break;
                    
                case 2: 
                    
                    if (pila.empty())
                        System.out.println("\n\n Pila vacia");
                    else System.out.println("\n\n\n\n Numero " + pila.pop() + " Ha sido eliminado ");
                    break;
                
                case 3:
                     if (pila.empty())
                        System.out.println("\n\n Pila vacia");
                     else {
                        System.out.print("\n\n\n Elementos de la pila: \n\n");
                        pila.showAll();
                     }
                    
                    break;
                    
                case 4:
                    
                    int size;
                    
                    if (pila.empty())
                        System.out.println("\n\n Pila vacia");
                    
                    else {
                        
                        System.out.print("\n\n Modificar elementos de la pila\n\n\n");
                        System.out.print(" Elementos en la Pila: \n");
                        pila.showAll();
                        System.out.print("\n\n Ingrese el numero de posicion correspondiente al elemento que desea modificar\n");
                        do{
                            System.out.print("\n Ingrese 0 si desea cancelar: ");
                            size = (int)valid.validate();
                        
                            if (size > pila.getTamano() || size < 1 && size != 0)
                                System.out.println("\n Posicion incorrecta intente de nuevo \n");
                        
                        }while(size > pila.getTamano() || size < 1 && size != 0);
                    
                        //se ejecuta siempre y cuando no se cancele el cambio
                        if (size != 0)
                        {
                            do{
                                System.out.print("\n\n Ingrese numero entre 1-9: ");
                                num = (int) valid.validate();
                            
                                if (num < 1 || num > 9)
                                    System.out.println("\n Solo se aceptan numeros entre 1-9");
                                
                            }while(num < 1 || num > 9);
                            pila.modify(size, num);
                        }
                    }
                    
                    break;
                    
                case 5:
                    
                    if (pila.empty())
                       System.out.println("\n\n\bLa pila ya esta vacia");
                    else { 
                        pila.emptyAll();
                        System.out.print("\n Se ha vaciado la pila");
                    }
                    
                    break;
                    
                default:
                    band = false;
                    System.out.println("\n\n Seguro que quiere salir?");
                    System.out.print("\n Ingrese 0 para cancelar y otro numero para confirmar: ");
                    num = (int) valid.validate();
            }
            
            if (band)
            {
                System.out.println("\n\n\n\n Desea volver al menu? ");
                System.out.print("\n Ingrese 0 para volver (Otro para salir del programa): ");
                num = (int) valid.validate();    
            }
           
            System.out.println("\n\n\n\n\n");
        }while(num == 0);
      
    }
    
}
