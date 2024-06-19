package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Whilst not specifically declared by the spec, this class models the concept
 * of identifying a person.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)
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

