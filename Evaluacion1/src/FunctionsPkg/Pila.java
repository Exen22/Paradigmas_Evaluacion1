/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionsPkg;

public class Pila<T> {
    
    private Nodo<T> lastvalue;
    private int tamano;
    //String text = "";
    public Pila()
    {
        lastvalue = null;
        tamano = 0;
    }
    
    public void push(T info){
        
        Nodo<T> niuNodo = new Nodo<>(info);
        niuNodo.setNext(lastvalue);
        lastvalue = niuNodo;
        tamano++;
    }

    public int getTamano() {
        return tamano;
    }
    
    public T pop()
    {
        T aux = lastvalue.getDate();
        lastvalue = lastvalue.getNext();
        tamano--;
        return aux;
    }
    
    public boolean empty()
    {
        return lastvalue == null;
    }

    public T getLastvalueDate() {
        return lastvalue.getDate();
    }

    /*
     * No se exactamente que hace esto el netbeans lo puso
    @Override
    public String toString() {
        return "Pila{" + "lastvalue =" + lastvalue + ", tamano =" + tamano + '}';
    }
    */
    public void emptyAll()
    {
        while(!empty())
            pop();
    }
    
    public void showAll()
    {
        Nodo<T> aux = lastvalue;
        int i = 1;
        
        do{
           
            System.out.print(" "+i + ": " + aux.getDate() + "\n");
               
            i++;
            aux = aux.getNext();
            
        }while(aux != null);
    }
     
    public void modify(int size, T niuValue)
    {
        Nodo<T> aux;
        aux = lastvalue;
        
        for(int i = 1; i < size; i++)
            aux = aux.getNext();
       
        aux.setDate(niuValue);
    }
    
    public void deleteOne(int size)
    {
        Nodo<T> aux,lastN,nextN;
        aux = lastvalue;
        nextN = lastvalue;
        
        if (size == 1)
            pop();
        else {
            
            lastN = null;
          
            for (int i = 1; i < size; i++)
            {
                
            lastN = aux;//guardamos el nodo actual
            aux = aux.getNext();//corremos un espacio
            nextN = aux.getNext();//totamos el siguiente nodo
            
            //lo repetimos hasta llegar a la posicion deseada
            //con esto logramos que lastN guarde el nodo anterior al actual
            //y nextN al nodo siguiente al actual, al llegar al nodo que queremos
            //Solo hacemos que lastN siguiente apunte a nextN
           
            }
           
           
           lastN.setNext(nextN);//igualar siguiente a nextN
        }
        
        tamano--;
    }
    
}

