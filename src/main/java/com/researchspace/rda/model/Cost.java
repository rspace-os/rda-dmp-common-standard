package com.researchspace.rda.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Optional;

/**
 * For modelling a cost related to data management.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cost {

  // MUST be a currency code from ISO-4217
  private Optional<String> currency_code;

  private Optional<String> description;

  private String title;

  private Optional<Long> value;

}

