
/**
 *
 * @author Thiago
 */
public class Somatoria {

    public static void main(String[] args) {

        int a = 0, i = 1, s = 0;

        while (i <= 100) {
            s = a + i;
            a = s;
            i++;
        }

        System.out.println("A somatória dos números de 1 a 100 é igual a " + s);
    }
}
