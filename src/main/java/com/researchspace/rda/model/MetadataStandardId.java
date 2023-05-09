package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetadataStandardId {

  private String identifier;

  public enum MetadataStandardIdType {

    @JsonProperty("url")
    URL,

    @JsonProperty("other")
    OTHER

  }

  private MetadataStandardIdType type;

}
