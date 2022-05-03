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
 * GcInviteAsMembersData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T07:39:00.941714+01:00[Europe/London]")
public class GcInviteAsMembersData {
  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<Integer> userIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<Integer> users = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_INVITATION_STATUS = "invitation_status";
  @SerializedName(SERIALIZED_NAME_INVITATION_STATUS)
  private List<String> invitationStatus = new ArrayList<String>();

  public static final String SERIALIZED_NAME_HIDDEN_STATUS = "hidden_status";
  @SerializedName(SERIALIZED_NAME_HIDDEN_STATUS)
  private List<String> hiddenStatus = new ArrayList<String>();

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

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcInviteAsMembersData userIds(List<Integer> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public GcInviteAsMembersData addUserIdsItem(Integer userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more user IDs to invite into the channel. The maximum number of users to be invited at once is 100. The users can be used instead of this property.
   * @return userIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more user IDs to invite into the channel. The maximum number of users to be invited at once is 100. The users can be used instead of this property.")

  public List<Integer> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<Integer> userIds) {
    this.userIds = userIds;
  }


  public GcInviteAsMembersData users(List<Integer> users) {
    
    this.users = users;
    return this;
  }

  public GcInviteAsMembersData addUsersItem(Integer usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * Specifies a list of one or more &#x60;JSON&#x60; objects which contain the user_id property to invite into the channel. The maximum number of users to be invited at once is 100. The user_ids can be used instead of this property.
   * @return users
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a list of one or more `JSON` objects which contain the user_id property to invite into the channel. The maximum number of users to be invited at once is 100. The user_ids can be used instead of this property.")

  public List<Integer> getUsers() {
    return users;
  }


  public void setUsers(List<Integer> users) {
    this.users = users;
  }


  public GcInviteAsMembersData invitationStatus(List<String> invitationStatus) {
    
    this.invitationStatus = invitationStatus;
    return this;
  }

  public GcInviteAsMembersData addInvitationStatusItem(String invitationStatusItem) {
    this.invitationStatus.add(invitationStatusItem);
    return this;
  }

   /**
   * Specifies an array of one or more information about the join status of each invited user to the channel. Each item of the array should be specified with a combination of the unique ID of a user in the user_ids or users property, a colon (:), and the user&#39;s join status (for example, user_id_1: join status). Acceptable values are joined, invited_by_friend, and invited_by_non_friend. (Default: joined)
   * @return invitationStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more information about the join status of each invited user to the channel. Each item of the array should be specified with a combination of the unique ID of a user in the user_ids or users property, a colon (:), and the user's join status (for example, user_id_1: join status). Acceptable values are joined, invited_by_friend, and invited_by_non_friend. (Default: joined)")

  public List<String> getInvitationStatus() {
    return invitationStatus;
  }


  public void setInvitationStatus(List<String> invitationStatus) {
    this.invitationStatus = invitationStatus;
  }


  public GcInviteAsMembersData hiddenStatus(List<String> hiddenStatus) {
    
    this.hiddenStatus = hiddenStatus;
    return this;
  }

  public GcInviteAsMembersData addHiddenStatusItem(String hiddenStatusItem) {
    this.hiddenStatus.add(hiddenStatusItem);
    return this;
  }

   /**
   * Specifies an array of one or more channel hidden statuses about whether to hide the channel from each invited user&#39;s list of group channels, and whether to automatically unhide the hidden channel when receiving a new message from other member of that channel. Each item of the array should be specified with a combination of the unique ID of a user in the user_ids or users property, a colon (:), and the channel hidden status (for example, user_id_1: channel hidden status). Acceptable values are limited to the following:&lt;br /&gt;- unhidden (default): the channel is included in when retrieving a list of group channels.&lt;br /&gt;- hidden_allow_auto_unhide: the channel automatically gets unhidden when receiving a new message.&lt;br /&gt;- hidden_prevent_auto_unhide: the channel keeps hidden though receiving a new message.
   * @return hiddenStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more channel hidden statuses about whether to hide the channel from each invited user's list of group channels, and whether to automatically unhide the hidden channel when receiving a new message from other member of that channel. Each item of the array should be specified with a combination of the unique ID of a user in the user_ids or users property, a colon (:), and the channel hidden status (for example, user_id_1: channel hidden status). Acceptable values are limited to the following:<br />- unhidden (default): the channel is included in when retrieving a list of group channels.<br />- hidden_allow_auto_unhide: the channel automatically gets unhidden when receiving a new message.<br />- hidden_prevent_auto_unhide: the channel keeps hidden though receiving a new message.")

  public List<String> getHiddenStatus() {
    return hiddenStatus;
  }


  public void setHiddenStatus(List<String> hiddenStatus) {
    this.hiddenStatus = hiddenStatus;
  }


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

