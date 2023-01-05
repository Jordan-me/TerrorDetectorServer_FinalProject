package com.example.webint;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Alerts")
public class AlertEntity {
    @Id
    private String alertId;
}
