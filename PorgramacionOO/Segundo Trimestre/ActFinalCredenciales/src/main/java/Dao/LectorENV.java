package Dao;

import io.github.cdimascio.dotenv.Dotenv;

public class LectorENV {
    Dotenv dotenv;

    public LectorENV(){
        dotenv = Dotenv.configure().load();
    }

    public String getHost(){
        return dotenv.get("DB_HOST");
    }

    public String getName(){
        return dotenv.get("DB_NAME");
    }

    public String getUser(){
        return dotenv.get("DB_USER");
    }

    public String getPass(){
        return  dotenv.get("DB_PASSWORD");
    }
}
