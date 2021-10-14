package com.convert.service;

import org.apache.commons.math3.util.Precision;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService implements Convertor{
    @Override
    public double convertToMetric(final double fahrenheitValue) {
        return Precision.round((fahrenheitValue - 32) / 1.8, 2);
    }
    @Override
    public double convertToImperial(final double celsiusValue) {
        return Precision.round((celsiusValue * 1.8) + 32, 2);
    }
}
