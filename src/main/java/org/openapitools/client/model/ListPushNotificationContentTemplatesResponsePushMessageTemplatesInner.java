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
import org.openapitools.client.model.ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate;

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
 * ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-29T13:37:01.045476+01:00[Europe/London]")
public class ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner {
  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "template_name";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate template;

  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner() { 
  }

  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner templateName(String templateName) {
    
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplateName() {
    return templateName;
  }


  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner template(ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate getTemplate() {
    return template;
  }


  public void setTemplate(ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate template) {
    this.template = template;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner listPushNotificationContentTemplatesResponsePushMessageTemplatesInner = (ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner) o;
    return Objects.equals(this.templateName, listPushNotificationContentTemplatesResponsePushMessageTemplatesInner.templateName) &&
        Objects.equals(this.template, listPushNotificationContentTemplatesResponsePushMessageTemplatesInner.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner {\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
    openapiFields.add("template_name");
    openapiFields.add("template");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner is not found in the empty JSON string", ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("template_name") != null && !jsonObj.get("template_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_name").toString()));
      }
      // validate the optional field `template`
      if (jsonObj.getAsJsonObject("template") != null) {
        ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.validateJsonObject(jsonObj.getAsJsonObject("template"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner>() {
           @Override
           public void write(JsonWriter out, ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner
  * @throws IOException if the JSON string is invalid with respect to ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner
  */
  public static ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner.class);
  }

 /**
  * Convert an instance of ListPushNotificationContentTemplatesResponsePushMessageTemplatesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

