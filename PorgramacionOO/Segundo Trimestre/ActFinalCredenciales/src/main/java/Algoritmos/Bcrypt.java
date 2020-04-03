package Algoritmos;

import org.mindrot.jbcrypt.BCrypt;

public class Bcrypt extends Algoritmo {


    public String getSaltedPasswordHash(String password, String salt){
        return BCrypt.hashpw(password,salt);
    }

    public String getSalt(){
        return BCrypt.gensalt(12);
    }
}
