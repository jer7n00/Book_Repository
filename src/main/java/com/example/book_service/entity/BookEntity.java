package com.example.book_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="book_details")
public class BookEntity {

    @Id
    @Column(name="book_id")
    private long book_id;
    @Column(name="book_name")
    private String book_name;
}
