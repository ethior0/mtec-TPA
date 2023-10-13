
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Ex2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m, d;

        System.out.println("Qual dia você nasceu: ");
        d = in.nextInt();

        System.out.println("qual seu mês de Nascimento: ");
        m = in.nextInt();

        if (d > 31) {
            System.out.println("insira uma data valida");
        } else {

            if (m == 2 && d > 28) {
                System.out.println("insira uma data valida");
            } else {

                if (m == 4 || m == 6 || m == 9 || m == 11 && d > 30) {
                    System.out.println("insira uma data valida");
                } else {

                    switch (m) {

                        case 1:
                            if (d <= 20) {
                                System.out.println("Seu Signo é Capricórnio");
                            } else {
                                System.out.println("Seu Signo é Aquário");
                            }
                            break;

                        case 2:
                            if (d <= 19) {
                                System.out.println("Seu Signo é Aquário");
                            } else {
                                System.out.println("Seu Signo é Peixes");
                            }
                            break;

                        case 3:
                            if (d <= 21) {
                                System.out.println("Seu Signo é Peixes");
                            } else {
                                System.out.println("Seu Signo é �?ries");
                            }
                            break;

                        case 4:
                            if (d <= 20) {
                                System.out.println("Seu Signo é �?ries");
                            } else {
                                System.out.println("Seu Signo é Touro");
                            }
                            break;

                        case 5:
                            if (d <= 20) {
                                System.out.println("Seu Signo é Touro");
                            } else {
                                System.out.println("Seu Signo é Gêmeos");
                            }
                            break;

                        case 6:
                            if (d <= 20) {
                                System.out.println("Seu Signo é Gêmeos");
                            } else {
                                System.out.println("Seu Signo é Câncer");
                            }
                            break;

                        case 7:
                            if (d <= 20) {
                                System.out.println("Seu Signo é Câncer");
                            } else {
                                System.out.println("Seu Signo é leão");
                            }
                            break;

                        case 8:
                            if (d <= 20) {
                                System.out.println("Seu Signo é Leão");
                            } else {
                                System.out.println("Seu Signo é Virgem");
                            }
                            break;

                        case 9:
                            if (d <= 20) {
                                System.out.println("Seu Signo é Virgem");
                            } else {
                                System.out.println("Seu Signo é Libra");
                            }
                            break;

                        case 10:
                            if (d <= 20) {
                                System.out.println("Seu Signo é Libra");
                            } else {
                                System.out.println("Seu Signo é Escorpião");
                            }
                            break;

                        case 11:
                            if (d <= 20) {
                                System.out.println("Seu Signo é Escorpião");
                            } else {
                                System.out.println("Seu Signo é Sagitário");
                            }
                            break;

                        case 12:
                            if (d <= 21) {
                                System.out.println("Seu Signo é Sagitário");
                            } else {
                                System.out.println("Seu Signo é Capricórnio");
                            }
                            break;
                        default:
                            System.out.println("Data ínvalida");

                    }
                }
            }
        }
        in.close();

    }
}
