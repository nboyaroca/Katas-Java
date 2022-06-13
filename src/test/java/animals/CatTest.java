package animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    void catCanTalk() {
        var cat1= new Cat("nou nom de gat");
        System.out.println(cat1.getName());
    }

    // alternative
    /*@Test
    void catCanTalk() {
        var cat1= new Cat();
        System.out.println(cat1.getName());

    }*/
}