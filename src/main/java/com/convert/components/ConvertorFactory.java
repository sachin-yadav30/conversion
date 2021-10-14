package com.convert.components;

import com.convert.service.*;
import com.convert.util.ConversionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.lang.String.format;

@Component
public class ConvertorFactory {
    private final TemperatureService temperatureService;
    private final AreaService areaService;
    private final LengthService lengthService;
    private final VolumeService volumeService;
    private final WeightService weightService;

    @Autowired
    public ConvertorFactory(final TemperatureService temperatureService,
                            final AreaService areaService,
                            final LengthService lengthService,
                            final VolumeService volumeService,
                            final WeightService weightService) {
        this.temperatureService = temperatureService;
        this.areaService = areaService;
        this.lengthService = lengthService;
        this.volumeService = volumeService;
        this.weightService = weightService;
    }

    public Convertor getConvertor(final ConversionType type) {
        if (ConversionType.TEMPERATURE.equals(type)) {
            return temperatureService;
        } else if (ConversionType.AREA.equals(type)) {
            return areaService;
        } else if (ConversionType.LENGTH.equals(type)) {
            return lengthService;
        } else if (ConversionType.VOLUME.equals(type)) {
            return volumeService;
        } else if (ConversionType.WEIGHT.equals(type)) {
            return weightService;
        } else {
            throw new RuntimeException(format("Could not identify implementation for the conversion type [%s]",
                    type.name()));
        }
    }
}
