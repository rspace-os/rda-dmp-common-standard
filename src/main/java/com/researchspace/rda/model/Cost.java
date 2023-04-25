package com.researchspace.rda.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * For modelling a cost related to data management.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cost {

  // MUST be a currency code from ISO-4217
  private Optional<String> currency_code;

  @JsonProperty("currency_code")
  public void setCurrencyCode(String currency_code) {
    this.currency_code = Optional.ofNullable(currency_code);
  }

  private Optional<String> description;

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = Optional.ofNullable(description);
  }

  private String title;

  private Optional<Long> value;

  @JsonProperty("value")
  public void setValue(Long value) {
    this.value = Optional.ofNullable(value);
  }

}

