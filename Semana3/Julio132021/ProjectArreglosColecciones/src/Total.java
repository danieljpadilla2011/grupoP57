public class Total {
    Carro[] carros;

    public Total(Carro[] carros) {
        this.carros = carros;
    }

    public Double totalizar() {
        Double acu = 0.0;
        for (int i = 0; i < carros.length; i++) {
            acu += carros[i].getPrecio();
        }
        return acu;
    }

}
