package Banco;

public class CuentaCorriente {

        private String nombre;
        private long nroCuenta;
        private double saldo;
        private double balance;


        public CuentaCorriente(String nombre, long nroCuenta, double saldo) {
            this.nombre = nombre;
            this.nroCuenta = nroCuenta;
            this.saldo = saldo;
        }


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public long getNroCuenta() {
            return nroCuenta;
        }

        public void setNroCuenta(long nroCuenta) {
            this.nroCuenta = nroCuenta;
        }

        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }


        //metodos de instancia
        public void credit ( double amount){
            saldo = saldo + amount;
        }
        public void debit ( double amount){
            saldo = saldo - amount;
        }
        @Override
        public String toString() {
            return "Cliente [nombre=" + nombre + ", nroCuenta=" + nroCuenta + ", saldo=" + saldo + "]";
        }
    }
