package ejercicio5;

public class Principal {
    public static void main(String[] args) {
        Coche coche1=new Coche("1111AAA","Toyota","Auris");
        Coche coche2=new Coche("2222AAA","Renault","Clio");
        Coche coche3=new Coche("3333AAA","BYD","nosecual");

        Cliente cliente1=new Cliente("Jaime","Marti","1A","casa 1");
        Cliente cliente2=new Cliente("Matthew","Pareja","2B","calle alta,1");
        Cliente cliente3=new Cliente("Marcos","Rubio","3C","calle baja,1");
        Cliente cliente4=new Cliente("Alejandro","Paúl","4D","calle mayor,1");

        Secretario jesus = new Secretario("Jesús","Tarín","6F","casa3","5555",40000,"5556","despacho1");
        Secretario juanluis = new Secretario("Juan Luís","Espinosa","7G","casa4","5557",40000,"5558","despacho2");

        Vendedor aray = new Vendedor("Aray","Brito","8H","casa6","6666",20000,coche1,"6667","area1",10);
        Vendedor cristobal = new Vendedor("Cristóbal","Madariaga","9I","casa7","6668",20000,coche2,"6669","area2",9);

        JefeZona marcos=new JefeZona("Marcos","Martínez","5E","casa2","9555",50000,"despacho1",jesus,new Vendedor[]{cristobal},coche3);

        juanluis.incrementarSalario();
        juanluis.cambiarSupervisor(aray);
        jesus.cambiarSupervisor(marcos);
        aray.cambiarSupervisor(cristobal);
        aray.anyadirCliente(cliente1);
        cristobal.anyadirCliente(cliente2);
        aray.anyadirCliente(cliente3);
        aray.borrarCliente(cliente3);
        aray.borrarCliente(cliente3);
        cristobal.anyadirCliente(cliente3);
        aray.anyadirCliente(cliente4);

        marcos.anyadirVendedor(aray);
        marcos.cambiarSecretario(juanluis);

        System.out.println(jesus);
        System.out.println(juanluis);
        System.out.println(aray);
        System.out.println(cristobal);
        System.out.println(marcos);

    }
}
