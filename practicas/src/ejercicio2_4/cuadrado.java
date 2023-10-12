package ejercicio2_4;

public class cuadrado {
    int lado;
    public cuadrado(int lado) {
        this.lado = lado;
    }
    double calcularArea (){
        return lado*lado;
    }
    double calcularPeri () {
        return (4*lado);
    }
}
