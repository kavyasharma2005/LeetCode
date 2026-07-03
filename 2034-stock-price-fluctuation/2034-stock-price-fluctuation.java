class StockPrice 
{
    HashMap<Integer, Integer> map;
    TreeMap<Integer, Integer> prices;
    int latestTime;

    public StockPrice() 
    {
        map = new HashMap<>();
        prices = new TreeMap<>();
        latestTime = 0;
    }

    public void update(int timestamp, int price) 
    {

        // Timestamp already exists
        if (map.containsKey(timestamp)) 
        {

            int oldPrice = map.get(timestamp);

            prices.put(oldPrice, prices.get(oldPrice) - 1);

            if (prices.get(oldPrice) == 0)
                prices.remove(oldPrice);
        }

        map.put(timestamp, price);

        prices.put(price, prices.getOrDefault(price, 0) + 1);

        latestTime = Math.max(latestTime, timestamp);
    }

    public int current() 
    {
        return map.get(latestTime);
    }

    public int maximum() 
    {
        return prices.lastKey();
    }

    public int minimum() 
    {
        return prices.firstKey();
    }
}
/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */