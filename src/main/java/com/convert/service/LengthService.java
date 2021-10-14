package com.convert.service;

import org.apache.commons.math3.util.Precision;
import org.springframework.stereotype.Service;

@Service
public class LengthService implements Convertor{
    @Override
    public double convertToMetric(final double mileValue) {
        return Precision.round(mileValue * 1.609, 2);
    }
    @Override
    public double convertToImperial(final double kilometerValue) {
        return Precision.round(kilometerValue / 1.609, 2);
    }
}
