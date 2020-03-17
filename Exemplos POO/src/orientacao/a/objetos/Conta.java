package orientacao.a.objetos;

/**
 *
 * @author Coelho
 */
public class Conta {

    public static final int TOTAL_CONTAS = 900;

    protected int numero;
    protected double saldo;

    public Conta() {
        numero = -1;
        saldo = 0;
    }
    
    public Conta(int n) {
        numero = n;
    }        

    public Conta(double s) {
        saldo = s;
    }    
    
    public Conta(int n, double s) {
        numero = n;
        saldo = s;
    }    
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double n) {
        if (n >= 0) {
            saldo = n;
        }
    }
    
    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }
    
    public boolean sacar() {
        saldo -= 10;
        return true;
    }

    public boolean sacar(double b) {
        saldo -= b;
        return true;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo + '}';
    }
}
