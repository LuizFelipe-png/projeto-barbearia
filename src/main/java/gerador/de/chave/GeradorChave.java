/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerador.de.chave;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Encoders;
import javax.crypto.SecretKey;
/**
 *
 * @author Aluno
 */
public class GeradorChave {
    public static void main(String[] args) {
        //Gera uma chave segura para o algoritmo HS256
        SecretKey key = Jwts.SIG.HS256.key().build();
        
        //Converte para Base64 para você salvar
        String secretString = Encoders.BASE64.encode(key.getEncoded());
        System.out.println("Sua Secret Key: " + secretString);
    }
}
