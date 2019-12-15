package at.MarsRover;

public class Navigation {
    float x, y;
    float wheelBase, distance, steeringAngle, radians, radius, radiansCircle, circumference, degTraveled, distanceTraveled, xTraveled, yTraveled;

    public Navigation( float wheelBase, float distance, float steeringAngle) {
        this.x = 0f;
        this.y = 0f;
        this.wheelBase = wheelBase;
        this.distance = distance;
        this.steeringAngle = steeringAngle;
    }

    public  void CalculatePosition(){
         radius = at.MarsRover.SteeringAngle.CalculateTurnRadius(wheelBase, steeringAngle);
         circumference = (float) (2*radius*Math.PI);
         degTraveled = (360 / circumference) * distance;
         radiansCircle = (float) Math.toRadians(degTraveled);
         // distanceTraveled = (float) (circumference * Math.sin(radiansCircle/2));
         xTraveled = (float) (radius-Math.cos(radiansCircle)*2);
         yTraveled = (float) (Math.sin(radiansCircle))*2;
        FloatPoint point = new FloatPoint(xTraveled, yTraveled);
    }
    public float CalculateNewDirection(){
        float degree = (float) Math.atan(radians);
        degree = (float) Math.toDegrees(degree);
        return degree;
    }
    public float distanceTraveled(float diameter, float radians){
        float distanceTraveled = (float) (diameter * Math.sin(radians));
        return distanceTraveled;
    }
}
