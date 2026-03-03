package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Metadata {

  private String description;

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /*
   * Language of the metadata expressed using ISO 639-3.
   */
  private String language;

  private MetadataStandardId metadataStandardId;

}
