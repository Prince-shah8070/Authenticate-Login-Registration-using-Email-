package Encrypt_decrypt_password;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class protect {
	
    private final String ALGORITHM = "AES";
    private final byte[] keyValue = "1234567891234567".getBytes();
 
    private Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGORITHM);
        return key;
    }
    
    public String encrypt(String valueToEnc) throws Exception {
    	 Key key = generateKey();
//        System.out.println("Plain text before:: " + valueToEnc);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
  
        byte[] encValue = cipher.doFinal(valueToEnc.getBytes());
        byte[] encryptedByteValue = new Base64().encode(encValue);
//        System.out.println("Encrypted Value :: " + new String(encryptedByteValue));
  
        return new String(encryptedByteValue);
    }
    
    public String decrypt(String encryptedValue) throws Exception {
         Key key = generateKey();
//                 System.out.println("Encrypted Value before desciption:: " + encryptedValue);
         Cipher cipher = Cipher.getInstance(ALGORITHM);
         cipher.init(Cipher.DECRYPT_MODE, key);
          
         byte[] decodedBytes = new Base64().decode(encryptedValue.getBytes());
  
         byte[] enctVal = cipher.doFinal(decodedBytes);
         
//         System.out.println("Decrypted Value :: " + new String(enctVal));
         return new String(enctVal);
     }
    
    }