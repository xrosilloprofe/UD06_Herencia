package ejercicio3;

import java.time.LocalDate;

public abstract class Producto {
    private LocalDate fechaCaducidad;
    private int numLote;

    public Producto(LocalDate fechaCaducidad, int numLote){
        this.fechaCaducidad=fechaCaducidad;
        this.numLote=numLote;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad){
        this.fechaCaducidad=fechaCaducidad;
    }
    public void setNumLote(int numLote){
        this.numLote=numLote;
    }
    public LocalDate getFechaCaducidad(){return fechaCaducidad;}
    public int getNumLote(){return numLote;}

    protected abstract void envioProducto(String direccion);

    @Override
    public String toString(){
        return "Producto del lote " + numLote + " con fecha caducidad " + fechaCaducidad;
    }
}
