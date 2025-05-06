package Part2.Unit16_Enum;
enum Suit
{
    SPADES,
    HEARTS,
    DIAMONDS,
    CLUBS
}


class PlayCard
{
    private Suit suit;
    private int rank;
    public PlayCard(Suit suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
    }
    
    public Suit getSuit()
    {
        return suit;
    }
    
    public int getRank()
    {
        return rank;
    }
    
    
    public String getSuitTitle()
    {
        String title;
        switch( suit )
        {
            case SPADES:
                 title = "黑桃";
                 break;
            case HEARTS:
                 title = "紅心";
                 break;
            case DIAMONDS:
                 title = "紅磚";
                 break;
            case CLUBS:
                 title = "梅花";
                 break;
            default:
                 title = "鬼牌";     
         }        
         return title; 
    }                                 
}


public class Ex02
{
    public static void main(String[] args)
    {
        PlayCard card1 = new PlayCard(Suit.HEARTS, 7);
        System.out.println("card1 is the " + card1.getRank() + " of " + card1.getSuitTitle());
        
        //PlayCard card2 = new PlayCard(1, 7);
        //PlayCard card2 = new PlayCard('1', 7);
        //PlayCard card2 = new PlayCard("1", 7);
        //PlayCard card2 = new PlayCard(1.0, 7);
    }
}