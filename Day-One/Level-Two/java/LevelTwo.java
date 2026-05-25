
public class LevelTwo{


    public static int[] getDuplicate(int[] array){
        ArrayList<Integer> duplicateArray = new ArrayList<Integer>();        
        ArrayList<Integer> seenNumber = new ArrayList<Integer>();  

        for(int number : array){
            if(seenNumber.contains(number)){
                if(!duplicateArray.contains(number)) duplicateArray.add(number);
            }
            else{
                seenNumber.add(number);
            }
        }

        int[] newArray = new int[duplicateArray.size()];

        int index =0;
        for(int number : duplicateArray){
            newArray[index] = number;
            index+=1;
        } 

        return newArray;     
    }

   public static int[] sortZero(int[] array){

        int size = array.length;

        int[] temp = new int[size];

        int tempCount = 0;

        for(int count = 0; count < size; count++){
            if(array[count] != 0){
                temp[tempCount] = array[count];
                tempCount++;
            }
        }

        while(tempCount < size){
            temp[tempCount++] = 0;

        }
            
            for(int count = 0; count < size ; count++){
                array[count] = temp[count];
            
        }
        return array;
    }


    
    

//End of class    
}
