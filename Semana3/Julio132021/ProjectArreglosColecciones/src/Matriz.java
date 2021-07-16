public class Matriz {
    public static void main(String[] args) {
        int[][] matrizCuadrada = new int[2][3];
        // System.out.println(matrizCuadrada[0].length);
        // matrizCuadrada[0][0] = 2;
        int dato = 12;
        for (int i = 0; i < matrizCuadrada.length; i++) {
            for (int j = 0; j < matrizCuadrada[i].length; j++) {
                matrizCuadrada[i][j] = dato;
                dato++;
            }
        }

        for (int i = 0; i < matrizCuadrada.length; i++) {
            for (int j = 0; j < matrizCuadrada[i].length; j++) {
                System.out.print(matrizCuadrada[i][j] + " ");
            }
            System.out.println();
        }

    }
}
