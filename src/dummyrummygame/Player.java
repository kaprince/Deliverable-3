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

public class Player {
    //player has cards in his hand
    protected Hand playerHand;

    public Player(){
        this.playerHand = new Hand();
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    //add cards to the hand
    public void addToHand(Cards card){
        this.playerHand.AddCard(card);
    }

    //discard card to discard pile
    public void discardFromHand(Cards card){
        this.playerHand.Discard(card);
    }

    //Lay out 3 Cards(or take to be added to the table)
    public void melding(ArrayList<Cards> meld){
        Table.newMeld(meld);
    }

}