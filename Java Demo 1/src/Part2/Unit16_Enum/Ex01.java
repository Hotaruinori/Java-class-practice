package Part2.Unit16_Enum;

class Suit{
    public static final int SPADES = 0;
    public static final int HEARTS = 1;
    public static final int DIAMONDS = 2;
    public static final int CLUBS = 3;
}


class PlayCard{   
    private int suit;
    private int rank;
    public PlayCard(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }
    
    public int getSuit(){
        return suit;
    }
    
    public int getRank(){
        return rank;
    }
    
    public String getSuitName(){
        String name;
        switch( suit ){
            case Suit.SPADES:
                 name = "Spades";
                 break;
            case Suit.HEARTS:
                 name = "Hearts";
                 break;
            case Suit.DIAMONDS:
                 name = "Diamonds";
                 break;
            case Suit.CLUBS:
                 name = "Clubs";
                 break;
            default:
                 name = "Joker";     
         }        
         return name; 
    }                              
}


public class Ex01{
    public static void main(String[] args){
        PlayCard card1 = new PlayCard(Suit.HEARTS, 7);
        System.out.println("card1 is the " + card1.getRank() + " of " + card1.getSuitName());
        PlayCard card2 = new PlayCard(1, 9);
        System.out.println("card2 is the " + card2.getRank() + " of " + card2.getSuitName());
        PlayCard card3 = new PlayCard(47, 7);
        System.out.println("card3 is the " + card3.getRank() + " of " + card3.getSuitName());       
    }
}