package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;

/**
 * For specifying equipment needed/used to create or process the data, e.g. a
 * microscope, etc.
 */
@Data
@AllArgsConstructor
public class TechnicalResource {

  /*
   * Name of the technical resource e.g. 123/45/43/AT
   */
  private String name;

  /*
   * Description of the technical resource e.g. Device needed to collect data
   */
  private Optional<String> description;

}
