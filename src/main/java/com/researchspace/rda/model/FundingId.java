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
public class FundingId {

  private String identifier;

  public enum FunderIdType {

    @JsonProperty("fundref")
    FUNDREF,

    @JsonProperty("url")
    URL,

    @JsonProperty("other")
    OTHER

  }

  private FunderIdType type;


}
