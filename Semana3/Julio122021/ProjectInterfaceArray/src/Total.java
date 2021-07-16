public class Total {
    private Double totalValorV = 0.0;
    private Double totalValorCamion = 0.0;
    private Double totalValorAuto = 0.0;
    // private Vehiculo[] listaVehiculos;
    private Vehiculo listaVehiculos[];

    public Total(Vehiculo[] listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public void presentarTotales() {
        for (int i = 0; i < listaVehiculos.length; i++) {
            if (listaVehiculos[i].getClass().getName() == "Vehiculo") {
                totalValorV = totalValorV + listaVehiculos[i].calcularCosto(10);
            } else if (listaVehiculos[i].getClass().getName() == "Camion") {
                totalValorCamion = totalValorCamion + listaVehiculos[i].calcularCosto(250);
            } else if (listaVehiculos[i].getClass().getName() == "Auto") {
                totalValorAuto = totalValorAuto + listaVehiculos[i].calcularCosto(120);
            }
        }

        System.out.println("El valor de los vehiculos es: " + totalValorV);
        System.out.println("El valor de los camiones es: " + totalValorCamion);
        System.out.println("El valor de los autos es: " + totalValorAuto);
    }

}
