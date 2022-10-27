public class EnergeyDrinkConsumption 
{
    public static void main(String[] args)
    {
        int survey = 12467;
        double energyDrinkrate = 0.14;
        double citrusflavouredrate = 0.64;
        double energyDrink;
        double citrusflavoured;
        energyDrink = survey*energyDrinkrate;
        citrusflavoured = energyDrink*citrusflavouredrate;
        System.out.println("The approximate number of customers from 12467 people in the survey who purchase \n one or more energy drinks per week is: "+ energyDrink);
        System.out.println("The approximate number of customers from 12467 people in the survey who prefer \n citrus-flavored energy drinks per week is: "+ citrusflavoured);
    }    
}
