import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Dog<Animal> dog = new Dog<Animal>("Gaf!", "Kolya");
        Dog<Animal> dog1 = new Dog<Animal>("Ga-f-f!", "Olya");
        Dog<Animal> dog2 = new Dog<Animal>("Gaffff!", "Mike");
        List<Dog<Animal>> dogsList = new ArrayList<>();
        dogsList.add(dog);
        dogsList.add(dog1);
        dogsList.add(dog2);
        System.out.println(dogsList);
        Map<Integer, Dog<Dog<Animal>>> listAnimal = new HashMap<>();
//       for (int i = 0; i < dogsList.size(); i++) {
//           listAnimal.put(i, dogsList.set(i,1));
//       }
//        System.out.println(listAnimal);
    }
}
