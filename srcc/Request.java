public class Request {
    public enum Type {
        hardware,
        software,
        network
    }

    private int id;
    private String description;
    private int priority;
    private Type type;

    public Request(int id, String description, int priority, Type type) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

