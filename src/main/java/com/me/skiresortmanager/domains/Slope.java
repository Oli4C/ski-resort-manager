package com.me.skiresortmanager.domains;


import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Data
@Entity
public class Slope {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    private String heightStart;
    private String heightEnd;
    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;
    private boolean open = false;
    private String status = "closed";
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action= NotFoundAction.IGNORE)
    private Lift liftDown;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action= NotFoundAction.IGNORE)
    private Lift liftUp;
    private String name;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotFound(action= NotFoundAction.IGNORE)
    private Resort resort;

    public Slope() {
    }

    public Slope(Long id, String heightStart, String heightEnd, Difficulty difficulty, boolean open, String status, String name) {
        this.id = id;
        this.heightStart = heightStart;
        this.heightEnd = heightEnd;
        this.difficulty = difficulty;
        this.open = open;
        this.status = status;
        this.name = name;
    }


    public Slope(Long id, String heightStart, String heightEnd, Difficulty difficulty, boolean open, String status, Lift liftDown, Lift liftUp, String name) {
        this.id = id;
        this.heightStart = heightStart;
        this.heightEnd = heightEnd;
        this.difficulty = difficulty;
        this.open = open;
        this.status = status;
        this.liftDown = liftDown;
        this.liftUp = liftUp;
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }

    public Long getID() {
        return this.id;
    }

    public void setID(Long id)  {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public boolean getOpen() {
        return this.open;
    }


    public void close() {
        this.open = false;
        this.status = "closed";
    }


    public void open(String newStatus) {
        this.open = true;
        this.status = newStatus;
    }

}
