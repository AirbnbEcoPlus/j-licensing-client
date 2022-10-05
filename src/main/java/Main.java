import method.help;
import method.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            main.main(args);
        }else {
            switch (args[0]) {
                case "install":
                    System.out.println("saveManager");
                    break;
                case "help":
                    System.out.println("main");
                    break;
                case "update":
                    System.out.println("terminalUtils");
                    break;
                case "setup":
                    System.out.println("terminalUtils");
                    break;
            }
        }

    }
}
