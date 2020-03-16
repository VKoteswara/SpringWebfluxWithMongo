package com.example.SpringWebfluxDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "masterdepartment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MasterDepartment {
    @TextIndexed
    String deptCode;
    String deptName;
}
