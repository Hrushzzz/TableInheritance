package com.hrushikesh.TableInheritance.JoinedTable;

import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "jt_users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    private String name;

    @Id
    private UUID id;
}
