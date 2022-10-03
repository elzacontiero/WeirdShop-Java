package training.weirdshop;

public class Item {

    public String name;

    /** SellIn indicates the number of days to sell the item.
     * Value of variable sellIn decreases at the end of the day.
     * If name is "Gold Coins" sellIn doesn't decrease.
     */
    public int sellIn;


    /** Quality indicates how valuable the item is.
     *  Value of variable quality decreases at the end of the day.
     *  Quality decreases twice as fast once the sell date has passed.
     *  if name is "Aged Brie" increases quality the older it gets.
     *  Quality of "Gold Coins" is 80 and it never alters.
     *  Quality is between 0 and 50:
     *      Quality of an item is never negative.
     *      Quality of an item is never more than 50.
     *  If name is "Gold Coins" it doesn't decrease in quality.
     *  If name is "Backstage Passes":
     *      increases in Quality as sell-by date approaches
     *      It increases by 2 when there are 10 days or less.
     *      It increases by 3 when there are 5 days or less.
     *      It decreases, dropping to O after the concert.
     *
     */
    public int quality;


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString()
    {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
