public class Carro {
    private String marca;
    private Double precio;

    public Carro(String marca) {
        this.marca = marca;
    }

    public Carro(String marca, Double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + "]";
    }

}
