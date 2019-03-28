/*
 * SVRF API
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
import com.svrf.client.model.Media;
import com.svrf.client.model.PaginationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchMediaResponse
 */

public class SearchMediaResponse {
  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("nextPageNum")
  private Integer nextPageNum = null;

  @SerializedName("pageNum")
  private Integer pageNum = null;

  @SerializedName("media")
  private List<Media> media = null;

  @SerializedName("tookMs")
  private Integer tookMs = null;

  @SerializedName("totalNum")
  private Integer totalNum = null;

  public SearchMediaResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * If the request was successful
   * @return success
  **/
  @ApiModelProperty(example = "true", value = "If the request was successful")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public SearchMediaResponse nextPageNum(Integer nextPageNum) {
    this.nextPageNum = nextPageNum;
    return this;
  }

   /**
   * The next page to query to see more results, whether or not the next page actually exists.
   * @return nextPageNum
  **/
  @ApiModelProperty(value = "The next page to query to see more results, whether or not the next page actually exists.")
  public Integer getNextPageNum() {
    return nextPageNum;
  }

  public void setNextPageNum(Integer nextPageNum) {
    this.nextPageNum = nextPageNum;
  }

  public SearchMediaResponse pageNum(Integer pageNum) {
    this.pageNum = pageNum;
    return this;
  }

   /**
   * The current page number
   * @return pageNum
  **/
  @ApiModelProperty(value = "The current page number")
  public Integer getPageNum() {
    return pageNum;
  }

  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  public SearchMediaResponse media(List<Media> media) {
    this.media = media;
    return this;
  }

  public SearchMediaResponse addMediaItem(Media mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<Media>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * The search results
   * @return media
  **/
  @ApiModelProperty(value = "The search results")
  public List<Media> getMedia() {
    return media;
  }

  public void setMedia(List<Media> media) {
    this.media = media;
  }

  public SearchMediaResponse tookMs(Integer tookMs) {
    this.tookMs = tookMs;
    return this;
  }

   /**
   * The number of milliseconds the request took
   * @return tookMs
  **/
  @ApiModelProperty(value = "The number of milliseconds the request took")
  public Integer getTookMs() {
    return tookMs;
  }

  public void setTookMs(Integer tookMs) {
    this.tookMs = tookMs;
  }

  public SearchMediaResponse totalNum(Integer totalNum) {
    this.totalNum = totalNum;
    return this;
  }

   /**
   * The number of total results for query
   * @return totalNum
  **/
  @ApiModelProperty(value = "The number of total results for query")
  public Integer getTotalNum() {
    return totalNum;
  }

  public void setTotalNum(Integer totalNum) {
    this.totalNum = totalNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchMediaResponse searchMediaResponse = (SearchMediaResponse) o;
    return Objects.equals(this.success, searchMediaResponse.success) &&
        Objects.equals(this.nextPageNum, searchMediaResponse.nextPageNum) &&
        Objects.equals(this.pageNum, searchMediaResponse.pageNum) &&
        Objects.equals(this.media, searchMediaResponse.media) &&
        Objects.equals(this.tookMs, searchMediaResponse.tookMs) &&
        Objects.equals(this.totalNum, searchMediaResponse.totalNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, nextPageNum, pageNum, media, tookMs, totalNum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchMediaResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    nextPageNum: ").append(toIndentedString(nextPageNum)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    tookMs: ").append(toIndentedString(tookMs)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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

