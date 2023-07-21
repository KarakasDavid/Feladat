import java.util.ArrayList;

public class Shop {
    private ArrayList<ShopItem> items = new ArrayList<ShopItem>();      // A boltban vásárolható tárgyak listája
    private ArrayList<Offer> flexibleoffers = new ArrayList<Offer>();   // A boltban lévő ajánlatok/módosítók, amelyek nem a végösszeggel számolnak pl.: 2 D után egy ingyen elvihető
    private ArrayList<Offer> endoffers = new ArrayList<Offer>();        // A boltban lévő ajánlatok/módosítók, amelyek a végösszeget módosítják pl.: E és D tárgy eseténa  végösszeg 30%-al több

    public ArrayList<ShopItem> getItems() {
        return items;
    }
    public ArrayList<Offer> getFlexibleoffers() {
        return flexibleoffers;
    }
    public ArrayList<Offer> getEndoffers() {
        return endoffers;
    }

    /* Feltölti a boltot alap termékekkel, ezek után ha lenne még például egy F termék, azt add-al hozzá lehet adni
     * Feltölti a boltot az aktuális ajánlatokkal, később bővíthető is akár
     */
    public void InitializeShop(){
        ShopItem item1 = new ShopItem("A",55);
        ShopItem item2 = new ShopItem("B",20);
        ShopItem item3 = new ShopItem("C",60);
        ShopItem item4 = new ShopItem("D",10);
        ShopItem item5 = new ShopItem("E",45);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        Offer offer1 = new TwoAOneCHalf();
        Offer offer2 = new PayTwoDGetOneFree();
        Offer offer3 = new EAndD();
        flexibleoffers.add(offer1);
        flexibleoffers.add(offer2);
        endoffers.add(offer3);

    }


}
