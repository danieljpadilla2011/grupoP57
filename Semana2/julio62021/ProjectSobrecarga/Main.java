public class Main {
    public static void main(String[] args) {
        Sumadora sumadora1=new Sumadora("Azul",2800.2f);
        Sumadora sumadora2=new Sumadora(3500.2f);
        Sumadora sumadora3=new Sumadora("Verde");
        Sumadora sumadora4=new Sumadora();

        System.out.println("Sumadora 1: "+sumadora1.getColor()+" "+sumadora1.getValor());
        System.out.println("Sumadora 2: "+sumadora2.getColor()+" "+sumadora2.getValor());
        System.out.println("Sumadora 3: "+sumadora3.getColor()+" "+sumadora3.getValor());
        System.out.println("Sumadora 4: "+sumadora4.getColor()+" "+sumadora4.getValor());


        // var res =sumadora1.calcularSuma(4.5);
        // System.out.println("La suma es: "+res);
    }
    
}
