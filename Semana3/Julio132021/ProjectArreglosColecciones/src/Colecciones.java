import java.util.*;

public class Colecciones {
    public static void main(String[] args) {
        Carro[] carros = new Carro[2];
        carros[0] = new Carro("Chevrolet", 10000.0);
        carros[1] = new Carro("Jaguar", 120000.0);

        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i].getMarca());

        }

        Total res = new Total(carros);
        double sum = res.totalizar();
        System.out.println("La suma es: " + sum + "\n");

        System.out.println();

        ArrayList<Carro> carrosLista = new ArrayList<>();
        carrosLista.add(new Carro("Nissan"));
        carrosLista.add(new Carro("Fiat"));

        for (int i = 0; i < carrosLista.size(); i++) {
            System.out.println(carrosLista.get(i));

        }

        Map<Integer, Carro> mapCarros = new HashMap<>();
        mapCarros.put(1, new Carro("KIA"));
        mapCarros.put(15, new Carro("Volvo"));
        System.out.println(mapCarros.size());
        System.out.println(mapCarros.get(15).getMarca());

        Set<Carro> carrosConjuntos = new HashSet<>();
        carrosConjuntos.add(new Carro("Toyota"));
        carrosConjuntos.add(new Carro("BMW"));
        System.out.println(carrosConjuntos.size());
        for (Carro car : carrosConjuntos) {
            System.out.println(car.getMarca());
        }

    }

}
