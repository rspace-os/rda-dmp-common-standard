package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;

@Data
@AllArgsConstructor
public class GrantId {

  private String identifier;

  public enum GrantIdType {
    URL,
    OTHER
  }

  private GrantIdType type;


}
