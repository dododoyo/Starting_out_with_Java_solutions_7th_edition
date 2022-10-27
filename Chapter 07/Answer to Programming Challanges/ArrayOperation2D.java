public class ArrayOperation2D 
{
    public double getTotal(double[][] array)
    {
        double total = 0; // Accumulator, set to 0 
        for (int row = 0; row < array.length; row++) 
        {        
            for (int col = 0; col < array[row].length; col++) 
            total += array[row][col]; 
        } 

        return total;

    }


    public double getAverage(double[][] array)
    {
        double total = 0;
        int row;
        int col;
        for (row = 0; row<array.length;row++ );
        {
            for ( col = 0; col<array[row].length;col++)
            {
                total += array[row][col];

            }
        }
        int elements = (row-1)*(col-1);
        double Average = total/elements;
        return Average;
    }


    public double getRowTotal(double[][] array,int rowNumber)
    {
        double total = 0;
        int col;
        for (col= 0; col<array[rowNumber-1].length; col++ )
        {
                total += array[rowNumber-1][col];
   
        }
        return total;
    }

    public double getColumnTotal(double[][] array,int columnNumber)
    {
        double total = 0;
        int row;
        for (row= 0; row<array.length; row++ )
        {
                total += array[row][columnNumber-1];
   
        }
        return total;

    }


    public double HighestInRow(double[][] array,int rowNumber)
    {
        
        int col = 0;
        rowNumber=1;
        double highest = array[rowNumber-1][0];
        for (col = 0; col<array[rowNumber-1].length; col++ )
        {         
            if (array[rowNumber-1][col] > highest)
            highest = array[rowNumber-1][col];
            
        }
        return highest;
    }
    
    
    public double LowestInRow(double[][] array,int rowNumber)
    {
        
        int col;
        double lowest= array[rowNumber-1][0];
        for (col= 0; col<array[rowNumber-1].length; col++ )
        {
            if (array[rowNumber-1][col] < lowest)
            lowest = array[rowNumber-1][col];
        }
        return lowest;
    }
}
