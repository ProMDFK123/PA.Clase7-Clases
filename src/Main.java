import Ejercicios.CuentaBancaria;
import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        while(true){
            try {
                StdOut.println("Ingrese saldo inicial: ");
                int saldo = StdIn.readInt();
                if(saldo>0){
                    cuenta.setSaldo(saldo);
                    break;
                }
                StdOut.println("Ingrese un valor positivo.");

            }catch(InputMismatchException ex){StdOut.println("Debe ingresar un valor númerico");}
        }
        while (true){
            try{
                StdOut.println("Ingrese monto a depositar: ");
                int deposito = StdIn.readInt();
                if(deposito>0){
                    cuenta.depositar(deposito);
                    break;
                }
                StdOut.println("Ingrese un valor positivo");
            }catch (InputMismatchException ex){StdOut.println("Ingrese un número");}
        }
        while (true){
            try {
                StdOut.println("Ingrese monto a girar: ");
                int giro = StdIn.readInt();
                if(giro>0){
                    cuenta.girar(giro);
                    break;
                }
                StdOut.println("Ingrese un valor positivo.");
            }catch (InputMismatchException ex){StdOut.println("Ingrese un número.");}
        }
        StdOut.println("Su saldo es de $"+cuenta.getSaldo());
    }
}