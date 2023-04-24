package com.researchspace.rda.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.Set;

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
public class Dataset {

  public static class DatasetId {

    public enum DatasetIdType {
      HANDLE,
      DOI,
      ARK,
      URL,
      OTHER
    }

    private String idenfitier;

    private DatasetIdType type;

  }

  private Optional<String> data_quality_assurance;

  private DatasetId dataset_id;

  /*
   * Description is a property in both Dataset and Distribution, in compliance
   * with W3C DCAT. In some cases these might be identical, but in most cases
   * the Dataset represents a more abstract concept, while the distribution can
   * point to a specific file.
   */
  private Optional<String> description;

  private Set<Distribution> distribution;

  /*
   * Encoded using the relevant ISO 8601 Date and Time compliant string.
   */
  private Optional<String> issued;

  private Set<String> keyword;

  /*
   * Language of the dataset expressed using ISO 639-3.
   */
  private Optional<String> language;

  private Set<Metadata> metadata;

  private YesNo personal_data;

  private Optional<String> preservation_statement;

  private Set<SecurityAndPrivacy> security_and_privacy;

  private YesNo sensitive_data;

  private Set<TechnicalResource> technical_resource;

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
  private Optional<String> type;

}

