package empleCarp.clases;

public class Oficial extends Operario{
    private String categoria;

    public Oficial(String nombre, String apellido, String dni, String direccion, int telefono, int codigoTaller, String categoria) {
        super(nombre, apellido, dni, direccion, telefono, codigoTaller);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "categoria='" + categoria + '\'' +
                "} " + super.toString();
    }
}
