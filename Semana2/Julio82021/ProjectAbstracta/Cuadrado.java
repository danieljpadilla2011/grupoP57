public class Cuadrado extends FiguraGeometrica {
    private float lado;

    public Cuadrado(float lado, int numeroLados) {
        super(numeroLados);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        return (lado * lado);
    }

    @Override
    public float perimetro() {
        return (4 * lado);
    }

}
