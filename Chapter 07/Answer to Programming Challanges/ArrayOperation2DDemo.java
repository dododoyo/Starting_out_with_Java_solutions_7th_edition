public class ArrayOperation2DDemo 
{
    public static void main(String[] args)
    {
        double[][] theMatrix ={ {1,2,3} ,
                                {4,5,6} ,
                                {7,8,9} };
        ArrayOperation2D Matrix = new ArrayOperation2D();
        double total = Matrix.getTotal(theMatrix);
        double RowTotal = Matrix.getRowTotal(theMatrix,1);
        double columnTotal = Matrix.getColumnTotal(theMatrix,1);
        double highest = Matrix.HighestInRow(theMatrix, 1);
        double lowest = Matrix.LowestInRow(theMatrix, 1);
        System.out.println(total);
        System.out.println(RowTotal);
        System.out.println(columnTotal);
        System.out.println(highest);
        System.out.println(lowest);
    }
    
}
