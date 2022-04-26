import org.testng.annotations.Test;

import java.util.*;

import static java.util.Optional.empty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestCollectionsTest {
    @Test
    public void givenList_whenCheck_thenNotEmpty() {
        List<Dog<Animal>> dogsList = new ArrayList<Dog<Animal>>();
        assertThat(dogsList, is(not(empty())));
    }
    @Test
    public void givenList_whenCheck_thenSize3() {
        Dog<Animal> dog = new Dog<Animal>("Gaf!", "Kolya");
        Dog<Animal> dog1 = new Dog<Animal>("Ga-f-f!", "Olya");
        Dog<Animal> dog2 = new Dog<Animal>("Gaffff!", "Mike");
        List<Dog<Animal>> dogsList = Arrays.asList(dog, dog1, dog2);
        assertThat(dogsList, hasSize(3));
    }
    @Test
    public void givenList_whenCheck_thenHasItem() {
        Dog<Animal> dog = new Dog<Animal>("Gaf!", "Kolya");
        Dog<Animal> dog1 = new Dog<Animal>("Ga-f-f!", "Olya");
        Dog<Animal> dog2 = new Dog<Animal>("Gaffff!", "Mike");
        List<Dog<Animal>> dogsList = Arrays.asList(dog, dog1, dog2);
        assertThat(dogsList, hasItem(dog1));
    }
    @Test
    public void givenMap_whenCheck_thenContains() {
        Map<Integer, Dog<Animal>> listAnimal = new HashMap<>();
        Dog<Animal> dog = new Dog<>("Gaf!", "Kolya");
        Dog<Animal> dog1 = new Dog<>("Ga-f-f!", "Olya");
        Dog<Animal> dog2 = new Dog<>("Gaffff!", "Mike");
        listAnimal.put(1,dog);
        listAnimal.put(2,dog1);
        listAnimal.put(3,dog2);

        assertThat(listAnimal, hasKey(1));
        assertThat(listAnimal, hasValue(dog1));
        assertThat(listAnimal, hasEntry(3, dog2));
    }
}
