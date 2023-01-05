package com.example.webint;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
//import org.springframework.data.repository.PagingAndSortingRepository;

public interface AlertCrud extends MongoRepository<AlertEntity, String>{
//    PagingAndSortingRepository<AlertEntity, String>
        // Additional methods go here, if needed
    public AlertEntity findByAlertId(
            @Param("alertId") String alertId);

}
