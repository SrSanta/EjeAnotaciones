package empleCarp.datos.tecnico;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface DatosTecnicos {
    DatoTecnico[] value();
}
