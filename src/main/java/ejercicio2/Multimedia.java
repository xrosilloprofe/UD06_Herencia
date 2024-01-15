package ejercicio2;

public class Multimedia {
    //Atributos título, autor, formato, y duración como atributos
    private String titulo;
    private String autor;
    private Formato formato;
    private int duracion;

    public Multimedia(String titulo, String autor, Formato formato, int duracion){
        this.autor=autor;
        this.titulo=titulo;
        this.formato=formato;
        this.duracion=duracion;
    }

    public String getTitulo(){ return titulo;}
    public String getAutor(){return autor;}
    public Formato getFormato(){return formato;}
    public int getDuracion(){return duracion;}

    @Override
    public String toString(){
        return "Título: " + titulo + " del autor: " + autor +
                " en formato: " + formato + " con duración: " + duracion;
    }

    @Override
    public boolean equals(Object obj){
        //si es nulo - si es una instancia de Multimedia
        if(obj==null || !(obj instanceof Multimedia))
            return false;
        //casteo
        Multimedia multimedia = (Multimedia) obj;
        //comprobar
        return (multimedia.getTitulo().equals(titulo) &&
                autor.equals(multimedia.getAutor()));
    }

}
