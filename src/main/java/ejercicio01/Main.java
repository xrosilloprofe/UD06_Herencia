package ejercicio01;

public class Main {
    public static void main(String[] args) {
        Persona blanca = new Persona("1A","Blanca","Romero Cano",45);
        Persona pepa = new Alumno("1A","Blanca","Romero Cano",34,Grado.DAM_PRIMERO);
        Grado[] gradosQIm = {Grado.ASIR_PRIMERO,Grado.DAM_PRIMERO};
        Directivo lluna = new Directivo("3A","Lluna","Navarro García", 20,gradosQIm,"Jefa de estudios");
        Profesor dulce = new Profesor("4V","Dulce","Pérez Rodríguez", 50,new Grado[]{Grado.DAW_SEGUNDO});
        dulce.setCursosImparte(Grado.DAW_SEGUNDO,Grado.DAM_SEGUNDO);

        System.out.println(blanca);
        pepa.cumplirAnyos();
        System.out.println(pepa);
        lluna.cumplirAnyos();
        System.out.println(lluna);
        System.out.println(dulce);

        System.out.println("Son iguales? " + blanca.equals(pepa));
        blanca.printDNI();
        pepa.printDNI();
        lluna.printDNI();
        dulce.printDNI();

        //Casting implícito
        Object object = new Directivo("3B","Manolo","Tres Cuatro",64,new Grado[]{Grado.ASIR_SEGUNDO},"Director");
        System.out.println(object);
        //object.cumplirAnyos();

        //Casting explícito
        if(object instanceof Directivo){
            Directivo directivo = (Directivo) object;
            directivo.cumplirAnyos();
            System.out.println(directivo);
        }

    }
}
