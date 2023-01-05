package com.example.webint;

public interface AlertService {
    public AlertBoundary create(AlertBoundary alert);

    public AlertBoundary getSpecificAlert(String alertID);

    public AlertBoundary search(String criteriaType, String criteriaValue, Integer size, Integer page, String sortAttribute, String sortOrder);


    public AlertBoundary searchHistory(String criteriaType, String criteriaValue, Integer size, Integer page, String sortAttribute, String sortOrder);

    public AlertBoundary updateAlert(String alertID, AlertBoundary alert);

    public AlertBoundary deleteAll();
}
