
package Entidades;


public class Cuenta {
    
    private int numCuenta;
    private int dni;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, int dni, int saldoActual) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }

    
    
}
