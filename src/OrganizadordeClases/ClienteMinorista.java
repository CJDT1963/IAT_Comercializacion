package OrganizadordeClases;
//Creamos la subClase
public class ClienteMinorista extends Cliente {
//Creamos su Metodo Constructor para inicializar sus variables o atributos
    public ClienteMinorista(String nombre, long totalCompra) {

        super(nombre, totalCompra);
    }
//Copiamos de la Clase Madre el Metodo y lo sobreescribimos con lo que aplica para esta subClase
    @Override
    public long calcularDescuento() {
        return (long) (totalCompra * 0.10); // 10% descuento
    }
}

