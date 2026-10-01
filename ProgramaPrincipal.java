import java.util.Scanner;
import Practica_Criptografia.ClasseCriptografica;

public class ProgramaPrincipal {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ProgramaPrincipal principal = new ProgramaPrincipal();
        principal.programa();
    }

    public void programa() {

        ClasseCriptografica criptografia = new ClasseCriptografica();
        System.out.println("Introdueix el missatge a encriptar: ");
        System.out.println("-------------------------------------");
        String missatge = scanner.nextLine();
        System.out.println("-------------------------------------");

        System.out.println("Introdueix la clau: ");
        System.out.println("-------------------------------------");
        String clau = scanner.nextLine();
        System.out.println("-------------------------------------");


        String missatgeEncriptat = criptografia.encripta(missatge, clau);
        System.out.println("-------------------------------------");
        System.out.println("Encriptat: " + missatgeEncriptat);
        System.out.println("-------------------------------------");

        System.out.println("-------------------------------------");
        System.out.println("Introdueix la clau de desencriptació: ");
        System.out.println("-------------------------------------");
        String clauDesencriptacio = scanner.nextLine();

        String missatgeDesencriptat = criptografia.desencripta(missatgeEncriptat, clauDesencriptacio);
        System.out.println("-------------------------------------");
        System.out.println("Desencriptat: " + missatgeDesencriptat);
        System.out.println("-------------------------------------");

    }
}