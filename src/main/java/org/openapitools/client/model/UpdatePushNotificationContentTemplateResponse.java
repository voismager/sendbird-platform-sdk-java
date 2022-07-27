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
import org.openapitools.client.model.ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner;

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
 * UpdatePushNotificationContentTemplateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T16:53:12.807119+01:00[Europe/London]")
public class UpdatePushNotificationContentTemplateResponse {
  public static final String SERIALIZED_NAME_PUSH_MESSAGE_TEMPLATES = "push_message_templates";
  @SerializedName(SERIALIZED_NAME_PUSH_MESSAGE_TEMPLATES)
  private List<ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner> pushMessageTemplates = null;

  public UpdatePushNotificationContentTemplateResponse() { 
  }

  public UpdatePushNotificationContentTemplateResponse pushMessageTemplates(List<ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner> pushMessageTemplates) {
    
    this.pushMessageTemplates = pushMessageTemplates;
    return this;
  }

  public UpdatePushNotificationContentTemplateResponse addPushMessageTemplatesItem(ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner pushMessageTemplatesItem) {
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

  public List<ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner> getPushMessageTemplates() {
    return pushMessageTemplates;
  }


  public void setPushMessageTemplates(List<ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner> pushMessageTemplates) {
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
    UpdatePushNotificationContentTemplateResponse updatePushNotificationContentTemplateResponse = (UpdatePushNotificationContentTemplateResponse) o;
    return Objects.equals(this.pushMessageTemplates, updatePushNotificationContentTemplateResponse.pushMessageTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushMessageTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePushNotificationContentTemplateResponse {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to UpdatePushNotificationContentTemplateResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdatePushNotificationContentTemplateResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePushNotificationContentTemplateResponse is not found in the empty JSON string", UpdatePushNotificationContentTemplateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdatePushNotificationContentTemplateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePushNotificationContentTemplateResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
          ViewPushNotificationContentTemplateResponsePushMessageTemplatesInner.validateJsonObject(jsonArraypushMessageTemplates.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePushNotificationContentTemplateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePushNotificationContentTemplateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePushNotificationContentTemplateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePushNotificationContentTemplateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePushNotificationContentTemplateResponse>() {
           @Override
           public void write(JsonWriter out, UpdatePushNotificationContentTemplateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePushNotificationContentTemplateResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePushNotificationContentTemplateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePushNotificationContentTemplateResponse
  * @throws IOException if the JSON string is invalid with respect to UpdatePushNotificationContentTemplateResponse
  */
  public static UpdatePushNotificationContentTemplateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePushNotificationContentTemplateResponse.class);
  }

 /**
  * Convert an instance of UpdatePushNotificationContentTemplateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

