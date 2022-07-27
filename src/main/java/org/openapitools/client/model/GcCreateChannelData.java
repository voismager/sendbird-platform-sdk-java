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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.sendbird.client.JSON;

/**
 * GcCreateChannelData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class GcCreateChannelData {
  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<String> userIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<String> users = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_COVER_URL = "cover_url";
  @SerializedName(SERIALIZED_NAME_COVER_URL)
  private String coverUrl;

  public static final String SERIALIZED_NAME_COVER_FILE = "cover_file";
  @SerializedName(SERIALIZED_NAME_COVER_FILE)
  private File coverFile;

  public static final String SERIALIZED_NAME_CUSTOM_TYPE = "custom_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TYPE)
  private String customType;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_IS_DISTINCT = "is_distinct";
  @SerializedName(SERIALIZED_NAME_IS_DISTINCT)
  private Boolean isDistinct;

  public static final String SERIALIZED_NAME_IS_PUBLIC = "is_public";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private Boolean isPublic;

  public static final String SERIALIZED_NAME_IS_SUPER = "is_super";
  @SerializedName(SERIALIZED_NAME_IS_SUPER)
  private Boolean isSuper;

  public static final String SERIALIZED_NAME_IS_EPHEMERAL = "is_ephemeral";
  @SerializedName(SERIALIZED_NAME_IS_EPHEMERAL)
  private Boolean isEphemeral;

  public static final String SERIALIZED_NAME_ACCESS_CODE = "access_code";
  @SerializedName(SERIALIZED_NAME_ACCESS_CODE)
  private String accessCode;

  public static final String SERIALIZED_NAME_INVITER_ID = "inviter_id";
  @SerializedName(SERIALIZED_NAME_INVITER_ID)
  private String inviterId;

  public static final String SERIALIZED_NAME_STRICT = "strict";
  @SerializedName(SERIALIZED_NAME_STRICT)
  private Boolean strict;

  public static final String SERIALIZED_NAME_INVITATION_STATUS = "invitation_status";
  @SerializedName(SERIALIZED_NAME_INVITATION_STATUS)
  private Object invitationStatus;

  public static final String SERIALIZED_NAME_HIDDEN_STATUS = "hidden_status";
  @SerializedName(SERIALIZED_NAME_HIDDEN_STATUS)
  private Object hiddenStatus;

  public static final String SERIALIZED_NAME_OPERATOR_IDS = "operator_ids";
  @SerializedName(SERIALIZED_NAME_OPERATOR_IDS)
  private List<String> operatorIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_BLOCK_SDK_USER_CHANNEL_JOIN = "block_sdk_user_channel_join";
  @SerializedName(SERIALIZED_NAME_BLOCK_SDK_USER_CHANNEL_JOIN)
  private Boolean blockSdkUserChannelJoin;

  public GcCreateChannelData() { 
  }

  public GcCreateChannelData userIds(List<String> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public GcCreateChannelData addUserIdsItem(String userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of users to invite to the channel. The maximum number of users to be invited at once is 100. The users below and this property can be used interchangeably.
   * @return userIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more IDs of users to invite to the channel. The maximum number of users to be invited at once is 100. The users below and this property can be used interchangeably.")

  public List<String> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public GcCreateChannelData users(List<String> users) {
    
    this.users = users;
    return this;
  }

  public GcCreateChannelData addUsersItem(String usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of users to invite to the channel. The maximum number of users to be invited at once is 100. The user_ids above and this property can be used interchangeably.
   * @return users
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more IDs of users to invite to the channel. The maximum number of users to be invited at once is 100. The user_ids above and this property can be used interchangeably.")

  public List<String> getUsers() {
    return users;
  }


  public void setUsers(List<String> users) {
    this.users = users;
  }


  public GcCreateChannelData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the channel, or the channel topic. The length is limited to 191 characters. (Default: group channel)
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of the channel, or the channel topic. The length is limited to 191 characters. (Default: group channel)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GcCreateChannelData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel. Only numbers, characters, and underscores are allowed. The length is 4 to 100 characters, inclusive. If not specified, a URL is automatically generated.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel. Only numbers, characters, and underscores are allowed. The length is 4 to 100 characters, inclusive. If not specified, a URL is automatically generated.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcCreateChannelData coverUrl(String coverUrl) {
    
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * Specifies the URL of the cover image for the channel. The length is limited to 2,048 characters.
   * @return coverUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the cover image for the channel. The length is limited to 2,048 characters.")

  public String getCoverUrl() {
    return coverUrl;
  }


  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public GcCreateChannelData coverFile(File coverFile) {
    
    this.coverFile = coverFile;
    return this;
  }

   /**
   * Uploads the cover image file for the channel.
   * @return coverFile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Uploads the cover image file for the channel.")

  public File getCoverFile() {
    return coverFile;
  }


  public void setCoverFile(File coverFile) {
    this.coverFile = coverFile;
  }


  public GcCreateChannelData customType(String customType) {
    
    this.customType = customType;
    return this;
  }

   /**
   * Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.&lt;br /&gt;&lt;br /&gt; Custom types are also used within Sendbird&#39;s [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.
   * @return customType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the custom channel type which is used for channel grouping. The length is limited to 128 characters.<br /><br /> Custom types are also used within Sendbird's [Advanced analytics](/docs/chat/v3/platform-api/guides/advanced-analytics) to segment metrics, which enables the sub-classification of data views.")

  public String getCustomType() {
    return customType;
  }


  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public GcCreateChannelData data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * Specifies additional channel information such as a long description of the channel or &#x60;JSON&#x60; formatted string.
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies additional channel information such as a long description of the channel or `JSON` formatted string.")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public GcCreateChannelData isDistinct(Boolean isDistinct) {
    
    this.isDistinct = isDistinct;
    return this;
  }

   /**
   * Determines whether to reuse an existing channel or create a new channel. If set to true, returns a channel with the same users in the user_ids or users property or creates a new channel if no match is found. Sendbird server can also use the custom channel type in the custom_type property if specified along with the users to return the corresponding channel. If set to false, Sendbird server always creates a new channel with a combination of the users as well as the channel custom type if specified. (Default: false)&lt;br /&gt;&lt;br /&gt; Under this property, Sendbird server does not distinguish channels based on other properties such as channel URL or channel name.
   * @return isDistinct
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to reuse an existing channel or create a new channel. If set to true, returns a channel with the same users in the user_ids or users property or creates a new channel if no match is found. Sendbird server can also use the custom channel type in the custom_type property if specified along with the users to return the corresponding channel. If set to false, Sendbird server always creates a new channel with a combination of the users as well as the channel custom type if specified. (Default: false)<br /><br /> Under this property, Sendbird server does not distinguish channels based on other properties such as channel URL or channel name.")

  public Boolean getIsDistinct() {
    return isDistinct;
  }


  public void setIsDistinct(Boolean isDistinct) {
    this.isDistinct = isDistinct;
  }


  public GcCreateChannelData isPublic(Boolean isPublic) {
    
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Determines whether to allow a user to join the channel without an invitation. (Default: false)
   * @return isPublic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to allow a user to join the channel without an invitation. (Default: false)")

  public Boolean getIsPublic() {
    return isPublic;
  }


  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public GcCreateChannelData isSuper(Boolean isSuper) {
    
    this.isSuper = isSuper;
    return this;
  }

   /**
   * Determines whether to allow the channel to accommodate more than 2,000 members. (Default: false) &lt;br/&gt;&lt;br/&gt; Supergroup channels are not supported with the is_distinct property and the property is false by default.
   * @return isSuper
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to allow the channel to accommodate more than 2,000 members. (Default: false) <br/><br/> Supergroup channels are not supported with the is_distinct property and the property is false by default.")

  public Boolean getIsSuper() {
    return isSuper;
  }


  public void setIsSuper(Boolean isSuper) {
    this.isSuper = isSuper;
  }


  public GcCreateChannelData isEphemeral(Boolean isEphemeral) {
    
    this.isEphemeral = isEphemeral;
    return this;
  }

   /**
   * Determines whether to preserve the messages in the channel for the purpose of retrieving chat history. (Default: false)
   * @return isEphemeral
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to preserve the messages in the channel for the purpose of retrieving chat history. (Default: false)")

  public Boolean getIsEphemeral() {
    return isEphemeral;
  }


  public void setIsEphemeral(Boolean isEphemeral) {
    this.isEphemeral = isEphemeral;
  }


  public GcCreateChannelData accessCode(String accessCode) {
    
    this.accessCode = accessCode;
    return this;
  }

   /**
   * This parameter can only be used when the channel operator creates a public group channel. They can set an access code for the corresponding type of channel. The channel then requires the specified access code to a user who attempts to join. If specified, the is_access_code_required property of the channel resource is set to true.
   * @return accessCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This parameter can only be used when the channel operator creates a public group channel. They can set an access code for the corresponding type of channel. The channel then requires the specified access code to a user who attempts to join. If specified, the is_access_code_required property of the channel resource is set to true.")

  public String getAccessCode() {
    return accessCode;
  }


  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  public GcCreateChannelData inviterId(String inviterId) {
    
    this.inviterId = inviterId;
    return this;
  }

   /**
   * Specifies the ID of the user who has invited other users as members of the channel. The inviter is not automatically registered to the channel as a member, so you should specify the ID of the inviter in the user_ids property below if needed.
   * @return inviterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the user who has invited other users as members of the channel. The inviter is not automatically registered to the channel as a member, so you should specify the ID of the inviter in the user_ids property below if needed.")

  public String getInviterId() {
    return inviterId;
  }


  public void setInviterId(String inviterId) {
    this.inviterId = inviterId;
  }


  public GcCreateChannelData strict(Boolean strict) {
    
    this.strict = strict;
    return this;
  }

   /**
   * Determines whether to receive a &#x60;400111&#x60; error and cease channel creation when there is at least one non-existing user in the specified user_ids or users property above. If set to false, the channel will be created excluding the non-existing users without receiving the mentioned error. (Default: false)
   * @return strict
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to receive a `400111` error and cease channel creation when there is at least one non-existing user in the specified user_ids or users property above. If set to false, the channel will be created excluding the non-existing users without receiving the mentioned error. (Default: false)")

  public Boolean getStrict() {
    return strict;
  }


  public void setStrict(Boolean strict) {
    this.strict = strict;
  }


  public GcCreateChannelData invitationStatus(Object invitationStatus) {
    
    this.invitationStatus = invitationStatus;
    return this;
  }

   /**
   * Specifies one or more key-value pair items which set the invitation status of each user invited to the channel. The key should be a user_id and the value should be their joining status. Acceptable values are joined, invited_by_friend, and invited_by_non_friend. (Default: joined)
   * @return invitationStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies one or more key-value pair items which set the invitation status of each user invited to the channel. The key should be a user_id and the value should be their joining status. Acceptable values are joined, invited_by_friend, and invited_by_non_friend. (Default: joined)")

  public Object getInvitationStatus() {
    return invitationStatus;
  }


  public void setInvitationStatus(Object invitationStatus) {
    this.invitationStatus = invitationStatus;
  }


  public GcCreateChannelData hiddenStatus(Object hiddenStatus) {
    
    this.hiddenStatus = hiddenStatus;
    return this;
  }

   /**
   * Specifies one or more key-value pair items which set the channel&#39;s hidden status for each user. The key should be a user_id and the value should be their hidden status. Acceptable values are limited to the following:&lt;br /&gt;- unhidden (default): the channel is included in when retrieving a list of group channels.&lt;br /&gt;- hidden_allow_auto_unhide: the channel automatically gets unhidden when receiving a new message.&lt;br /&gt;- hidden_prevent_auto_unhide: the channel keeps hidden though receiving a new message.
   * @return hiddenStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies one or more key-value pair items which set the channel's hidden status for each user. The key should be a user_id and the value should be their hidden status. Acceptable values are limited to the following:<br />- unhidden (default): the channel is included in when retrieving a list of group channels.<br />- hidden_allow_auto_unhide: the channel automatically gets unhidden when receiving a new message.<br />- hidden_prevent_auto_unhide: the channel keeps hidden though receiving a new message.")

  public Object getHiddenStatus() {
    return hiddenStatus;
  }


  public void setHiddenStatus(Object hiddenStatus) {
    this.hiddenStatus = hiddenStatus;
  }


  public GcCreateChannelData operatorIds(List<String> operatorIds) {
    
    this.operatorIds = operatorIds;
    return this;
  }

  public GcCreateChannelData addOperatorIdsItem(String operatorIdsItem) {
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * Specifies an array of one or more IDs of users to register as operators of the channel. You should also include these IDs in the user_ids property to invite them to the channel as members. They can delete any messages in the channel, and also view all messages without any filtering or throttling. The maximum allowed number of operators per channel is 100.
   * @return operatorIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of one or more IDs of users to register as operators of the channel. You should also include these IDs in the user_ids property to invite them to the channel as members. They can delete any messages in the channel, and also view all messages without any filtering or throttling. The maximum allowed number of operators per channel is 100.")

  public List<String> getOperatorIds() {
    return operatorIds;
  }


  public void setOperatorIds(List<String> operatorIds) {
    this.operatorIds = operatorIds;
  }


  public GcCreateChannelData blockSdkUserChannelJoin(Boolean blockSdkUserChannelJoin) {
    
    this.blockSdkUserChannelJoin = blockSdkUserChannelJoin;
    return this;
  }

   /**
   * Determines whether to block users from joining the channel through the Chat SDK. This parameter can be used in order to restrict the ways for users to join the channel, and only using the [join a channel](#2-join-a-channel) action can add a user to the channel. (Default: false)
   * @return blockSdkUserChannelJoin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines whether to block users from joining the channel through the Chat SDK. This parameter can be used in order to restrict the ways for users to join the channel, and only using the [join a channel](#2-join-a-channel) action can add a user to the channel. (Default: false)")

  public Boolean getBlockSdkUserChannelJoin() {
    return blockSdkUserChannelJoin;
  }


  public void setBlockSdkUserChannelJoin(Boolean blockSdkUserChannelJoin) {
    this.blockSdkUserChannelJoin = blockSdkUserChannelJoin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcCreateChannelData gcCreateChannelData = (GcCreateChannelData) o;
    return Objects.equals(this.userIds, gcCreateChannelData.userIds) &&
        Objects.equals(this.users, gcCreateChannelData.users) &&
        Objects.equals(this.name, gcCreateChannelData.name) &&
        Objects.equals(this.channelUrl, gcCreateChannelData.channelUrl) &&
        Objects.equals(this.coverUrl, gcCreateChannelData.coverUrl) &&
        Objects.equals(this.coverFile, gcCreateChannelData.coverFile) &&
        Objects.equals(this.customType, gcCreateChannelData.customType) &&
        Objects.equals(this.data, gcCreateChannelData.data) &&
        Objects.equals(this.isDistinct, gcCreateChannelData.isDistinct) &&
        Objects.equals(this.isPublic, gcCreateChannelData.isPublic) &&
        Objects.equals(this.isSuper, gcCreateChannelData.isSuper) &&
        Objects.equals(this.isEphemeral, gcCreateChannelData.isEphemeral) &&
        Objects.equals(this.accessCode, gcCreateChannelData.accessCode) &&
        Objects.equals(this.inviterId, gcCreateChannelData.inviterId) &&
        Objects.equals(this.strict, gcCreateChannelData.strict) &&
        Objects.equals(this.invitationStatus, gcCreateChannelData.invitationStatus) &&
        Objects.equals(this.hiddenStatus, gcCreateChannelData.hiddenStatus) &&
        Objects.equals(this.operatorIds, gcCreateChannelData.operatorIds) &&
        Objects.equals(this.blockSdkUserChannelJoin, gcCreateChannelData.blockSdkUserChannelJoin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds, users, name, channelUrl, coverUrl, coverFile, customType, data, isDistinct, isPublic, isSuper, isEphemeral, accessCode, inviterId, strict, invitationStatus, hiddenStatus, operatorIds, blockSdkUserChannelJoin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcCreateChannelData {\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    coverFile: ").append(toIndentedString(coverFile)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isDistinct: ").append(toIndentedString(isDistinct)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    isSuper: ").append(toIndentedString(isSuper)).append("\n");
    sb.append("    isEphemeral: ").append(toIndentedString(isEphemeral)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    inviterId: ").append(toIndentedString(inviterId)).append("\n");
    sb.append("    strict: ").append(toIndentedString(strict)).append("\n");
    sb.append("    invitationStatus: ").append(toIndentedString(invitationStatus)).append("\n");
    sb.append("    hiddenStatus: ").append(toIndentedString(hiddenStatus)).append("\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
    sb.append("    blockSdkUserChannelJoin: ").append(toIndentedString(blockSdkUserChannelJoin)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("user_ids");
    openapiFields.add("users");
    openapiFields.add("name");
    openapiFields.add("channel_url");
    openapiFields.add("cover_url");
    openapiFields.add("cover_file");
    openapiFields.add("custom_type");
    openapiFields.add("data");
    openapiFields.add("is_distinct");
    openapiFields.add("is_public");
    openapiFields.add("is_super");
    openapiFields.add("is_ephemeral");
    openapiFields.add("access_code");
    openapiFields.add("inviter_id");
    openapiFields.add("strict");
    openapiFields.add("invitation_status");
    openapiFields.add("hidden_status");
    openapiFields.add("operator_ids");
    openapiFields.add("block_sdk_user_channel_join");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_ids");
    openapiRequiredFields.add("users");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("channel_url");
    openapiRequiredFields.add("cover_url");
    openapiRequiredFields.add("cover_file");
    openapiRequiredFields.add("custom_type");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("is_distinct");
    openapiRequiredFields.add("is_public");
    openapiRequiredFields.add("is_super");
    openapiRequiredFields.add("is_ephemeral");
    openapiRequiredFields.add("access_code");
    openapiRequiredFields.add("inviter_id");
    openapiRequiredFields.add("strict");
    openapiRequiredFields.add("invitation_status");
    openapiRequiredFields.add("hidden_status");
    openapiRequiredFields.add("operator_ids");
    openapiRequiredFields.add("block_sdk_user_channel_join");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GcCreateChannelData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GcCreateChannelData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GcCreateChannelData is not found in the empty JSON string", GcCreateChannelData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GcCreateChannelData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GcCreateChannelData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GcCreateChannelData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("user_ids") != null && !jsonObj.get("user_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_ids` to be an array in the JSON string but got `%s`", jsonObj.get("user_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("channel_url") != null && !jsonObj.get("channel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_url").toString()));
      }
      if (jsonObj.get("cover_url") != null && !jsonObj.get("cover_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cover_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cover_url").toString()));
      }
      if (jsonObj.get("custom_type") != null && !jsonObj.get("custom_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_type").toString()));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if (jsonObj.get("access_code") != null && !jsonObj.get("access_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_code").toString()));
      }
      if (jsonObj.get("inviter_id") != null && !jsonObj.get("inviter_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inviter_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inviter_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("operator_ids") != null && !jsonObj.get("operator_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator_ids` to be an array in the JSON string but got `%s`", jsonObj.get("operator_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GcCreateChannelData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GcCreateChannelData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GcCreateChannelData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GcCreateChannelData.class));

       return (TypeAdapter<T>) new TypeAdapter<GcCreateChannelData>() {
           @Override
           public void write(JsonWriter out, GcCreateChannelData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GcCreateChannelData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GcCreateChannelData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GcCreateChannelData
  * @throws IOException if the JSON string is invalid with respect to GcCreateChannelData
  */
  public static GcCreateChannelData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GcCreateChannelData.class);
  }

 /**
  * Convert an instance of GcCreateChannelData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

