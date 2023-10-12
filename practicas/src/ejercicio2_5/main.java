package ejercicio2_5;

public class main {
    public static void main(String[] args) {
        cuentaBancaria cuenta = new cuentaBancaria("Pedro","Pérez",
                123456789, cuentaBancaria.tipo.AHORROS,0.3);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);

    }
}
