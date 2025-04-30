package OrganizadordeClases;
//Creamos la SubClase que hereda de la Clase Madre Cliente
public class ClienteMayorista extends Cliente {

    //Creamos el Metodo Constructor de la SubClase para inicializar sus variables o atributos
    public ClienteMayorista(String nombre, long totalCompra) {

        super(nombre, totalCompra);
    }
//Copiamos y sobre escribimos el Metodo creado en la clase Madre con lo que aplica para esta subClase
    @Override
    public long calcularDescuento() {
        return (long) (totalCompra * 0.05); // 5% descuento
    }
}

