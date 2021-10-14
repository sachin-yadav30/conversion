package com.convert.service;

import org.apache.commons.math3.util.Precision;
import org.springframework.stereotype.Service;

@Service
public class WeightService implements Convertor{
    @Override
    public double convertToMetric(final double fromValue) {
        return Precision.round(fromValue / 2.205, 2);
    }

    @Override
    public double convertToImperial(final double fromValue) {
        return Precision.round(fromValue * 2.205, 2);
    }
}
