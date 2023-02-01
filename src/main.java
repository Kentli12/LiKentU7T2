import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main (String[] args ){

        // create an array with the known types
        Car car1 = new Car("Lambo", 100);
        Car car2 = new Car("Lambo", 1000);
        Car car3 = new Car("Lambo", 100000);
        //adda
        Car [] carArray = {car1, car2, car3};

// use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carArray));
        System.out.println(carList);


    }
}
