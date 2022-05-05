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
import org.openapitools.client.model.SBObject;

/**
 * SendBirdSender
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-05T15:12:57.551715+01:00[Europe/London]")
public class SendBirdSender {
  public static final String SERIALIZED_NAME_CONNECTION_STATUS = "connection_status";
  @SerializedName(SERIALIZED_NAME_CONNECTION_STATUS)
  private String connectionStatus;

  public static final String SERIALIZED_NAME_FRIEND_DISCOVERY_KEY = "friend_discovery_key";
  @SerializedName(SERIALIZED_NAME_FRIEND_DISCOVERY_KEY)
  private String friendDiscoveryKey;

  public static final String SERIALIZED_NAME_FRIEND_NAME = "friend_name";
  @SerializedName(SERIALIZED_NAME_FRIEND_NAME)
  private String friendName;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_BLOCKED_BY_ME = "is_blocked_by_me";
  @SerializedName(SERIALIZED_NAME_IS_BLOCKED_BY_ME)
  private Boolean isBlockedByMe;

  public static final String SERIALIZED_NAME_LAST_SEEN_AT = "last_seen_at";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN_AT)
  private Integer lastSeenAt;

  public static final String SERIALIZED_NAME_META_DATA = "meta_data";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private SBObject metaData;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_PLAIN_PROFILE_URL = "plain_profile_url";
  @SerializedName(SERIALIZED_NAME_PLAIN_PROFILE_URL)
  private String plainProfileUrl;

  public static final String SERIALIZED_NAME_PREFERRED_LANGUAGES = "preferred_languages";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LANGUAGES)
  private List<String> preferredLanguages = null;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profile_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public static final String SERIALIZED_NAME_REQUIRE_AUTH = "require_auth";
  @SerializedName(SERIALIZED_NAME_REQUIRE_AUTH)
  private Boolean requireAuth;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public SendBirdSender() { 
  }

  public SendBirdSender connectionStatus(String connectionStatus) {
    
    this.connectionStatus = connectionStatus;
    return this;
  }

   /**
   * Get connectionStatus
   * @return connectionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectionStatus() {
    return connectionStatus;
  }


  public void setConnectionStatus(String connectionStatus) {
    this.connectionStatus = connectionStatus;
  }


  public SendBirdSender friendDiscoveryKey(String friendDiscoveryKey) {
    
    this.friendDiscoveryKey = friendDiscoveryKey;
    return this;
  }

   /**
   * Get friendDiscoveryKey
   * @return friendDiscoveryKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFriendDiscoveryKey() {
    return friendDiscoveryKey;
  }


  public void setFriendDiscoveryKey(String friendDiscoveryKey) {
    this.friendDiscoveryKey = friendDiscoveryKey;
  }


  public SendBirdSender friendName(String friendName) {
    
    this.friendName = friendName;
    return this;
  }

   /**
   * Get friendName
   * @return friendName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFriendName() {
    return friendName;
  }


  public void setFriendName(String friendName) {
    this.friendName = friendName;
  }


  public SendBirdSender isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public SendBirdSender isBlockedByMe(Boolean isBlockedByMe) {
    
    this.isBlockedByMe = isBlockedByMe;
    return this;
  }

   /**
   * Get isBlockedByMe
   * @return isBlockedByMe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsBlockedByMe() {
    return isBlockedByMe;
  }


  public void setIsBlockedByMe(Boolean isBlockedByMe) {
    this.isBlockedByMe = isBlockedByMe;
  }


  public SendBirdSender lastSeenAt(Integer lastSeenAt) {
    
    this.lastSeenAt = lastSeenAt;
    return this;
  }

   /**
   * Get lastSeenAt
   * @return lastSeenAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLastSeenAt() {
    return lastSeenAt;
  }


  public void setLastSeenAt(Integer lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
  }


  public SendBirdSender metaData(SBObject metaData) {
    
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SBObject getMetaData() {
    return metaData;
  }


  public void setMetaData(SBObject metaData) {
    this.metaData = metaData;
  }


  public SendBirdSender nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public SendBirdSender plainProfileUrl(String plainProfileUrl) {
    
    this.plainProfileUrl = plainProfileUrl;
    return this;
  }

   /**
   * Get plainProfileUrl
   * @return plainProfileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlainProfileUrl() {
    return plainProfileUrl;
  }


  public void setPlainProfileUrl(String plainProfileUrl) {
    this.plainProfileUrl = plainProfileUrl;
  }


  public SendBirdSender preferredLanguages(List<String> preferredLanguages) {
    
    this.preferredLanguages = preferredLanguages;
    return this;
  }

  public SendBirdSender addPreferredLanguagesItem(String preferredLanguagesItem) {
    if (this.preferredLanguages == null) {
      this.preferredLanguages = new ArrayList<String>();
    }
    this.preferredLanguages.add(preferredLanguagesItem);
    return this;
  }

   /**
   * Get preferredLanguages
   * @return preferredLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPreferredLanguages() {
    return preferredLanguages;
  }


  public void setPreferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
  }


  public SendBirdSender profileUrl(String profileUrl) {
    
    this.profileUrl = profileUrl;
    return this;
  }

   /**
   * Get profileUrl
   * @return profileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfileUrl() {
    return profileUrl;
  }


  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public SendBirdSender requireAuth(Boolean requireAuth) {
    
    this.requireAuth = requireAuth;
    return this;
  }

   /**
   * Get requireAuth
   * @return requireAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequireAuth() {
    return requireAuth;
  }


  public void setRequireAuth(Boolean requireAuth) {
    this.requireAuth = requireAuth;
  }


  public SendBirdSender userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdSender sendBirdSender = (SendBirdSender) o;
    return Objects.equals(this.connectionStatus, sendBirdSender.connectionStatus) &&
        Objects.equals(this.friendDiscoveryKey, sendBirdSender.friendDiscoveryKey) &&
        Objects.equals(this.friendName, sendBirdSender.friendName) &&
        Objects.equals(this.isActive, sendBirdSender.isActive) &&
        Objects.equals(this.isBlockedByMe, sendBirdSender.isBlockedByMe) &&
        Objects.equals(this.lastSeenAt, sendBirdSender.lastSeenAt) &&
        Objects.equals(this.metaData, sendBirdSender.metaData) &&
        Objects.equals(this.nickname, sendBirdSender.nickname) &&
        Objects.equals(this.plainProfileUrl, sendBirdSender.plainProfileUrl) &&
        Objects.equals(this.preferredLanguages, sendBirdSender.preferredLanguages) &&
        Objects.equals(this.profileUrl, sendBirdSender.profileUrl) &&
        Objects.equals(this.requireAuth, sendBirdSender.requireAuth) &&
        Objects.equals(this.userId, sendBirdSender.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionStatus, friendDiscoveryKey, friendName, isActive, isBlockedByMe, lastSeenAt, metaData, nickname, plainProfileUrl, preferredLanguages, profileUrl, requireAuth, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdSender {\n");
    sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
    sb.append("    friendDiscoveryKey: ").append(toIndentedString(friendDiscoveryKey)).append("\n");
    sb.append("    friendName: ").append(toIndentedString(friendName)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isBlockedByMe: ").append(toIndentedString(isBlockedByMe)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    plainProfileUrl: ").append(toIndentedString(plainProfileUrl)).append("\n");
    sb.append("    preferredLanguages: ").append(toIndentedString(preferredLanguages)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    requireAuth: ").append(toIndentedString(requireAuth)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

