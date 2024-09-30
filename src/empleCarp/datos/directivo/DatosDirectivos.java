package empleCarp.datos.directivo;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface DatosDirectivos {
    DatoDirectivo[] value();
}
