package Database;

import java.util.ArrayList;

import Model.Todo;

public class Database {
    private ArrayList<Todo> todoes = new ArrayList<Todo>();

    public void add(Todo todo) {
        this.todoes.add(todo);
    }

    public ArrayList<Todo> getTodo() {
        return this.todoes;
    }

    public Todo getTodoByIndex(int index) {
        return this.todoes.get(index - 1);
    }

    public int findIndexByid(int id) { // 3
        int counter = 0;
        for (Todo todo : this.todoes) {
            if (todo.id == id)
                return counter;

            counter++;
        }
        return counter;
    }
}

// 1---- 0
// 2---- 1
// 4---- 2