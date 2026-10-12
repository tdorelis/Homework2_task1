package lt.vcd;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year to determine the edition number of the Olympic Games:  ");
        int y = scanner.nextInt();

        if (y < 1896) {
            System.out.print("Įvesti metai pries pirmasias olimpines žaidynes");
        } else if (y == 1896) {
            System.out.print("Šiais metasi įvyko pirmosios limpinės žaidynės");
        } else if (y > 1896 && y % 4 != 0) {
            System.out.print("Šiais metais nevyko olimpinės žaidynės");
        } else if ((y > 1896 && y % 4 == 0)) {
            y = ((y - 1896) / 4) + 1;
            System.out.print("Šiais metais įvyko " +y+  " olimpinės žaidynės");
        }



    }
}

