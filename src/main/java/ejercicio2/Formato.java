package ejercicio2;

/**
 * El Formato puede ser uno de los siguientes:
 * wav, mp3, midi, avi, mov, mpg, cdAudio y dvd
 */
public enum Formato {
    WAV(".wav"), MP3(".mp3"), MIDI(".midi"),
    AVI(".avi"), MOV(".mov"), MPG(".mpg"),
    CDAUDIO(".cda"), DVD(".dvd");

    //El atributo extensión del archivo
    private String extension;
    Formato(String extension){ this.extension=extension;}
    public String getExtension(){return extension;}

}
