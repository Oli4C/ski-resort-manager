package com.me.skiresortmanager.domains;


import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

import java.time.LocalTime;


@Data
@Entity
public class Lift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
    private LocalTime openFrom;
    private LocalTime openUntil;
    private boolean open = false;
    private  String name;
    private int seatsPerChair;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @NotFound(action= NotFoundAction.IGNORE)
    private Resort resort;


    public Lift() {
    }


    public Lift(Long id, LocalTime openFrom, LocalTime openUntil, boolean open, String name, int seatsPerChair) {
        this.id = id;
        this.openFrom = openFrom;
        this.openUntil = openUntil;
        this.open = open;
        this.name = name;
        this.seatsPerChair = seatsPerChair;
    }



    public boolean getOpen() {
        return this.open;
    }


    public void openLift() {
        this.open = true;
    }


    public void closeLift() {
        this.open = false;
    }


}
