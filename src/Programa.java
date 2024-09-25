import utils.Validador;
import validadores.ValidadorCNPJ;
import validadores.ValidadorData;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer opcao;


        do {
            System.out.println("1 - Validar data");
            System.out.println("2 - Validar cnpj");
            System.out.println("3 - Executar testes");
            System.out.println("4 - Encerrar programa");

            System.out.print("Selecione a opção: ");
            opcao = scanner.nextInt();


            switch (opcao) {
                case 1:
                    ValidadorData validadorData = new ValidadorData();
                    System.out.print("Digite o valor da data: ");
                    String entrada = scanner.next();
                    validarEntrada(validadorData, entrada);
                    break;
                case 2:
                    ValidadorCNPJ validadorCNPJ = new ValidadorCNPJ();
                    System.out.print("Digite o valor do CNPJ: ");
                    entrada = scanner.next();
                    validarEntrada(validadorCNPJ, entrada);
                    break;
                case 3:
                    executarTestes();
                    break;
            }
        } while (opcao != 4);


    }

    static void executarTestes() {
        Validador validadorData = new ValidadorData();
        Validador validadorCNPJ = new ValidadorCNPJ();
        // cnpjs para teste
        String cnpj1 = "00.000.000/0000-00";
        String cnpj2 = "48.204.156/0001-10";
        String cnpj3 = "48.204.15226/0001-10";
        String cnpj4 = "123.456.789-09";
        // datas para teste
        String data1 = "28-09-2002";
        String data2 = "28/09/2002";
        String data3 = "2024-01-01";
        String data4 = "01-012024";

        System.out.println("=================================================");
        System.out.println("ER 3: CNPJ Brasileiro (xx.xxx.xxx/xxxx-xx)");
        System.out.printf("%s está válido? %b%n", cnpj1, validadorCNPJ.valido(cnpj1));
        System.out.printf("%s está válido? %b%n", cnpj2, validadorCNPJ.valido(cnpj2));
        System.out.printf("%s está válido? %b%n", cnpj3, validadorCNPJ.valido(cnpj3));
        System.out.printf("%s está válido? %b%n", cnpj4, validadorCNPJ.valido(cnpj4));
        System.out.println("=================================================");
        System.out.println("ER 4: Data no Formato DD/MM/YYYY ou DD-MM-YYYY");
        System.out.printf("%s está válido? %b%n", data1, validadorData.valido(data1));
        System.out.printf("%s está válido? %b%n", data2, validadorData.valido(data2));
        System.out.printf("%s está válido? %b%n", data3, validadorData.valido(data3));
        System.out.printf("%s está válido? %b%n", data4, validadorData.valido(data4));
    }

    static void validarEntrada(Validador validador, String entrada) {
        Boolean valido = validador.valido(entrada);
        System.out.printf("a entrada %s está %s conforme a expressao regular %s\n", entrada, valido ? "válida" : "inválida", validador.getPattern().toString());
    }


}
