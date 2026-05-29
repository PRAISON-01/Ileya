public class LevelFour {

    public static int[] getTwoSumIndex(int[] numbers, int target){

        int size = numbers.length;
        int[] newArray = new int[2];

        for(int index = 0; index < size; index++){
            for(int count = index + 1; count < size; count++){
                if(numbers[index] + numbers[count] == target){
                    return new int[]{index, count};
                }
            }
        }
    return new int[]{};
    }

//End of class
}
