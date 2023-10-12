package ejercicio2_4;

public class rombo {
    double diago;
    double diagonal;

    //constructor

    public rombo(double diago, double diagonal) {
        this.diago = diago;
        this.diagonal = diagonal;
    }
    //metodos
    double calcularArea(){
        return (diago*diagonal)/2;
    }
    double calcularPeri (){
        return (2*diago)+(2*diagonal);
    }
}
