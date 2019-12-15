package at.MarsRover;

public class Main {

    public static void main(String[] args) {
        //System.out.println(SteeringAngle.CalculateTurnRadius(1.00f, 30.00f));
        //System.out.println(SteeringAngle.CalculateTurnRadius(1.00f, 13.76f));
        //System.out.println(SteeringAngle.CalculateTurnRadius(1.00f, 2.34f));
        //System.out.println(SteeringAngle.CalculateTurnRadius(1.00f, 90.00f));
        //System.out.println(SteeringAngle.CalculateTurnRadius(2.45f, 90.00f));
        Navigation n3 = new Navigation(1f, 1f, 30f);
        n3.CalculatePosition();
        System.out.println(n3.xTraveled + ", " + n3.yTraveled);
        System.out.println(n3.degTraveled);

        Navigation n1 = new Navigation(2.13f, 4.30f, 23f);
        n1.CalculatePosition();
        System.out.println(n1.xTraveled + ", " + n1.yTraveled);
        System.out.println(n1.degTraveled);

        Navigation n2 = new Navigation(1.75f, 3.14f, -23f);
        n2.CalculatePosition();
        System.out.println(n2.xTraveled + ", " + n2.yTraveled);
        System.out.println(n2.degTraveled);
    }
}
