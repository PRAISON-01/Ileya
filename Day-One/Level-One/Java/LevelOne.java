public class LevelOne{
    
    public static int[][] getSplitArray(int[] array){
        
        int evenCount = 0;
        int oddCount = 0;

        for(int number : array){
            if(number % 2 == 0){
                evenCount += 1;
            }
            else{
                oddCount += 1;
            }
        }

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        int evenIndex = 0;
        int oddIndex = 0;
        for(int number : array){
            if(number % 2 == 0){
                evenArray[evenIndex] = number;
                evenIndex += 1;
            }
            else{
                oddArray[oddIndex] = number;
                oddIndex += 1;
            }
        
        }

    int[][] newArray = {oddArray, evenArray};
    return newArray;
    }

    

    public static boolean isPalindromic(int[] array){
        
        int[] reverseArray = new int[array.length];

        int count = 0;
        for(int index = array.length - 1; index >= 0; index-=1){
            reverseArray[count++] = array[index];
        }

        int index = 0;
        for(int number : array){
           if(number != reverseArray[index]){
                return false;
           }
            index +=1;
        }
        return true;
    }

    public static int[] getPerfectSquare(int[] array){
        
        int checkerCount = 0;
        for(int number : array){
            if(number >= 0){
                int root = (int) Math.sqrt(number);
                if(root * root == number){
                    checkerCount += 1;
                }
            }
        }

        int[] newArray = new int[checkerCount];
        
        int index = 0;
        for(int number : array){
            if(number >= 0){
                int root = (int) Math.sqrt(number);
                if(root * root == number){
                    newArray[index] = number;
                    index += 1;
                }
            }
        }
        return newArray;
    }
    
    public static int[] repplaceNonPerfectSquare(int[] array){
        
        int[] newArray = new int[array.length];


        int index = 0 ;
        for(int number : array ){
            if(number >= 0){
                int root = (int) Math.sqrt(number);
                    if(root * root == number){
                        newArray[index] = number;
                    }
                    else{
                         newArray[index] = -1;
                    }
                index += 1;
            }
            
        }
        return newArray;
    }

//End of class File
}
