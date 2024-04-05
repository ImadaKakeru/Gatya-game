package Level2;

public class Panaisonic {
    private String type;
    private String name;
    private int strongness;

    public Panaisonic(){
        this.name = "Panaisonic";
        this.strongness = 100;
        this.type = "human embryo";
    }

    public void explain(){
        System.out.println("Panaisonicはisodaの進化系である。" +
                "パナソニックに内定が出たことにより絶大な求心力と経済力を得た");
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrongness() {
        return strongness;
    }

    public void setStrongness(int strongness) {
        this.strongness = strongness;
    }
}
