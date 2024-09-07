package br.edu.fatecfranca.ex0;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private int id;
    private String name;
    private String url;
    private List<Message> message;

    public Forum() {
        this.name = "";
        this.url = "";
        this.message = new ArrayList<>();
    }
    public Forum(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.message = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", message=" + message +
                '}';
    }
    public void addMessage(int id, String text, Person person) {
        message.add(new Message(id,text, person));

    }
}
