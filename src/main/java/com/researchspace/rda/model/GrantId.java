package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GrantId {

  private String identifier;

  public enum GrantIdType {

    @JsonProperty("url")
    URL,

    @JsonProperty("other")
    OTHER

  }

  private GrantIdType type;


}
