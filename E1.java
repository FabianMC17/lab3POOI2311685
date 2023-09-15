import java.util.*;

public class E1 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num; 

            try {
                System.out.print("INGRESA UN NUMERO : ");
                num = sc.nextInt();

                while (num < 2 || num > 20) {
                    System.out.println("INGRESA UN NUMERO VALIDO ENTRE 2 Y 20 : ");
                    num = sc.nextInt();
                }
                for (int i = 1 ; i <= 10; i++) {
                        
                            System.out.println(num + " " + "x" + " " + i + " " + "=" + " " + (num * i));
                    }
            } catch (Exception e) {
                System.out.println("ERROR: EL VALOR INGRESADO DEBE SER ENTERO");
    }
    }
}