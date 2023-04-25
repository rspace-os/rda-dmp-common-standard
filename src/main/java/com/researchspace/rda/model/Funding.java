package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * For specifying details on funded projects, e.g. NSF of EC funded projects.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funding {

  private FundingId funder_id;

  public enum FundingStatus {

    @JsonProperty("planned")
    PLANNED,

    @JsonProperty("applied")
    APPLIED,

    @JsonProperty("granted")
    GRANTED,

    @JsonProperty("rejected")
    REJECTED

  }

  private Optional<FundingStatus> funding_status;

  @JsonProperty("funding_status")
  public void setFundingStatus(FundingStatus funding_status) {
    this.funding_status = Optional.ofNullable(funding_status);
  }

  private Optional<GrantId> grant_id;

  @JsonProperty("grant_id")
  public void setGrantId(GrantId grant_id) {
    this.grant_id = Optional.ofNullable(grant_id);
  }

}
