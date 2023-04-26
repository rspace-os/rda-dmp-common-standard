package com.researchspace.rda.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

/**
 * For modelling a cost related to data management.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Cost {

  // MUST be a currency code from ISO-4217
  private Optional<String> currencyCode;

  @JsonProperty("currencyCode")
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = Optional.ofNullable(currencyCode);
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

