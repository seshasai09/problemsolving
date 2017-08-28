package ood;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by vasumathi on 19/08/2017.
 */
public class ParkingLot {

    public static final int CAPACITY = 100;
    boolean []spots = new boolean[CAPACITY];
    PriorityQueue<Integer> availableSpots;

    public ParkingLot(){
        availableSpots = new PriorityQueue<Integer>();
        for(int i=0;i<CAPACITY;i++){
            availableSpots.add(i+1);
        }
    }

    public int getParkingSpot(){
        if(availableSpots.size()>0)
            return availableSpots.remove();
        return 0;
    }

    public void parkingExit(int spot){
        availableSpots.add(spot);
    }
}
