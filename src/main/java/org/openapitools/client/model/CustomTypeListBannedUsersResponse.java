/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.OcListBannedUsersResponseBannedListInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * CustomTypeListBannedUsersResponse
 */
@JsonPropertyOrder({
  CustomTypeListBannedUsersResponse.JSON_PROPERTY_BANNED_LIST,
  CustomTypeListBannedUsersResponse.JSON_PROPERTY_NEXT
})
@JsonTypeName("customTypeListBannedUsersResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
public class CustomTypeListBannedUsersResponse {
  public static final String JSON_PROPERTY_BANNED_LIST = "banned_list";
  private List<OcListBannedUsersResponseBannedListInner> bannedList = null;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public CustomTypeListBannedUsersResponse() { 
  }

  public CustomTypeListBannedUsersResponse bannedList(List<OcListBannedUsersResponseBannedListInner> bannedList) {
    this.bannedList = bannedList;
    return this;
  }

  public CustomTypeListBannedUsersResponse addBannedListItem(OcListBannedUsersResponseBannedListInner bannedListItem) {
    if (this.bannedList == null) {
      this.bannedList = new ArrayList<>();
    }
    this.bannedList.add(bannedListItem);
    return this;
  }

   /**
   * Get bannedList
   * @return bannedList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANNED_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcListBannedUsersResponseBannedListInner> getBannedList() {
    return bannedList;
  }


  @JsonProperty(JSON_PROPERTY_BANNED_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBannedList(List<OcListBannedUsersResponseBannedListInner> bannedList) {
    this.bannedList = bannedList;
  }


  public CustomTypeListBannedUsersResponse next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(String next) {
    this.next = next;
  }


  /**
   * Return true if this customTypeListBannedUsersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTypeListBannedUsersResponse customTypeListBannedUsersResponse = (CustomTypeListBannedUsersResponse) o;
    return Objects.equals(this.bannedList, customTypeListBannedUsersResponse.bannedList) &&
        Objects.equals(this.next, customTypeListBannedUsersResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bannedList, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTypeListBannedUsersResponse {\n");
    sb.append("    bannedList: ").append(toIndentedString(bannedList)).append("\n");
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

