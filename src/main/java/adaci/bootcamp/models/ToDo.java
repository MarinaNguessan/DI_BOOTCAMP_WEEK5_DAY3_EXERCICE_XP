package adaci.bootcamp.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class ToDo {

    @Id
    private int id;
    private String item;
    private boolean isDone;

    public ToDo() {
    }

    public ToDo(int id, String item, boolean isDone) {
        this.id = id;
        this.item = item;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
    
}
