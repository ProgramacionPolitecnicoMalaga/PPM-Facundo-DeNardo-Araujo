package Controlador;

import Algoritmos.Algoritmo;
import Algoritmos.Bcrypt;
import Algoritmos.Sha3512;

import java.security.NoSuchAlgorithmException;

public class ControladorAlgoritmo {

    private static final String BCRYPT = "Bcrypt";

    public boolean comprobarPassword(String algoritmoDeseado, String password, String passHash, String salt) throws NoSuchAlgorithmException {
        boolean verificacion = true;
        if (algoritmoDeseado.equals(BCRYPT))
            verificacion = new Bcrypt().verificarBcrypt(password,passHash);
        if (!algoritmoDeseado.equals(BCRYPT)){
            verificacion = new Sha3512().verificarSHA(password, salt, passHash);
        }
        return verificacion;
    }

    public String getSaltedPassHash(String algoritmoDeseado, String pass, String salt) throws NoSuchAlgorithmException {
        Algoritmo alg;
        String saltedPass;
        if (algoritmoDeseado.equals(BCRYPT)){
            alg =  new Bcrypt();
            saltedPass = alg.getSaltedPasswordHash(pass,alg.getSalt());
        }else {
            alg = new Sha3512();
            saltedPass =  alg.getSaltedPasswordHash(pass,salt);
        }
        return saltedPass;
    }

    public String generarSalt(String algoritmoDeseado) throws NoSuchAlgorithmException {
        String sal;
        if (algoritmoDeseado.equals(BCRYPT))
            sal = new Bcrypt().getSalt();
        else
            sal = new Sha3512().getSalt();
        return sal;
    }
}
