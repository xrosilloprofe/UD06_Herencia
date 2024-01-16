package ejercicio1;

import java.util.Arrays;

public class Profesor extends Persona{
    private Grado[] cursosImparte;


    public Profesor(String DNI, String nombre, String apellidos, int edad, Grado[] cursosImparte) {
        super(DNI, nombre, apellidos, edad);
        this.cursosImparte=cursosImparte;
    }

    public Grado[] getCursosImparte(){ return cursosImparte;}
    public void setCursosImparte(Grado... cursosImparte){
        this.cursosImparte=cursosImparte;
    }

    @Override
    public void printDNI(){
        System.out.println("Desde Profesor imprimo el DNI: " + getDNI());
    }

    @Override
    public String toString(){
        return super.toString() +
                " Profesor que imparte los cursos " + Arrays.toString(cursosImparte);
    }

}
