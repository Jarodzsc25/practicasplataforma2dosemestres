package ejercicio2_6;

public class main {
    public static void main(String args[]) {
        cuentabancaria cuenta1 = new
                cuentabancaria("Pedro","Pérez",123456789, cuentabancaria.tipo.AHORROS);
        cuentabancaria cuenta2 = new
                cuentabancaria("Pablo","Pinzón",44556677, cuentabancaria.tipo.AHORROS);
        cuenta1.consignar(200000);
        cuenta2.consignar(100000);
        cuenta1.compararCuentas(cuenta2);
        cuenta1.transferencia(cuenta2,50000);
        cuenta1.consultarSaldo();
        cuenta2.consultarSaldo();
        cuenta1.cuentaActiva();
        cuenta2.cuentaActiva();
    }
}
