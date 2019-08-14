/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummyrummygame;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Prince
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of makeDeck method, of class Deck.
     */
    @Test
    public void testMakeDeckGood() {
        System.out.println("makeDeck");
        Deck instance = new Deck();
        LinkedList<Cards> expResult = new LinkedList<>();
        LinkedList<Cards> result = instance.makeDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMakeDeckBad() {
        System.out.println("makeDeck");
        Deck instance = new Deck();
        LinkedList<Cards> expResult = new LinkedList<>();
        expResult.add(null);
        
        LinkedList<Cards> result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMakeDeckBoundary() {
        System.out.println("makeDeck");
        Deck instance = new Deck();
        LinkedList<Cards> expResult = new LinkedList<>();
        
        LinkedList<Cards> result = instance.makeDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffleGood() {
        System.out.println("shuffle");
        LinkedList<Cards> deckCards = new LinkedList<>();
        deckCards.add(null);
        Deck instance = new Deck();
        instance.shuffle(deckCards);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testShuffleBad() {
        System.out.println("shuffle");
        LinkedList<Cards> deckCards = null;
        Deck instance = null;
        instance.shuffle(deckCards);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testShuffleBoundary() {
        System.out.println("shuffle");
        LinkedList<Cards> deckCards = null;
        Deck instance = new Deck();
        instance.shuffle(deckCards);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deal method, of class Deck.
     */
    @Test
    public void testDealGood() {
        System.out.println("deal");
        LinkedList<Cards> deckCards = null;
        Deck instance = new Deck();
        Cards expResult = null;
        Cards result = instance.deal(deckCards);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDealBad() {
        System.out.println("deal");
        LinkedList<Cards> deckCards = null;
        Deck instance = new Deck();
        Cards expResult = null;
        Cards result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDealBoundary() {
        System.out.println("deal");
        LinkedList<Cards> deckCards = null;
        Deck instance = new Deck();
        Cards expResult = null;
        Cards result = instance.deal(deckCards);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
