package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class MetadataStandardId {

  private String identifier;

  public enum MetadataStandardIdType {
    URL,
    OTHER
  }

  private MetadataStandardIdType type;

}
