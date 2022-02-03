package MyListcreation;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyListTest {
    MyList ilist;
    @BeforeEach
    public  void setMylist(){
        ilist=new MyList("fish",0);
    }
@Test
    public void canAddToTheList()throws Exception {
    ilist.canAddToList("apple");
    assertArrayEquals(new String[]{"apple", null, null, null}, ilist.getValue());
}
@Test
    public void listCanHaveASize()throws Exception{
        ilist.getSize();
        ilist.canAddToList("apple");
        ilist.canAddToList("orange");
        ilist.canAddToList("pineapple");
        assertEquals(3,ilist.getSize());

    }
    @Test
    public void listHaveACapacity()throws Exception{
        ilist.getCapacity();
        ilist.canAddToList("apple");
        ilist.canAddToList("orange");
        ilist.canAddToList("pineapple");
        ilist.canAddToList("mango");
        ilist.canAddToList("tangarine");
        ilist.canAddToList("bannana");
        ilist.canAddToList("dodo ikire");
        ilist.canAddToList("agbado");
        ilist.canAddToList("rice");
        ilist.canAddToList("boli");
        System.out.println(ilist);
        assertEquals(10,ilist.getSize());
    }
    @Test
    public void iCanRemoveFromList(){
       // ilist.canRomeveFromList();
        ilist.canAddToList("apple");
        ilist.canAddToList("orange");
        ilist.canAddToList("pineapple");
        ilist.canAddToList("mango");
        ilist.canAddToList("tangarine");
        ilist.canAddToList("bannana");

      assertEquals(6,ilist.getSize());
        ilist.canRomoveFromList("tangarine");
        assertEquals(5,ilist.getSize());


    }




}
