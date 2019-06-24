package kNearestNeighbour;

import com.example.yael.readaloud.Grade;

public class Neighbour implements Comparable {
    public double distance;
    public Grade gradeLabel;

    public Neighbour(double distance, Grade classlabel){
        this.distance = distance;
        this.gradeLabel = classlabel;
    }
    
    @Override
    public int compareTo(Object o) {
        Neighbour other = (Neighbour)o;
        return Double.compare(this.distance, other.distance);
    }

}
