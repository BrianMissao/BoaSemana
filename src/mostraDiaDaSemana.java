import java.util.Scanner;

public class mostraDiaDaSemana {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroDoDiaDaSemana = obterNumeroDoDiaDaSemana();
        calcularEImprimirODiaDaSemanaCorrespondente(numeroDoDiaDaSemana);
    }

    private static void calcularEImprimirODiaDaSemanaCorrespondente(int numeroDoDiaDaSemana) {
        String diaDaSemanaCorrespondente;
        switch (numeroDoDiaDaSemana) {
            case 1:
                diaDaSemanaCorrespondente = "Domingo";
                break;
            case 2:
                diaDaSemanaCorrespondente = "Segunda-feira";
                break;
            case 3:
                diaDaSemanaCorrespondente = "Terça-Feira";
                break;
            case 4:
                diaDaSemanaCorrespondente = "Quarta-Feira";
                break;
            case 5:
                diaDaSemanaCorrespondente = "Quinta-Feira";
                break;
            case 6:
                diaDaSemanaCorrespondente = "Sexta-Feira\nSextou!";
                break;
            case 7:
                diaDaSemanaCorrespondente = "Sábado";
                break;
            default:
                diaDaSemanaCorrespondente = "Dia inválido.";
                break;
        }
        System.out.println(diaDaSemanaCorrespondente);
    }

    private static int obterNumeroDoDiaDaSemana() {
        System.out.println("Seja bem-vindo ao BoaSemana!\nDigite, de 0 a 7, o dia da semana que você deseja saber:");
        return scanner.nextInt();
    }
}
