public class Shirt {
    private String id = "";
    private String description = "";
    private String color = "";
    private String size = "";

    public Shirt() {
    }

    public Shirt(String color, String description, String id, String size) {
        this.color = color;
        this.description = description;
        this.id = id;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return this.id;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shirt ID: ");
        sb.append(getId());
        sb.append("\nDescription: ");
        sb.append(getDescription());
        sb.append("\nColor: ");
        sb.append(getColor());
        sb.append("\nSize: ");
        sb.append(this.getSize());
        sb.append("\n");

        return sb.toString();
    }
}
