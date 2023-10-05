package ejercicio2_7;

public class main {
    public static void main(String ags[]) {
        peliculas película1 = new peliculas("Gandhi", "Richard Attenborough", peliculas.tipo.DRAMA,191,1982,8.3);
        peliculas película2 = new peliculas("Thor", "Kenneth Branagh",peliculas.tipo.ACCIÓN, 115,2011,7.0);
        película1.imprimir();
        System.out.println();
        película2.imprimir();
        System.out.println();
        System.out.println("La película " + película1.getNombre() +  " es épica: " + película1.esPelículaEpica());
        System.out.println("La película " + película2.getNombre() + " es épica: "  + película2.esPelículaEpica());
        System.out.println("La película "  + película1.getNombre() + " y la película "  + película2.getNombre() + " son similares = " +película1.esSimilar(película2));
        película1.imprimircartel();
        película2.imprimircartel();
    }
}
