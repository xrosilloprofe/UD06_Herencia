package ejercicio2;

public class Principal {
    public static void main(String[] args) {
        Multimedia cosa = new Multimedia("Matrix","Hermanas Wachosky",
                Formato.DVD,60*120);
        Multimedia cosa2 = new Multimedia("Hijos de los hombre", "Alfonso Cuarón",
                Formato.DVD,60*90);
        Multimedia cosa3 = new Multimedia("Matrix","Hermanas Wachosky",
                Formato.AVI,60*153);

        Pelicula pelicula1 = new Pelicula("Shrek","Dreamworks",
                Formato.DVD,60*120);
        Pelicula pelicula2 = new Pelicula("La sirenita", "Disney",
                Formato.DVD,60*90,null,null);
        Pelicula pelicula3 = new Pelicula("Matrix","Hermanas Wachosky",
                Formato.AVI,60*153,"Keanu Reaves","Carrie-Ann Moss");

        Disco disco1 = new Disco("Javelin","Sufjan Stevens",Formato.WAV,50*60,"pop");

        System.out.println(cosa);
        System.out.println(cosa2);
        System.out.println("Las cosas 1 y 3 son iguales? --> " + cosa.equals(cosa3));
        System.out.println("Las cosas 1 y 2 son iguales? --> " + cosa.equals(cosa2));

        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);
        System.out.println("Cosa 1 y pelicula 3 son iguales? --> " + cosa.equals(pelicula3));

        System.out.println(disco1);
        System.out.println("Cosa 1 y disco 3 son iguales? --> " + cosa.equals(disco1));



    }
}
