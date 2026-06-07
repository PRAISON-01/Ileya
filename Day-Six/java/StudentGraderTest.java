import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StudentGraderTest{

    int[][] scores;



    @Test
    public void testThatgetDetailsReturnsA2dArrayWithDefaultValues(){

        int[][]actual = StudentGraderFunctions.getDetails(4, 3);
        int[][] expected =  {{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void testThatGetDetaiLsOf2StudentFor2SubjectReturnsCorrectly(){

        StudentGraderFunctions.getDetails(2, 2);
        StudentGraderFunctions.getScores(0, 0, 50);
        StudentGraderFunctions.getScores(0, 1, 90);
        StudentGraderFunctions.getScores(1, 0, 45);
        StudentGraderFunctions.getScores(1, 1, 70);

        int[][] actual = StudentGraderFunctions.checkScores();
        int[][] expected = {{50,90},{45,70}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatGetDetaiLsOf4StudentFor3SubjectsReturnsCorrectly(){

        StudentGraderFunctions.getDetails(4, 3);
        StudentGraderFunctions.getScores(0, 0, 67);
        StudentGraderFunctions.getScores(0, 1, 21);
        StudentGraderFunctions.getScores(0, 2, 49);
        StudentGraderFunctions.getScores(1, 0, 98);
        StudentGraderFunctions.getScores(1, 1, 62);
        StudentGraderFunctions.getScores(1, 2, 56);
        StudentGraderFunctions.getScores(2, 0, 93);
        StudentGraderFunctions.getScores(2, 1, 34);
        StudentGraderFunctions.getScores(2, 2, 27);
        StudentGraderFunctions.getScores(3, 0, 78);
        StudentGraderFunctions.getScores(3, 1, 83);
        StudentGraderFunctions.getScores(3, 2, 66);

        int[][] actual = StudentGraderFunctions.checkScores();
        int[][] expected = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatGetTotalOfThe4Studentsfor3SubjectReturnsCorrectly(){
        StudentGraderFunctions.getDetails(4, 3);
        StudentGraderFunctions.getScores(0, 0, 67);
        StudentGraderFunctions.getScores(0, 1, 21);
        StudentGraderFunctions.getScores(0, 2, 49);
        StudentGraderFunctions.getScores(1, 0, 98);
        StudentGraderFunctions.getScores(1, 1, 62);
        StudentGraderFunctions.getScores(1, 2, 56);
        StudentGraderFunctions.getScores(2, 0, 93);
        StudentGraderFunctions.getScores(2, 1, 34);
        StudentGraderFunctions.getScores(2, 2, 27);
        StudentGraderFunctions.getScores(3, 0, 78);
        StudentGraderFunctions.getScores(3, 1, 83);
        StudentGraderFunctions.getScores(3, 2, 66);

        int[] actual = StudentGraderFunctions.getTotal();
        int[] expected = {137, 216, 154, 227};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void testThatGetAverageOf4StudentsFor3SubjectsReturnsCorrectly(){
        StudentGraderFunctions.getDetails(4, 3);
        StudentGraderFunctions.getScores(0, 0, 67);
        StudentGraderFunctions.getScores(0, 1, 21);
        StudentGraderFunctions.getScores(0, 2, 49);
        StudentGraderFunctions.getScores(1, 0, 98);
        StudentGraderFunctions.getScores(1, 1, 62);
        StudentGraderFunctions.getScores(1, 2, 56);
        StudentGraderFunctions.getScores(2, 0, 93);
        StudentGraderFunctions.getScores(2, 1, 34);
        StudentGraderFunctions.getScores(2, 2, 27);
        StudentGraderFunctions.getScores(3, 0, 78);
        StudentGraderFunctions.getScores(3, 1, 83);
        StudentGraderFunctions.getScores(3, 2, 66);

        double[] actual = StudentGraderFunctions.getAverage(3);
        double[] expected = {45.666666666666664, 72.0, 51.333333333333336, 75.66666666666667};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void testThatGetPositionReturnsTheCorrectCorrespondingPositionFromHIghestToTheLowest(){
        StudentGraderFunctions.getDetails(4, 3);
        StudentGraderFunctions.getScores(0, 0, 67);
        StudentGraderFunctions.getScores(0, 1, 21);
        StudentGraderFunctions.getScores(0, 2, 49);
        StudentGraderFunctions.getScores(1, 0, 98);
        StudentGraderFunctions.getScores(1, 1, 62);
        StudentGraderFunctions.getScores(1, 2, 56);
        StudentGraderFunctions.getScores(2, 0, 93);
        StudentGraderFunctions.getScores(2, 1, 34);
        StudentGraderFunctions.getScores(2, 2, 27);
        StudentGraderFunctions.getScores(3, 0, 78);
        StudentGraderFunctions.getScores(3, 1, 83);
        StudentGraderFunctions.getScores(3, 2, 66);

        double[] actual = StudentGraderFunctions.getAverage(3);
        double[] expected = {45.666666666666664, 72.0, 51.333333333333336, 75.66666666666667};

        assertArrayEquals(expected, actual);

        int[] actualPosition = StudentGraderFunctions.getPosition();
        int[] expectedPosition = {4, 2, 3, 1};
        assertArrayEquals(expectedPosition, actualPosition);

    }


}
