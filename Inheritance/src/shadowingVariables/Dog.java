package shadowingVariables;

public class Dog extends Animal {
    String name = "ispis iz klase (grad)";
    public void bark(){
        String name = "ispis iz metode (opstina)";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
