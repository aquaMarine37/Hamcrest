public class Animal {
    protected String sound;
    protected String owner;


    public String getSound() {
        return sound;
    }
    public String getOwner() {
        return owner;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Animal(String sound, String owner) {
        this.sound = sound;
        this.owner = owner;
    }
}
