package com.example.studentproj.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STUDENTS")
@SequenceGenerator(name = "idGenerator", sequenceName = "STUDENTS_SEQ", allocationSize = 1)
public class Student extends BaseModel {
  @Column(length = 16, nullable = false)
  private String firstName;
  @Column(length = 16, nullable = false)
  private String lastName;
  @OneToMany(mappedBy = "student")
  private List<Lesson> lessons;
  @ManyToOne
  private Teacher teacher;

//  @Enumerated(EnumType.STRING)
//  @NotNull
//  private Level level;

}
