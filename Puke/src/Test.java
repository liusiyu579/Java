import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/21 14:36
 * @Version 1.0
 **/
class Card{
    private String suit;   //牌的花色
    private int rank;      //牌的数值
    public Card(String suit,int rank){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String strNum = rank+"";
        switch (rank){
            case 11:
                strNum = "J";
                break;
            case 12:
                strNum = "Q";
                break;
            case 13:
                strNum = "K";
                break;
        }
        return "["  + suit + " " +
                strNum +
                ']';
    }
}
class CardDeam{
    //构造一副扑克牌
    String Color[] = {"❤","♦","♣","♠"};
    public List<Card> BuyDeck(){
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            //牌面值和花色
            for (int j = 1; j <14 ; j++) {
                Card c = new Card(Color[i],j);
                cards.add(c);
            }
        }
        return cards;
    }
    //洗牌
    public void shuffle(List<Card> L){
        for (int i = L.size()-1; i > 0 ; i--) {
            //从[0,i)随机取一张牌
            //常见设置种子的方式：获取系统当前的时间
            Random random = new Random(20200213);
            int j = random.nextInt(i);
            //将i j 位置牌进行交换
            swap(L,i,j);
        }
    }
    //交换
    private void swap(List<Card> L,int i,int j){
        Card tmp = L.get(i);
        L.set(i,L.get(j));
        L.set(j,tmp);
    }
}
public class Test {

    public static void main(String[] args) {
        CardDeam cardDeam = new CardDeam();

        //构造一副扑克牌
        List<Card> L = cardDeam.BuyDeck();
        System.out.println(L);

        cardDeam.shuffle(L);
        System.out.println(L);

        //3个人  每个人摸5张牌
        List<List<Card>> hands = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            hands.add(new ArrayList<>());
        }
        for (int i = 0; i < 5; i++) {
            //3个人 依次 摸排
            for (int j = 0; j <3 ; j++) {
                //从L 中 依次获取一张牌
                Card card = L.remove(L.size()-1);
                //将该牌 放置到对应人手上
                hands.get(j).add(card);
            }
        }
        //打印每人手里的牌
        for (int i = 0; i < hands.size(); i++) {
            System.out.println(hands.get(i));
        }
        System.out.println(L.size());
        System.out.println(L);
    }
}
