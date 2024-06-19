package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FundingId {

  private String identifier;

  public enum FunderIdType {

    @JsonProperty("fundref")
    FUNDREF,

    @JsonProperty("url")
    URL,

    @JsonProperty("other")
    OTHER;

    private static Map<String, FunderIdType> namesMap = new HashMap<>(3);

    static {
      namesMap.put("fundref", FUNDREF);
      namesMap.put("url", URL);
      namesMap.put("other", OTHER);
    }

    @JsonCreator
    public static FunderIdType forValue(String value) {
      if (value != null) {
        return namesMap.get(value.toLowerCase());
      }
      return null;
    }

    @JsonValue
    public String toValue() {
      for (Entry<String, FunderIdType> entry : namesMap.entrySet()) {
        if (entry.getValue() == this) {
          return entry.getKey();
        }
      }
      return null; // ignore the value
    }

  }

  private FunderIdType type;


}
