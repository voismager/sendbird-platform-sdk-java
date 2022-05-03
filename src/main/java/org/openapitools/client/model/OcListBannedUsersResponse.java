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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.OcListBannedUsersResponseBannedList;

/**
 * OcListBannedUsersResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class OcListBannedUsersResponse {
  public static final String SERIALIZED_NAME_BANNED_LIST = "banned_list";
  @SerializedName(SERIALIZED_NAME_BANNED_LIST)
  private List<OcListBannedUsersResponseBannedList> bannedList = null;

  public static final String SERIALIZED_NAME_TOTAL_BAN_COUNT = "total_ban_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_BAN_COUNT)
  private BigDecimal totalBanCount;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public OcListBannedUsersResponse() { 
  }

  public OcListBannedUsersResponse bannedList(List<OcListBannedUsersResponseBannedList> bannedList) {
    
    this.bannedList = bannedList;
    return this;
  }

  public OcListBannedUsersResponse addBannedListItem(OcListBannedUsersResponseBannedList bannedListItem) {
    if (this.bannedList == null) {
      this.bannedList = new ArrayList<OcListBannedUsersResponseBannedList>();
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

  public List<OcListBannedUsersResponseBannedList> getBannedList() {
    return bannedList;
  }


  public void setBannedList(List<OcListBannedUsersResponseBannedList> bannedList) {
    this.bannedList = bannedList;
  }


  public OcListBannedUsersResponse totalBanCount(BigDecimal totalBanCount) {
    
    this.totalBanCount = totalBanCount;
    return this;
  }

   /**
   * Get totalBanCount
   * @return totalBanCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTotalBanCount() {
    return totalBanCount;
  }


  public void setTotalBanCount(BigDecimal totalBanCount) {
    this.totalBanCount = totalBanCount;
  }


  public OcListBannedUsersResponse next(String next) {
    
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
    OcListBannedUsersResponse ocListBannedUsersResponse = (OcListBannedUsersResponse) o;
    return Objects.equals(this.bannedList, ocListBannedUsersResponse.bannedList) &&
        Objects.equals(this.totalBanCount, ocListBannedUsersResponse.totalBanCount) &&
        Objects.equals(this.next, ocListBannedUsersResponse.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bannedList, totalBanCount, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcListBannedUsersResponse {\n");
    sb.append("    bannedList: ").append(toIndentedString(bannedList)).append("\n");
    sb.append("    totalBanCount: ").append(toIndentedString(totalBanCount)).append("\n");
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

