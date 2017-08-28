package ood.deck;

/**
 * Created by seshasaai on 17/08/2017.
 */
public class Deck {

    public Card[] getCards() {
        return cards;
    }

    private Card[] cards;

    public Deck(){
        cards = initializeDeck();
    }

    private Card[] initializeDeck(){
        int index=0;
        Card[] newCards = new Card[52];
        for(Suite suite : Suite.values()){
            for(int i=1;i<=13;i++){
                if(i==1){
                    newCards[index] = new Card("A", suite);
                }else if(i==11){
                    newCards[index] = new Card("J", suite);
                }else if(i==12){
                    newCards[index] = new Card("Q", suite);
                }else if(i==13){
                    newCards[index] = new Card("K", suite);
                }else{
                    newCards[index] = new Card(String.valueOf(i), suite);
                }
                index++;
            }
        }
        return newCards;
    }

}
