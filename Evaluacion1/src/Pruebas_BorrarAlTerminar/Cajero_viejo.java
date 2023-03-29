package Pruebas_BorrarAlTerminar;

import FunctionsPkg.*;

public class Cajero_viejo {
    private int monto;
    private int b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, b2 = 0, b1 = 0;
    
    public Cajero_viejo(int _monto){//Constructor
        this.monto = _monto;
    }
    
    public void desgloseMonto(){//setter
        int aux = monto;
        b100 = aux / 100;
        aux %= 100;
        b50 = aux / 50;
        aux %= 50;
        b20 = aux / 20;
        aux %= 20;
        b10 = aux / 10;
        aux %= 10;
        b5 = aux / 5;
        aux %= 5;
        b2 = aux / 2;
        aux %= 2;
        b1 = aux;
        
    }
    
    public void show(){//getter
        System.out.println("\n El desglose del monto '"+monto+"' Es: \n");
        System.out.println(" Billetes de 100: "+b100+"\n Billetes de 50: "+b50+"\n Billetes de 20: "+b20+
        "\n Billetes de 10: "+b10+"\n Billetes de 5: "+b5+"\n Billetes de 2: "+b2+"\n Billetes de 1: "+b1);
    }
}
