public class card {
    public String suit;
    public int value;
    public String name;
    public boolean isDealt;

    public card(int pSuit, int pName){
        if(pSuit == 0){
            suit = "Diamond";
        }
        if(pSuit == 0){
            suit = "spade";
        }
    }
}
