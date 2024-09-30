package empleCarp.datos.oficial;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface DatosOficiales {
    DatoOficial[] value();
}
