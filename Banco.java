
import java.util.Scanner;

public class Banco {
    private int cuenta;
    private String cliente;
    private int deposito;
    private int saldo;

    public Banco(int cuenta){
        this.cuenta = cuenta;

    }
    public Banco(int cuenta, String cliente){
        this.cuenta = cuenta;
        this.cliente = cliente;
    }
    public Banco(int deposito, int saldo){
        this.deposito = deposito;
        this.saldo = saldo;
    }
    public Banco(int cuenta, String clinete, int deposito, int saldo){
        this.cuenta = cuenta;
        this.cliente = cliente;
        this.deposito = deposito;
        this.saldo = saldo;
    }
    //definir metodo
    public void acuenta(int valor){
        if(valor < 1000){
            this.cuenta = valor;

        }
        else{
            System.out.println("El numero de cuenta fuera de rango");
        }
        public void acuenta (int = cliente){
            this.cuenta = cliente;
        }
        public void acliente (String valor){
            this.cliente = valor;


        }
        public void adeposito (int d){
            this.deposito = d;
        }
        public void asaldo (int s){
            this.saldo = s;
        }
    
        public int Icuenta(){
            return this.cuenta;
        }
        public int Icliente(){
            return this.cliente;
        }
        public int Ideposito(){
            return this.deposito;
        }
        public int Isaldo(){
            return this.saldo;
        }
        
    }
    public static void main(String[] args){
        Banco b1 = new Banco (cuenta:99,cliente:"Dave Pozo");
        Bnaco b2 = new Banco (deposito:500,saldo:1200);
        Banco b3 = new Banco (cuenta:200,cliente:"Josue Pozo",deposito:96,saldo:587);
        Banco b4 = new Banco (1025);

        System.out.println("Prueba de clase por tipo de costructor");
        System.out.println(b1.Icuenta()+ "" + b1.Icliente());
        System.out.println(b2.Ideposito()+ "" + b2.Isaldo());
        System.out.println(b3.Icuenta()+ "" + b3.Icliente() + " " b3.Ideposito() + "" + b3.Isaldo());
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese cuenta a verificar");
        int valos = teclado.nextInt();
        b4.acuenta(valor);
        teclado.close();
    }



}
