package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * For modelling a party which can provide any information on the DMP. This is
 * not necessarily the DMP creator, and can be a person or an organisation.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Contact {

  // Identifier for a contact person
  private PersonId contactId;

  // Email address
  private String mbox;

  // Name of the contact person
  private String name;

}

