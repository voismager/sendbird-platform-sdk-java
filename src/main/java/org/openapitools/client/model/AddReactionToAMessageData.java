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
 * AddReactionToAMessageData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class AddReactionToAMessageData {
  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private String channelType;

  public static final String SERIALIZED_NAME_CHANNEL_URL = "channel_url";
  @SerializedName(SERIALIZED_NAME_CHANNEL_URL)
  private String channelUrl;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private Integer messageId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_REACTION = "reaction";
  @SerializedName(SERIALIZED_NAME_REACTION)
  private String reaction;

  public AddReactionToAMessageData() { 
  }

  public AddReactionToAMessageData channelType(String channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * Specifies the type of the channel. Currently, a value of group_channels is only available for the parameter.
   * @return channelType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the type of the channel. Currently, a value of group_channels is only available for the parameter.")

  public String getChannelType() {
    return channelType;
  }


  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public AddReactionToAMessageData channelUrl(String channelUrl) {
    
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the target channel.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the target channel.")

  public String getChannelUrl() {
    return channelUrl;
  }


  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public AddReactionToAMessageData messageId(Integer messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Specifies the unique ID of the message to add a reaction to.
   * @return messageId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the message to add a reaction to.")

  public Integer getMessageId() {
    return messageId;
  }


  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }


  public AddReactionToAMessageData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the ID of the user who reacts to the message.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the user who reacts to the message.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AddReactionToAMessageData reaction(String reaction) {
    
    this.reaction = reaction;
    return this;
  }

   /**
   * Specifies the unique key of the reaction to be added to the message. The length is limited to 192 charaters.
   * @return reaction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique key of the reaction to be added to the message. The length is limited to 192 charaters.")

  public String getReaction() {
    return reaction;
  }


  public void setReaction(String reaction) {
    this.reaction = reaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddReactionToAMessageData addReactionToAMessageData = (AddReactionToAMessageData) o;
    return Objects.equals(this.channelType, addReactionToAMessageData.channelType) &&
        Objects.equals(this.channelUrl, addReactionToAMessageData.channelUrl) &&
        Objects.equals(this.messageId, addReactionToAMessageData.messageId) &&
        Objects.equals(this.userId, addReactionToAMessageData.userId) &&
        Objects.equals(this.reaction, addReactionToAMessageData.reaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelType, channelUrl, messageId, userId, reaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddReactionToAMessageData {\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    reaction: ").append(toIndentedString(reaction)).append("\n");
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
    openapiFields.add("channel_type");
    openapiFields.add("channel_url");
    openapiFields.add("message_id");
    openapiFields.add("user_id");
    openapiFields.add("reaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_type");
    openapiRequiredFields.add("channel_url");
    openapiRequiredFields.add("message_id");
    openapiRequiredFields.add("user_id");
    openapiRequiredFields.add("reaction");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddReactionToAMessageData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddReactionToAMessageData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddReactionToAMessageData is not found in the empty JSON string", AddReactionToAMessageData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddReactionToAMessageData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddReactionToAMessageData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddReactionToAMessageData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("channel_type") != null && !jsonObj.get("channel_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_type").toString()));
      }
      if (jsonObj.get("channel_url") != null && !jsonObj.get("channel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_url").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("reaction") != null && !jsonObj.get("reaction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reaction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reaction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddReactionToAMessageData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddReactionToAMessageData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddReactionToAMessageData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddReactionToAMessageData.class));

       return (TypeAdapter<T>) new TypeAdapter<AddReactionToAMessageData>() {
           @Override
           public void write(JsonWriter out, AddReactionToAMessageData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddReactionToAMessageData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddReactionToAMessageData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddReactionToAMessageData
  * @throws IOException if the JSON string is invalid with respect to AddReactionToAMessageData
  */
  public static AddReactionToAMessageData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddReactionToAMessageData.class);
  }

 /**
  * Convert an instance of AddReactionToAMessageData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

