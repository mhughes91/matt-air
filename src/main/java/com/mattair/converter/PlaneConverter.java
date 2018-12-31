package com.mattair.converter;

import com.mattair.domain.Plane;
import com.mattair.dto.PlaneDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PlaneConverter implements Converter<Plane, PlaneDto> {

    @Override
    public PlaneDto convert(final Plane source) {
        if (source == null) {
            return null;
        }

        return new PlaneDto(source.getId(),
                source.getCallSign(),
                source.getPlaneType(),
                source.getVersion());
    }
}
