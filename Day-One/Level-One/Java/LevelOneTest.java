import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LevelOneTest{

    @Test
    public void testThatTheFirstIndexOfTheNewArrayContainsOnlyOddNumbers(){

        int[] array = {45, 60, 3, 10, 9, 22};
        int[][] newArray = {{45, 3 , 9} , {60 , 10, 22}};
        newArray[0] = new int[]{45, 3, 9};
        int[][] actual = LevelOne.getSplitArray(array);
        assertArrayEquals(newArray, actual);

    }

    @Test
    public void testThatThesecondIndexOfTheNewArrayContainsOnlyEvenNumbers(){

        int[] array = {45, 60, 3, 10, 9, 22};
        int[][] newArray = {{45, 3 , 9} , {60 , 10, 22}};
        newArray[1] = new int[]{60 , 10, 22};
        int[][] actual = LevelOne.getSplitArray(array);
        assertArrayEquals(newArray, actual);

    }

   @Test
    public void testThatTheNotPalindromicArrayReTurnsFalse(){
        
        int[] array = {45, 60, 3, 10, 9, 22};
        boolean isValid = LevelOne.isPalindromic(array);
        assertFalse(isValid);
    }

    @Test
    public void testThatThePalindromicArrayReTurnsTrue(){
        
        int[] array = {45, 0, 8, 0, 45};
        boolean isValid = LevelOne.isPalindromic(array);
        assertTrue(isValid);
    }

    @Test
    public void testThatANArrayThatContainsPerfectSquareReturnsANewArrayOfOnlyPerfectSquare(){
        
        int[] array = {4, 7, 9, 10, 16, 18};
        int[] expected = {4, 9, 16};
        int[] actual = LevelOne.getPerfectSquare(array);
        assertArrayEquals(actual, expected);

    }

     @Test
    public void testThatNonPerfectSquaresAreReplacedWithMinusOne(){
        
        int[] array = {4, 7, 9, 10, 16, 18};
        int[] expected = {4, -1, 9, -1, 16, -1};
        int[] actual = LevelOne.repplaceNonPerfectSquare(array);
        assertArrayEquals(actual, expected);

    }
//End of class 
}
