package org.prog.session9;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class LocationDto {
    private StreetDto street;
    private CoordinatesDto coordinates;
}
