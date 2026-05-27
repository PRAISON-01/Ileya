public class LevelThree{

    public static int[] flatten(int[][] array){

        
        int arrayCount = 0;
        for(int[] element : array){

            for(int number : element){
                arrayCount += 1;
            }   
        }

        int[] newArray = new int[arrayCount];

    
        int index = 0;
        for(int[] element : array){

            for(int number : element){
                newArray[index++] = number;
            }   
        }
        return newArray;
    }

    public static int[] merge(int[] arrayOne, int[] arrayTwo){
        
        int sizeOne = 0;
        for(int number : arrayOne){
            sizeOne += 1;
        }
        
        int sizeTwo = 0;
        for(int number : arrayTwo){
            sizeTwo += 1;
        }

        int newSize = sizeTwo + sizeOne;

        int[] newArray = new int[newSize];

        int index = 0;
        for(int number : arrayOne){
            newArray[index++]= number;
        }
        
        for(int number : arrayTwo){
            newArray[index++]= number;
        }

        for(int count = 0; count < newSize; count+=1){
            for(int counter = count + 1; counter < newSize; counter += 1){
                if(newArray[count] > newArray[counter]){
                    int temp = newArray[count];
                    newArray[count] = newArray[counter];
                    newArray[counter] = temp;
                }
            }
        }
        
        return newArray;
    }

//End of file
}
