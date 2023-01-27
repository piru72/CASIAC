/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PasswordEncryptionDecryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;


/**
 *
 * @author taral
 */
public class MainOfPassword {
    public static void main(String args[])  //static method  
{  
 System.out.println("Encrypted Message::: "+doHashing("12345"));
         
}  
    
    public  static  String doHashing(String pass)
    {
        try{
        MessageDigest md = MessageDigest.getInstance("MD5");
       md.update(pass.getBytes());
       byte[] resultByteArray = md.digest();
       StringBuilder sb = new StringBuilder();
       for(byte b : resultByteArray)
       {
           sb.append(String.format("%02x", b));
       }
        return sb.toString();
        }catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return "";
    }
    public static String Unhashing(String message)
    {
        try{
           // MessageDigest messageDigest = MessageDigest.getInstance(message)
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return "";
    }
  }
