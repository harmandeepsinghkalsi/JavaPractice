package practice;
import java.security.spec.KeySpec;

import javax.xml.bind.DatatypeConverter;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
public class EncDecCCPA {

    private static boolean DISABLE_ENCRYPTION = false;
    private static String secretKey = "ccpa_2019!!!";
    private static String salt = "ccpa_fd_ot_int_2019";
    static Cipher cipher_dec;
    static Cipher cipher_enc;
    static SecretKeySpec secretKeySpec;
    static IvParameterSpec ivspec;

    static
    {
        try {
            byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            ivspec = new IvParameterSpec(iv);

            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), salt.getBytes(), 65536, 128);
            SecretKey tmp = factory.generateSecret(spec);
            secretKeySpec = new SecretKeySpec(tmp.getEncoded(), "AES");

            //For decryption
            cipher_dec = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher_dec.init(Cipher.DECRYPT_MODE, secretKeySpec, ivspec);

            //For encryption
            cipher_enc = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher_enc.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivspec);

        } catch (Exception e) {
            throw new RuntimeException("Error:", e);
        }
    }

    public static String encrypt(String strToEncrypt) {
        if (DISABLE_ENCRYPTION) return strToEncrypt;
        if (strToEncrypt == null || "".equals(strToEncrypt)) {
            return strToEncrypt;
        }
        try {
            synchronized (cipher_enc) {
                return DatatypeConverter.printBase64Binary(cipher_enc.doFinal(strToEncrypt.getBytes("UTF-8")));
            }
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
            throw new RuntimeException("Error while encrypting.", e);
        }
    }

    public static String decrypt(String strToDecrypt) {
        if (DISABLE_ENCRYPTION) return strToDecrypt;
        if (strToDecrypt == null || "".equals(strToDecrypt)) {
            return strToDecrypt;
        }
        try {
            synchronized (cipher_dec) {
                return new String(cipher_dec.doFinal(DatatypeConverter.parseBase64Binary(strToDecrypt)));
            }

        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
            throw new RuntimeException("Error while decrypting.", e);
        }
    }

    public static void main(String[] args) {
        String str = "ZJdPflUTewgXw2n8jgbTrbzP5O0XUSNsdJrHu1l0WKygS7I4dOsElLN+D3WyR27fcwVym2mRmzdAZH4AtIwepQvFUgXmzCiPcGuzXJpM+V92jliTjLDUSY1rV8QsTG9KZW1ikyeXw4XoAC9HPrzRDGtYyyv9E6vGPN3EY2K6QEk7UOYThzJF8u0diFbClQ7nhTc+/5syXfv1W+JJ6Gr+jUzoR+LcKAIc+i1Cje3jLBwxYmudZBc11B1H2Dmk3p25YVSzGtenw8vARralQofQ418CjFyjaaA0eFPicSHwJqjPx1IBADy56YwqXVuSKs7naCt3otKb+5agbDYwwqOI52WKqbuNBeQZiQihkUSAJhy2bJ2ZMkKubvmg+uU/PjcrXaeCGeLzo0vEuxgJ+ubnzZo3dvW1z4XncuawIziVNgHEo4cXiKwsLVyfvKnPH3JJOxroVveLNKOsXB9ohdso5F2oC8/GQCklol8ckqZMKc8R6H7uDCD6sMo92sHU/d1dZS3u93DQavkjZ4DXjpyl9laC/kB9VG7XxbMmUp+EKFZnYoG9kiPj28pNEh3iYTic0Ha/s9MS4ncA/XcBIpulGdHSj4OtZFv76JZfHB1ASyHmYVC1vEgXVcHwAS3D2zYjZSoIBLibFkABI2F2VW6yO85F+4NkEQhBG4/wWg8GwpwIMl8zFf6TjiA/SgGZ0g34oSAE9lAVnkHGsZYNeOKOoQDigJHRChg29TyoL6TtvioOXVQVHnt1OJM2cswPc95XVLnYlSJd2GFsm1tXaDhsojOJb9wJZT7PVE4zOzJ877/hCEfyOvp3NRDUW/YEZP0FWgNtWPmBNH8adwV/HD4txaqsCHVrvgFwW+j+qk4XxTzUOlX7VyC389uj8A53BArOPT+579scCQAcKS/bzbNDqR+HhOILY4BH2wvvjfzx/i/zAXX5HyZMOHkf1ojVunsurNnv+kFwFecg5L3m7p2Y0zeH9JEs7XddqbEZdYkylI0=";
        System.out.println(encrypt("{\n" +
                "\"email\":\"srinivasulu.dommaraju@wirewheel.io\",\n" +
                "\"lastName\":\"D\",\n" +
                "\"organization\":\"\",\n" +
                "\"requestTypes\":[\"Do Not Sell My PI\"],\n" +
                "\"subjectTypes\":[\"Dealer\"],\n" +
                "\"language\":\"en\",\n" +
                "\"additionalData\":{\n" +
                "\"cdsId\":\"ccpareq\",\n" +
                "\"Dealer Email\":\"ccpareq@forddirect.com\",\n" +
                "\"Consumer's Email\":\"srinivasulu.dommaraju@wirewheel.io\",\n" +
                "\"Consumer's Phone Number\":\"9949290090\",\n" +
                "\"Request Details\":\"No additional request details provided\"\n" +
                "},\n" +
                "\"lawCode\" : \"CCPA\",\n" +
                "\"address\":[{\"addressLine1\":\"8787 One Blvd\",\"addressLine2\":\"Apt 1\",\"city\":\"St Franscisco\",\"country\":\"USA\",\"postalCode\":\"12345\",\"stateOrProvince\":\"CA\"}]\n" +
                "}"));
        System.out.println(decrypt(str));
    }
}
