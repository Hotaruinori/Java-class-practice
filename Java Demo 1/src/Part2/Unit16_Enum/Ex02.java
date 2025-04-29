
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
                 title = "¶Â®ç";
                 break;
            case HEARTS:
                 title = "¬õ¤ß";
                 break;
            case DIAMONDS:
                 title = "¬õ¿j";
                 break;
            case CLUBS:
                 title = "±öªá";
                 break;
            default:
                 title = "°­µP";     
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