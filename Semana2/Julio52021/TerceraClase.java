public class TerceraClase {
    public static void main(String[] args) {
        Productos prod1=new Productos(2500.0,0.21);
        System.out.println("El precio iniciado en el constructor es: "+prod1.getPrecio());
        System.out.println("El iva iniciado en el constructor es: "+prod1.getIva());
        Double precioVenta=prod1.calcularValorVenta();
        System.out.println("El valor de venta es: "+precioVenta);
               
    }    
}

class Productos{
    private Double precio;
    private Double iva;

    public Double getPrecio() {
        return this.precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Double getIva() {
        return this.iva;
    }
    public void setIva(Double iva) {
        this.iva = iva;
    }
    
    public Productos(Double precio, Double iva) {
        this.precio = precio;
        this.iva = iva;
    }

    public Double calcularValorVenta(){
        return this.precio+(this.precio*this.iva);
    }

    // public Productos(){
    //     this.iva=0.19;
    // }

    

    



}
