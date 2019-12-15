package at.MarsRover;

public class Main {

    public static void main(String[] args) {
        System.out.println(SteeringAngle.CalculateTurnRadius(1.00f, 30.00f));
        System.out.println(SteeringAngle.CalculateTurnRadius(1.00f, 13.76f));
        System.out.println(SteeringAngle.CalculateTurnRadius(1.00f, 2.34f));
        System.out.println(SteeringAngle.CalculateTurnRadius(1.00f, 90.00f));
        System.out.println(SteeringAngle.CalculateTurnRadius(2.45f, 90.00f));

        Navigation n1 = new Navigation(1.00f, 1.00f, 30.0f);
        n1.CalculatePosition();
        System.out.println(n1.xTraveled + ", " + n1.yTraveled);
        System.out.println(n1.degTraveled);
    }
}
