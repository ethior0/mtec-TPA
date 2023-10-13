
/**
 *
 * @author Thiago
 */
public class JoaoAltura {

    public static void main(String[] args) {

        double j = 134, p = 145;
        int a = 0;

        while (j < p) {
            j += 2.5;
            p += 2;
            a++;
        }

        System.out.println("Demorará " + a + " anos para que João fique mais alto que Pedro");
    }
}
