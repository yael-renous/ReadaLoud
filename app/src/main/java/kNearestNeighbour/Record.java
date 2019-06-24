package kNearestNeighbour;

import com.example.yael.readaloud.Grade;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;

/**
 * Class representing a record of a reader
 */
public class Record {
    public static final int CORRECT_WORDS = 0;
    public static final int DELETED_WORDS = 1;
    public static final int INSERTED_WORDS = 2;
    public static final int TIME_ELAPSED = 3;

    /** feature vector*/
    private LinkedHashMap<Integer, Double> features = new LinkedHashMap<Integer, Double>();

    /**the level of the story read*/
    private Grade storyVersion = null;

    /**the reading level grade*/
    private Grade gradeLabel = null;


    public Record(Grade storyVersion, Grade gradeLabel, LinkedHashMap<Integer,Double> featureVec){
        this.features=featureVec;
        this.storyVersion=storyVersion;
        this.gradeLabel=gradeLabel;
    }


    // Mutators and accessors.
    public void putFeature(int feature, double value) {
        features.put(feature, value);
    }

    public void setGradeLabel(Grade classLabel) {
        this.gradeLabel = classLabel;
    }

    public Grade getClassLabel() {
        return gradeLabel;
    }

    public Grade getStoryVersion(){return storyVersion;}

    public Double getFeature(int feature) {
        return features.get(feature);
    }

    public Set<Integer> getFeatures() {
        return features.keySet();
    } // Iterator over features.
}
