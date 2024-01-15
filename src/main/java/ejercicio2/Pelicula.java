package ejercicio2;

import java.text.Normalizer;

public class Pelicula extends Multimedia{

    private static final String ANIMACION="Animación";

    private String actor;
    private String actriz;

    public Pelicula(String titulo, String autor, Formato formato, int duracion){
        super(titulo,autor,formato,duracion);
        this.actor=ANIMACION;
        this.actriz=ANIMACION;
    }

    public Pelicula(String titulo, String autor, Formato formato, int duracion,String actor,String actriz){
        this(titulo, autor, formato, duracion);
        if (!(actor==null && actriz==null)) {
            this.actor = actor;
            this.actriz = actriz;
        }
    }

    public String getActor(){ return actor;}
    public String getActriz(){ return actriz;}

    @Override
    public String toString(){
        if(actriz.equals(ANIMACION))
            return "Película --> " + super.toString() + " sin actores";
        return "Película --> " + super.toString() + " actor: " + actor + " actriz: " + actriz;
    }

}
