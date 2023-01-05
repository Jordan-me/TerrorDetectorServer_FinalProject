package com.example.webint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlertController {
    private AlertService alertService;
    @Autowired
    public AlertController(AlertService alertService) {
        super();
        this.alertService = alertService;
    }

    @RequestMapping(
            path ="/alerts",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AlertBoundary create(@RequestBody AlertBoundary alert){
        return this.alertService.create(alert);
    }

    @RequestMapping(
            path ="/alert/{alertID}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AlertBoundary getAlert(@PathVariable("alertID") String alertID){
        return this.alertService.getSpecificAlert(alertID);
    }

    @RequestMapping(
            path ="/alerts/search?filterType={criteriaType}&filterValue={criteriaValue}&sortBy={sortBy}&sortOrder={sortOrder}&page={page}&size={size}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AlertBoundary searchAlertsByAttribute(
            @RequestParam(name = "criteriaType", required = false, defaultValue = "") String criteriaType ,
            @RequestParam(name = "criteriaValue", required = false, defaultValue = "") String criteriaValue,
            @RequestParam(name = "size", required = false, defaultValue = "10") Integer size,
            @RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(name = "sortBy", required = false, defaultValue = "email") String sortAttribute,
            @RequestParam(name = "sortOrder", required = false, defaultValue = "ASC") String sortOrder
    ){
        return this.alertService.search(
                criteriaType,
                criteriaValue,
                size,
                page,
                sortAttribute,
                sortOrder
        );
    }

    @RequestMapping(
            path ="/alerts/history?filterType={criteriaType}&filterValue={criteriaValue}&sortBy={sortBy}&sortOrder={sortOrder}&page={page}&size={size}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AlertBoundary searchAlertsHistoryByAttribute(
            @RequestParam(name = "criteriaType", required = false, defaultValue = "") String criteriaType ,
            @RequestParam(name = "criteriaValue", required = false, defaultValue = "") String criteriaValue,
            @RequestParam(name = "size", required = false, defaultValue = "10") Integer size,
            @RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(name = "sortBy", required = false, defaultValue = "email") String sortAttribute,
            @RequestParam(name = "sortOrder", required = false, defaultValue = "ASC") String sortOrder
    ){
        return this.alertService.searchHistory(
                criteriaType,
                criteriaValue,
                size,
                page,
                sortAttribute,
                sortOrder
        );
    }

    @RequestMapping(
            path ="/alert/{alertID}",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AlertBoundary updateAlert(@PathVariable("alertID") String alertID, @RequestBody AlertBoundary alert ){
        return this.alertService.updateAlert(alertID, alert);
    }

    @RequestMapping(
            path ="/alerts",
            method = RequestMethod.DELETE)
    public AlertBoundary deleteAllAlerts(){
        return this.alertService.deleteAll();
    }

}
