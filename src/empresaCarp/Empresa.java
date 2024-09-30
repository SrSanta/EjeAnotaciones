package empresaCarp;

import empleCarp.*;

import java.util.ArrayList;
import java.util.List;

@DatosEmpleados({
        @DatoEmpleado(
                nombre = "Andres",
                apellido = "conde",
                dni = "25555555T",
                direccion = "mi casa",
                telefono = 666999666,
                clase = "Directivo",
                codigoDespacho = 1
        ),

        @DatoEmpleado(
                nombre = "santa",
                apellido = "clous",
                dni = "26555555T",
                direccion = "polo",
                telefono = 266999666,
                clase = "Tecnico",
                codigoTaller = 1,
                perfil = "a"
        ),

        @DatoEmpleado(
                nombre = "pepe",
                apellido = "palotes",
                dni = "27555555T",
                direccion = "polo",
                telefono = 166999666,
                clase = "Oficial",
                codigoTaller = 2,
                categoria = "especial"
        )
})
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
                        empleado = new Tecnico(emp.nombre(), emp.apellido(), emp.dni(), emp.direccion(), emp.telefono(), emp.codigoTaller(), emp.categoria());
                case "oficial" ->
                        empleado = new Oficial(emp.nombre(), emp.apellido(), emp.dni(), emp.direccion(), emp.telefono(), emp.codigoTaller(), emp.perfil());
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