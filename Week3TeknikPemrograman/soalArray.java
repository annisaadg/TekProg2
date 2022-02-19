package w3;

/**
 *
 * @author Annisa
 * @since 2022-02-20
 * @version 1.0
 */
public class soalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //One Dimensional Arrays
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {firstArray, secondArray,thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray,sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray,ninthArray};
        //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1,twoDimensionalArray2, twoDimensionalArray3};
        System.out.print("{");
        for(int index1=0; index1<3; index1++){
            System.out.print("{");
            for(int index2=0; index2<3; index2++){
                System.out.print(twoDimensionalArray1[index1][index2]+" ");
            }
            System.out.print("}");
        }
        System.out.println(" }");
        
        System.out.print("{");
        for(int index1=0; index1<3; index1++){
            System.out.print("{");
            for(int index2=0; index2<3; index2++){
                System.out.print(twoDimensionalArray2[index1][index2]+" ");
            }
            System.out.print("}");
        }
        System.out.println(" }");
        
        System.out.print("{");
        for(int index1=0; index1<3; index1++){
            System.out.print("{");
            for(int index2=0; index2<3; index2++){
                System.out.print(twoDimensionalArray3[index1][index2]+" ");
            }
            System.out.print("}");
        }
        System.out.println(" }");
        
    }
    
}
