package empleCarp;

public class Directivo extends Empleado {
    private int codigoDespacho;

    public Directivo(String nombre, String apellido, String dni, String direccion, int telefono,int codigoDespacho) {
        super(nombre, apellido, dni, direccion, telefono);
        this.codigoDespacho = codigoDespacho;
    }
}
