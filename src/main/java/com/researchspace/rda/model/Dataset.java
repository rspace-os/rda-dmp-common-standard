package com.researchspace.rda.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This follows the definition of Dataset in the W3C DCAT specification.
 * Dataset can be understood as a logical entity depicting data, e.g. raw data.
 * It provides high level information about the data. The granularity of
 * dataset depends on a specific setting. In edge cases it can be a file, but
 * also a collection of files in different formats. See <a
 * href=https://github.com/RDA-DMP-Common/RDA-DMP-Common-Standard/blob/master/docs/FAQ.md>FAQ</a>
 * for more details.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Dataset {

  public static class DatasetId {

    public enum DatasetIdType {

      @JsonProperty("handle")
      HANDLE,

      @JsonProperty("doi")
      DOI,

      @JsonProperty("ark")
      ARK,

      @JsonProperty("url")
      URL,

      @JsonProperty("other")
      OTHER

    }

    private String idenfitier;

    private DatasetIdType type;

  }

  private String dataQualityAssurance;

  @JsonProperty("dataQualityAssurance")
  public void setDataQualityAssurance(String dataQualityAssurance) {
    this.dataQualityAssurance = dataQualityAssurance;
  }

  private DatasetId datasetId;

  /*
   * Description is a property in both Dataset and Distribution, in compliance
   * with W3C DCAT. In some cases these might be identical, but in most cases
   * the Dataset represents a more abstract concept, while the distribution can
   * point to a specific file.
   */
  private String description;

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  private Set<Distribution> distribution;

  /*
   * Encoded using the relevant ISO 8601 Date and Time compliant string.
   */
  private String issued;

  @JsonProperty("issued")
  public void setIssued(String issued) {
    this.issued = issued;
  }

  private Set<String> keyword;

  /*
   * Language of the dataset expressed using ISO 639-3.
   */
  private String language;

  @JsonProperty("language")
  public void setLanguage(String language) {
    this.language = language;
  }

  private Set<Metadata> metadata;

  private YesNo personalData;

  private String preservationStatement;

  @JsonProperty("preservationStatement")
  public void setPreservationStatement(String preservationStatement) {
    this.preservationStatement = preservationStatement;
  }

  private Set<SecurityAndPrivacy> securityAndPrivacy;

  private YesNo sensitiveData;

  private Set<TechnicalResource> technicalResource;

  /*
   * Title is a property in both Dataset and Distribution, in compliance with
   * W3C DCAT. In some cases these might be identical, but in most cases the
   * Dataset represents a more abstract concept, while the distribution can
   * point to a specific file.
   */
  private String title;

  /*
   * If appropriate, type according to: DataCite and/or COAR dictionary.
   * Otherwise use the common name for the type, e.g. raw data, software,
   * survey, etc.
   * https://schema.datacite.org/meta/kernel-4.1/doc/DataCite-MetadataKernel_v4.1.pdf
   * http://vocabularies.coar-repositories.org/pubby/resource_type.html
   */
  private String type;

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

}

