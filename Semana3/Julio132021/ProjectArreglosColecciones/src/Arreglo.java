public class Arreglo {
    public static void main(String[] args) {
        int[] arreglo = new int[3];
        // arreglo[0] = 7;
        // arreglo[1] = 9;
        // arreglo[2] = 6;
        int dato = 12;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = dato;
            dato++;
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento en el índice " + i + " : " + arreglo[i]);
        }

    }
}
