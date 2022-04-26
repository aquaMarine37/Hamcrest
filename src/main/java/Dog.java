public class Dog<D extends Animal> extends Animal {

    public Dog(String sound, String owner) {
        super(sound, owner);
    }

    public String toString() {
        return "dog: " + this.sound + " owner: " + this.owner;
    }
}
