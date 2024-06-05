import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item(1,"Telefon"));
        itemList.add(new Item(2,"Laptop"));
        itemList.add(new Item(3,"Myszka"));
        itemList.add(new Item(4,"Klawiatura"));
        itemList.add(new Item(5,"Monitor"));


        for (int i=0 ; i <itemList.size(); i++){
            itemList.get(i).show();
        }

        Map<Integer, String> itemMap = new HashMap<>();

        for (Item item: itemList){
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()){
            System.out.println("Item ID: " + entry.getKey() + " item name: " + entry.getValue());
        }
    }
}