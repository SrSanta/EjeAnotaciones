package empleCarp.datos.oficial;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(DatosOficiales.class)

public @interface DatoOficial {
    String nombre() default "";
    String apellido() default "";
    String dni() default "";
    String direccion() default "";
    int telefono() default 0;
    String clase() default "";
    int codigoTaller()default 0;
    String categoria() default "";
}
