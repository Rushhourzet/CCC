package at.MarsRover;

public class SteeringAngle{
    float wheelBase, steeringAngle, turnRadius;

    public SteeringAngle(float wheelBase, float steeringAngle) {
        setWheelBase(wheelBase);
        setSteeringAngle(steeringAngle);
        setTurnRadius(wheelBase, steeringAngle);
    }

    public float getWheelBase() {
        return wheelBase;
    }

    public void setWheelBase(float wheelBase) {
        this.wheelBase = wheelBase;
    }

    public float getSteeringAngle() {
        return steeringAngle;
    }

    public void setSteeringAngle(float steeringAngle) {
        this.steeringAngle = steeringAngle;
    }

    public float getTurnRadius() {
        return turnRadius;
    }

    public void setTurnRadius(float wheelBase, float steeringAngle) {
        turnRadius = CalculateTurnRadius(wheelBase, steeringAngle);
    }

    public static float CalculateTurnRadius(float wheelBase, float steeringAngle){
        return (float) Math.round((wheelBase/Math.sin(Math.toRadians(steeringAngle))*100))/100;
    }

}