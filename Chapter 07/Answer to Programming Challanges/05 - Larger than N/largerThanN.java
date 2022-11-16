public class largerThanN{
    public static void main(String[] args){
        // This is a sample list.
        int[] theList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printLarger(theList,6);
    

    }
    public static void printLarger(int[] array, int theNUmber)
    {
        for (int i = 0; i < array.length; i++){
            if (array[i] >theNUmber)
            System.out.println(array[i]);
        }
    }
}