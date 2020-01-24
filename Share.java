
//编写一个 StockSpanner 类，它收集某些股票的每日报价，
//并返回该股票当日价格的跨度。

//今天股票价格的跨度被定义为股票价格小于或等于今天价格的最大连续日数
//（从今天开始往回数，包括今天）。

//例如，如果未来7天股票的价格是 [100, 80, 60, 70, 60, 75, 85]，
//那么股票跨度将是 [1, 1, 1, 2, 1, 4, 6]。

class Share {
     List<Integer> prices;
      List<Integer> result;
    public StockSpanner() {
        prices = new ArrayList<>();
        result = new ArrayList<>();
    }
    
    public int next(int price) {
        int a=prices.size()-1;
        int b=1;
        while(a >= 0 && price >= prices.get(a)){
            int c=result.get(a);
            b=b+c;
            a=a-c;
        }
        prices.add(price);
        result.add(b);
        return b;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */