package empleCarp;

public class Tecnico extends Operario{
    private String perfil;

    public Tecnico(String nombre, String apellido, String dni, String direccion, int telefono, int codigoTaller, String perfil) {
        super(nombre, apellido, dni, direccion, telefono, codigoTaller);
        this.perfil = perfil;
    }
}
