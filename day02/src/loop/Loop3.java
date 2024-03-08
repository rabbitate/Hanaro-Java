package loop;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out:while(true) {
            System.out.print("Input Command..(q,c,r,u,d): ");
            String cmd = sc.next();

            if (cmd.equals("q")) {
                System.out.println("Bye");
                sc.close(); // 시스템 자원을 반환해야 한다
                break;
            }

            switch (cmd) {
                case "c":
                    System.out.println("Create");
                    break;
                case "r":
                    System.out.print("Input ID: ");
                    String id = sc.next();
                    System.out.println("Read ID Info...");
                    break;
//                    sc.close(); // 시스템 자원을 반환해야 한다
//                    break out; // scope break
                case "u":
                    System.out.println("Update");
                    break;
                case "d":
                    System.out.println("Delete");
                    break;
                default:
                    System.out.println("Try Again");
            }
        }
        System.out.println("End...");
    }
}
