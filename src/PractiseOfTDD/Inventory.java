package PractiseOfTDD;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Guitar> guitars=new ArrayList<>();

    public void addGuitar(String s, double v, String rate, String eat, String take, String rat, String yaou) {
        Guitar guitar= new Guitar(564,"tac","tao","you","hole","toa");
    guitars.add(guitar);
    }

    public ArrayList<Guitar> getGuitar() {
        return guitars;
    }



}

