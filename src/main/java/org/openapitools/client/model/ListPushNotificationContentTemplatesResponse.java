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
import org.openapitools.client.model.ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner;

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
 * ListPushNotificationContentTemplatesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T14:16:58.424760+01:00[Europe/London]")
public class ListPushNotificationContentTemplatesResponse {
  public static final String SERIALIZED_NAME_PUSH_MESSAGE_TEMPLATES = "push_message_templates";
  @SerializedName(SERIALIZED_NAME_PUSH_MESSAGE_TEMPLATES)
  private List<ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner> pushMessageTemplates = null;

  public ListPushNotificationContentTemplatesResponse() { 
  }

  public ListPushNotificationContentTemplatesResponse pushMessageTemplates(List<ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner> pushMessageTemplates) {
    
    this.pushMessageTemplates = pushMessageTemplates;
    return this;
  }

  public ListPushNotificationContentTemplatesResponse addPushMessageTemplatesItem(ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner pushMessageTemplatesItem) {
    if (this.pushMessageTemplates == null) {
      this.pushMessageTemplates = new ArrayList<>();
    }
    this.pushMessageTemplates.add(pushMessageTemplatesItem);
    return this;
  }

   /**
   * Get pushMessageTemplates
   * @return pushMessageTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner> getPushMessageTemplates() {
    return pushMessageTemplates;
  }


  public void setPushMessageTemplates(List<ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner> pushMessageTemplates) {
    this.pushMessageTemplates = pushMessageTemplates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPushNotificationContentTemplatesResponse listPushNotificationContentTemplatesResponse = (ListPushNotificationContentTemplatesResponse) o;
    return Objects.equals(this.pushMessageTemplates, listPushNotificationContentTemplatesResponse.pushMessageTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushMessageTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPushNotificationContentTemplatesResponse {\n");
    sb.append("    pushMessageTemplates: ").append(toIndentedString(pushMessageTemplates)).append("\n");
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
    openapiFields.add("push_message_templates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListPushNotificationContentTemplatesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListPushNotificationContentTemplatesResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPushNotificationContentTemplatesResponse is not found in the empty JSON string", ListPushNotificationContentTemplatesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListPushNotificationContentTemplatesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPushNotificationContentTemplatesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraypushMessageTemplates = jsonObj.getAsJsonArray("push_message_templates");
      if (jsonArraypushMessageTemplates != null) {
        // ensure the json data is an array
        if (!jsonObj.get("push_message_templates").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `push_message_templates` to be an array in the JSON string but got `%s`", jsonObj.get("push_message_templates").toString()));
        }

        // validate the optional field `push_message_templates` (array)
        for (int i = 0; i < jsonArraypushMessageTemplates.size(); i++) {
          ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner.validateJsonObject(jsonArraypushMessageTemplates.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPushNotificationContentTemplatesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPushNotificationContentTemplatesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPushNotificationContentTemplatesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPushNotificationContentTemplatesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPushNotificationContentTemplatesResponse>() {
           @Override
           public void write(JsonWriter out, ListPushNotificationContentTemplatesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPushNotificationContentTemplatesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListPushNotificationContentTemplatesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListPushNotificationContentTemplatesResponse
  * @throws IOException if the JSON string is invalid with respect to ListPushNotificationContentTemplatesResponse
  */
  public static ListPushNotificationContentTemplatesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPushNotificationContentTemplatesResponse.class);
  }

 /**
  * Convert an instance of ListPushNotificationContentTemplatesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

