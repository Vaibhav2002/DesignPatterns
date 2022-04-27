package singleton.prefManager;

public class PresRunner {
    public static void main(String[] args) {
        var pref = PrefManager.getInstance();
        pref.addUser("Vaibhav");
        System.out.println(pref.getUsers().toString());
        System.out.println(pref.isUserSaved("Vaibhav").toString());
    }
}
