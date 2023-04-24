package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;

@Data
@AllArgsConstructor
public class FundingId {

  private String identifier;

  public enum FunderIdType {
    FUNDREF,
    URL,
    OTHER
  }

  private FunderIdType type;


}
