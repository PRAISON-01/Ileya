import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LevelThreeTest{

    @Test
    public void testThatMethodReturnsNewArrayOfFlattenedArray(){

        int[][] array = {{9, 0, 7}, {3, 5, 1}, {8, 1, 7}, {9, 9, 6}};
        int[] expected = {9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6};
        int[] actual = LevelThree.flatten(array);

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testThatMethodMergesAnArrayAndSortsTheArray(){
        int[] arrayOne = {3, 5, 1};
        int[] arrayTwo = {2, 4, 6};

        int[] actual = LevelThree.merge(arrayOne, arrayTwo);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(actual, expected);

    }
//End of class 
}
