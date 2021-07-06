public class MiPrimeraClase {
    public static void main(String[] args) {
        Carro carro1=new Carro();
        // carro1.color="Azul";
        // carro1.marca="Nissan";
        // carro1.modelo=2018;
        carro1.establecerAtributos("Azul", "Nissan", 2018);

        System.out.println("El carro es de color: "+carro1.color);
        System.out.println("El carro es de marca: "+carro1.marca);
        System.out.println("El carro es de modelo: "+carro1.modelo);

        carro1.acelerar();
        carro1.frenar();
        

        
       
    }
    
}

class Carro{
    String color;
    String marca;
    Integer modelo;

    public void establecerAtributos(String color, String marca, Integer modelo){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
    }

    public void acelerar(){
        System.out.println("El carro está acelerando");
    }
    
    public void frenar(){
        System.out.println("El carro está frenando");
    }
}
