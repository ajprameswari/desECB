/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DES;

import java.security.*;
import javax.crypto.*;

/**
 *
 * @author Prameswari
 */
public class DES_lib {

    public static void main(String[] argv) {
        try{ 
            KeyGenerator keygen = KeyGenerator.getInstance("DES");
            SecretKey desKey = keygen.generateKey();
            
            Cipher desCipher;
            
            desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            
            desCipher.init(Cipher.ENCRYPT_MODE, desKey);
            
            byte[] text = "No body can see me".getBytes();
            
            System.out.println("Test [Byte Format]: " + text);
            System.out.println("Text: " + new String(text));
            
            byte[] textEncrypted = desCipher.doFinal(text);
            
            System.out.println("Encrypted Text: " + textEncrypted);
            
            desCipher.init(Cipher.DECRYPT_MODE, desKey);
            
            byte[] textDecrypted = desCipher.doFinal(textEncrypted);
            
            System.out.println("Encrypted Text: " + textDecrypted);
        }
        catch(Exception e)
        {
        }
    }
}
    
