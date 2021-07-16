public class Excepciones {
    public static void main(String[] args) {
        int div;
        int x;
        int y = 0;
        try {
            x = 55;
            div = x / y;
            System.out.println("La división es: " + div);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }

    }

}
