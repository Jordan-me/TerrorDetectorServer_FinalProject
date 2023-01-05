package com.example.webint;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AlertConverter {
    private ObjectMapper jackson;
    @PostConstruct
    public void init() {
        this.jackson = new ObjectMapper();
    }

    public AlertEntity toEntity(AlertBoundary alert){
        return null;
    }
    public AlertBoundary toBoundary(AlertEntity alert) {
        return null;
    }
}
