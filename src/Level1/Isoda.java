package Level1;

public class Isoda {
    private String type;
    private String name;
    private int strongness;

    public Isoda(){
        this.name = "Isoda";
        this.strongness = 10;
        this.type = "Segmentation";
    }
    // setter
    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrongness(int strongness) {
        this.strongness = strongness;
    }

    // getter
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getStrongness() {
        return strongness;
    }
}
