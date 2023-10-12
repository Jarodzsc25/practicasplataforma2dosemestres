package ejercicio2_8;

public class avion { private String fabricante;
    private int numeroMotores;
    //constructores


    public avion(String fabricante, int numeroMotores) {
        this.fabricante = fabricante;
        this.numeroMotores = numeroMotores;
    }
    // metodos
    public String getFabricante(){
        return fabricante;
    }
    private void setFabricante(){
        this.fabricante=fabricante;
    }
    void setFabricante(String fabricante){
        this.fabricante=fabricante;
    }
    void cambiarFabricante(avion a){
        a.setFabricante("Lockheed");
    }
    public int getNumeroMotores(){
        return numeroMotores;
    }
    private void setNumeroMotores(int numeroMotores){
        this.numeroMotores=numeroMotores;
    }
    public void imprimirFabricante(){
        System.out.println("El fabricante del avion es: "+fabricante);
    }



}

