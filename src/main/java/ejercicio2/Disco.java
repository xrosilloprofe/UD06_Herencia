package ejercicio2;

public class Disco extends Multimedia{
    public String genero;

    public Disco(String titulo, String autor, Formato formato, int duracion, String genero){
        super(titulo, autor, formato, duracion);
        this.genero=genero;
    }

    public String getGenero(){return genero;}

    @Override
    public String toString() {
        return "Disco --> " + super.toString() + " género: " + genero;
    }
}
