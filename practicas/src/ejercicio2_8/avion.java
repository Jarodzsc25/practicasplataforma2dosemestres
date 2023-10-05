package ejercicio2_8;

public class avion {
        private String fabricante;
        private int numeroMotores;
    private avion(String fabricante, int numeroMotores) {
        this.fabricante = fabricante;
        this.numeroMotores = numeroMotores;
    }
    public String getFabricante() {
        return fabricante;
    }
    private void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    private void cambiarFabricante(avion a) {
        a.setFabricante("Lockheed");
    }
    public int getNumeroMotores() {
        return numeroMotores;
    }
    private void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }
    public void imprimirFabricante() {
        System.out.println("El fabricante del avión es: " + fabricante);
    }
}

