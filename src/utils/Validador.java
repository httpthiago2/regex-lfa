package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Validador {
    public Boolean valido(String valor) {
        Matcher matcher = getPattern().matcher(valor);
        return matcher.matches();
    }
    public abstract Pattern getPattern();
}
