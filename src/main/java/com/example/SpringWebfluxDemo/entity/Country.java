package com.example.SpringWebfluxDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("country")
public class Country {
    Long id;
    String countryCode;
    String countryDesc;
    State state;
}
