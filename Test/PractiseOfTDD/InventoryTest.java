package PractiseOfTDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    Inventory inventory;
    @BeforeEach
    public void setUp(){
        inventory= new Inventory();
    }
    @Test
    public void testThatInventoryCanBeCreated(){
        assertNotNull(inventory);
    }
    @Test
    public void checkThatGuitarCanBeAddedToInventory(){
       // inventory.addGuitar();
        assertEquals(1,inventory.getGuitar().size());
    }
    @Test
    public void guitarCanBeGotten(){
        inventory.addGuitar("234",4.45,"rate","eat","take","rat","yaou");
        inventory.addGuitar("234",0.45,"rate","eat","take","rat","yaou");
        inventory.addGuitar("234",9.45,"rate","eat","take","rat","yaou");
        inventory.addGuitar("234",8.45,"rate","eat","take","rat","yaou");

    }


}