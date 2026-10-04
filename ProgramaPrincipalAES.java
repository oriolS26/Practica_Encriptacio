import java.util.Scanner;

public class ProgramaPrincipalAES {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        ProgramaPrincipalAES principal = new ProgramaPrincipalAES();

        principal.programa();
    }


    public void programa() throws Exception {

        System.out.println("====================================");
        System.out.println("       XIFRAT AES");
        System.out.println("====================================");

        System.out.println("Introdueix el missatge:");
        String missatge = scanner.nextLine();

        System.out.println("------------------------------------");

        System.out.println("Introdueix la clau:");
        String clau = scanner.nextLine();

        System.out.println("------------------------------------");

        String missatgeXifrat = ClasseAES.encripta(missatge, clau);

        System.out.println("Missatge original: " + missatge);
        System.out.println("Missatge xifrat: " + missatgeXifrat);

        System.out.println("------------------------------------");

        System.out.println("Introdueix la clau per desencriptar:");
        String clauDesencriptacio = scanner.nextLine();

        String missatgeDesxifrat =
                ClasseAES.desencripta(missatgeXifrat, clauDesencriptacio);

        System.out.println("------------------------------------");

        System.out.println("Missatge desencriptat: " + missatgeDesxifrat);

        System.out.println("====================================");
    }
}