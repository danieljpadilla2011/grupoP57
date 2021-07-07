public class Circulo{
    public static final float PI=3.141519f;
    public float radio=0f;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public static float calcularArea(float radio){
        return PI*(float)Math.pow(radio, 2);
    }
    

}
