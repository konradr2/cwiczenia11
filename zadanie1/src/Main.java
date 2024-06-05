import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", 2005));
        cars.add(new Car("BMW", 2009));
        cars.add(new Car("Audi", 2022));
        cars.add(new Car("Citroen", 2021));
        cars.add(new Car("Mitsubishi", 2023));
        cars.add(new Car("Infinity", 2020));
        cars.add(new Car("Lexxus", 2017));
        cars.add(new Car("Toyota", 2012));
        cars.add(new Car("Mercedes", 2011));
        cars.add(new Car("Ferrari", 2018));

        Collections.sort(cars);

        for (Car car : cars){
            System.out.println(car);
        }

    }
}