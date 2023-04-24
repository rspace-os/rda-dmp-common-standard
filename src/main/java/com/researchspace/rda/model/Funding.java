package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;

/*
 * For specifying details on funded projects, e.g. NSF of EC funded projects.
 */
@Data
@AllArgsConstructor
public class Funding {

  private FundingId funder_id;

  public enum FundingStatus {
    PLANNED,
    APPLIED,
    GRANTED,
    REJECTED
  }

  private Optional<FundingStatus> funding_status;

  private Optional<GrantId> grant_id;

}
