public class RetailItemDemo 
{
    public static void main(String[] args)throws NegativePrice,NegativeUnits
    {
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95); // Throws no error
        RetailItem item2 = new RetailItem("Designer Jeans", -40, 34.95); // Throws negetive units error
        RetailItem item3 = new RetailItem("Shirt", 20, -24.95); //Throws negative price error

        System.out.println("Here is a list of the items.");
        System.out.println("Item Name -------- Number of Units ------------- Price");
        System.out.println(item1.getDescription()+"\t\t\t"+item1.getUnits()+"\t\t\t"+item1.getPrice());
        System.out.println(item2.getDescription()+"\t\t"+item2.getUnits()+"\t\t\t"+item2.getPrice());
        System.out.println(item3.getDescription()+"\t\t\t"+item3.getUnits()+"\t\t\t"+item3.getPrice());
    }


    
}
