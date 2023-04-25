package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Provides information on the system where data is stored. It can be used to
 * provide details on a repository where data is deposited, e.g. a Core Trust
 * Seal certified repository located in Europe that uses DOIs. It can also
 * provide details on systems where data is stored and processed during
 * research, e.g. a high performance computer that uses fast storage with two
 * daily backups.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Host {

  private Optional<String> availability;

  @JsonProperty("availability")
  public void setAvailability(String availability) {
    this.availability = Optional.ofNullable(availability);
  }

  private Optional<String> backup_frequency;

  @JsonProperty("backup_frequency")
  public void setBackupFrequency(String backup_frequency) {
    this.backup_frequency = Optional.ofNullable(backup_frequency);
  }

  private Optional<String> backup_type;

  @JsonProperty("backup_type")
  public void setBackupType(String backup_type) {
    this.backup_type = Optional.ofNullable(backup_type);
  }

  public enum CertificationStandard {

    @JsonProperty("din31644")
    DIN31644,

    @JsonProperty("dini-zertifikat")
    DINI_ZERTIFIKAT,

    @JsonProperty("dsa")
    DSA,

    @JsonProperty("iso16363")
    ISO16363,

    @JsonProperty("iso16919")
    ISO16919,

    @JsonProperty("trac")
    TRAC,

    @JsonProperty("wds")
    WDS,

    @JsonProperty("coretrustseal")
    CORETRUSTSEAL

  }

  private Optional<CertificationStandard> certified_with;

  private Optional<String> description;

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = Optional.ofNullable(description);
  }

  /*
   * Physical location of the data expressed using ISO 3166-1 country code.
   */
  private Optional<String> geo_location;

  @JsonProperty("geo_location")
  public void setGeoLocation(String geo_location) {
    this.geo_location = Optional.ofNullable(geo_location);
  }

  public enum PIDSystem {

    @JsonProperty("ark")
    ARK,

    @JsonProperty("arxiv")
    ARXIV,

    @JsonProperty("bibcode")
    BIBCODE,

    @JsonProperty("doi")
    DOI,

    @JsonProperty("ean13")
    EAN13,

    @JsonProperty("eissn")
    EISSN,

    @JsonProperty("handle")
    HANDLE,

    @JsonProperty("igsn")
    IGSN,

    @JsonProperty("isbn")
    ISBN,

    @JsonProperty("issn")
    ISSN,

    @JsonProperty("istc")
    ISTC,

    @JsonProperty("lissn")
    LISSN,

    @JsonProperty("lsid")
    LSID,

    @JsonProperty("pmid")
    PMID,

    @JsonProperty("purl")
    PURL,

    @JsonProperty("upc")
    UPC,

    @JsonProperty("url")
    URL,

    @JsonProperty("urn")
    URN,

    @JsonProperty("other")
    OTHER

  }

  private Set<PIDSystem> pid_system;

  private Optional<String> storage_type;

  @JsonProperty("storage_type")
  public void setStorageType(String storage_type) {
    this.storage_type = Optional.ofNullable(storage_type);
  }

  private Optional<YesNo> supports_versioning;

  private String title;

  /*
   * The URL of the system hosting a distribution of a dataset.
   */
  private URI url;

}

