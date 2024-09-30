package empleCarp.datos;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(DatosEmpleados.class)

public @interface DatoEmpleado {
    String nombre() default "";
    String apellido() default "";
    String dni() default "";
    String direccion() default "";
    int telefono() default 0;
    String clase() default "";
    int codigoDespacho() default 0;
    int codigoTaller()default 0;
    String perfil() default "";
    String categoria() default "";
}