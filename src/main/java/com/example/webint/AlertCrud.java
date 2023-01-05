package com.example.webint;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlertCrud extends MongoRepository<AlertEntity, String>, PagingAndSortingRepository<AlertEntity, String> {
        // Additional methods go here, if needed

}
