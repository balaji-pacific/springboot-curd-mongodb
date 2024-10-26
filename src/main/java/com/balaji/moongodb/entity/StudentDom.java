package com.balaji.moongodb.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
@Builder
@ToString
public class StudentDom {

    @Id
    private String id;
    private String name;
    private String rollnumber;
    private String grade;

}
