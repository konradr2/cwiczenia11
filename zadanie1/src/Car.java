import java.util.ArrayList;
import java.util.List;

public class Car implements Comparable<Car> {

    String model;
    int yearOfProduction;
    List<Car> cars = new ArrayList<>();

    public Car(String model, int yearOfProduction){
        this.model=model;
        this.yearOfProduction=yearOfProduction;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.yearOfProduction,o.yearOfProduction);
    }

    @Override
    public String toString() {
        return model + " " + yearOfProduction;
    }
}
