package com.hrushikesh.TableInheritance.JoinedTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "jt_instructors")
@PrimaryKeyJoinColumn(name = "user_id")
public class Instructor extends User {
    private Double ratings;
}
