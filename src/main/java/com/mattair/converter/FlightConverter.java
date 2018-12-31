package com.mattair.converter;

import com.mattair.domain.Flight;
import com.mattair.dto.FlightDto;
import com.mattair.util.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FlightConverter implements Converter<Flight, FlightDto> {

    @Autowired
    private PlaneConverter planeConverter;

    @Autowired
    private LocationConverter locationConverter;

    @Override
    public FlightDto convert(final Flight source) {
        if (source == null) {
            return null;
        }

        return new FlightDto.Builder()
                .setId(source.getId())
                .setPlane(this.planeConverter.convert(source.getPlane()))
                .setStartLocation(this.locationConverter.convert(source.getStartLocation()))
                .setDestination(this.locationConverter.convert(source.getDestination()))
                .setDepartureDateTime(DateTimeUtils.convertDateToBritishDateTimeString(source.getDepartureDateTime()))
                .setArrivalDateTime(DateTimeUtils.convertDateToBritishDateTimeString(source.getArrivalDateTime()))
                .setCreatedDateTime(DateTimeUtils.convertDateToBritishDateTimeString(source.getCreatedDateTime()))
                .setVersion(source.getVersion())
                .createFlightDto();
    }
}
