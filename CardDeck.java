package JUNIT_UNO;

import java.awt.*;
import java.util.*;
import java.util.List;

/*
    Name: Akshita Sreenivasulu
    Student ID Number: 991592661
*/

public class CardDeck
{
    final private static HashMap<String, Card> fullDeck = new HashMap<>(108);

    /**
     * Create cards and add to deck
     */
    CardDeck()
    {
        for (int i = 1; i < 10; i++)
        {
            fullDeck.put("Red"+i+"-1", new Card(Color.red, i));
            fullDeck.put("Red"+i+"-2", new Card(Color.red, i));
            fullDeck.put("Blue"+i+"-1", new Card(Color.blue, i));
            fullDeck.put("Blue"+i+"-2", new Card(Color.blue, i));
            fullDeck.put("Green"+i+"-1", new Card(Color.green, i));
            fullDeck.put("Green"+i+"-2", new Card(Color.green, i));
            fullDeck.put("Yellow"+i+"-1", new Card(Color.yellow, i));
            fullDeck.put("Yellow"+i+"-2", new Card(Color.yellow, i));
        }

        fullDeck.put("Red0",new Card(Color.red, 0));
        fullDeck.put("Blue0",new Card(Color.blue, 0));
        fullDeck.put("Green0",new Card(Color.yellow, 0));
        fullDeck.put("Yellow0", new Card(Color.green, 0));

        for (int i = 1; i < 3; i++)
        {
            fullDeck.put("Red+2-"+i, new Card(Color.red, Card.CardAction.PLUS_2));
            fullDeck.put("Blue+2"+i,new Card(Color.blue, Card.CardAction.PLUS_2));
            fullDeck.put("Yellow+2-"+i,new Card(Color.yellow, Card.CardAction.PLUS_2));
            fullDeck.put("Green+2-"+i,new Card(Color.green, Card.CardAction.PLUS_2));

            fullDeck.put("RedReverse-"+i, new Card(Color.red, Card.CardAction.REVERSE));
            fullDeck.put("BlueReverse-"+i,new Card(Color.blue, Card.CardAction.REVERSE));
            fullDeck.put("YellowReverse"+i,new Card(Color.yellow, Card.CardAction.REVERSE));
            fullDeck.put("GreenReverse"+i,new Card(Color.green, Card.CardAction.REVERSE));

            fullDeck.put("RedSkip-"+i, new Card(Color.red, Card.CardAction.SKIP));
            fullDeck.put("BlueSkip-"+i,new Card(Color.blue, Card.CardAction.SKIP));
            fullDeck.put("YellowSkip"+i,new Card(Color.yellow, Card.CardAction.SKIP));
            fullDeck.put("GreenSkip"+i,new Card(Color.green, Card.CardAction.SKIP));
        }

        for (int i = 0; i < 4; i++)
        {
            fullDeck.put("Wild+4"+i, new Card(Color.black, Card.CardAction.PLUS_4));
            fullDeck.put("WildChangeColor"+i ,new Card(Color.black, Card.CardAction.CHANGE_COLOR));
        }
    }

    /**
     * Creates a deck of cards for round
     * @return deck of cards as a Stack
     */
    public Stack<Card> createPlayDeck()
    {
        ArrayList<Card> playDeck = new ArrayList<>(fullDeck.values());
        return shuffleCards( playDeck);
    }

    /**
     * Shuffle Cards
     * @param cards list of cards to shuffle
     * @return Stack of shuffled cards
     */
    public Stack<Card> shuffleCards( List<Card> cards)
    {
        Stack<Card> shuffledCards = new Stack<>();
        shuffledCards.addAll(cards);
        Collections.shuffle(shuffledCards);
        return shuffledCards;
    }

    /**
     * @return full deck of cards
     */
    public HashMap<String, Card> getFullDeck()
    {
        return fullDeck;
    }
}


