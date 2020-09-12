package com.cucumberspring.domain;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;


}
