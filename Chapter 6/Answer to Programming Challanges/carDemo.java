public class carDemo 
{
    public static void main(String[] args){
        car bugatti = new car(2022, "Bugatti");
        bugatti.accelerate();
        bugatti.accelerate();
        bugatti.accelerate();
        bugatti.accelerate();
        bugatti.accelerate();
        int Speed = bugatti.getSpeed();
        System.out.println("The current speed is: "+Speed);
        bugatti.brake();
        bugatti.brake();
        bugatti.brake();
        bugatti.brake();
        bugatti.brake();
        Speed = bugatti.getSpeed();
        System.out.println("The current speed is: "+Speed);

    }
    
}
