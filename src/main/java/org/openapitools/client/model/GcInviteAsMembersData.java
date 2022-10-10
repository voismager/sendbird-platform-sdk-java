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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GcInviteAsMembersData
 */
@JsonPropertyOrder({
  GcInviteAsMembersData.JSON_PROPERTY_CHANNEL_URL,
  GcInviteAsMembersData.JSON_PROPERTY_USER_IDS,
  GcInviteAsMembersData.JSON_PROPERTY_USERS,
  GcInviteAsMembersData.JSON_PROPERTY_INVITATION_STATUS,
  GcInviteAsMembersData.JSON_PROPERTY_HIDDEN_STATUS
})
@JsonTypeName("gcInviteAsMembersData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-10T12:34:59.419016+01:00[Europe/London]")
public class GcInviteAsMembersData {
  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_USER_IDS = "user_ids";
  private List<String> userIds = new ArrayList<>();

  public static final String JSON_PROPERTY_USERS = "users";
  private List<String> users = new ArrayList<>();

  public static final String JSON_PROPERTY_INVITATION_STATUS = "invitation_status";
  private Object invitationStatus;

  public static final String JSON_PROPERTY_HIDDEN_STATUS = "hidden_status";
  private Object hiddenStatus;

  public GcInviteAsMembersData() { 
  }

  public GcInviteAsMembersData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to invite into.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to invite into.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcInviteAsMembersData userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public GcInviteAsMembersData addUserIdsItem(String userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more user IDs to invite into the channel. The maximum number of users to be invited at once is 100. The users can be used instead of this property.
   * @return userIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more user IDs to invite into the channel. The maximum number of users to be invited at once is 100. The users can be used instead of this property.")
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getUserIds() {
    return userIds;
  }


  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public GcInviteAsMembersData users(List<String> users) {
    this.users = users;
    return this;
  }

  public GcInviteAsMembersData addUsersItem(String usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * Specifies a list of one or more &#x60;JSON&#x60; objects which contain the user_id property to invite into the channel. The maximum number of users to be invited at once is 100. The user_ids can be used instead of this property.
   * @return users
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a list of one or more `JSON` objects which contain the user_id property to invite into the channel. The maximum number of users to be invited at once is 100. The user_ids can be used instead of this property.")
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsers(List<String> users) {
    this.users = users;
  }


  public GcInviteAsMembersData invitationStatus(Object invitationStatus) {
    this.invitationStatus = invitationStatus;
    return this;
  }

   /**
   * Specifies one or more key-value pair items which set the invitation status of each user invited to the channel. The key should be a user_id and the value should be their joining status. Acceptable values are joined, invited_by_friend, and invited_by_non_friend. (Default: joined)
   * @return invitationStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies one or more key-value pair items which set the invitation status of each user invited to the channel. The key should be a user_id and the value should be their joining status. Acceptable values are joined, invited_by_friend, and invited_by_non_friend. (Default: joined)")
  @JsonProperty(JSON_PROPERTY_INVITATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getInvitationStatus() {
    return invitationStatus;
  }


  @JsonProperty(JSON_PROPERTY_INVITATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvitationStatus(Object invitationStatus) {
    this.invitationStatus = invitationStatus;
  }


  public GcInviteAsMembersData hiddenStatus(Object hiddenStatus) {
    this.hiddenStatus = hiddenStatus;
    return this;
  }

   /**
   * Specifies one or more key-value pair items which set the channel&#39;s hidden status for each user. The key should be a user_id and the value should be their hidden status. Acceptable values are limited to the following:&lt;br /&gt;- unhidden (default): the channel is included in when retrieving a list of group channels.&lt;br /&gt;- hidden_allow_auto_unhide: the channel automatically gets unhidden when receiving a new message.&lt;br /&gt;- hidden_prevent_auto_unhide: the channel keeps hidden though receiving a new message.
   * @return hiddenStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies one or more key-value pair items which set the channel's hidden status for each user. The key should be a user_id and the value should be their hidden status. Acceptable values are limited to the following:<br />- unhidden (default): the channel is included in when retrieving a list of group channels.<br />- hidden_allow_auto_unhide: the channel automatically gets unhidden when receiving a new message.<br />- hidden_prevent_auto_unhide: the channel keeps hidden though receiving a new message.")
  @JsonProperty(JSON_PROPERTY_HIDDEN_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getHiddenStatus() {
    return hiddenStatus;
  }


  @JsonProperty(JSON_PROPERTY_HIDDEN_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHiddenStatus(Object hiddenStatus) {
    this.hiddenStatus = hiddenStatus;
  }


  /**
   * Return true if this gcInviteAsMembersData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcInviteAsMembersData gcInviteAsMembersData = (GcInviteAsMembersData) o;
    return Objects.equals(this.channelUrl, gcInviteAsMembersData.channelUrl) &&
        Objects.equals(this.userIds, gcInviteAsMembersData.userIds) &&
        Objects.equals(this.users, gcInviteAsMembersData.users) &&
        Objects.equals(this.invitationStatus, gcInviteAsMembersData.invitationStatus) &&
        Objects.equals(this.hiddenStatus, gcInviteAsMembersData.hiddenStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, userIds, users, invitationStatus, hiddenStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcInviteAsMembersData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    invitationStatus: ").append(toIndentedString(invitationStatus)).append("\n");
    sb.append("    hiddenStatus: ").append(toIndentedString(hiddenStatus)).append("\n");
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

