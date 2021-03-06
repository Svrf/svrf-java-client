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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets StereoscopicType
 */
@JsonAdapter(StereoscopicType.Adapter.class)
public enum StereoscopicType {
  
  NONE("none"),
  
  TOP_BOTTOM("top-bottom"),
  
  LEFT_RIGHT("left-right");

  private String value;

  StereoscopicType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StereoscopicType fromValue(String text) {
    for (StereoscopicType b : StereoscopicType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StereoscopicType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StereoscopicType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StereoscopicType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StereoscopicType.fromValue(String.valueOf(value));
    }
  }
}

