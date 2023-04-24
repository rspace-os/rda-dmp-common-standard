package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.util.List;
import java.net.URI;

@Data
@AllArgsConstructor
public class DMP {

  /*
   * Contact person for a DMP.
   */
  private Contact contact;

  /*
   * To list people that play role in data management related to this DMP, e.g.
   * responsible for performing actions described in this DMP.
   */
  private List<Contributor> contributor;

  /*
   * To list costs related to data management. Providing multiple instances of
   * a 'Cost' allows to break down costs into details. Providing one 'Cost'
   * instance allows to provide one aggregated sum.
   */
  private Set<Cost> cost;

  /*
   * Date and time of the first version of a DMP. Must not be changed in
   * subsequent DMPs. Encoded using the relevant ISO 8601 Date and Time
   * compliant string
   */
  private String created;

  /*
   * To describe data on a non-technical level.
   * Set MUST not be empty;
   */
  private Set<Dataset> dataset;

  /*
   * To provide any free-form text information on a DMP.
   */
  private Optional<String> description;

  private DmpId dmp_id;

  /*
   * To describe ethical issues directly in a DMP.
   */
  private Optional<String> ethical_issues_description;

  private YesNo ethical_issues_exist;

  /*
   * To indicate where a protocol from a meeting with an ethical commitee can
   * be found.
   */
  private Optional<URI> ethical_issues_report;

  /*
   * Language of the DMP expressed using ISO 639-3.
   */
  private String language;

  /*
   * Must be set each time DMP is modified. Indicates DMP version.
   * Encoded using the relevant ISO 8601 Date and Time compliant string
   */
  private String modified;

  private Set<Project> project;

  private String title;

}

