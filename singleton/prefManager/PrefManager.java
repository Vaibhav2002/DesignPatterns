package singleton.prefManager;

import java.util.ArrayList;
import java.util.List;

public class PrefManager {

    private static volatile PrefManager instance;
    List<String> users;

    private PrefManager(){
        users = new ArrayList<>();
    }

    public static PrefManager getInstance(){
        if(instance == null){
            synchronized (PrefManager.class){
                instance = new PrefManager();
            }
        }
        return instance;
    }

    void addUser(String name){
        users.add(name);
    }
    List<String> getUsers(){
        return users;
    }
    Boolean isUserSaved(String name){
        return users.contains(name);
    }


}
