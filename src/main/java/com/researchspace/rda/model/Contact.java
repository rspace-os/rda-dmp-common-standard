package com.researchspace.rda.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * For modelling a party which can provide any information on the DMP. This is
 * not necessarily the DMP creator, and can be a person or an organisation.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

  // Identifier for a contact person
  private PersonId contact_id;

  // Email address
  private String mbox;

  // Name of the contact person
  private String name;

}

