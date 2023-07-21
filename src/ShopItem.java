public class ShopItem {

    private String name;    // Tárgy neve pl.: A
    private int value;      // Tárgy ára

    public  ShopItem(String name, int value){
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }



    @Override
    public String toString(){
        return name+" : "+value+" Ft";
    }
}
