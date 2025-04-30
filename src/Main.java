import OrganizadordeClases.Cliente;
import OrganizadordeClases.ClienteMayorista;
import OrganizadordeClases.ClienteMinorista;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" ******* IAT Productos Lacteos Artesanales  *******");
        System.out.println("================================================================");
        System.out.println(" Sistema de Comercializacion y Facturacion ");
        System.out.println("================================================================");
//Creamos ao instanciamos el objeto c1 tipo Cliente y apunta a la subClase

        Cliente c1 = new ClienteMayorista("Distribuidora La Vaca Sagrada ", 25000000);
        c1.generarFactura();
        System.out.println("================================================================");
//Creamos ao instanciamos el objeto c1 tipo Cliente y apunta a la subClase
        Cliente c2 = new ClienteMinorista("Tienda del Compae Diomedes ", 15000000);
        c2.generarFactura();
        System.out.println("================================================================");
        System.out.println(" ******* FIN SISTEMA DE COMERCILIZACION Y FACTURACION  *******");

    }
}