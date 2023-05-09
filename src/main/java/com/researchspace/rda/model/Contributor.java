package com.researchspace.rda.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Optional;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

/**
 * For modelling a party involved in the process of the data management
 * described by this DMP, and those parties involved in the creation and
 * management of the DMP itself.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Contributor {

  private PersonId contactId;

  // Mail address
  private Optional<String> mbox;

  @JsonProperty("mbox")
  public void setMbox(String mbox) {
    this.mbox = Optional.ofNullable(mbox);
  }

  // Name
  private String name;

  // Type of contributor e.g. "Data Steward"
  // Set MUST not be empty.
  private Set<String> role;

}

