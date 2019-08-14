/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummyrummygame;

/**
 *
 * @author Prince
 */
import java.util.ArrayList;

public class Hand {
    private ArrayList<Cards> Card;

    public Hand() {
        this.Card = new ArrayList<Cards>();
    }

    public ArrayList<Cards> getAllCards() {
        return this.Card;
    }

    public Cards getCard(int index) {
        return this.Card.get(index);
    }

    public void AddCard(Cards card) {
        this.Card.add(card);
    }

    public void Discard(Cards card) {
        DiscardPile.addToDiscard(card);
        Card.remove(card);
    }
    public void Remove(Cards card){
        Card.remove(card);
    }

}
