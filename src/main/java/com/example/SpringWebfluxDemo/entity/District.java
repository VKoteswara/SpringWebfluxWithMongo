package com.example.SpringWebfluxDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("district")
public class District {
    @Id
    Long id;
    String districtCode;
    String districtDesc;
}
