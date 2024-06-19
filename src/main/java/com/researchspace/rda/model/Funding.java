package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * For specifying details on funded projects, e.g. NSF of EC funded projects.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Funding {

  private FundingId funderId;

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

  private Optional<FundingStatus> fundingStatus;

  @JsonProperty("fundingStatus")
  public void setFundingStatus(FundingStatus fundingStatus) {
    this.fundingStatus = Optional.ofNullable(fundingStatus);
  }

  private Optional<GrantId> grantId;

  @JsonProperty("grantId")
  public void setGrantId(GrantId grantId) {
    this.grantId = Optional.ofNullable(grantId);
  }

}
