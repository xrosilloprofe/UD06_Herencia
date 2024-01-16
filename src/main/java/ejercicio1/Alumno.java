package ejercicio1;

public class Alumno extends Persona{

    private int NIA;
    private Grado curso;

    public Alumno(String DNI, String nombre, String apellidos, int edad, int NIA, Grado curso){
        super(DNI,nombre,apellidos,edad);
        this.curso=curso;
        this.NIA=NIA;
    }

    public Alumno(String DNI, String nombre, String apellidos, int edad, Grado curso){
        super(DNI,nombre,apellidos,edad);
        this.curso=curso;
        this.NIA=generateNIA();
    }

    @Override
    public void printDNI(){
        System.out.println("Desde Alumno imprimo el DNI: "+ getDNI());
    }

    @Override
    public String toString(){
        return super.toString() + " Alumno de " + curso + " NIA: " + NIA;
    }

    private int generateNIA(){ return (int)(Math.random()*100000000);}


}
