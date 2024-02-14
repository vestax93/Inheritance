package exercise2;

public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();

        puppy.eat(); //nasledjeno iz Animal klase preko Dog klase
        puppy.bark(); //nasledjeno iz Dog klase
        puppy.weep(); //deo Puppy klase
    }
}
