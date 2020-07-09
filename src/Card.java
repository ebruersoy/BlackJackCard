public class Card {
    Suit suit;
    int value;
    String name;

    private Card() {
    }

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
        switch (value){
            case 1:
                name="ACE";
                break;
            case 2:
                name="TWO";
                break;
            case 3:
                name="THREE";
                break;
            case 4:
                name="FOUR";
                break;
            case 5:
                name="FIVE";
                break;
            case 6:
                name="SIX";
                break;
            case 7:
                name="SEVEN";
                break;
            case 8:
                name="EIGHT";
                break;
            case 9:
                name="NINE";
                break;
            case 10:
                name="TEN";
                break;
            case 11:
                name="JACK";
                this.value = 10; //?
                break;
            case 12:
                name="QUEEN";
                this.value = 10; //?
                break;
            case 13:
                name="KING";
                this.value = 10; //?
                break;
            default:
                name = "JOKER";
                this.value = 10; //?
        }
    }
}