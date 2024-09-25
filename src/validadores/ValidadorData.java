package validadores;

import utils.Validador;

import java.util.regex.Pattern;

public class ValidadorData extends Validador {

    @Override
    public Pattern getPattern() {
        return Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[/\\-](0[1-9]|1[0-2])[/\\-](\\d{4})$");
    }
}
