package com.hrushikesh.TableInheritance.SingleTable;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(value = "TA")
public class TA extends User {
    private int helpRequests;
}
