package exercise4;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    private Random random; //klasa za generisanje nasumicnih elemenata

    public RandomArrayList() {
        this.random = new Random();
    }

    public Object getRandomElement() { //nalazi i brise element na nasumicnom mestu
        int index = this.random.nextInt(super.size()); //dobijanje nasumicnog integera koji predstavlja index u listi (bira se nasumicno od 0 do velicine liste iskljucujuci tu vrednost)
        Object element = super.get(index); //uzimamo element na toj poziciji
        super.remove(index); //sklanjamo element iz liste na izgenerisanoj nasumicnoj poziciji
        return element; //vracamo izbrisani element
    }

}
