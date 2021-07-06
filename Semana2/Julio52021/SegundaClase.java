public class SegundaClase {
    public static void main(String[] args) {
        Circulo circ1=new Circulo();
        circ1.setRadio(2.5f);
        System.out.println("El radio es: "+circ1.getRadio());
        System.out.println("El área del círculo es: "+circ1.calcularArea());        
    }    
}

class Circulo{
    private Float radio;
    private String color;
    private String textura;
    private final Float PI=3.1416f;

    public void setRadio(Float radio){
        this.radio=radio;
    
    }

    public Float getRadio(){
        return this.radio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextura() {
        return this.textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public Float getPI() {
        return this.PI;
    }

    public Float calcularArea(){
        Float area;
        area= this.PI*(float)Math.pow(this.radio, 2);
        return area;
    }
}
