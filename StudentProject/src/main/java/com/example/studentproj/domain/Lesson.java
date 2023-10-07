package com.example.studentproj.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LESSONS")
@SequenceGenerator(name = "idGenerator", sequenceName = "LESSONS_SEQ", allocationSize = 1)
public class Lesson extends BaseModel{

  @Column(length = 16, nullable = false)
  private String title;
  @Column(length = 160, nullable = false)
  private String description;
//  @Enumerated(EnumType.STRING)
//  private Level level;
  @ManyToOne
  private Teacher teacher;
  @ManyToOne
  private Student student;
}
