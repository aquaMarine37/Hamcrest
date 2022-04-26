import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.samePropertyValuesAs;

public class HamcrestBeanTest {
    @Test
    public void givenBean_whenCheckProperty_thenHas() {

        Animal animal = new Animal("gaf", "Liza");
        Dog<Animal> dog = new Dog<Animal>("gaf", "Kolya");
        assertThat(animal, Matchers.<Animal> hasProperty("sound"));
        assertThat(dog, Matchers.<Animal> hasProperty("sound"));
    }

    @Test
    public void givenBean_whenCheckPropertyValue_thenEqual() {
        Animal animal = new Animal("gaf", "Kolya");
        assertThat(animal, Matchers.<Animal> hasProperty("sound", equalTo("gaf")));
    }

    @Test
    public void given2Beans_whenHavingSameValues_thenCorrect() {
        Animal animal1 = new Animal("gaf", "Kolya");
        Animal animal2 = new Animal("gaf", "Kolya");
        assertThat(animal1, samePropertyValuesAs(animal2));
    }
}
