package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;

/**
 * Used to indicate any specific requirements related to security and privacy
 * of a specific dataset, e.g. to indicate that data is not anonymized.
 */
@Data
@AllArgsConstructor
public class SecurityAndPrivacy {

  /*
   * E.g. Physical access control.
   */
  private String title;

  /*
   * E.g. Server with data must be kept in a locked room.
   */
  private Optional<String> description;

}
