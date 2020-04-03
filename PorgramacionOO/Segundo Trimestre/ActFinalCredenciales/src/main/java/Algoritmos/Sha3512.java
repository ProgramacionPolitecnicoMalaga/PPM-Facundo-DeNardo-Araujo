package Algoritmos;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.apache.commons.codec.binary.Hex;

public class Sha3512 extends Algoritmo{
    MessageDigest messageDigest;

    public Sha3512() throws NoSuchAlgorithmException {
        messageDigest = MessageDigest.getInstance("SHA-512");
    }

    public String getSalt(){
        SecureRandom secureRandom = null;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
            byte[] salt = new byte[16]; secureRandom.nextBytes(salt);
            return Hex.encodeHexString(salt);
        } catch (NoSuchAlgorithmException e) { e.printStackTrace();
            return "Salt!";
        } }

    public String getSaltedPasswordHash(String password, String salt) throws NoSuchAlgorithmException {
        if (messageDigest == null){
            throw new NoSuchAlgorithmException("No existe el algoritmo de hash");}
        messageDigest.update(salt.getBytes());
        byte[] bytes = messageDigest.digest(password.getBytes());
        return new String(Hex.encodeHex(bytes));
    }


}
