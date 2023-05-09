package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

