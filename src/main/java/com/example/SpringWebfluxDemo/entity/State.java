package com.example.SpringWebfluxDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("state")
public class State {
    Long id;
    String stateCode;
    String stateDesc;
    District district;
}
