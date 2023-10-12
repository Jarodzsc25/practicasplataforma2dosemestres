package ejercicio2_4;

public class ractangulo {
    int base;
    int altura;
    //const


    public ractangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //metodos

    double calcularArea() {
        return base*altura;
    }
    double calcularPeri(){
        return (2*base)+(2*altura);
    }
}
