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
import java.util.*;

public class DiscardPile {
    private static LinkedList<Cards> discardPile = new LinkedList<Cards>();

    public static void toStockPile() {
        Cards topCard = discardPile.pop();
        while (discardPile.size() > 0) {
            Cards c = discardPile.pop();
            StockPile.AddCard(c);
        }
        discardPile.push(topCard);
    }
    public static void addToDiscard(Cards discard){
        discardPile.push(discard);
    }

    public static Cards Draw() {
        return discardPile.pop();
    }

    public static Cards ShowTopCard() {
        return discardPile.peek();
    }
}