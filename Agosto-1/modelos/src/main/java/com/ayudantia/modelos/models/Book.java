package com.ayudantia.modelos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) //AI autoincrement
  private Long id;

  @Size(min = 2, max = 45)
  private String title;

  @Size(min = 10, max = 1000)
  private Integer pages;

  @Column(updatable = false)
  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date created_at;

  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date updated_at;

  /* DEFAULT NOW() */
  @PrePersist
  protected void onCreate() {
    this.created_at = new Date();
    this.updated_at = new Date();
  }

  /* NOW() ON UPDATE NOW() */
  @PreUpdate
  protected void onUpdate() {
    this.updated_at = new Date();
  }

  public Book(
    @Size(min = 2, max = 45) String title,
    @Size(min = 10, max = 1000) Integer pages
  ) {
    this.title = title;
    this.pages = pages;
  }
}
