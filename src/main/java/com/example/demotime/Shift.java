package com.example.demotime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.OffsetTime;

@Entity
public class Shift {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "start_time", columnDefinition = "TIME WITH TIME ZONE")
    private OffsetTime startTime;
    @Column(name = "end_time", columnDefinition = "TIME WITH TIME ZONE")
    private OffsetTime endTime;

    public Shift(OffsetTime startTime, OffsetTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Shift() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetTime startTime) {
        this.startTime = startTime;
    }

    public OffsetTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetTime endTime) {
        this.endTime = endTime;
    }
}
