package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Used to indicate any specific requirements related to security and privacy
 * of a specific dataset, e.g. to indicate that data is not anonymized.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecurityAndPrivacy {

  /*
   * E.g. Physical access control.
   */
  private String title;

  /*
   * E.g. Server with data must be kept in a locked room.
   */
  private String description;

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

}
