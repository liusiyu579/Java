import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName TestDemo
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/24 22:32
 * @Version 1.0
 **/
class Card{
    private String suit;
    private int rank;
    public Card(String suit,int rank){
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        String strNum = ""+rank;
        switch (rank) {
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
        return suit+":"+strNum;
    }
}
class CardDemo{
    String[] color = {"♥", "♦", "♣", "♠"};
    public List<Card> getCard(){
        List<Card> cards = new ArrayList<>();
        for(int i = 0;i < 4;i++) {
            for (int j = 1; j <= 13 ; j++) {
                Card card = new Card(color[i],j);
                cards.add(card);
            }
        }
        return cards;
    }
    public void shuffleCard(List<Card> L){
        for (int i = L.size()-1; i > 0 ; i--) {
            Random random = new Random(20191224);
            int j = random.nextInt(i);
            swap(L,i,j);
        }
    }
    private void swap(List<Card> L,int i,int j){
        Card tmp = L.get(i);
        L.set(j,L.get(i));
        L.set(i,tmp);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        CardDemo cd = new CardDemo();
        List<Card> L = cd.getCard();
        System.out.println(L);
        cd.shuffleCard(L);
        System.out.println(L);
    }
}
