import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class LevelTwoTest{

    @Test
    public void testThatMethodReturnsNewArrayOfOnlyTheDuplicateElements(){

        int[] array = {1, 2, 3, 2, 4, 3};
        int[] expected= {2, 3};
        int[] actual = LevelTwo.getDuplicate(array);
        assertArrayEquals(actual, expected);

    }
    
//    @Test
//    public void testThatMethodReturnTheTwoIndexesOfWhereTheDuplicateNumber(){
//
//        int[] array = {1, 2, 3, 2, 4, 3};
//        int[][] expected= {2{1, 3}, 3{2, 5}};
//        int[][] actual = LevelTwo.getDuplicate(array);
//        assertArrayEquals(actual, expected);
//
//    }

    @Test
    public void testThatNewArrayContainsZeroAtTheEndOfTheAray(){

        int[] array = {5, 0 , 3, 0, 2, 0};
        int[] expected = {5, 3 , 2 , 0, 0 , 0};
        int[] actual = LevelTwo.sortZero(array);
        assertArrayEquals(actual, expected);
        
    }

//End of class
}
