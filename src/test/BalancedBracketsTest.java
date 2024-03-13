package test;


import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
//1. Only brackets return true
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
//2. Nested brackets are allowed
    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("['[]']"));
    }
//3. Brackets whith text
    @Test
    public void bracketsWithTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hola]"));
    }
//4. Two brackets of each type.
    @Test
    public void multipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hola] [mon]"));
    }
//5. Two square brackets with other characters allowd.
    @Test
    public void bracketsWithOtherCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hola] {mon}"));
    }
//6. Only one bracket, that failed.
    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

//7. The other one bracket, that failed.

    @Test
    public void singleReversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
// 8. Whit out brackets are allowed

    @Test
    public void stringWithoutBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    // 9. Whit tow open brackets and one other are falied.

    @Test
    public void towOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    // 10. Whit tow open brackets and one other are falied.

    @Test
    public void towCloseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    // 11. Wrong orther brackets are falied.

    @Test
    public void wrongOrtherBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    // 12. Double wrong orther brackets are falied.

    @Test
    public void doubleWrongOrtherBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
    // 13. Whit text infrot brackets are allowed

    @Test
    public void whitTextInfrontBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("hola[]"));
    }

    // 14. Whit text before brackets are allowed

    @Test
    public void whitTextBeforeBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]que tal"));
    }
}

