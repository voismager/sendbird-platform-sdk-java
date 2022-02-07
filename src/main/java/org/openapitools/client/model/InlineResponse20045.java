/*
 * Sendbird Platform SDK
 * Sendbird Platform API Javascript SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20045
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class InlineResponse20045 {
  public static final String SERIALIZED_NAME_ANNOUNCEMENT_GROUP = "announcement_group";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENT_GROUP)
  private List<String> announcementGroup = null;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public InlineResponse20045() { 
  }

  public InlineResponse20045 announcementGroup(List<String> announcementGroup) {
    
    this.announcementGroup = announcementGroup;
    return this;
  }

  public InlineResponse20045 addAnnouncementGroupItem(String announcementGroupItem) {
    if (this.announcementGroup == null) {
      this.announcementGroup = new ArrayList<String>();
    }
    this.announcementGroup.add(announcementGroupItem);
    return this;
  }

   /**
   * Get announcementGroup
   * @return announcementGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAnnouncementGroup() {
    return announcementGroup;
  }


  public void setAnnouncementGroup(List<String> announcementGroup) {
    this.announcementGroup = announcementGroup;
  }


  public InlineResponse20045 next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20045 inlineResponse20045 = (InlineResponse20045) o;
    return Objects.equals(this.announcementGroup, inlineResponse20045.announcementGroup) &&
        Objects.equals(this.next, inlineResponse20045.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(announcementGroup, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20045 {\n");
    sb.append("    announcementGroup: ").append(toIndentedString(announcementGroup)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

