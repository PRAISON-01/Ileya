import java.util.Arrays;
public class StudentGraderFunctions{

    static int[][] scores;
    static int[] total;
    static double[] averages;


    public static int[][] getDetails(int studentAmount, int subjectAmount){
        scores = new int[studentAmount][subjectAmount];
        return scores;

    }

    public static void getScores(int studentIndex, int subjectIndex, int score){
        scores[studentIndex][subjectIndex] = score;
    }


    public static int[][] checkScores(){

        return scores;
    }

    public static int[]  getTotal(){
        total = new int[scores.length];

        for(int count = 0; count < scores.length; count++){
            int sum = 0;
            for(int score : scores[count]){
                sum += score;
            }

            total[count] = sum;
        }
        return total;

    }

    public static double[]  getAverage(int subjectAmount){
        double studentAmount = scores.length;
        averages = new double[studentAmount];

        for(int count = 0; count < scores.length; count++){
            double sum = 0;
            for(int score : scores[count]){
                sum += score;
            }
            averages[count] = sum/subjectAmount;
        }
        return averages;

    }




public static void main(String[] args){
        getDetails(4, 3);
        getScores(0, 0, 67);
        getScores(0, 1, 21);
        getScores(0, 2, 49);
        getScores(1, 0, 98);
        getScores(1, 1, 62);
        getScores(1, 2, 56);
        getScores(2, 0, 93);
        getScores(2, 1, 34);
        getScores(2, 2, 27);
        getScores(3, 0, 78);
        getScores(3, 1, 83);
        getScores(3, 2, 66);

    System.out.println(Arrays.toString(getTotal(4)));
    System.out.println(Arrays.toString(getAverage(3)));
}

}
