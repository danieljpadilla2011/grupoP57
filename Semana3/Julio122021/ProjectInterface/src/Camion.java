public class Camion extends Vehiculo implements Idetermine {
    private Integer numeroEjes;

    public Camion(String placa, String marca, Integer precio, Integer numeroEjes) {
        super(placa, marca, precio);
        this.numeroEjes = numeroEjes;
    }

    public Integer getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(Integer numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public Integer calcularCosto(Integer factor) {
        Integer costoCamion = this.precio + (this.numeroEjes * factor);
        return costoCamion = costoCamion + (costoCamion * IVA / 100);
    }

}
