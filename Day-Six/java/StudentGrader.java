import java.util.Scanner;
import java.util.Arrays;
public class StudentGrader{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many students do you have >> ");
        int studentAmount = input.nextInt();

        System.out.println();
        System.out.println();

        System.out.print("How many subject do they offer >> ");
        int subjectAmount = input.nextInt();

        StudentGraderFunctions.getDetails(studentAmount, subjectAmount);


        int studentCount = 1;
        int subjectCount = 1;
        int studentIndex = 0;
        int subjectIndex = 0;
        while(studentCount <= studentAmount){
            subjectCount = 1;
            subjectIndex = 0;

            System.out.print("\nEntering score for student "+ studentCount);
            while(subjectCount <= subjectAmount){
                System.out.println("\nEnter score for subject"+ subjectCount);
                int score = input.nextInt();
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved sucessfully\n");

                StudentGraderFunctions.getScores(studentIndex,  subjectIndex,  score);

                subjectCount += 1;
                subjectIndex += 1;
            }
            studentCount += 1;
            studentIndex += 1;
        }

        System.out.println("<<<<<<<<<<<STUDENT GRADER QUUIZ RESULTS>>>>>>>>>>>");
        studentCount = 1;
        int[][] scores = StudentGraderFunctions.checkScores();
        int[] totals = StudentGraderFunctions.getTotal();
        double[] averages = StudentGraderFunctions.getAverage(subjectAmount);
        int[] positions = StudentGraderFunctions.getPosition();

        for(int count = 0; count < scores.length ;count++ ){
            System.out.print("Student "+(studentCount));
            for(int counter = 0; counter < subjectAmount; counter++){
               System.out.print("\t"+scores[count][counter]);
            }
            System.out.printf("\t%d\t%.2f\t%d\t",totals[count],averages[count],positions[count]);
            studentCount += 1;
            System.out.println();
        }

    } // end main
} //End class


//        System.out.println(Arrays.deepToString()));
// Is it working?.... it is working ✅️
