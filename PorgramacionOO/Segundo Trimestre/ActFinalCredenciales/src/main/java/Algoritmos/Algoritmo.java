package Algoritmos;

import org.mindrot.jbcrypt.BCrypt;

import java.security.NoSuchAlgorithmException;

public abstract class Algoritmo {

    public String getSaltedPasswordHash(String password, String salt) throws NoSuchAlgorithmException {
        return null;
    }

    public String getSalt() {
        return null;
    }

    public boolean verificarBcrypt(String password, String passwordHash){
        return BCrypt.checkpw(password,passwordHash);
    }

    public boolean verificarSHA(String password, String salt, String passwordHash) throws NoSuchAlgorithmException {
        Sha3512 sha = new Sha3512();
        String nuevoHash = sha.getSaltedPasswordHash(password,salt);
        return nuevoHash.equals(passwordHash);
    }
}
