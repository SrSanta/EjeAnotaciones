package empresaCarp;

import empleCarp.clases.Directivo;
import empleCarp.clases.Empleado;
import empleCarp.clases.Oficial;
import empleCarp.clases.Tecnico;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private List<Empleado> empleados = new ArrayList<Empleado>();

    public Empresa() {
        this.nombre = "";
        this.empleados = cargadorDeContexto();
    }

    public List<Empleado> cargadorDeContexto() {

        DatoEmpleado[] datosEmpleados = Empresa.class.getAnnotationsByType(DatoEmpleado.class);

        for (DatoEmpleado emp : datosEmpleados) {
            Empleado empleado;
            switch (emp.clase().toLowerCase()) {
                case "directivo" ->
                        empleado = new Directivo(emp.nombre(), emp.apellido(), emp.dni(), emp.direccion(), emp.telefono(), emp.codigoDespacho());
                case "tecnico" ->
                        empleado = new Tecnico(emp.nombre(), emp.apellido(), emp.dni(), emp.direccion(), emp.telefono(), emp.codigoTaller(), emp.perfil());
                case "oficial" ->
                        empleado = new Oficial(emp.nombre(), emp.apellido(), emp.dni(), emp.direccion(), emp.telefono(), emp.codigoTaller(), emp.categoria());
                default -> throw new IllegalStateException("Unexpected value: " + emp.clase().toLowerCase());
            }

            empleados.add(empleado);
        }

        return empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String texto = "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados= ";

        for (Empleado emp : empleados) {
            texto += "\n" + emp.toString();
        }

        return texto;

    }
}