package Section12_Enum.entities;

public class Departament {
    private String name;

    public Departament(){}

    public Departament(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return this.name;
    }
}
