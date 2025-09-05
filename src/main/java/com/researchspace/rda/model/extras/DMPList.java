package com.researchspace.rda.model.extras;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.researchspace.rda.model.DMP;
import java.util.LinkedList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DMPList {

  private Integer page;

  @JsonAlias({"per_page"})
  private Integer perPage;

  @JsonAlias({"total_items"})
  private Integer totalItems;

  private List<DMPItem> items;

  public void setDmpItems(List<DMP> dmpItems) {
    this.items = new LinkedList<>();
    for (DMP dmpItem : dmpItems) {
      this.items.add(new DMPItem(dmpItem));
    }
  }

}

