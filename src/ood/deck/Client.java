package ood.deck;

/**
 * Created by seshasai on 17/08/2017.
 */
public class Client {

    public static void main(String[] args){
        Deck d = new Deck();
        for(Card c : d.getCards()){
            System.out.println(c.getSuite() + " :" +c.getValue());
        }
    }
}
