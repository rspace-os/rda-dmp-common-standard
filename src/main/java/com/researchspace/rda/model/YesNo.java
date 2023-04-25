package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum YesNo {

  @JsonProperty("yes")
  YES,

  @JsonProperty("no")
  NO,

  @JsonProperty("unknown")
  UNKNOWN
}
