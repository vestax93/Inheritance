package exercise5;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item); //dodavanje na stack
    }
    public String pop() {
        if(isEmpty()){ //provera da li je stack prazan
            throw new IndexOutOfBoundsException("StackOfStrings is Empty");
        }
        return this.data.remove(this.data.size() - 1); //uzimamo element sa poslednje pozicije i sklanjamo ga
    }
    public boolean isEmpty(){
        return this.data.isEmpty();
    }
    public String peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("StackOfStrings is Empty");
        }
        return this.data.get(this.data.size() - 1); //citamo element sa poslednje pozicije i vracamo tu vrednost
    }

}
