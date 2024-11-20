package com.example.crm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "activity")
class Activity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var activity_type: String? = null
}

