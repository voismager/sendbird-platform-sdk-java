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
 * GcInviteAsMembersData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class GcInviteAsMembersData {
  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<String> userIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<String> users = new ArrayList<>();

  public static final String SERIALIZED_NAME_INVITATION_STATUS = "invitation_status";
  @SerializedName(SERIALIZED_NAME_INVITATION_STATUS)
  private Object invitationStatus;

  public static final String SERIALIZED_NAME_HIDDEN_STATUS = "hidden_status";
  @SerializedName(SERIALIZED_NAME_HIDDEN_STATUS)
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

  public String getChannelUrl() {
    return channelUrl;
  }


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

  public List<String> getUserIds() {
    return userIds;
  }


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

  public List<String> getUsers() {
    return users;
  }


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

  public Object getInvitationStatus() {
    return invitationStatus;
  }


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

  public Object getHiddenStatus() {
    return hiddenStatus;
  }


  public void setHiddenStatus(Object hiddenStatus) {
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("channel_url");
    openapiFields.add("user_ids");
    openapiFields.add("users");
    openapiFields.add("invitation_status");
    openapiFields.add("hidden_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_url");
    openapiRequiredFields.add("user_ids");
    openapiRequiredFields.add("users");
    openapiRequiredFields.add("invitation_status");
    openapiRequiredFields.add("hidden_status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GcInviteAsMembersData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GcInviteAsMembersData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GcInviteAsMembersData is not found in the empty JSON string", GcInviteAsMembersData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GcInviteAsMembersData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GcInviteAsMembersData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GcInviteAsMembersData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("channel_url") != null && !jsonObj.get("channel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_url").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("user_ids") != null && !jsonObj.get("user_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_ids` to be an array in the JSON string but got `%s`", jsonObj.get("user_ids").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GcInviteAsMembersData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GcInviteAsMembersData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GcInviteAsMembersData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GcInviteAsMembersData.class));

       return (TypeAdapter<T>) new TypeAdapter<GcInviteAsMembersData>() {
           @Override
           public void write(JsonWriter out, GcInviteAsMembersData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GcInviteAsMembersData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GcInviteAsMembersData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GcInviteAsMembersData
  * @throws IOException if the JSON string is invalid with respect to GcInviteAsMembersData
  */
  public static GcInviteAsMembersData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GcInviteAsMembersData.class);
  }

 /**
  * Convert an instance of GcInviteAsMembersData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

