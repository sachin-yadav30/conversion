package com.convert.service;

import org.apache.commons.math3.util.Precision;
import org.springframework.stereotype.Service;

@Service
public class VolumeService implements Convertor{
    @Override
    public double convertToMetric(final double gallonValue) {
        return Precision.round(gallonValue * 4.546, 2);
    }
    @Override
    public double convertToImperial(final double litreValue) {
        return Precision.round(litreValue / 4.546, 2);
    }
}
