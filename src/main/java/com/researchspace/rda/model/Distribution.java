package com.researchspace.rda.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Optional;
import java.net.URI;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URISyntaxException;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

/**
 * The term "distribution" used here is as defined by the very widely used W3C
 * DCAT metadata application profile. It is used to mean a particular instance
 * of a dataset that has been, or is intended to be, made available in some
 * fashion. It is important to separates the logical notion of a "dataset" from
 * its distributions, of which there may be several, especially to attach more
 * specific metadata properties such as "size" and "license". The lifecycle of
 * the DMP has no particular bearing on this, and a "distribution" may be
 * defined even if the DMP is never actually realised.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Distribution {

  /*
   * A URL of the resource that gives access to a distribution of the dataset.
   * e.g. landing page.
   */
  private Optional<URI> accessUrl;

  @JsonProperty("accessUrl")
  public void setAccessUrl(String accessUrl) throws URISyntaxException {
    this.accessUrl = Optional.ofNullable(accessUrl).flatMap(eir -> {
      try {
        return Optional.of(new URI(eir));
      } catch (Exception e) {
        return Optional.empty();
      }
    });
  }

  /*
   * Indicates how long this distribution will be/ should be available. MUST be
   * encoded using the relevant ISO 8601 Date and Time compliant string.
   */
  private Optional<String> availableUntil;

  @JsonProperty("availableUntil")
  public void setAvailableUntil(String availableUntil) {
    this.availableUntil = Optional.ofNullable(availableUntil);
  }

  private Optional<Long> byteSize;

  @JsonProperty("byteSize")
  public void setByteSize(Long byteSize) {
    this.byteSize = Optional.ofNullable(byteSize);
  }

  public enum DataAccess {

    @JsonProperty("open")
    OPEN,

    @JsonProperty("shared")
    SHARED,

    @JsonProperty("closed")
    CLOSED

  }

  private DataAccess dataAccess;

  /*
   *Description is a property in both Dataset and Distribution, in compliance
   with W3C DCAT. In some cases these might be identical, but in most cases the
   Dataset represents a more abstract concept, while the distribution can point
   to a specific file.
   */
  private Optional<String> description;

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = Optional.ofNullable(description);
  }

  /*
   * The URL of the downloadable file in a given format. E.g. CSV file or RDF
   * file.
   */
  private Optional<URI> downloadUrl;

  @JsonProperty("downloadUrl")
  public void setDownloadUrl(String downloadUrl) throws URISyntaxException {
    this.downloadUrl = Optional.ofNullable(downloadUrl).flatMap(eir -> {
      try {
        return Optional.of(new URI(eir));
      } catch (Exception e) {
        return Optional.empty();
      }
    });
  }

  /*
   * Format according to:
   * https://www.iana.org/assignments/media-types/media-types.xhtml if
   * appropriate, otherwise use the common name for this format.
   */
  private Set<String> format;

  /*
   * To provide information on quality of service provided by infrastructure
   * (e.g. repository) where data is stored.
   */
  private Optional<Host> host;

  @JsonProperty("host")
  public void setHost(Long host) {
    this.host = Optional.ofNullable(host);
  }

  private Set<License> license;

  /*
   * Title is a property in both Dataset and Distribution, in compliance with
   * W3C DCAT. In some cases these might be identical, but in most cases the
   * Dataset represents a more abstract concept, while the distribution can
   * point to a specific file.
   */
  private String title;

}

