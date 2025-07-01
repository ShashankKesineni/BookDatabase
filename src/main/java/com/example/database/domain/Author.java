package com.example.database.domain;

import ch.qos.logback.core.model.processor.AllowAllModelFilter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {
    private Long id;

    private String name;

    private Integer age;


}
