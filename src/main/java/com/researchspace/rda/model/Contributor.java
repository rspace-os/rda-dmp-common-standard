package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Optional;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * For modelling a party involved in the process of the data management
 * described by this DMP, and those parties involved in the creation and
 * management of the DMP itself.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown=true)
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

