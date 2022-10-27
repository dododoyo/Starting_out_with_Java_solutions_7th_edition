public class car 
{
    int YEARMODEL;
    String MAKE;
    int SPEED;
    public car(int model, String make)
    {
        YEARMODEL = model;
        MAKE = make;
        SPEED = 0;

    }
    public int getSpeed(){
        return SPEED;
    }
    public int getyearModel(){
        return YEARMODEL;
    }
    public String getMake(){
        return MAKE;
    }

    public void setSpeed(int carSpeed){
        SPEED = carSpeed;
    }
    public void setYearModel(int YearModel){
        YEARMODEL = YearModel;
    }
    public void setMake(String Make){
        MAKE = Make;
    }

    public void accelerate(){
        SPEED += 5;
    }
    public void brake(){
        SPEED -= 5;
    }
    
}
