public class Circle
{
    double radius;
    final double PI = 3.14159;
    public Circle(double theRadius){
        radius = theRadius;
    }
    public Circle(){
        radius = 0.0;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double theRadius){
        radius = theRadius;
    }
    public double area(){
        double theArea = PI*radius*radius;
        return theArea;
    }
    public double diameter(){
        double theDiameter = 2*radius;
        return theDiameter;
    }
    public double circumference(){
        double theCircumferene = 2*PI*radius;
        return theCircumferene;

    }
}
