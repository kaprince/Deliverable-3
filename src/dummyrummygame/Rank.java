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


public enum Rank {
    Ace,
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Jack,
    Queen,
    King;

    private final int VALUE;

    private Rank() {
        this.VALUE = this.ordinal() + 1;

    }

    public int getValue() {
        return this.VALUE;
    }

    public String getShortString() {
        if (this.VALUE > 1 && this.VALUE < 11) {
            return "" + this.VALUE;
        } else if (this.VALUE == 1) {
            return "A";
        } else if (this.VALUE == 11) {
            return "J";
        } else if (this.VALUE == 12) {
            return "Q";
        } else {
            return "K";
        }
    }
}