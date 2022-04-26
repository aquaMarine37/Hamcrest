import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestObjectsTest {

    @Test
    public void givenDog_whenToStringReturnSound(){
        Dog<Animal> dog = new Dog<Animal>("gaf", "Kolya");
        assertThat(dog, hasToString("gaf"));
    }

    @Test
    public void givenSubclass_whenTypeCompatableThenTrue(){
        assertThat(Dog.class, typeCompatibleWith(Animal.class));
        assertThat(Integer.class, typeCompatibleWith(Number.class));
    }

    @Test
    public void givenSubclass_whenChecked_thenTrue() {
        Dog<Animal> dog = new Dog<Animal>("gaf", "Kolya");
        assertThat(dog, instanceOf(Animal.class));
        assertThat(dog, isA(Animal.class));
    }

}
