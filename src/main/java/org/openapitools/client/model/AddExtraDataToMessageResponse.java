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
import org.openapitools.client.model.ListMessagesResponseSortedMetaarray;

/**
 * AddExtraDataToMessageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class AddExtraDataToMessageResponse {
  public static final String SERIALIZED_NAME_SORTED_METAARRAY = "sorted_metaarray";
  @SerializedName(SERIALIZED_NAME_SORTED_METAARRAY)
  private List<ListMessagesResponseSortedMetaarray> sortedMetaarray = null;

  public AddExtraDataToMessageResponse() { 
  }

  public AddExtraDataToMessageResponse sortedMetaarray(List<ListMessagesResponseSortedMetaarray> sortedMetaarray) {
    
    this.sortedMetaarray = sortedMetaarray;
    return this;
  }

  public AddExtraDataToMessageResponse addSortedMetaarrayItem(ListMessagesResponseSortedMetaarray sortedMetaarrayItem) {
    if (this.sortedMetaarray == null) {
      this.sortedMetaarray = new ArrayList<ListMessagesResponseSortedMetaarray>();
    }
    this.sortedMetaarray.add(sortedMetaarrayItem);
    return this;
  }

   /**
   * Get sortedMetaarray
   * @return sortedMetaarray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ListMessagesResponseSortedMetaarray> getSortedMetaarray() {
    return sortedMetaarray;
  }


  public void setSortedMetaarray(List<ListMessagesResponseSortedMetaarray> sortedMetaarray) {
    this.sortedMetaarray = sortedMetaarray;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddExtraDataToMessageResponse addExtraDataToMessageResponse = (AddExtraDataToMessageResponse) o;
    return Objects.equals(this.sortedMetaarray, addExtraDataToMessageResponse.sortedMetaarray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortedMetaarray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddExtraDataToMessageResponse {\n");
    sb.append("    sortedMetaarray: ").append(toIndentedString(sortedMetaarray)).append("\n");
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

