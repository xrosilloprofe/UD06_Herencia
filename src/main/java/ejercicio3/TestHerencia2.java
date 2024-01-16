package ejercicio3;

import java.time.LocalDate;

public class TestHerencia2 {
    public static void main(String[] args) {
        ProductoFresco huevos =
                new ProductoFresco(LocalDate.now().plusDays(30),
                        123,LocalDate.now(),"Portugal");

        huevos.envioProducto("Mi casa");
        System.out.println(huevos);

        ProductoRefrigerado yogur = new ProductoRefrigerado(LocalDate.now().plusMonths(1),999,"UE");
        ProductoCongelado polo = new ProductoCongelado(LocalDate.now().plusYears(1),555,-18);

        polo.envioProducto("Casa Juan Carlos");
        yogur.envioProducto("Casa blanca");

        System.out.println(yogur);
        System.out.println(polo);

    }
}
