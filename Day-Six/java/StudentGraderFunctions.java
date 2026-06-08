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
        averages = new double[scores.length];

        for(int count = 0; count < scores.length; count++){
            double sum = 0;
            for(int score : scores[count]){
                sum += score;
            }
            averages[count] = sum/subjectAmount;
        }
        return averages;

    }

    public static int[] getPosition(){
        int size = averages.length;
        int[] positions = new int[size];
        int positionCount;
        for(int count = 0; count < size; count++){
            positionCount = 0;
            for(int index = 0; index < size; index++){
                if(averages[index] > averages[count]){
                    positionCount += 1;
                }
            }
            positions[count] = positionCount + 1;
        }
        return positions;
    }

//========================================================================================

    public static int getHighest(int subjectIndex){
        int largest = scores[0][subjectIndex];

        for(int count = 0; count < scores.length; count++){
            if(scores[count][subjectIndex]> largest){
                largest = scores[count][subjectIndex];
            }
        }
        return largest;
    }

    public static int getLowest(int subjectIndex){
        int largest = scores[0][subjectIndex];

        for(int count = 0; count < scores.length; count++){
            if(scores[count][subjectIndex] < largest){
                largest = scores[count][subjectIndex];
            }
        }
        return largest;
    }

    public static int getHighestStudent(int subjectIndex){
        int studentAmount = scores.length;


        int highestCount = 0;
        int largest = scores[0][0];
        for(int count = 0; count < studentAmount; count++){
            if(scores[count][subjectIndex] > largest){
                largest = scores[count][subjectIndex];
                highestCount = count;
            }
        }
        return highestCount + 1;
    }

    public static int getLowestStudent(int subjectIndex){


        int largest = scores[0][0];
        int lowestCount = 0;
        for(int count = 0; count < scores.length; count++){
            if(scores[count][subjectIndex] < largest){
                largest = scores[count][subjectIndex];
                lowestCount = count;
            }
        }
        return lowestCount + 1;
    }

    public static int getSubjectTotal(int subjectIndex){

        int subjectTotal = 0;
        for(int count = 0; count < scores.length; count++){
            subjectTotal += scores[count][subjectIndex];
        }
        return subjectTotal;
    }

    public static double getSubjectAverage(int subjectIndex){
        double subjectAverage = 0;
        for(int count = 0; count < scores.length; count++){
            subjectAverage += (double)((double)scores[count][subjectIndex]/ scores.length);
        }
        return subjectAverage;
    }

    public static int getPasses(int subjectIndex){

        int numberOfPasses = 0;
        for( int count = 0; count < scores.length; count++){

            if(scores[count][subjectIndex] < 50){
                continue;
            }
            else{
                numberOfPasses += 1;
            }
        }
        return numberOfPasses;
    }

    public static int getFails(int subjectIndex){

        int numberOfFails = 0;
        for( int count = 0; count < scores.length; count++){

            if(scores[count][subjectIndex] < 50){
                numberOfFails += 1;
            }
            else{
                continue;
            }
        }
        return numberOfFails;
    }






//public static void main(String[] args){
//        getDetails(4, 3);
//        getScores(0, 0, 67);
//        getScores(0, 1, 21);
//        getScores(0, 2, 49);
//        getScores(1, 0, 98);
//        getScores(1, 1, 62);
//        getScores(1, 2, 56);
//        getScores(2, 0, 93);
//        getScores(2, 1, 34);
//        getScores(2, 2, 27);
//        getScores(3, 0, 78);
//        getScores(3, 1, 83);
//        getScores(3, 2, 66);
//
//
//      System.out.println(getSubjectTotal(0));
//      System.out.println(getSubjectAverage(0));
//      System.out.println(getPasses(0));
//      System.out.println(getFails(0));
//}

}

// System.out.println(Arrays.toString(getTotal()));
//    System.out.println(Arrays.toString(getAverage(3)));
//    System.out.println(Arrays.toString(getPosition()));
//    System.out.println(getHighest(0));
//    System.out.println(getLowest(0));
//    System.out.println(getHighestStudent(0));
//    System.out.println(getLowestStudent(0));
