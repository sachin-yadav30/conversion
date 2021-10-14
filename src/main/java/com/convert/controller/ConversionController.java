package com.convert.controller;

import com.convert.service.ConvertorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/convert")
public class ConversionController {

    private final ConvertorService convertorService;

    @Autowired
    public ConversionController(final ConvertorService convertorService) {
        this.convertorService = convertorService;
    }

    @GetMapping("/{measurement}/{toSystem}/{value}")
    public ResponseEntity<String> convert(@PathVariable final String measurement, @PathVariable final String toSystem, @PathVariable final Double value) {
        return convertorService.convert(measurement, toSystem, value);
    }

    @GetMapping("/measurements")
    public ResponseEntity<List<String>> getMeasurements() {
        return convertorService.getMeasurements();
    }

    @GetMapping("/si-units")
    public ResponseEntity<List<String>> getSiUnits() {
        return convertorService.getSiUnits();
    }
}
