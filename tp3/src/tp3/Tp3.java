/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author houssem
 */

public class Tp3 {
    public static void main(String[] args) {
        String key = "secret";
        String plaintext = "bonjour";
        XORCipher xorCipher = new XORCipher(key);
        String encryptedText = xorCipher.encrypt(plaintext);
        System.out.println("Texte chiffré : " + encryptedText);
        String decryptedText = xorCipher.decrypt(encryptedText);
        System.out.println("Texte dechiffré : " + decryptedText);
    }
}