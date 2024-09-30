package empleCarp.datos.directivo;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(DatosDirectivos.class)

public @interface DatoDirectivo{
    String nombre() default "";
    String apellido() default "";
    String dni() default "";
    String direccion() default "";
    int telefono() default 0;
    String clase() default "";
    int codigoDespacho() default 0;
}
