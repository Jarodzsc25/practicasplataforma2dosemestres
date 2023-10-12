package ejercicio2_4;

public class main {
    public static void main(String[] args) {
        circulo cir1 = new circulo(2);
        ractangulo rec1= new ractangulo(1,2);
        cuadrado cua1= new cuadrado(3);
        trianguloRectangulo tiran1 = new trianguloRectangulo(3,5);
        rombo rom1 = new rombo(2,2);
        trapecio tra1 = new trapecio(4,8,3);

        System.out.println("El area del circulo es: "+ cir1.calcuArea());
        System.out.println("El perimetro del circulo es: "+ cir1.calcularPerimetro());
        System.out.println();

        System.out.println("El area del rectangulo es: "+rec1.calcularArea());
        System.out.println("El perimetro del rectangulo es: "+rec1.calcularPeri());
        System.out.println();

        System.out.println("El area del cuadrado es: "+ cua1.calcularArea());
        System.out.println("El perimetro del cuadrado es: "+ cua1.calcularPeri());
        System.out.println();

        System.out.println("El area del triangulo es: "+tiran1.calcularArea());
        System.out.println("El perimetro del triangulo es: "+ tiran1.calcularPeri());
        tiran1.derminarTipoTrian();

        System.out.println("El area del rombo es: "+ rom1.calcularArea());
        System.out.println("El perimetro del rombo es: " + rom1.calcularPeri() );
        System.out.println();

        System.out.println("El area del trapecio es: "+tra1.calcularArea());
        System.out.println("El perimetro del trapecio es:"+tra1.calcularPeri());
        System.out.println();
    }
}
