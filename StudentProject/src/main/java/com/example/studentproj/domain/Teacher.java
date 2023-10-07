package com.example.studentproj.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TEACHERS")
@SequenceGenerator(name = "idGenerator", sequenceName = "TEACHERS_SEQ", allocationSize = 1)
public class Teacher extends BaseModel{
  @Column(length = 16, nullable = false)
  private String firstName;
  @Column(length = 16, nullable = false)
  private String lastName;
  @Column(length = 160, nullable = false)
  private String biography;
  @OneToMany(mappedBy = "teacher")
  private List<Student> students;
  @OneToMany(mappedBy = "teacher")
  private List<Lesson> lessons;

}
