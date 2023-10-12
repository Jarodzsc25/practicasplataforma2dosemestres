package ejercicio2_4;

public class circulo {
    int radio;
    public circulo(int radio) {
        this.radio = radio;
    }
    double calcuArea (){
        return Math.PI*Math.pow(radio,2);
    }

    double calcularPerimetro (){
        return 2*Math.PI*radio;
    }
}
