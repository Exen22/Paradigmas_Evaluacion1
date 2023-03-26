package FunctionsPkg;

public class Cajero {
    private int monto;
    private int b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, b2 = 0, b1 = 0;
    
    public Cajero(int _monto){//Constructor
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
        System.out.println("El desglose del monto '"+monto+"' Es: ");
        System.out.println("Billetes de 100: "+b100+"\nBilletes de 50: "+b50+"\nBilletes de 20: "+b20+
        "\nBilletes de 10: "+b10+"\nBilletes de 5: "+b5+"\nBilletes de 2: "+b2+"\nBilletes de 1: "+b1);
    }
}
