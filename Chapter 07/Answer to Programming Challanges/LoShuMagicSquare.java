public class LoShuMagicSquare 
{
    public static void main(String[]args)
    {
        int[][] sampleMatrix = {{4,9,2},{3,5,7},{8,1,6}};
        boolean checker = isMagicSquare(sampleMatrix);
        if (checker)
        System.out.println("The Square is a magic square.");
        else
        System.out.println("The Square is not a magic square.");

    }
    public static boolean isMagicSquare(int[][] array)
    {
        int[] entireTotal = new int[8];
        int total = 0;
        int col;
        int row;
        int index=0;
        for (row = 0; row<array.length;row++) //Sum of the rows
        {
            total = 0;
            for (col =0; col<array[row].length;col++)
            {
                total += array[row][col];
            }
            entireTotal[index] = total;
            index++;
        }

        for (col = 0; col<array.length;col++) //Sum of the colomuns
        {
            total = 0;
            for (row =0; row<array.length;row++)
            {
                total += array[row][col];
                
            }
            entireTotal[index] = total;
            index++;
        }

        total = 0;
        for (row=0,col=0; row<array.length;col++,row++) //Sum of the first diagonal
        {
            
            total += array[row][col];
        }
        entireTotal[index] = total;
        index++;

        total = 0;
        for (col = 0,row=2; col<array.length;col++,row--) //Sum of the second diagonal
        {
            
            total += array[row][col];
        }
        entireTotal[index] = total;

      
        boolean flag = true;
        for (int i =0;i<8;i++)
        {
            if (entireTotal[i] != 15)
            flag = false;
        }
        return flag;
    }   
}
