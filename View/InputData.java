package View;

import java.util.Scanner;

import Model.Todo;

public class InputData {

    public Todo inputData() {
        String title;
        String description;

        Scanner input = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("Title Task:\t");
        title = input.nextLine();
        System.out.println("Description Task:\t");
        description = input.nextLine();
        System.out.println();

        return new Todo(title, description);
    }

    public int inputInt(String placeHolder) {
        Scanner input = new Scanner(System.in);
        System.out.println("=================");
        System.out.println(placeHolder);
        return input.nextInt();
    }

    public String inputStr(String placeHolder) {
        Scanner input = new Scanner(System.in);
        System.out.println("=================");
        System.out.println(placeHolder);
        return input.nextLine();
    }
}
