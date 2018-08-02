/*
 * SVRF API
 * # Getting Started  SVRF's API allows you to supercharge your project or app with the first and largest search engine for immersive experiences. We make it simple for any developer to incorporate highly immersive experiences with all kinds of applications: virtual reality, augmented reality, mixed reality, mobile, and web.  The SVRF API is based on REST principles, allowing it to integrate cross-platform. Our endpoints return responses in [JSON][]. We support [CORS][], allowing you to access immersive experiences indexed by SVRF on your own web domains. We provide a variety of resolutions, projections, and file formats to support most modern clients.  The SVRF API Documentation is available at [https://developers.svrf.com][SVRF Dev].  ## Access and API Keys  The SVRF API is currently in private beta and access is limited to select partners. If you are interested in using the SVRF API for your app or project, please contact us at [api@svrf.com][API Email]. We cannot guarantee immediate access for all requests, but we will announce a public release in the coming months.  See our [terms of service][TOS] for restrictions on using the SVRF API.  If you have any questions please contact us at [api@svrf.com][API Email]. Submit API corrections via [GitHub Issues][].  ## API Highlights  ### Search Endpoint  The [SVRF Search Endpoint][Docs Search] brings the power of immersive search found on [SVRF.com][SVRF] to your app or project. Our search engine enables your users to instantly find the immersive experience they are seeking. Content is sorted by the SVRF rating system, ensuring that the highest quality and most relevant search results are returned first.  ### Trending Endpoint  The [SVRF Trending Endpoint][Docs Trending] provides your app or project with the hottest immersive content - curated by real humans. The experiences returned mirror the [SVRF homepage][SVRF], from timely cultural content to trending pop-culture references. The experiences are updated regularly to ensure users always get a fresh list of immersive content.  ## API Libraries  You can use SVRF API libraries to encapsulate endpoint requests: * [C#][CSharp] * [Java][Java] * [JavaScript][JavaScript] * [Objective C][Objective C]  ## Attribution  ### Authors and Site Credit  At SVRF, we believe in giving credit where credit is due. Do your best to provide attribution to the `authors` and `site` where the content originated. We suggest using the format: __by {authors} via {site}__.  If possible, provide a way for users to discover and visit the page the content originally came from (`url`).  ### Powered By SVRF  As per section 5a of the [terms of service][TOS], __we require all apps that use the SVRF API to conspicuously display \"Powered By SVRF\" attribution marks where the API is utilized.__  ## Rate Limits  The SVRF API has a generous rate limit to ensure the best experience for your users. We rate limit by IP address with a maximum of 100 requests per second. If you exceed this rate limit, requests will be blocked for 60 seconds. Requests blocked by the rate limit will return with status code `429`.  [API Email]: mailto:api@svrf.com [CORS]: https://en.wikipedia.org/wiki/Cross-origin_resource_sharing [CSharp]: https://www.nuget.org/packages/SVRF.Client [Docs Search]: https://developers.svrf.com/#tag/Media/paths/~1vr~1search?q={q}/get [Docs Trending]: https://developers.svrf.com/#tag/Media/paths/~1vr~1trending/get [GitHub Issues]: https://github.com/Svrf/svrf-api/issues [Java]: https://mvnrepository.com/artifact/com.svrf/svrf-client [JavaScript]: https://www.npmjs.com/package/svrf-client [JSON]: http://www.json.org/ [Objective C]: https://cocoapods.org/pods/SVRFClient [SVRF]: https://www.svrf.com [SVRF Dev]: https://developers.svrf.com [TOS]: https://www.svrf.com/terms 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@svrf.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.svrf.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.svrf.client.model.MediaFiles;
import com.svrf.client.model.MediaType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Media
 */

public class Media {
  @SerializedName("adult")
  private Boolean adult = false;

  @SerializedName("authors")
  private List<String> authors = null;

  @SerializedName("canonical")
  private String canonical = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("duration")
  private BigDecimal duration = null;

  @SerializedName("embedHtml")
  private String embedHtml = null;

  @SerializedName("embedUrl")
  private String embedUrl = null;

  @SerializedName("files")
  private MediaFiles files = null;

  @SerializedName("height")
  private BigDecimal height = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("site")
  private String site = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("type")
  private MediaType type = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("width")
  private BigDecimal width = null;

  public Media adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

   /**
   * Whether the Media is adult content
   * @return adult
  **/
  @ApiModelProperty(value = "Whether the Media is adult content")
  public Boolean isAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  public Media authors(List<String> authors) {
    this.authors = authors;
    return this;
  }

  public Media addAuthorsItem(String authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<String>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * The Media&#39;s authors. This should be displayed when possible.
   * @return authors
  **/
  @ApiModelProperty(value = "The Media's authors. This should be displayed when possible.")
  public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  public Media canonical(String canonical) {
    this.canonical = canonical;
    return this;
  }

   /**
   * The canonical page this Media can be found at via SVRF.
   * @return canonical
  **/
  @ApiModelProperty(value = "The canonical page this Media can be found at via SVRF.")
  public String getCanonical() {
    return canonical;
  }

  public void setCanonical(String canonical) {
    this.canonical = canonical;
  }

  public Media description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the Media
   * @return description
  **/
  @ApiModelProperty(value = "A description of the Media")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Media duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the Media in seconds.
   * @return duration
  **/
  @ApiModelProperty(value = "The duration of the Media in seconds.")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public Media embedHtml(String embedHtml) {
    this.embedHtml = embedHtml;
    return this;
  }

   /**
   * An &#x60;&lt;iframe&gt;&#x60; tag that embeds a player that plays the Media.
   * @return embedHtml
  **/
  @ApiModelProperty(value = "An `<iframe>` tag that embeds a player that plays the Media.")
  public String getEmbedHtml() {
    return embedHtml;
  }

  public void setEmbedHtml(String embedHtml) {
    this.embedHtml = embedHtml;
  }

  public Media embedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
    return this;
  }

   /**
   * A player that can be embedded using an &#x60;&lt;iframe&gt;&#x60; tag to play the Media.
   * @return embedUrl
  **/
  @ApiModelProperty(value = "A player that can be embedded using an `<iframe>` tag to play the Media.")
  public String getEmbedUrl() {
    return embedUrl;
  }

  public void setEmbedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
  }

  public Media files(MediaFiles files) {
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @ApiModelProperty(value = "")
  public MediaFiles getFiles() {
    return files;
  }

  public void setFiles(MediaFiles files) {
    this.files = files;
  }

  public Media height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * The height, in pixels, of the Media&#39;s source
   * @return height
  **/
  @ApiModelProperty(value = "The height, in pixels, of the Media's source")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public Media id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID of this Media
   * @return id
  **/
  @ApiModelProperty(value = "The unique ID of this Media")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Media site(String site) {
    this.site = site;
    return this;
  }

   /**
   * The site that this Media came from. This should be displayed when possible.
   * @return site
  **/
  @ApiModelProperty(value = "The site that this Media came from. This should be displayed when possible.")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public Media title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the Media, suitable for displaying
   * @return title
  **/
  @ApiModelProperty(value = "The title of the Media, suitable for displaying")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Media type(MediaType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public MediaType getType() {
    return type;
  }

  public void setType(MediaType type) {
    this.type = type;
  }

  public Media url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The original page this Media is located at.
   * @return url
  **/
  @ApiModelProperty(value = "The original page this Media is located at.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Media width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * The width, in pixels, of the Media&#39;s source
   * @return width
  **/
  @ApiModelProperty(value = "The width, in pixels, of the Media's source")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Media media = (Media) o;
    return Objects.equals(this.adult, media.adult) &&
        Objects.equals(this.authors, media.authors) &&
        Objects.equals(this.canonical, media.canonical) &&
        Objects.equals(this.description, media.description) &&
        Objects.equals(this.duration, media.duration) &&
        Objects.equals(this.embedHtml, media.embedHtml) &&
        Objects.equals(this.embedUrl, media.embedUrl) &&
        Objects.equals(this.files, media.files) &&
        Objects.equals(this.height, media.height) &&
        Objects.equals(this.id, media.id) &&
        Objects.equals(this.site, media.site) &&
        Objects.equals(this.title, media.title) &&
        Objects.equals(this.type, media.type) &&
        Objects.equals(this.url, media.url) &&
        Objects.equals(this.width, media.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adult, authors, canonical, description, duration, embedHtml, embedUrl, files, height, id, site, title, type, url, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Media {\n");
    
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    canonical: ").append(toIndentedString(canonical)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    embedHtml: ").append(toIndentedString(embedHtml)).append("\n");
    sb.append("    embedUrl: ").append(toIndentedString(embedUrl)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

