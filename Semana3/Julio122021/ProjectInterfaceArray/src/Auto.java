public class Auto extends Vehiculo implements Iarancel {
    private Integer numeroAirBags;
    private TipoAuto tipo;

    public Auto(String placa, String marca, Integer precio, Integer numeroAirBags, TipoAuto tipo) {
        super(placa, marca, precio);
        this.numeroAirBags = numeroAirBags;
        this.tipo = tipo;
    }

    public TipoAuto getTipo() {
        return tipo;
    }

    public void setTipo(TipoAuto tipo) {
        this.tipo = tipo;
    }

    public Integer getNumeroAirBags() {
        return numeroAirBags;
    }

    public void setNumeroAirBags(Integer numeroAirBags) {
        this.numeroAirBags = numeroAirBags;
    }

    @Override
    public Integer calcularCosto(Integer factor) {
        Integer cosotoAuto = this.precio + (this.numeroAirBags * factor);
        return cosotoAuto = cosotoAuto + (cosotoAuto * IVA / 100);
    }

}
