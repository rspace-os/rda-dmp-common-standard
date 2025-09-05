package com.researchspace.rda.model.extras;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.researchspace.rda.model.DMP;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DMPItem {
  private DMP dmp;

}
