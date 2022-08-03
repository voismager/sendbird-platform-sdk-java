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
 * UpdatePushNotificationContentTemplateData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class UpdatePushNotificationContentTemplateData {
  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "template_name";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TEMPLATE_M_E_S_G = "template.MESG";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_M_E_S_G)
  private String templateMESG;

  public static final String SERIALIZED_NAME_TEMPLATE_F_I_L_E = "template.FILE";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_F_I_L_E)
  private String templateFILE;

  public static final String SERIALIZED_NAME_TEMPLATE_A_D_M_N = "template.ADMN";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_A_D_M_N)
  private String templateADMN;

  public UpdatePushNotificationContentTemplateData() { 
  }

  public UpdatePushNotificationContentTemplateData templateName(String templateName) {
    
    this.templateName = templateName;
    return this;
  }

   /**
   * Specifies the name of a push notification content template to update. Acceptable values are default and alternative.
   * @return templateName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the name of a push notification content template to update. Acceptable values are default and alternative.")

  public String getTemplateName() {
    return templateName;
  }


  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public UpdatePushNotificationContentTemplateData template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * The push notification content template of which content types to be updated and their detailed format.
   * @return template
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The push notification content template of which content types to be updated and their detailed format.")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public UpdatePushNotificationContentTemplateData templateMESG(String templateMESG) {
    
    this.templateMESG = templateMESG;
    return this;
  }

   /**
   * Specifies a format for text messages. We support customization of two fields, which are the sender_name and message. These fields will be replaced with actual corresponding values when sending notification requests to FCM, HMS, or APNs.
   * @return templateMESG
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a format for text messages. We support customization of two fields, which are the sender_name and message. These fields will be replaced with actual corresponding values when sending notification requests to FCM, HMS, or APNs.")

  public String getTemplateMESG() {
    return templateMESG;
  }


  public void setTemplateMESG(String templateMESG) {
    this.templateMESG = templateMESG;
  }


  public UpdatePushNotificationContentTemplateData templateFILE(String templateFILE) {
    
    this.templateFILE = templateFILE;
    return this;
  }

   /**
   * Specifies a format for file messages. We support customization with variables including filename and file_type_friendly. When sending notification requests to FCM, HMS, or APNs, the filename will be replaced with the corresponding string value while the file_type_friendly will indicate the type of the file sent, such as &#x60;Audio&#x60;, &#x60;Image&#x60;, and &#x60;Video&#x60;.
   * @return templateFILE
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a format for file messages. We support customization with variables including filename and file_type_friendly. When sending notification requests to FCM, HMS, or APNs, the filename will be replaced with the corresponding string value while the file_type_friendly will indicate the type of the file sent, such as `Audio`, `Image`, and `Video`.")

  public String getTemplateFILE() {
    return templateFILE;
  }


  public void setTemplateFILE(String templateFILE) {
    this.templateFILE = templateFILE;
  }


  public UpdatePushNotificationContentTemplateData templateADMN(String templateADMN) {
    
    this.templateADMN = templateADMN;
    return this;
  }

   /**
   * Specifies a format for admin messages. We support customization of one field, which is the message. This field will be replaced with actual corresponding values when sending notification requests to FCM, HMS, or APNs.
   * @return templateADMN
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a format for admin messages. We support customization of one field, which is the message. This field will be replaced with actual corresponding values when sending notification requests to FCM, HMS, or APNs.")

  public String getTemplateADMN() {
    return templateADMN;
  }


  public void setTemplateADMN(String templateADMN) {
    this.templateADMN = templateADMN;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePushNotificationContentTemplateData updatePushNotificationContentTemplateData = (UpdatePushNotificationContentTemplateData) o;
    return Objects.equals(this.templateName, updatePushNotificationContentTemplateData.templateName) &&
        Objects.equals(this.template, updatePushNotificationContentTemplateData.template) &&
        Objects.equals(this.templateMESG, updatePushNotificationContentTemplateData.templateMESG) &&
        Objects.equals(this.templateFILE, updatePushNotificationContentTemplateData.templateFILE) &&
        Objects.equals(this.templateADMN, updatePushNotificationContentTemplateData.templateADMN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateName, template, templateMESG, templateFILE, templateADMN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePushNotificationContentTemplateData {\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateMESG: ").append(toIndentedString(templateMESG)).append("\n");
    sb.append("    templateFILE: ").append(toIndentedString(templateFILE)).append("\n");
    sb.append("    templateADMN: ").append(toIndentedString(templateADMN)).append("\n");
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
    openapiFields.add("template.MESG");
    openapiFields.add("template.FILE");
    openapiFields.add("template.ADMN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("template_name");
    openapiRequiredFields.add("template");
    openapiRequiredFields.add("template.MESG");
    openapiRequiredFields.add("template.FILE");
    openapiRequiredFields.add("template.ADMN");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdatePushNotificationContentTemplateData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdatePushNotificationContentTemplateData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatePushNotificationContentTemplateData is not found in the empty JSON string", UpdatePushNotificationContentTemplateData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdatePushNotificationContentTemplateData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatePushNotificationContentTemplateData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdatePushNotificationContentTemplateData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("template_name") != null && !jsonObj.get("template_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_name").toString()));
      }
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template").toString()));
      }
      if (jsonObj.get("template.MESG") != null && !jsonObj.get("template.MESG").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template.MESG` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template.MESG").toString()));
      }
      if (jsonObj.get("template.FILE") != null && !jsonObj.get("template.FILE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template.FILE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template.FILE").toString()));
      }
      if (jsonObj.get("template.ADMN") != null && !jsonObj.get("template.ADMN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template.ADMN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template.ADMN").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatePushNotificationContentTemplateData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatePushNotificationContentTemplateData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatePushNotificationContentTemplateData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatePushNotificationContentTemplateData.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatePushNotificationContentTemplateData>() {
           @Override
           public void write(JsonWriter out, UpdatePushNotificationContentTemplateData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatePushNotificationContentTemplateData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatePushNotificationContentTemplateData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatePushNotificationContentTemplateData
  * @throws IOException if the JSON string is invalid with respect to UpdatePushNotificationContentTemplateData
  */
  public static UpdatePushNotificationContentTemplateData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatePushNotificationContentTemplateData.class);
  }

 /**
  * Convert an instance of UpdatePushNotificationContentTemplateData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

