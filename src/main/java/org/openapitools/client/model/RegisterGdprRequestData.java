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
 * RegisterGdprRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class RegisterGdprRequestData {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<String> userIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHANNEL_DELETE_OPTION = "channel_delete_option";
  @SerializedName(SERIALIZED_NAME_CHANNEL_DELETE_OPTION)
  private String channelDeleteOption;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public RegisterGdprRequestData() { 
  }

  public RegisterGdprRequestData action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Determines the type of a GDPR request. Acceptable values are limited to access and delete. If set to access, Sendbird server generates a downloadable zip file containing the data of the specified user with the user_id property to comply with GDPR&#39;s [right to access](https://gdpr-info.eu/art-15-gdpr/) of the data subject. If set to delete, the specified users with the user_ids property will be permanently deleted from your Sendbird application to comply with GDPR&#39;s [right to erasure](https://gdpr-info.eu/art-17-gdpr/) of the data subject. (Default: delete)
   * @return action
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines the type of a GDPR request. Acceptable values are limited to access and delete. If set to access, Sendbird server generates a downloadable zip file containing the data of the specified user with the user_id property to comply with GDPR's [right to access](https://gdpr-info.eu/art-15-gdpr/) of the data subject. If set to delete, the specified users with the user_ids property will be permanently deleted from your Sendbird application to comply with GDPR's [right to erasure](https://gdpr-info.eu/art-17-gdpr/) of the data subject. (Default: delete)")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public RegisterGdprRequestData userIds(List<String> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public RegisterGdprRequestData addUserIdsItem(String userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Specifies an array of the IDs of the users to delete in order to meet the GDPR&#39;s requirements. The maximum number of users to be processed at once is 100. This should be specified when the value of the action property is delete.
   * @return userIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of the IDs of the users to delete in order to meet the GDPR's requirements. The maximum number of users to be processed at once is 100. This should be specified when the value of the action property is delete.")

  public List<String> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public RegisterGdprRequestData channelDeleteOption(String channelDeleteOption) {
    
    this.channelDeleteOption = channelDeleteOption;
    return this;
  }

   /**
   * Determines the scope of group channels to delete in addition to deleting the specified users with the user_ids property. Acceptable values are limited to the following:&lt;br /&gt;- do_not_delete (default): the users will be deleted but their joined group channels will remain.&lt;br /&gt;- 1_on_1: only 1-on-1 group channels of the users will be deleted. (This option can be useful when eliminating spam users) &lt;br /&gt;- all: all joined group channels of the users will be deleted.&lt;br /&gt;&lt;br /&gt; This only works when the value of the action property is delete.
   * @return channelDeleteOption
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Determines the scope of group channels to delete in addition to deleting the specified users with the user_ids property. Acceptable values are limited to the following:<br />- do_not_delete (default): the users will be deleted but their joined group channels will remain.<br />- 1_on_1: only 1-on-1 group channels of the users will be deleted. (This option can be useful when eliminating spam users) <br />- all: all joined group channels of the users will be deleted.<br /><br /> This only works when the value of the action property is delete.")

  public String getChannelDeleteOption() {
    return channelDeleteOption;
  }


  public void setChannelDeleteOption(String channelDeleteOption) {
    this.channelDeleteOption = channelDeleteOption;
  }


  public RegisterGdprRequestData userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the ID of the user to meet the GDPR&#39;s requirements.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the user to meet the GDPR's requirements.")

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
    RegisterGdprRequestData registerGdprRequestData = (RegisterGdprRequestData) o;
    return Objects.equals(this.action, registerGdprRequestData.action) &&
        Objects.equals(this.userIds, registerGdprRequestData.userIds) &&
        Objects.equals(this.channelDeleteOption, registerGdprRequestData.channelDeleteOption) &&
        Objects.equals(this.userId, registerGdprRequestData.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, userIds, channelDeleteOption, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterGdprRequestData {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    channelDeleteOption: ").append(toIndentedString(channelDeleteOption)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("action");
    openapiFields.add("user_ids");
    openapiFields.add("channel_delete_option");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
    openapiRequiredFields.add("user_ids");
    openapiRequiredFields.add("channel_delete_option");
    openapiRequiredFields.add("user_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RegisterGdprRequestData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RegisterGdprRequestData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RegisterGdprRequestData is not found in the empty JSON string", RegisterGdprRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RegisterGdprRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RegisterGdprRequestData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RegisterGdprRequestData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("user_ids") != null && !jsonObj.get("user_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_ids` to be an array in the JSON string but got `%s`", jsonObj.get("user_ids").toString()));
      }
      if (jsonObj.get("channel_delete_option") != null && !jsonObj.get("channel_delete_option").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_delete_option` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_delete_option").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RegisterGdprRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RegisterGdprRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RegisterGdprRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RegisterGdprRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<RegisterGdprRequestData>() {
           @Override
           public void write(JsonWriter out, RegisterGdprRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RegisterGdprRequestData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RegisterGdprRequestData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RegisterGdprRequestData
  * @throws IOException if the JSON string is invalid with respect to RegisterGdprRequestData
  */
  public static RegisterGdprRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RegisterGdprRequestData.class);
  }

 /**
  * Convert an instance of RegisterGdprRequestData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

