package com.hrushikesh.TableInheritance.SingleTable;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "Mentor")
public class Mentor extends User {
    private String company;
}
