package empresaCarp;

import empleCarp.*;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    //nombre de la empresa
    public String nombre;

    //creamos el array de los datos de los empleados y intoducimos los datos usando el cargador de contexto que lo que hace es insertar los empleados en el array
    public static List<Empleado> empleados = new ArrayList<Empleado>();

    private static void cargadorDeContexto(DatosEmpresa datosEmpresa) {
        DatosEmpleados datosEmpleados = datosEmpresa.getClass().getAnnotation(DatosEmpleados.class);

        if (datosEmpleados != null) {
            for (DatoEmpleado emp : datosEmpleados.value()) {
                Empleado empleado;
                switch (emp.clase().toLowerCase()) {
                    case "directivo" ->
                            empleado = new Directivo(emp.nombre(), emp.apellido(), emp.dni(), emp.direccion(), emp.telefono(), emp.codigoDespacho());
                    case "tecnico" ->
                            empleado = new Tecnico(emp.nombre(), emp.apellido(), emp.dni(), emp.direccion(), emp.telefono(), emp.codigoTaller(), emp.categoria());
                    case "oficial" ->
                            empleado = new Tecnico(emp.nombre(), emp.apellido(), emp.dni(), emp.direccion(), emp.telefono(), emp.codigoTaller(), emp.perfil());
                    default -> throw new IllegalStateException("Unexpected value: " + emp.clase().toLowerCase());
                }

                empleados.add(empleado);
            }
        }
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
        DatosEmpresa datosEmpresa = new DatosEmpresa();
        cargadorDeContexto(datosEmpresa);
    }
}
