package method;

public class help {
    public static void main(String[] args) {
        System.out.println("Usage: method [options] [command] [command options]");
        System.out.println("  Options:");
        System.out.println("    -h, --help");
        System.out.println("       Display help information");
        System.out.println("    -v, --version");
        System.out.println("       Display version information");
        System.out.println("  Commands:");
        System.out.println("    setup    Setup the method environment");
        System.out.println("    install  Install on a linux server");
        System.out.println("    update   Update a method");
    }
}
