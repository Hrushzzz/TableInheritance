package com.hrushikesh.TableInheritance.JoinedTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jt_mentors")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {
    private String company;
}
