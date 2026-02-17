package com.hrushikesh.TableInheritance.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tbc_tas")
public class TA extends User{
    private int helpRequests;
}
