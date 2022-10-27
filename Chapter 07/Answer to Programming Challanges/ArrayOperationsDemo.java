public class ArrayOperationsDemo 
{
    public static void main(String[] args)
    {
        double[] sampleData = {12.0,34.9,53.7,75.4,23.7,93.2,29.0,37.1,7.75};
        ArrayOperations operator = new ArrayOperations();
        double Total = operator.getTotal(sampleData);
        double Average = operator.getAverage(sampleData);
        double Highest = operator.getHighest(sampleData);
        double Lowest = operator.getLowest(sampleData);
        System.out.printf("The total value in the sample data is: %,.2f\n",Total);
        System.out.printf("The average value in the sample data is: %,.2f\n",Average);
        System.out.printf("The highest value in the sample data is: %,.2f\n",Highest);
        System.out.printf("The lowest value in the sample data is: %,.2f\n",Lowest);
    }
    
}
