package Model;

public class Todo {
    public int id;
    public String title;
    public String description;
    static int counterId;

    public Todo(String title, String description) {
        this.id = ++counterId;
        this.title = title;
        this.description = description;
    }
}