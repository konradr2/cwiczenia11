import java.sql.SQLOutput;

public class Item {

    int id;
    String name;

    public Item(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println("Nazwa Item'u: " + name);
    }
}
