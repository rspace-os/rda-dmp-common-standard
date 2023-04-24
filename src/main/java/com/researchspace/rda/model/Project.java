package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;

/*
 * Describes the project associated with the DMP, if applicable. It can be used
 * to describe any type of project: that is, not only funded projects, but also
 * internal projects, PhD theses, etc.
 */
@Data
@AllArgsConstructor
public class Project {

  private Optional<String> description;

  /*
   * Project end date. Encoded using the relevant ISO 8601 Date and Time
   * compliant string.
   */
  private Optional<String> end;

  private Set<Funding> funding;

  /*
   * Project start date. Encoded using the relevant ISO 8601 Date and Time
   * compliant string.
   */
  private Optional<String> start;

  private String title;

}
