package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.Set;
import java.net.URI;

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
public class Host {

  private Optional<String> availability;

  private Optional<String> backup_frequency;

  private Optional<String> backup_type;

  public enum CertificationStandard {
    DIN31644,
    DINI_ZERTIFIKAT,
    DSA,
    ISO16363,
    ISO16919,
    TRAC,
    WDS,
    CORETRUSTSEAL
  }

  private Optional<CertificationStandard> certified_with;

  private Optional<String> description;

  /*
   * Physical location of the data expressed using ISO 3166-1 country code.
   */
  private Optional<String> geo_location;

  public enum PIDSystem {
    ARK,
    ARXIV,
    BIBCODE,
    DOI,
    EAN13,
    EISSN,
    HANDLE,
    IGSN,
    ISBN,
    ISSN,
    ISTC,
    LISSN,
    LSID,
    PMID,
    PURL,
    UPC,
    URL,
    URN,
    OTHER
  }

  private Set<PIDSystem> pid_system;

  private Optional<String> storage_type;

  private Optional<YesNo> supports_versioning;

  private String title;

  /*
   * The URL of the system hosting a distribution of a dataset.
   */
  private URI url;

}

