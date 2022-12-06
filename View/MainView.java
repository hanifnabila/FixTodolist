package View;

import java.util.Scanner;

import Controller.TodoController;
import Database.Database;

public class MainView {
    Scanner input = new Scanner(System.in);

    public void menu() {
        int select;
        InputData inputTodolist = new InputData();
        Database db = new Database();
        TodoController todoCntrl = new TodoController();
        do {
            System.out.println("Application To Do List");
            System.out.println("=================");
            System.out.println("1. Add Todo List");
            System.out.println("2. Show Todo List");
            System.out.println("3. Edit Todo List");
            System.out.println("4. Delete Todo List");
            System.out.println("5. Logout");
            System.out.println();
            System.out.println("Select Menu : ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    todoCntrl.store(db, inputTodolist.inputData());
                    break;
                case 2:
                    todoCntrl.show(db.getTodo());
                    break;
                case 3:
                    int index = inputTodolist.inputInt("Masukan nomor id: ");
                    String newTitle = inputTodolist.inputStr("Masukan nomor title baru: ");
                    String newDesc = inputTodolist.inputStr("Masukan nomor description baru: ");
                    todoCntrl.edit(db, index, newTitle, newDesc);
                    break;
                case 4:
                    int id = inputTodolist.inputInt("Masukan nomor id: ");
                    todoCntrl.delete(db, id);
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        } while (select != 5);
    }

}
