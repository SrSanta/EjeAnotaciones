package empleCarp;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface DatosEmpleados {
    DatoEmpleado[] value();
}
