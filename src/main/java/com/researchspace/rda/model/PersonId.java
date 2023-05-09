package com.researchspace.rda.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Whilst not specifically declared by the spec, this class models the concept
 * of identifying a person.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonId {

  public enum PersonIdType {

    @JsonProperty("orcid")
    ORCID,

    @JsonProperty("isni")
    ISNI,

    @JsonProperty("openid")
    OPENID,

    @JsonProperty("other")
    OTHER

  }

  private String identifier;

  private PersonIdType type;

}

