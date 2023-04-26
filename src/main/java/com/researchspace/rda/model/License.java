package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.net.URI;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

/**
 * Used to indicate the license under which data (each specific Distribution)
 * will be made available. It also allows for modelling embargoes. See <a
 * href=https://github.com/RDA-DMP-Common/RDA-DMP-Common-Standard/blob/master/docs/FAQ.md>FAQ</a>
 * for more details.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class License {

  private URI licenseRef;

  /**
   * If date is set in the future, it indicates embargo period. Encoded using
   * the relevant ISO 8601 Date and Time compliant string
   */
  private String startDate;

}

