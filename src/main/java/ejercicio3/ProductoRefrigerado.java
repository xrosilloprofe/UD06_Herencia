package ejercicio3;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{
    private String supervision;
    public ProductoRefrigerado(LocalDate fechaCaducidad, int numLote, String supervision){
        super(fechaCaducidad, numLote);
        this.supervision=supervision;
    }

    public void setSupervision(String supervision) {
        this.supervision = supervision;
    }

    public String getSupervision(){ return supervision;}

    @Override
    protected void envioProducto(String direccion){
        System.out.println("Envío por camión frigo a " + direccion);
    }

    @Override
    public String toString(){
        return "Producto Refrigerado " + super.toString() + " supervisado por el organismo " + supervision;
    }
}
