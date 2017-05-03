package cl.ckelar.android.lense.helper;

/**
 * Clase con métodos auxiliares de validación
 * @author Gerson Díaz
 * @version 1.0
 * Creado el 27/04/2017
 */
public class ValidatorUtil {

    /**
     * Valida que el texto ingresado solo contenga letras
     * @param text
     * @return Retorna true si contiene solo letras, false si e¿no es así
     * **/
    public static boolean isLettersOnly(String text) {

        String pattern= "^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]*$";
        return text.matches(pattern);

    }

}
