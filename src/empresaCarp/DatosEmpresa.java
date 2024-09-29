package empresaCarp;

import empleCarp.DatoEmpleado;
import empleCarp.DatosEmpleados;

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

public class DatosEmpresa {
}
