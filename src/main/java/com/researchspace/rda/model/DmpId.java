package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;

@Data
@AllArgsConstructor
public class DmpId {

  private String identifier;

  public enum DmpIdType {
    HANDLE,
    DOI,
    ARK,
    URL,
    OTHER
  }

  private DmpIdType type;

}

