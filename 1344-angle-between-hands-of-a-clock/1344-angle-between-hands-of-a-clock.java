class Solution {
    public double angleClock(int hour, int minutes) {
        double minn=Double.MAX_VALUE;
    
    double hourAngle =30*hour + 0.5*minutes;
    double minutesAngle=6*minutes;
   minn= Math.abs(hourAngle-minutesAngle);
    double secondAngle=360-minn;
    return Math.min(minn,secondAngle);


        
    }
}