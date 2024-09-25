package validadores;

import utils.Validador;

import java.util.regex.Pattern;

public class ValidadorCNPJ extends Validador {

    @Override
    public Pattern getPattern() {
        return Pattern.compile("^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}$");
    }
}
