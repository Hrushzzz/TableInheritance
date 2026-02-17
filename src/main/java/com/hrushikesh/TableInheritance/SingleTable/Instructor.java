package com.hrushikesh.TableInheritance.SingleTable;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "Instructor")
public class Instructor extends User {
    private Double ratings;
}
