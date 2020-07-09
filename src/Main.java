import cards.Bronze;
import cards.Card;
import cards.Gold;
import cards.Silver;

public class Main {

    public static void main(String[] args) {
        try {
            Card bronze = new Bronze("Pesho", 0, 150);
            Card silver = new Silver("Gosho", 600, 850);
            Card gold = new Gold("Minka", 1500, 1300);

            System.out.println(bronze);
            System.out.println();
            System.out.println(silver);
            System.out.println();
            System.out.println(gold);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
