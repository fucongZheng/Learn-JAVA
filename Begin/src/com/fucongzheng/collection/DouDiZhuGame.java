package com.fucongzheng.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/*
    这个示例代码实现了一个简单的斗地主游戏。创建了一个名为 Card 的类来表示扑克牌（包括花色和点数），
    然后在 DouDiZhuGame 类中使用集合 ArrayList 来代表一副扑克牌。在 initializeDeck() 方法中初始化了一整副扑克牌，
    包括大小王。shuffleDeck() 方法用于洗牌，而 dealCards() 方法用于发牌给指定数量的玩家。

    在 main() 函数中创建了一个 DouDiZhuGame 对象，并进行洗牌和发牌操作，模拟了一个三个玩家的斗地主游戏场景。你可以根据需要修改代码以适应更多或更少的玩家。

    运行代码时，将输出每个玩家手中的扑克牌。这个示例演示了如何利用 Java 集合的功能来处理斗地主游戏的一些基本操作。
 */

class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + suit;
    }
}

public class DouDiZhuGame {
    private List<Card> deck;
    private List<Card> bottomCard;

    public DouDiZhuGame() {
        deck = new ArrayList<>();
        initializeDeck();
    }

    public void initializeDeck() {
        String[] suits = {"♦", "♣", "♥", "♠"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String s : suits
        ) {
            for (String r : ranks
            ) {
                deck.add(new Card(s, r));
            }
        }
        deck.add(new Card("Joker", "♥"));
        deck.add(new Card("Joker", "♠"));
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
        bottomCard = deck.subList(2, deck.size());
    }

    public void dealCards(int numPlayers) {
        int carNumbers = bottomCard.size() / numPlayers;
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Player " + i + ":");
            List<Card> peopleCards = bottomCard.subList((i - 1) * carNumbers, i * carNumbers);
            if (randomNumber + 1 == i) {
                peopleCards.add(deck.get(0));
                peopleCards.add(deck.get(1));
                peopleCards.add(deck.get(2));
            }
            for (Card c : peopleCards
            ) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DouDiZhuGame game = new DouDiZhuGame();
        game.shuffleDeck();
        game.dealCards(3);
    }
}
