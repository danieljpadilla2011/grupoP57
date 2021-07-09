public abstract class FiguraGeometrica {
    private int numeroLados;

    public FiguraGeometrica(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public abstract float area();

    public abstract float perimetro();

}
