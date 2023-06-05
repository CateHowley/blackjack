public class card {
    public String suit;
    public int value;
    public String name;
    public boolean isDealt;


    public card(int pSuit, int pName) {
        if (pSuit == 0) {
            suit = "Diamond";
        }
        if (pSuit == 1) {
            suit = "spade";
        }
        if (pSuit == 2) {
            suit = "heart";
        }
        if (pSuit == 3) {
            suit = "club";
        }
        if (pName == 10) {
            suit = "King";

        }
        if (pName == 11) {
            suit = "ace";

        }
    }

    public void print() {
        System.out.println("your card is" + name + "of" + suit);
    }

}





