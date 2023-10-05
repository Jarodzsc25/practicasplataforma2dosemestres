package ejercicio2_7;
    public class peliculas {
        private String nombre;
        private String director;
        enum tipo {ACCIÓN, COMEDIA, DRAMA, SUSPENSO};
        tipo género;
        private int duración;
        private int año;
        private double calificación;
        public peliculas(String nombre, String director, tipo género, int duración,
                         int año, double calificación) {
            this.nombre = nombre;
            this.director = director;
            this.género = género;
            this.duración = duración;
            this.año = año;
            this.calificación = calificación;
        }


       public String getNombre() {
            return nombre;
        }
        private void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getDirector() {
            return director;
        }
        private void setDirector(String director) {
            this.director = director;
        }
        public tipo getGénero() {
            return género;
        }
        private void setGénero(tipo género) {
            this.género = género;
        }
        public int getDuración() {
            return duración;
        }
        private void setDuración(int duración) {
            this.duración = duración;
        }
        public int getAño() {
            return año;
        }
        private void setAño(int año) {
            this.año = año;
        }
        public double getCalificación() {
            return año;
        }
        private void setCalificación(double calificación) {
            this.calificación = calificación;
        }
        public void imprimir() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Director: " + director);
            System.out.println("Género: "+ género);
            System.out.println("Duración: " + duración);
            System.out.println("Año: " + año);
            System.out.println("Calificación: " + calificación);
        }
        boolean esPelículaEpica() {
            if (duración >= 180) {
                return true;
            } else {
                return false;
            }
        }
        private String calcularValoración() {
            if (calificación >= 0 && calificación <= 2) {
                return "*";
            } else if (calificación > 2 && calificación <= 5) {
                return "**";
            } else if (calificación > 5 && calificación <= 7) {
                return "***";
            } else if (calificación > 7 && calificación <= 8) {
                return "****";
            } else if (calificación > 8 && calificación <= 10){
                return "*****";
            } else {
                return "No tiene asignada una valoración válida";
            }
        }
        boolean esSimilar(peliculas película) {
            if (película.género == género && película.calcularValoración() == calcularValoración()) {
                return true;
            } else {
                return false;
            }
            }
            public void imprimircartel(){
                System.out.println("-------"+nombre+"-------");
                System.out.println(calcularValoración());
                System.out.println(año);
                System.out.println(tipo.ACCIÓN+","+tipo.COMEDIA+","+tipo.DRAMA);
                System.out.println(director);

            }
    }
