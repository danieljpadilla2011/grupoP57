public class Estudiante extends Persona {
    private int numeroCarnet;

    public Estudiante(String nombre, int edad, int documentoId, int numeroCarnet) {
        this.nombre=nombre;
        this.edad=edad;
        this.documentoId=documentoId;
        this.numeroCarnet=numeroCarnet;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    
    
}
