package org.example;
import jakarta.persistence.*;
@Entity
public class Store {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @ManyToMany  Set<Book> likedCourses;


}
