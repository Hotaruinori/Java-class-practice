package Week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BlackjackGame {
    
    public static void main(String[] args) {
        System.out.println("歡迎來到 Blackjack 21點遊戲！");
        Scanner scanner = new Scanner(System.in);
        
        Deck deck = new Deck();
        deck.shuffle();
        
        Player player = new Player("玩家");
        Player dealer = new Player("莊家");
        
        // 初始發牌
        player.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());
        
        // 顯示初始牌面
        System.out.println("莊家的牌: " + dealer.getHand().get(0) + " 和 [隱藏牌]");
        System.out.println("你的牌: " + player.getHand() + " (總點數: " + player.getHandValue() + ")");
        
        // 玩家回合
        boolean playerBusted = playerTurn(player, deck, scanner);
        
        // 莊家回合
        boolean dealerBusted = false;
        if (!playerBusted) {
            dealerBusted = dealerTurn(dealer, deck);
        }
        
        // 顯示結果
        determineWinner(player, dealer, playerBusted, dealerBusted);
        
        scanner.close();
    }
    
    private static boolean playerTurn(Player player, Deck deck, Scanner scanner) {
        while (true) {
            System.out.print("你要「要牌」(h) 還是「停牌」(s)? ");
            String input = scanner.nextLine().trim().toLowerCase();
            
            if (input.equals("h")) {
                player.addCard(deck.dealCard());
                System.out.println("你抽到: " + player.getHand().get(player.getHand().size() - 1));
                System.out.println("你的牌: " + player.getHand() + " (總點數: " + player.getHandValue() + ")");
                
                if (player.getHandValue() > 21) {
                    System.out.println("爆牌了！");
                    return true;
                }
            } else if (input.equals("s")) {
                System.out.println("你選擇停牌。");
                return false;
            } else {
                System.out.println("無效輸入，請輸入 'h' 或 's'。");
            }
        }
    }
    
    private static boolean dealerTurn(Player dealer, Deck deck) {
        System.out.println("\n莊家的牌: " + dealer.getHand() + " (總點數: " + dealer.getHandValue() + ")");
        
        while (dealer.getHandValue() < 17) {
            System.out.println("莊家要牌...");
            dealer.addCard(deck.dealCard());
            System.out.println("莊家抽到: " + dealer.getHand().get(dealer.getHand().size() - 1));
            System.out.println("莊家的牌: " + dealer.getHand() + " (總點數: " + dealer.getHandValue() + ")");
            
            if (dealer.getHandValue() > 21) {
                System.out.println("莊家爆牌了！");
                return true;
            }
        }
        
        System.out.println("莊家停牌。");
        return false;
    }
    
    private static void determineWinner(Player player, Player dealer, boolean playerBusted, boolean dealerBusted) {
        System.out.println("\n=== 遊戲結果 ===");
        System.out.println("你的牌: " + player.getHand() + " (總點數: " + player.getHandValue() + ")");
        System.out.println("莊家的牌: " + dealer.getHand() + " (總點數: " + dealer.getHandValue() + ")");
        
        if (playerBusted) {
            System.out.println("你爆牌了，莊家贏！");
        } else if (dealerBusted) {
            System.out.println("莊家爆牌，你贏了！");
        } else if (player.getHandValue() > dealer.getHandValue()) {
            System.out.println("你的點數比莊家大，你贏了！");
        } else if (player.getHandValue() < dealer.getHandValue()) {
            System.out.println("你的點數比莊家小，莊家贏！");
        } else {
            System.out.println("平手！");
        }
    }
}

class Card {
    private String suit;  // 花色
    private String rank; // 點數
    
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
    public int getValue() {
        if (rank.equals("A")) {
            return 11; // 暫時將A當作11，在Player類中會處理
        } else if (rank.equals("K") || rank.equals("Q") || rank.equals("J")) {
            return 10;
        } else {
            return Integer.parseInt(rank);
        }
    }
    
    @Override
    public String toString() {
        return suit + rank;
    }
}

class Deck {
    private List<Card> cards;
    
    public Deck() {
        String[] suits = {"紅心", "紅磚", "梅花", "黑桃"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        cards = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card dealCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("牌堆已空");
        }
        return cards.remove(0);
    }
}

class Player {
    private String name;
    private List<Card> hand;
    
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }
    
    public void addCard(Card card) {
        hand.add(card);
    }
    
    public List<Card> getHand() {
        return hand;
    }
    
    public int getHandValue() {
        int value = 0;
        int aceCount = 0;
        
        for (Card card : hand) {
            value += card.getValue();
            if (card.getValue() == 11) {
                aceCount++;
            }
        }
        
        // 處理Ace可以當作1或11的情況
        while (value > 21 && aceCount > 0) {
            value -= 10;
            aceCount--;
        }
        
        return value;
    }
}
