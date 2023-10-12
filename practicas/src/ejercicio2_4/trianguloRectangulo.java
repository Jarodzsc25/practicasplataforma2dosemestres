package ejercicio2_4;

public class trianguloRectangulo {
    int base;
    int altura;
    //constructores


    public trianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //metodos
    double calcularHipotenusa(){
        return Math.pow(base*base+altura*altura,0.5);
    }
    double calcularArea (){
        return (base*altura/2);
    }
    double calcularPeri(){
        return (base+altura+calcularHipotenusa());
    }
    void derminarTipoTrian (){
        if ((base==altura)&&(base==calcularHipotenusa())&&(altura==calcularHipotenusa())){
            System.out.println("Es un Triangulo equilatero");
        } else if ((base!=altura)&&(base!=calcularHipotenusa())&&(altura!=calcularHipotenusa())) {
            System.out.println("Es un triangulo escaleno");
        }else {
            System.out.println("Es un triangulo isoceles");
        }
    }
}
