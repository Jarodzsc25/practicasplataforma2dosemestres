package ejercicio2_8;

public class main {
    public static void main(String[] args) {
        avion a1= new avion("Airbus",4);
        avion a2;
        avion a3 =new avion("Boeign",4);
        a2=a1;
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.setFabricante("Douglas");
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        a1.cambiarFabricante(a2);
        a2.imprimirFabricante();
        avion  a4=new avion("LLoyd",6);
        avion a5;
        a5=a4;
        a4.imprimirFabricante();
        a5.imprimirFabricante();
        a5.setFabricante("Stealth");
        a4.imprimirFabricante();
        a5.imprimirFabricante();

    }

}

