package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Optional;

@Data
@AllArgsConstructor
public class Metadata {

  private Optional<String> description;

  /*
   * Language of the metadata expressed using ISO 639-3.
   */
  private String language;

  private MetadataStandardId metadata_standard_id;

}
