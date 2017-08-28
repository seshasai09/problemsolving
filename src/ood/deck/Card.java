package ood.deck;

/**
 * Created by seshasai on 17/08/2017.
 */
public class Card {

    private String value;
    private Suite suite;

    public Card(String value, Suite suite){
        this.value = value;
        this.suite = suite;
    }


    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
