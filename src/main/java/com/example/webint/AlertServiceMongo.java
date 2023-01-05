package com.example.webint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertServiceMongo implements AlertService{
    private AlertCrud alertCrud;
    private AlertConverter alertConverter;

    @Autowired
    public AlertServiceMongo(AlertCrud alertCrud,AlertConverter alertConverter) {
        this.alertCrud = alertCrud;
        this.alertConverter = alertConverter;
    }

    @Override
    public AlertBoundary create(AlertBoundary alert) {
        return null;
    }

    @Override
    public AlertBoundary getSpecificAlert(String alertID) {
        return null;
    }

    @Override
    public AlertBoundary search(String criteriaType, String criteriaValue, Integer size, Integer page, String sortAttribute, String sortOrder) {
        return null;
    }

    @Override
    public AlertBoundary searchHistory(String criteriaType, String criteriaValue, Integer size, Integer page, String sortAttribute, String sortOrder) {
        return null;
    }

    @Override
    public AlertBoundary updateAlert(String alertID, AlertBoundary alert) {
        return null;
    }

    @Override
    public AlertBoundary deleteAll() {
        return null;
    }
}
