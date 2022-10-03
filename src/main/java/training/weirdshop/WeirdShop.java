package training.weirdshop;

class WeirdShop {
    private Item[] items;

    public WeirdShop(Item[] items) {
        this.items = items;
    }

    // Method to simplify calls to items[i].name.equals(name)
    private boolean eq(String name, int i) {
        return items[i].name.equals(name);
    }

    void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!eq("Aged Brie", i)
                    && !eq("Backstage Pass",i)) {
                if (items[i].quality > 0 && (!eq("Gold Coin", i)) ) {
                        items[i].quality = items[i].quality - 1;
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (eq("Backstage Pass",i)) {
                        if (items[i].sellIn < 12) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 7) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!eq("Gold Coin",i)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!eq("Aged Brie",i)) {
                    if (!eq("Backstage Pass",i)) {
                        if (items[i].quality > 0) {
                            if (!eq("Gold Coin",i)) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}