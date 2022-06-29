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
import org.openapitools.client.model.SBObject;

/**
 * User
 */
@ApiModel(description = "User")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T11:00:21.022543+01:00[Europe/London]")
public class SendBirdUser {
  public static final String SERIALIZED_NAME_REQUIRE_AUTH_FOR_PROFILE_IMAGE = "require_auth_for_profile_image";
  @SerializedName(SERIALIZED_NAME_REQUIRE_AUTH_FOR_PROFILE_IMAGE)
  private Boolean requireAuthForProfileImage;

  public static final String SERIALIZED_NAME_IS_ONLINE = "is_online";
  @SerializedName(SERIALIZED_NAME_IS_ONLINE)
  private Boolean isOnline;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_HAS_EVER_LOGGED_IN = "has_ever_logged_in";
  @SerializedName(SERIALIZED_NAME_HAS_EVER_LOGGED_IN)
  private Boolean hasEverLoggedIn;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_LAST_SEEN_AT = "last_seen_at";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN_AT)
  private Integer lastSeenAt;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_DISCOVERY_KEYS = "discovery_keys";
  @SerializedName(SERIALIZED_NAME_DISCOVERY_KEYS)
  private List<String> discoveryKeys = null;

  public static final String SERIALIZED_NAME_SESSION_TOKENS = "session_tokens";
  @SerializedName(SERIALIZED_NAME_SESSION_TOKENS)
  private List<String> sessionTokens = null;

  public static final String SERIALIZED_NAME_PREFERRED_LANGUAGES = "preferred_languages";
  @SerializedName(SERIALIZED_NAME_PREFERRED_LANGUAGES)
  private List<String> preferredLanguages = null;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profile_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_LOCAL = "local";
  @SerializedName(SERIALIZED_NAME_LOCAL)
  private String local;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_IS_HIDE_ME_FROM_FRIENDS = "is_hide_me_from_friends";
  @SerializedName(SERIALIZED_NAME_IS_HIDE_ME_FROM_FRIENDS)
  private Boolean isHideMeFromFriends;

  public static final String SERIALIZED_NAME_IS_SHADOW_BLOCKED = "is_shadow_blocked";
  @SerializedName(SERIALIZED_NAME_IS_SHADOW_BLOCKED)
  private Boolean isShadowBlocked;

  public static final String SERIALIZED_NAME_IS_CREATED = "is_created";
  @SerializedName(SERIALIZED_NAME_IS_CREATED)
  private Boolean isCreated;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private SBObject metadata;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private BigDecimal endAt;

  public static final String SERIALIZED_NAME_START_AT = "start_at";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private BigDecimal startAt;

  public SendBirdUser() { 
  }

  public SendBirdUser requireAuthForProfileImage(Boolean requireAuthForProfileImage) {
    
    this.requireAuthForProfileImage = requireAuthForProfileImage;
    return this;
  }

   /**
   * Get requireAuthForProfileImage
   * @return requireAuthForProfileImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequireAuthForProfileImage() {
    return requireAuthForProfileImage;
  }


  public void setRequireAuthForProfileImage(Boolean requireAuthForProfileImage) {
    this.requireAuthForProfileImage = requireAuthForProfileImage;
  }


  public SendBirdUser isOnline(Boolean isOnline) {
    
    this.isOnline = isOnline;
    return this;
  }

   /**
   * Get isOnline
   * @return isOnline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOnline() {
    return isOnline;
  }


  public void setIsOnline(Boolean isOnline) {
    this.isOnline = isOnline;
  }


  public SendBirdUser userId(String userId) {
    
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


  public SendBirdUser accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public SendBirdUser hasEverLoggedIn(Boolean hasEverLoggedIn) {
    
    this.hasEverLoggedIn = hasEverLoggedIn;
    return this;
  }

   /**
   * Get hasEverLoggedIn
   * @return hasEverLoggedIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasEverLoggedIn() {
    return hasEverLoggedIn;
  }


  public void setHasEverLoggedIn(Boolean hasEverLoggedIn) {
    this.hasEverLoggedIn = hasEverLoggedIn;
  }


  public SendBirdUser isActive(Boolean isActive) {
    
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


  public SendBirdUser lastSeenAt(Integer lastSeenAt) {
    
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


  public SendBirdUser nickname(String nickname) {
    
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


  public SendBirdUser discoveryKeys(List<String> discoveryKeys) {
    
    this.discoveryKeys = discoveryKeys;
    return this;
  }

  public SendBirdUser addDiscoveryKeysItem(String discoveryKeysItem) {
    if (this.discoveryKeys == null) {
      this.discoveryKeys = new ArrayList<String>();
    }
    this.discoveryKeys.add(discoveryKeysItem);
    return this;
  }

   /**
   * Get discoveryKeys
   * @return discoveryKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDiscoveryKeys() {
    return discoveryKeys;
  }


  public void setDiscoveryKeys(List<String> discoveryKeys) {
    this.discoveryKeys = discoveryKeys;
  }


  public SendBirdUser sessionTokens(List<String> sessionTokens) {
    
    this.sessionTokens = sessionTokens;
    return this;
  }

  public SendBirdUser addSessionTokensItem(String sessionTokensItem) {
    if (this.sessionTokens == null) {
      this.sessionTokens = new ArrayList<String>();
    }
    this.sessionTokens.add(sessionTokensItem);
    return this;
  }

   /**
   * Get sessionTokens
   * @return sessionTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSessionTokens() {
    return sessionTokens;
  }


  public void setSessionTokens(List<String> sessionTokens) {
    this.sessionTokens = sessionTokens;
  }


  public SendBirdUser preferredLanguages(List<String> preferredLanguages) {
    
    this.preferredLanguages = preferredLanguages;
    return this;
  }

  public SendBirdUser addPreferredLanguagesItem(String preferredLanguagesItem) {
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


  public SendBirdUser profileUrl(String profileUrl) {
    
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


  public SendBirdUser createdAt(Integer createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public SendBirdUser phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public SendBirdUser local(String local) {
    
    this.local = local;
    return this;
  }

   /**
   * Get local
   * @return local
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocal() {
    return local;
  }


  public void setLocal(String local) {
    this.local = local;
  }


  public SendBirdUser locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public SendBirdUser isHideMeFromFriends(Boolean isHideMeFromFriends) {
    
    this.isHideMeFromFriends = isHideMeFromFriends;
    return this;
  }

   /**
   * Get isHideMeFromFriends
   * @return isHideMeFromFriends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsHideMeFromFriends() {
    return isHideMeFromFriends;
  }


  public void setIsHideMeFromFriends(Boolean isHideMeFromFriends) {
    this.isHideMeFromFriends = isHideMeFromFriends;
  }


  public SendBirdUser isShadowBlocked(Boolean isShadowBlocked) {
    
    this.isShadowBlocked = isShadowBlocked;
    return this;
  }

   /**
   * Get isShadowBlocked
   * @return isShadowBlocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsShadowBlocked() {
    return isShadowBlocked;
  }


  public void setIsShadowBlocked(Boolean isShadowBlocked) {
    this.isShadowBlocked = isShadowBlocked;
  }


  public SendBirdUser isCreated(Boolean isCreated) {
    
    this.isCreated = isCreated;
    return this;
  }

   /**
   * Get isCreated
   * @return isCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsCreated() {
    return isCreated;
  }


  public void setIsCreated(Boolean isCreated) {
    this.isCreated = isCreated;
  }


  public SendBirdUser metadata(SBObject metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SBObject getMetadata() {
    return metadata;
  }


  public void setMetadata(SBObject metadata) {
    this.metadata = metadata;
  }


  public SendBirdUser description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SendBirdUser endAt(BigDecimal endAt) {
    
    this.endAt = endAt;
    return this;
  }

   /**
   * Get endAt
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getEndAt() {
    return endAt;
  }


  public void setEndAt(BigDecimal endAt) {
    this.endAt = endAt;
  }


  public SendBirdUser startAt(BigDecimal startAt) {
    
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getStartAt() {
    return startAt;
  }


  public void setStartAt(BigDecimal startAt) {
    this.startAt = startAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdUser sendBirdUser = (SendBirdUser) o;
    return Objects.equals(this.requireAuthForProfileImage, sendBirdUser.requireAuthForProfileImage) &&
        Objects.equals(this.isOnline, sendBirdUser.isOnline) &&
        Objects.equals(this.userId, sendBirdUser.userId) &&
        Objects.equals(this.accessToken, sendBirdUser.accessToken) &&
        Objects.equals(this.hasEverLoggedIn, sendBirdUser.hasEverLoggedIn) &&
        Objects.equals(this.isActive, sendBirdUser.isActive) &&
        Objects.equals(this.lastSeenAt, sendBirdUser.lastSeenAt) &&
        Objects.equals(this.nickname, sendBirdUser.nickname) &&
        Objects.equals(this.discoveryKeys, sendBirdUser.discoveryKeys) &&
        Objects.equals(this.sessionTokens, sendBirdUser.sessionTokens) &&
        Objects.equals(this.preferredLanguages, sendBirdUser.preferredLanguages) &&
        Objects.equals(this.profileUrl, sendBirdUser.profileUrl) &&
        Objects.equals(this.createdAt, sendBirdUser.createdAt) &&
        Objects.equals(this.phoneNumber, sendBirdUser.phoneNumber) &&
        Objects.equals(this.local, sendBirdUser.local) &&
        Objects.equals(this.locale, sendBirdUser.locale) &&
        Objects.equals(this.isHideMeFromFriends, sendBirdUser.isHideMeFromFriends) &&
        Objects.equals(this.isShadowBlocked, sendBirdUser.isShadowBlocked) &&
        Objects.equals(this.isCreated, sendBirdUser.isCreated) &&
        Objects.equals(this.metadata, sendBirdUser.metadata) &&
        Objects.equals(this.description, sendBirdUser.description) &&
        Objects.equals(this.endAt, sendBirdUser.endAt) &&
        Objects.equals(this.startAt, sendBirdUser.startAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requireAuthForProfileImage, isOnline, userId, accessToken, hasEverLoggedIn, isActive, lastSeenAt, nickname, discoveryKeys, sessionTokens, preferredLanguages, profileUrl, createdAt, phoneNumber, local, locale, isHideMeFromFriends, isShadowBlocked, isCreated, metadata, description, endAt, startAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdUser {\n");
    sb.append("    requireAuthForProfileImage: ").append(toIndentedString(requireAuthForProfileImage)).append("\n");
    sb.append("    isOnline: ").append(toIndentedString(isOnline)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    hasEverLoggedIn: ").append(toIndentedString(hasEverLoggedIn)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    discoveryKeys: ").append(toIndentedString(discoveryKeys)).append("\n");
    sb.append("    sessionTokens: ").append(toIndentedString(sessionTokens)).append("\n");
    sb.append("    preferredLanguages: ").append(toIndentedString(preferredLanguages)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    isHideMeFromFriends: ").append(toIndentedString(isHideMeFromFriends)).append("\n");
    sb.append("    isShadowBlocked: ").append(toIndentedString(isShadowBlocked)).append("\n");
    sb.append("    isCreated: ").append(toIndentedString(isCreated)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
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

