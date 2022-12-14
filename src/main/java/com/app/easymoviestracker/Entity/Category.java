package com.app.easymoviestracker.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "Category")
public class Category implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String comments;

    @OneToMany (mappedBy = "category", cascade = CascadeType.ALL)
    Set<Movie> category = new HashSet<>();

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
