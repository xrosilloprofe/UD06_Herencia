package ejercicio1;

import java.util.Arrays;

public class Directivo extends Persona{

    private String cargo;
    private Grado[] clasesImparte;

    public Directivo(String DNI, String nombre, String apellidos, int edad, Grado[] clasesImparte, String cargo) {
        super(DNI, nombre, apellidos, edad);
        this.cargo=cargo;
        this.clasesImparte = clasesImparte;
    }

    public String getCargo(){return cargo;}
    public void setCargo(String cargo){ this.cargo=cargo;}

    @Override
    public void printDNI(){
        System.out.println("Desde Directivo imprimo el DNI: " + getDNI());
    }

    @Override
    public String toString(){
        return super.toString() +
                " Directivo con cargo " + cargo +
                " cursos que imparte " + Arrays.toString(clasesImparte);
    }


}
