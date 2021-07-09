public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(5, 4);
        cuadrado1.setLado(7);
        System.out.println("El area del cuadrado es: " + cuadrado1.area());
        System.out.println("El perimetro del cuadrado es: " + cuadrado1.perimetro());
        System.out.println(cuadrado1.getLado());
    }

}
