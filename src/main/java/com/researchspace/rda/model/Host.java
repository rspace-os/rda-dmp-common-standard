package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

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
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Host {

  private Optional<String> availability;

  @JsonProperty("availability")
  public void setAvailability(String availability) {
    this.availability = Optional.ofNullable(availability);
  }

  private Optional<String> backupFrequency;

  @JsonProperty("backupFrequency")
  public void setBackupFrequency(String backupFrequency) {
    this.backupFrequency = Optional.ofNullable(backupFrequency);
  }

  private Optional<String> backupType;

  @JsonProperty("backupType")
  public void setBackupType(String backupType) {
    this.backupType = Optional.ofNullable(backupType);
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

  private Optional<CertificationStandard> certifiedWith;

  @JsonProperty("certifiedWith")
  public void setCertifiedWith(Long certifiedWith) {
    this.certifiedWith = Optional.ofNullable(certifiedWith);
  }

  private Optional<String> description;

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = Optional.ofNullable(description);
  }

  /*
   * Physical location of the data expressed using ISO 3166-1 country code.
   */
  private Optional<String> geoLocation;

  @JsonProperty("geoLocation")
  public void setGeoLocation(String geoLocation) {
    this.geoLocation = Optional.ofNullable(geoLocation);
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

  private Set<PIDSystem> pidSystem;

  private Optional<String> storageType;

  @JsonProperty("storageType")
  public void setStorageType(String storageType) {
    this.storageType = Optional.ofNullable(storageType);
  }

  private Optional<YesNo> supportsVersioning;

  @JsonProperty("supportsVersioning")
  public void setSupportsVersioning(Long supportsVersioning) {
    this.supportsVersioning = Optional.ofNullable(supportsVersioning);
  }

  private String title;

  /*
   * The URL of the system hosting a distribution of a dataset.
   */
  private URI url;

}

