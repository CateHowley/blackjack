
public class game {
    public int a;
    public int b;
    public card card1;
    public card[] deck;

    public static void main(String[] args) {
        game mygame= new game();
    }


    public game() {
        // System.out.println("Game Constructor");
        deck = new card[52];
        for (int w = 0; w < 4; w++) {
            for (int x = 0; x < 13; x++) {
                //deck[count] = new card(e, w);

            }
            // deck[0].print();
            // card1= new card(1,1);
            // card1.print();
        }
    }
            public void shuffle() {
                    card[] shuffleDeck = new card[52];

                    for (int f = 0; f < shuffleDeck.length; f++) {

                        int randomCard = (int) (Math.random() * 52);
                        card shuffelCard = deck[randomCard];
                        if(deck[randomCard].isDealt==true){
                            randomCard = (int) (Math.random() * 52);
                            shuffelCard.printCard();
                        }
                        deck[randomCard].isDealt = true;
                        shuffelCard.printCard();

                        shuffleDeck[f]=shuffelCard;



                    }
                    deck=shuffleDeck;

                }
            }






