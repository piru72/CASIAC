/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PasswordEncryptionDecryption;

import java.io.UnsupportedEncodingException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.Cipher;
import javax.crypto.spec.DESedeKeySpec;
import java.util.Base64;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author taral
 */
public class CipherKey {
    private static final String UNICODE_FORMAT ="UTF8";
    public static final String  DESDe_ENCRYPTION_SCHEME ="DESede";
    private KeySpec ks;
    private SecretKeyFactory skf;
    private Cipher cipher;
    byte[] arrayBytes;
    private String myEncryptionKey;
    private String myEncryptionScheme;
    SecretKey key;
    
   /* public CipherKey() throws Exception{
     myEncryptionKey ="ThisIsSpartaThisIsSparta";
     myEncryptionScheme = "DESDE_ENCRYPTION_SCHEME";
     arrayBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
     ks = new DESedeKeySpec(arrayBytes);
     skf = SecretKeyFactory.getInstance(myEncryptionScheme);
     cipher = Cipher.getInstance(myEncryptionScheme);
     key = skf.generateSecret(ks);
     
    }*/
    
    public SecretKeySpec
    generateSecretKey(char[] password, byte[] salt,
                      int iterationCount, int keyLength)
        throws NoSuchAlgorithmException,
               InvalidKeySpecException
    {
        SecretKeyFactory keyFactory
            = SecretKeyFactory.getInstance(
                "PBKDF2WithHmacSHA512");
        PBEKeySpec keySpec = new PBEKeySpec(
            password, salt, iterationCount, keyLength);
        SecretKey tempKey
            = keyFactory.generateSecret(keySpec);
        return new SecretKeySpec(tempKey.getEncoded(),
                                 "AES");
    }
     private String base64Encoder(byte[] bytes)
    {
        return Base64.getEncoder().encodeToString(bytes);
    }
    public String encrypt(String dataToEncrypt,
                          SecretKeySpec key)
        throws GeneralSecurityException,
               UnsupportedEncodingException
    {
        Cipher pbeCipher
            = Cipher.getInstance("AES/CBC/PKCS5Padding");
        pbeCipher.init(Cipher.ENCRYPT_MODE, key);
          
                 AlgorithmParameters parameters
            = pbeCipher.getParameters();
          
                 IvParameterSpec ivParameterSpec
            = parameters.getParameterSpec(
                IvParameterSpec.class);
          
                 byte[] cryptoText = pbeCipher.doFinal(
            dataToEncrypt.getBytes("UTF-8"));
          
                 byte[] iv = ivParameterSpec.getIV();
        return base64Encoder(iv) + ":"
            + base64Encoder(cryptoText);
    }
}
   
