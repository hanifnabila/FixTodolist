package Controller;

import java.util.ArrayList;
import Database.Database;
import Model.Todo;

public class TodoController {
    public void show(ArrayList<Todo> todoes) {
        System.out.println("==================");
        System.out.println("Show Todo List");
        System.out.println("ID\tJUDUL\tDescription");
        for (Todo todo : todoes) {
            System.out.println(todo.id + "\t" + todo.title + "\t" + todo.description);
        }
    }

    public void store(Database data, Todo todo) {
        data.add(todo);
    }

    public void edit(Database data, int index, String newTitle, String newDescription) {
        data.getTodoByIndex(index).title = newTitle;
        data.getTodoByIndex(index).description = newDescription;
    }

    public void delete(Database data, int index) {
        int id = data.findIndexByid(index);
        data.getTodo().remove(id);
    }
}
