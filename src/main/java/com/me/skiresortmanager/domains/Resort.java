package com.me.skiresortmanager.domains;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class Resort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Slope> slopes  = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lift> lifts  = new ArrayList<>();

    public Resort() {
    }

    public Resort(String name) {
        this.name = name;
    }

    public Resort(Long id, String name, List<Slope> slopes, List<Lift> lifts) {
        this.id = id;
        this.name = name;
        this.slopes = slopes;
        this.lifts = lifts;
    }



    public String getName() {
        return name;
    }

//    public int getNumOfRuns() {
//        return slopes.size();
//    }
//
//    public int getNumOfLifts() {
//        return lifts.size();
//    }
//

//    public List<Slope> viewAllSlopes() {
//        return this.slopes;
//    }
//

//    public List<Lift> viewAllLifts() {
//        return this.lifts;
//    }
//

//    public int getNumOpenLifts() {
//        int count = 0;
//        for (Lift lift : this.lifts) {
//            if (lift.getOpen()) {
//                count++;
//            }
//        }
//        return count;
//    }
//

//    public int getNumOpenRuns() {
//        int count = 0;
//        for (Slope slope : this.slopes) {
//            if (slope.getOpen()) {
//                count++;
//            }
//        }
//        return count;
//    }


//    public String getLiftLineEstimate(int targetID) {
//        int estimate = 0;
//        int peopleInLine;
//        for (Lift lift : this.lifts) {
//            if (lift.getId() == targetID) {
//                peopleInLine = lift.getNumPeopleInLine();
//                estimate = ((peopleInLine / lift.getSeatsPerChair()) * 30); // 30 seconds per chair
//            }
//        }
//        return ((estimate / 60) + " mins");
//    }


//    public void updateLiftLine(int targetID, int peopleInLine) {
//        for (Lift lift : this.lifts) {
//            if (lift.getId() == targetID) {
//                lift.setNumPeopleInLine(peopleInLine);
//            }
//        }
//    }
}
