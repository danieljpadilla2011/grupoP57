public class Sumadora {
    private String color;
    private Float valor;

    public Sumadora(String color, Float valor) {
        this.color = color;
        this.valor = valor;
    }

    

    public Sumadora(String color) {
        this.color = color;
    }
    
    public Sumadora(Float valor) {
        this.valor = valor;
    }

    public Sumadora() {
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public int calcularSuma(int val1, int val2){
        return val1+val2;
    }

    public double calcularSuma(double val1, double val2){
        return val1+val2;
    }

    public String calcularSuma(String val1, String val2){
        return val1+val2;
    }

    public double calcularSuma(double val1){
        return val1+5;
    }
    


    

    
}
