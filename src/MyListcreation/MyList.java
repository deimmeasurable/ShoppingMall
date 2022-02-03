package MyListcreation;


import java.util.Arrays;

public class MyList {
    private String name;
    private String[] value = new String[4];
    private String[] capacity = new String[0];
    private int sizeCount;

    public MyList(String name, int sizeCount) {
        this.sizeCount = sizeCount;
        this.name = name;
    }

    public String getName(String name) {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getValue() {
        return value;
    }

    public void setValue() {
        this.value = value;
    }

    public String[] getCapacity() {
        return capacity;
    }

    public void setCapacity(String[] capacity) {
        if (getSize() == value.length) {
            capacity = value;
            value = new String[value.length * 2];

        }
        this.capacity = capacity;
    }

    public int getSize() {
        return sizeCount;
    }

    public void setSize(int size) {
        this.sizeCount = size;
    }


    public void canAddToList(String item) {
//        setCapacity(capacity);
        if (value.length <= sizeCount) {
            setCapacity(capacity);
            for (int i = 0; i < capacity.length; i++) {
                value[i] = capacity[i];
            }
        }
        for (int i = 0; i < value.length; i++) {
            if (value[i] == null) {
                value[i] = item;

                sizeCount++;
                break;
            }

        }

    }


    public void canRomoveFromList(String itemValue) {
        if (value.length <= sizeCount) {
            setCapacity(capacity);
//            for (int i = 1; i < capacity.length; i++) {
//                value[i] = capacity[i];
//            }
//        }
            for (int i = 0; i < value.length-1; i++) {
                if (value[i] == null) {
                    value[i] = itemValue;


//                    sizeCount++;
                    break;
                }

            }


        }
    }


    @Override
    public String toString() {
        return "MyList{" +
                "name='" + name + '\'' +
                ", value=" + Arrays.toString(value) +
                ", capacity=" + Arrays.toString(capacity) +
                ", sizeCount=" + sizeCount +
                '}';
    }
}
