import java.util.Arrays;
import java.util.Scanner;
public class PraiseCourseGrader{

    public static void main(String[] args){

        

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students enrolled => ");
        int studentNumber = input.nextInt();

        System.out.print("Enter number of quizes taken => ");
        int questionAmount = input.nextInt();

        int[][] scores = new int[studentNumber][questionAmount];

        int scoreCount = 1;
        int studentCount = 1;

       
        while(true){
            scoreCount = 1;

            System.out.printf("--- Student %d ----\n\n", studentCount);

            while(true){
                System.out.printf("Score for quiz %d =>",scoreCount);
                int scoreInput = input.nextInt();
                scores[studentCount - 1][scoreCount - 1] += scoreInput;

                if(questionAmount <= scoreCount){
                    break;
                }
                scoreCount += 1;
                
            }

            if(studentCount == studentNumber){
                break;
            }
            studentCount += 1;
            
        }
//===============================================================================

        System.out.println("\n\n======== QUIZ GRADE REPORT =======");
        int[] total = new int[studentNumber];

        double[] averages = new double[studentNumber];

        for(int count = 0; count < studentNumber; count++){
            for(int index = 0; index < questionAmount; index++){
                int score = scores[count][index];
                
                total[count] += score;
            }
            
            averages[count] = (double) total[count]/questionAmount;

            System.out.println("Student "+(count + 1)+" "+averages[count]);
            
        }

        System.out.print("\n\n=======================\n\n\n");

        int averageCount = 0;
        int bestCount = 0;
        int quizCount = 1;
        double bestAverage = averages[0];
        System.out.print("Quiz Averages: ");
        for(double average : averages){
            System.out.printf("Qz %d: %.1f\t",quizCount ,average);
            averageCount += 1;
            if(averages[averageCount - 1] > bestAverage){
                bestAverage = averages[averageCount];
                bestCount = quizCount + 1;
            }
            quizCount += 1;
        }
       
        System.out.printf("\n\n\nBest Quiz: Quiz %d (avg %.1f)", bestCount, bestAverage);
        
    }
}
