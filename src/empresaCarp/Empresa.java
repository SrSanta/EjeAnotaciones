package empresaCarp;

import empleCarp.clases.*;
import empleCarp.datos.*;
import empleCarp.datos.directivo.DatoDirectivo;
import empleCarp.datos.directivo.DatosDirectivos;
import empleCarp.datos.oficial.DatoOficial;
import empleCarp.datos.oficial.DatosOficiales;
import empleCarp.datos.tecnico.DatoTecnico;
import empleCarp.datos.tecnico.DatosTecnicos;

import java.util.ArrayList;
import java.util.List;

@DatosTecnicos({
        @DatoTecnico(
                nombre = "Paco",
                apellido = "Rabane",
                dni = "26555555T",
                direccion = "siono",
                telefono = 266999666,
                clase = "ClasesEmpleado.Tecnico",
                codigoTaller = 1,
                perfil = "a"
        )
})

@DatosDirectivos(
        {
                @DatoDirectivo(
                        nombre = "Andres",
                        apellido = "conde",
                        dni = "25555555T",
                        direccion = "mi casa",
                        telefono = 666999666,
                        clase = "ClasesEmpleado.Directivo",
                        codigoDespacho = 1
                )
        })

@DatosOficiales(
        {
                @DatoOficial(
                        nombre = "pepe",
                        apellido = "palotes",
                        dni = "27555555T",
                        direccion = "polo",
                        telefono = 166999666,
                        clase = "ClasesEmpleado.Oficial",
                        codigoTaller = 2,
                        categoria = "especial"
                )
        }
)

public class Empresa {

    private String nombre;
    private List<Empleado> empleados = new ArrayList<Empleado>();

    public Empresa() {
        this.nombre = "";
        cargadorDeContexto();
    }

    public void cargadorDeContextoAhoraEsPersonal(){

    }

    public void cargadorDeContextoDirectivo(){
        DatoDirectivo[] datoDirectivos = Empresa.class.getAnnotationsByType(DatoDirectivo.class);

        for (DatoDirectivo emp : datoDirectivos){
            Empleado empleado;
            empleado = new Directivo(emp.nombre(), emp.apellido(), emp.dni(), emp.direccion(), emp.telefono(), emp.codigoDespacho());
            empleados.add(empleado);
        }
    }

    public void cargadorDeContexto() {

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