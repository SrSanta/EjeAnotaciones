package empleCarp;

public class Operario extends Empleado{
    private int codigoTaller;

    public Operario(String nombre, String apellido, String dni, String direccion, int telefono, int codigoTaller) {
        super(nombre, apellido, dni, direccion, telefono);
        this.codigoTaller = codigoTaller;
    }
}
