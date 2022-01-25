package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void parenthesesReturnsFalse() { assertFalse(BalancedBrackets.hasBalancedBrackets("()"));
    }

    @Test
    public void onlyOpeningBracketReturnsFalse(){ assertFalse(BalancedBrackets.hasBalancedBrackets("[)"));
    }

    @Test
    public void onlyClosingBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void bracketsOutOfOrder(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void twoOpeningBracketsDoesntCount(){ assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void twoClosingBracketsDoesntCount(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
            }

    @Test
    public void curlyBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void additionalOpeningBracketFails(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void additionalClosingBracketFails(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void twoPairsSideBySidePasses(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void inputStringWithoutBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("ak,"));
    }

    @Test
    public void empyStringReturnsTrue(){assertTrue(BalancedBrackets.hasBalancedBrackets(""));}
}
