package liste;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        List<Animal> list1 = new ArrayList<>();
        list1.add(animal); //radi
        list1.add(dog); //radi, ali ne moze se pristupiti poljima i metodama specificnim za Dog klasu npr. bark
        for(Animal a : list1){
            a.eat();//radi
            //a.bark(); //ne radi
        }
        List<Dog> list2 = new ArrayList<>();
        //list2.add(animal); //ne radi, ne poseduje sva polja i metode koje Dog klasa poseduje
        list2.add(dog); //radi
        for(Dog d : list2){
            d.eat(); //radi
            d.bark(); //radi
        }

    }
}
