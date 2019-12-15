package at.MarsRover;

import java.awt.*;

public class Position {
    float x, y;

    public static Point CalculatePosition(float wheelBase, float distance, float steeringAngle){
        float radians = (float) Math.toRadians(steeringAngle);
        float radius = at.MarsRover.SteeringAngle.CalculateTurnRadius(wheelBase, steeringAngle);
        float diameter = (float) (2*radius*Math.PI);
        float degTraveled = 360 / diameter * distance;
        float distanceTraveled = (float) (diameter * Math.sin(radians));
        float xTraveled = (float) (radius - Math.cos(radians));
        float yTraveled = (float) (radius - Math.sin(radians));
        return new Point (x+xTraveled, y+yTraveled);
    }
    public static float CalculateNewDirection(Point startPoint, Point endPoint){
        float radians = (float) Math.toRadians(steeringAngle);
        float degree =
        return degree;
    }
}
