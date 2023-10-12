package ejercicio2_1;

public class persona {
    String nombre;
    String apellido;
    String numeroDocumentoIdentidad;
    String pais;
    char genero;
    int fechadenacimiento;
    public persona(String nombre, String apellido, String numeroDocumentoIdentidad, String pais, char genero, int fechadenacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.fechadenacimiento = fechadenacimiento;
        this.genero = genero;
        this.pais = pais;
    }
    void imprimir() {
        System.out.println("nombre= "+ nombre);
        System.out.println("apellido= " + apellido);
        System.out.println("nuemero del documento de identidad= "+ numeroDocumentoIdentidad);
        System.out.println("fecha de nacimineto= "+ fechadenacimiento);
        System.out.println("pais de origen= "+pais);
        System.out.println("genero= "+genero);
        System.out.println();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public int getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(int fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }
}
