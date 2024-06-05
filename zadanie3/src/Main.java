import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item(1,"Telefon"));
        itemList.add(new Item(2,"Laptop"));
        itemList.add(new Item(3,"Myszka"));
        itemList.add(new Item(4,"Klawiatura"));
        itemList.add(new Item(5,"Monitor"));
        itemList.add(new Item(6,"Drukarka"));
        itemList.add(new Item(7,"Router"));
        itemList.add(new Item(8,"Glosnik"));
        itemList.add(new Item(9,"Krzeslo"));
        itemList.add(new Item(10,"Biurko"));


        List<Item> subList = itemList.subList(0,5);

        Set<Item> itemSet = new HashSet<>(subList);

        for (Item item : itemSet){
            System.out.println(item);
        }
    }
}