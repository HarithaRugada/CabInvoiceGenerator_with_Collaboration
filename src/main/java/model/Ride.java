package model;

import utility.CabRide;

public class Ride {
    public int time;
    public double distance;
    public CabRide cabRideType;

    public Ride(CabRide cabRideType, double distance, int time) {
        this.cabRideType=cabRideType;
        this.distance = distance;
        this.time = time;
    }
}