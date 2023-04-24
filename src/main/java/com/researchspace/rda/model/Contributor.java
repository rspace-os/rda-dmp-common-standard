package com.researchspace.rda.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.Set;

/**
 * For modelling a party involved in the process of the data management
 * described by this DMP, and those parties involved in the creation and
 * management of the DMP itself.
 */
@Data
@AllArgsConstructor
public class Contributor {

  private PersonId contact_id;

  // Mail address
  private Optional<String> mbox;

  // Name
  private String name;

  // Type of contributor e.g. "Data Steward"
  // Set MUST not be empty.
  private Set<String> role;

}

