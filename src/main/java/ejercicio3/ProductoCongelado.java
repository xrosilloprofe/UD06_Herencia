package ejercicio3;

import java.time.LocalDate;

public class ProductoCongelado extends Producto{
    private int temperatura;

    public ProductoCongelado(LocalDate fechaCaducidad, int numLote, int temperatura) {
        super(fechaCaducidad, numLote);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString(){
        return "Producto Congelado " + super.toString() + " temperatura de congelación " + temperatura;
    }

    @Override
    protected void envioProducto(String direccion){
        System.out.println("Envío por camión congelador a " + direccion);
    }

}
