package ejercicio3;

import java.time.LocalDate;

public class ProductoFresco extends Producto{

    private LocalDate fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado, String paisOrigen){
        super(fechaCaducidad,numLote);
        this.fechaEnvasado=fechaEnvasado;
        this.paisOrigen=paisOrigen;
    }

    @Override
    protected void envioProducto(String direccion){
        System.out.println("Envío del producto por coche a " + direccion);
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setPaisOrigen(String paisOrigen){
        this.paisOrigen=paisOrigen;
    }

    public LocalDate getFechaEnvasado(){ return fechaEnvasado;}
    public String getPaisOrigen(){return paisOrigen;}

    @Override
    public String toString(){
        return "Producto Fresco " + super.toString() + " fecha de envasado " + fechaEnvasado + " país de origen " + paisOrigen;
    }

}
