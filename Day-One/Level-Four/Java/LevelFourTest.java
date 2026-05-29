import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LevelFourTest{

    @Test
    public void testThatGettwoSumIndexesReturnsTheIndexOfTheNumbersThatSumsTheTarget(){
        int[] array = {2, 7, 9, 11, 15};
        int[] actual = LevelFour.get_two_sum_index(array, 9);
        int[] expected = {0, 1};
        assertArrayEquals(actual, expected);
    }


}
