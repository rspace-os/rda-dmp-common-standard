package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Describes the project associated with the DMP, if applicable. It can be used
 * to describe any type of project: that is, not only funded projects, but also
 * internal projects, PhD theses, etc.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)
public class Project {

  private String description;

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /*
   * Project end date. Encoded using the relevant ISO 8601 Date and Time
   * compliant string.
   */
  private String end;

  @JsonProperty("end")
  public void setEnd(String end) {
    this.end = end;
  }

  private Set<Funding> funding;

  /*
   * Project start date. Encoded using the relevant ISO 8601 Date and Time
   * compliant string.
   */
  private String start;

  @JsonProperty("start")
  public void setStart(String start) {
    this.start = start;
  }

  private String title;

}
