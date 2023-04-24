package Ejercicios;

public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria() {
        this.saldo = 0;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {this.saldo = saldo;}

    public void girar(int monto){this.saldo-=monto;}

    public void depositar(int monto){this.saldo+=monto;}
}
