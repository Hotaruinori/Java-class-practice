package Part2.Unit16_Enum;
enum Suit
{
    SPADES   ("黑桃"),
    HEARTS   ("紅心"),
    DIAMONDS ("紅磚"),
    CLUBS    ("梅花");
    
    private final String title;
    
    private Suit(String title)
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return title;
    }        
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
}


public class Ex03
{
    public static void main(String[] args)
    {
        PlayCard card1 = new PlayCard(Suit.HEARTS, 7);
        System.out.println("card1 is the " + card1.getRank() + " of " + card1.getSuit().getTitle());
        // PlayCard card2 = new PlayCard("紅心", 5);
    }
}