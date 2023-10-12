package ejercicio2_2;

public class planeta {String nombredelplaneta= null;
    int cantidaddesatelites= 0;
    int diametro=0;
    int distanciaalsol=0;
    double masa=0;
    double volumen=0;
    float periodoorbital=0;
    float periododerotacion=0;
    enum tipoPlaneta {GASEOSO,TERRESTRE,ENANO}
    tipoPlaneta tipo;
    boolean esobservable=false;
    planeta(String nombredelplaneta, int cantidaddesatelites, double masa, double
            volumen, int diametro, int distanciaalsol,float periododerotacion,float periodoorbital, tipoPlaneta tipo, boolean esobservable) {
        this.nombredelplaneta = nombredelplaneta;
        this.cantidaddesatelites = cantidaddesatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaalsol = distanciaalsol;
        this.periodoorbital=periodoorbital;
        this.periododerotacion=periododerotacion;
        this.tipo = tipo;
        this.esobservable = esobservable;
    }
    void imprimir() {
        System.out.println("nombre del planeta= "+nombredelplaneta);
        System.out.println("cantidad de satelites= "+cantidaddesatelites);
        System.out.println("la masa del planeta= "+ masa);
        System.out.println("el volumen del planeta= "+ volumen);
        System.out.println("el diametro del planeta"+ diametro);
        System.out.println("la distacia al sol= "+ distanciaalsol);
        System.out.println("el tipo del planeta= "+ tipo);
        System.out.println("periodo orbital del planeta en años= "+periodoorbital);
        System.out.println("periodo de rotacion en dias= "+periododerotacion);
        System.out.println("si el planeta es o no observable= "+ esobservable);
    }
    double calcularDensidad() {
        return masa/volumen;
    }
    boolean esPlanetaExterior(){
        float limite = (float) (149597870 * 3.4);
        if (distanciaalsol > limite) {
            return true;
        } else {
            return false;
        }
    }

    public float getPeriodoorbital() {
        return periodoorbital;
    }

    public void setPeriodoorbital(float periodoorbital) {
        this.periodoorbital = periodoorbital;
    }

    public float getPeriododerotacion() {
        return periododerotacion;
    }

    public void setPeriododerotacion(float periododerotacion) {
        this.periododerotacion = periododerotacion;
    }

    public String getNombredelplaneta() {
        return nombredelplaneta;
    }

    public void setNombredelplaneta(String nombredelplaneta) {
        this.nombredelplaneta = nombredelplaneta;
    }

    public int getCantidaddesatelites() {
        return cantidaddesatelites;
    }

    public void setCantidaddesatelites(int cantidaddesatelites) {
        this.cantidaddesatelites = cantidaddesatelites;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistanciaalsol() {
        return distanciaalsol;
    }

    public void setDistanciaalsol(int distanciaalsol) {
        this.distanciaalsol = distanciaalsol;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public tipoPlaneta getTipo() {
        return tipo;
    }

    public void setTipo(tipoPlaneta tipo) {
        this.tipo = tipo;
    }

    public boolean isEsobservable() {
        return esobservable;
    }

    public void setEsobservable(boolean esobservable) {
        this.esobservable = esobservable;
    }
}
