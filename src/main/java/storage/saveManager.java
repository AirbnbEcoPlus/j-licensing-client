package storage;

public class saveManager {

    public static boolean getMainFolder() {
        return new java.io.File("license/").exists();
    }
    public static void createMainFolder() {
        new java.io.File("license/").mkdir();
    }
}
