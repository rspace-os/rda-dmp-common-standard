package com.researchspace.rda.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * Whilst not specifically declared by the spec, this class models the concept
 * of identifying a person.
 */
@Data
@AllArgsConstructor
public class PersonId {

  public enum PersonIdType {
    ORCID,
    ISNI,
    OPENID,
    OTHER
  }

  private String identifier;

  private PersonIdType type;

}

