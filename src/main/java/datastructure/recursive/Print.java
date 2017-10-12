package datastructure.recursive;

import java.util.Scanner;

/**
 * use datastructure.recursive
 * Created by Linuxea on 17-10-7.
 */
public class Print {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Print print = new Print();
        print.print();
    }

    public void print() {
        String line = scanner.nextLine();
        if (!"exit".equalsIgnoreCase(line)) {
            print();
        }
        System.out.println(line);
    }

}
