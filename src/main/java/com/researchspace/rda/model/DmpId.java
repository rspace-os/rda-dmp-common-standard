package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)
public class DmpId {

  private String identifier;

  public enum DmpIdType {

    @JsonProperty("handle")
    HANDLE,

    @JsonProperty("doi")
    DOI,

    @JsonProperty("ark")
    ARK,

    @JsonProperty("url")
    URL,

    @JsonProperty("other")
    OTHER

  }

  private DmpIdType type;

}

