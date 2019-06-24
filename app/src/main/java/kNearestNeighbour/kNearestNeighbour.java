package kNearestNeighbour;

import com.example.yael.readaloud.Grade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class kNearestNeighbour {


    static int K = 4;

    /**
     * classify function
     *
     * @param trained    the pre trained data set
     * @param toClassify the record to classify
     * @return the grade level classification
     */
    public static Grade classify(ArrayList<Record> trained, Record toClassify) {
        // Calculates the neighbour distances between the test example and each traineding example.
        int numOfNeighbours = getNumOfNeighbours(trained, toClassify.getStoryVersion());
        Neighbour[] neighbours = new Neighbour[numOfNeighbours];
        int j=0;
        for (int i = 0; i < trained.size(); i++) {

            // Creates a new Neighbour object for that distance with the traineding example's label
            if (trained.get(i).getStoryVersion().equals(toClassify.getStoryVersion())) {
                neighbours[j] = new Neighbour(euclideanDistance(trained.get(i), toClassify),
                        trained.get(i).getClassLabel());
                j++;
            }
        }

        // Sorts the array of neighbours by distance.
        Arrays.sort(neighbours);

        // Calculates the votes of the K nearest neighbours, unweighted
        Grade decision = null;
        LinkedHashMap<Grade, Integer> votes = new LinkedHashMap<>();
        for (int i = 0; i < K; i++) {
            // Gets the label of the ith nearest neighbour.
            Grade label = neighbours[i].gradeLabel;

            // Increments the vote for that neighbour's class if already in the list.
            if (votes.containsKey(label))
                votes.put(label, votes.get(label) + 1);
                // Adds a vote for that neighbour's class if it is not in the list.
            else
                votes.put(label, 1);
        }

        // Sets the decision as the label with the greatest number of votes.
        double maxVote = 0;
        for (Map.Entry<Grade, Integer> vote : votes.entrySet()) {
            if (vote.getValue() > maxVote) {
                decision = vote.getKey();
                maxVote = vote.getValue();
            }
        }
        // Sets the test example's label to that label.
        return decision;
    }

    /**
     * calculates the euclidean distance between two records
     * @param trained the pre trained record
     * @param toClassify the record to classify
     * @return the euclidean distance
     */
    private static double euclideanDistance(Record trained, Record toClassify) {
        double squaredDistance = 0;
        // Iterates over the features of a.
        Set<Integer> aFeatures = toClassify.getFeatures();
        for (int feature : aFeatures) {

            // If that key exists in b:
            if (trained.getFeature(feature) >0)
                // Adds the squared difference between the feature values to the distance.
                squaredDistance += Math.pow((toClassify.getFeature(feature) - trained.getFeature(feature)), 2);
            else
                // Adds the squared feature value to the distance.
                squaredDistance += Math.pow(toClassify.getFeature(feature), 2);
        }

        // Iterates over the features of b to find the features in b but not a.
        Set<Integer> bFeatures = trained.getFeatures();
        for (int feature : bFeatures) {
            if (toClassify.getFeature(feature) == null)
                // Adds the squared feature value to the distance.
                squaredDistance += Math.pow(trained.getFeature(feature), 2);
        }

        return Math.sqrt(squaredDistance);
    }




    /**
     * retrieves the number of records with the same story level
     * @param trained      the trained records
     * @param storyVersion the story level / version
     * @return
     */
    private static int getNumOfNeighbours(ArrayList<Record> trained, Grade storyVersion) {
        int counter = 0;
        for (Record t : trained) {
            if (t.getStoryVersion().equals(storyVersion))
                counter++;
        }
        return counter;
    }
}

