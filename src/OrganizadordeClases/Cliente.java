package OrganizadordeClases;
//Creamos La Clase Madre de tipo abstract para proteger los datos o atributos
    public abstract class Cliente {
        //Creamos los atributos  con modificador de acceso tipo protected
        protected String nombre;
        protected long totalCompra;
//Creamos el Metodo constructor para inicializar las variables o atributos
        public Cliente(String nombre, long totalCompra) {
            this.nombre = nombre;
            this.totalCompra = totalCompra;
        }
//Creamos el Metodo tipo abstract clacularDescuento para que sea usado por las subClases
        public abstract long calcularDescuento();
//Creamos el Metodo generarFactura para que sea usado por el objeto creado con cada subClase
        public void generarFactura() {
            long descuento = calcularDescuento();
            long totalPagar = totalCompra - descuento;
            System.out.println("Factura para " + nombre);
            System.out.println("Total sin descuento: $" + totalCompra);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + totalPagar);
        }
    }



