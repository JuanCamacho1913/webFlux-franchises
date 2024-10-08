package com.example.franchise.persistence;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "franquicia")
public class Franchise {

    @Id
    private String id;
    private String name;
    private List<Branch> branches;
}