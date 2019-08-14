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
import java.util.LinkedList;

public class StockPile {
    private static LinkedList<Cards> stockPile = new LinkedList<Cards>();

    public static Cards Draw() {
        return stockPile.pop();
    }

    public static void AddCard(Cards card) {
        stockPile.push(card);
    }

    public static LinkedList<Cards> getStockPile() {
        return stockPile;
    }

    public static void setStockPile(LinkedList<Cards> cards) {
        stockPile = cards;
    }
}
