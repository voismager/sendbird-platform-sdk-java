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
 * ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate {
  public static final String SERIALIZED_NAME_M_E_S_G = "MESG";
  @SerializedName(SERIALIZED_NAME_M_E_S_G)
  private String MESG;

  public static final String SERIALIZED_NAME_F_I_L_E = "FILE";
  @SerializedName(SERIALIZED_NAME_F_I_L_E)
  private String FILE;

  public static final String SERIALIZED_NAME_A_D_M_M = "ADMM";
  @SerializedName(SERIALIZED_NAME_A_D_M_M)
  private String ADMM;

  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate() { 
  }

  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate MESG(String MESG) {
    
    this.MESG = MESG;
    return this;
  }

   /**
   * Get MESG
   * @return MESG
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMESG() {
    return MESG;
  }


  public void setMESG(String MESG) {
    this.MESG = MESG;
  }


  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate FILE(String FILE) {
    
    this.FILE = FILE;
    return this;
  }

   /**
   * Get FILE
   * @return FILE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFILE() {
    return FILE;
  }


  public void setFILE(String FILE) {
    this.FILE = FILE;
  }


  public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate ADMM(String ADMM) {
    
    this.ADMM = ADMM;
    return this;
  }

   /**
   * Get ADMM
   * @return ADMM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getADMM() {
    return ADMM;
  }


  public void setADMM(String ADMM) {
    this.ADMM = ADMM;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate listPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate = (ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate) o;
    return Objects.equals(this.MESG, listPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.MESG) &&
        Objects.equals(this.FILE, listPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.FILE) &&
        Objects.equals(this.ADMM, listPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.ADMM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MESG, FILE, ADMM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate {\n");
    sb.append("    MESG: ").append(toIndentedString(MESG)).append("\n");
    sb.append("    FILE: ").append(toIndentedString(FILE)).append("\n");
    sb.append("    ADMM: ").append(toIndentedString(ADMM)).append("\n");
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
    openapiFields.add("MESG");
    openapiFields.add("FILE");
    openapiFields.add("ADMM");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate is not found in the empty JSON string", ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("MESG") != null && !jsonObj.get("MESG").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MESG` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MESG").toString()));
      }
      if (jsonObj.get("FILE") != null && !jsonObj.get("FILE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FILE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FILE").toString()));
      }
      if (jsonObj.get("ADMM") != null && !jsonObj.get("ADMM").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ADMM` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ADMM").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate>() {
           @Override
           public void write(JsonWriter out, ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate
  * @throws IOException if the JSON string is invalid with respect to ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate
  */
  public static ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate.class);
  }

 /**
  * Convert an instance of ListPushNotificationContentTemplatesResponsePushMessageTemplatesInnerTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

