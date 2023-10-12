package ejercicio2_3;

public class main {
    public static void main(String args[]) {
        auto auto1 = new auto("Ford",2018,3, auto.tipoCom.DIESEL, auto.tipoA.EJECUTIVO,5,
                6,250, auto.tipoColor.NEGRO,"mecanico");
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual =  "+ auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(20);
        System.out.println();
        System.out.println("la multa del vehiculo es de: "+auto1.multa);
    }
}
