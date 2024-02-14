package exercise3;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); //metoda iz nadklase tj. Animal klase
        dog.bark(); //metoda iz Dog klase

        Cat cat = new Cat();
        cat.eat(); //metoda iz nadklase tj. Animal klase
        cat.meow(); //metoda iz Cat klase
        //dog.meow(); - ne poseduje tu metodu
        //cat.bark(); - ne poseduje tu metodu
    }
}
