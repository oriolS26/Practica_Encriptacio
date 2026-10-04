import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ClasseAES {

    public static String encripta(String missatge, String clau) throws Exception {

            byte[] clauBytes = clau.getBytes();

            SecretKeySpec clauAES = new SecretKeySpec(clauBytes, "AES");

            Cipher cipher = Cipher.getInstance("AES");

            cipher.init(Cipher.ENCRYPT_MODE, clauAES);

            byte[] missatgeBytes = missatge.getBytes();

            byte[] missatgeXifrat = cipher.doFinal(missatgeBytes);

            String resultat = Base64.getEncoder().encodeToString(missatgeXifrat);

            return resultat;

        }


    public static String desencripta(String missatgeXifrat, String clau) throws Exception {

            byte[] clauBytes = clau.getBytes();

            SecretKeySpec clauAES = new SecretKeySpec(clauBytes, "AES");

            Cipher cipher = Cipher.getInstance("AES");

            cipher.init(Cipher.DECRYPT_MODE, clauAES);

            byte[] dadesXifrades = Base64.getDecoder().decode(missatgeXifrat);

            byte[] missatgeDesxifrat = cipher.doFinal(dadesXifrades);

            String resultat = new String(missatgeDesxifrat);

            return resultat;
    }
}