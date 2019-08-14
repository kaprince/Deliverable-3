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


public class Table{// implements Comparable<Cards>{
    private static ArrayList<ArrayList<Cards>> tableCards = new ArrayList<ArrayList<Cards>>();

    //see (get) whatever is on the table
    public static ArrayList<ArrayList<Cards>> getTableCards() {
        return tableCards;
    }

    //add to the Array if you add a run
    public static void newMeld(ArrayList<Cards> meld){
        
        tableCards.add(meld);

    }

    public static void addToMeld(ArrayList<Cards> toAdd, int tableCardIndex){
        ArrayList<Cards> addCardsHere = tableCards.remove(tableCardIndex);
        for (Cards c : toAdd) {
            addCardsHere.add(c);
        }
        
        tableCards.add(addCardsHere);
    }
}
