package Practica_Criptografia;

public class ClasseCriptografica {

    public String encripta(String missatge, String clau) {
        String resultat = "";

        for (int i = 0;i < missatge.length();i++){
            char caracter = missatge.charAt(i);
            int valorMissatge = (int) caracter;

            char caracterClau = clau.charAt(i % clau.length());
            int valorClau = (int) caracterClau;

            int valorFinal = (valorMissatge + valorClau) % 256;

            resultat = resultat + String.format("%02X", valorFinal);
        }

        return resultat;
    }

    public String desencripta(String missatge, String clau) {
        String resultat = "";

        for (int i = 0; i < missatge.length(); i = i + 2) {

            String hexadecimal = missatge.substring(i, i + 2);

            int valorMissatge = Integer.parseInt(hexadecimal, 16);

            char caracterClau = clau.charAt((i / 2) % clau.length());
            int valorClau = (int) caracterClau;

            int valorFinal = (valorMissatge - valorClau + 256) % 256;

            resultat = resultat + (char) valorFinal;
        }

        return resultat;
    }

}
