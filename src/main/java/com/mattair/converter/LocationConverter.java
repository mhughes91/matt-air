package com.mattair.converter;

import com.mattair.domain.Location;
import com.mattair.dto.LocationDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LocationConverter implements Converter<Location, LocationDto> {

    @Override
    public LocationDto convert(final Location source) {
        if (source == null) {
            return null;
        }

        return new LocationDto(source.getId(),
                source.getCity(),
                source.getCountry(),
                source.getVersion());
    }
}
