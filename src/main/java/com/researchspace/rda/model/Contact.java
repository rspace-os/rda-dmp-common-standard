package com.researchspace.rda.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

/**
 * For modelling a party which can provide any information on the DMP. This is
 * not necessarily the DMP creator, and can be a person or an organisation.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Contact {

  // Identifier for a contact person
  private PersonId contactId;

  // Email address
  private String mbox;

  // Name of the contact person
  private String name;

}

