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
 * SendBirdRestrictionInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T14:38:17.329046+01:00[Europe/London]")
public class SendBirdRestrictionInfo {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  private BigDecimal endAt;

  /**
   * Gets or Sets restrictionType
   */
  @JsonAdapter(RestrictionTypeEnum.Adapter.class)
  public enum RestrictionTypeEnum {
    BANNED("banned"),
    
    MUTED("muted");

    private String value;

    RestrictionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RestrictionTypeEnum fromValue(String value) {
      for (RestrictionTypeEnum b : RestrictionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RestrictionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RestrictionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RestrictionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RestrictionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESTRICTION_TYPE = "restriction_type";
  @SerializedName(SERIALIZED_NAME_RESTRICTION_TYPE)
  private RestrictionTypeEnum restrictionType;

  public SendBirdRestrictionInfo() { 
  }

  public SendBirdRestrictionInfo description(String description) {
    
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


  public SendBirdRestrictionInfo endAt(BigDecimal endAt) {
    
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


  public SendBirdRestrictionInfo restrictionType(RestrictionTypeEnum restrictionType) {
    
    this.restrictionType = restrictionType;
    return this;
  }

   /**
   * Get restrictionType
   * @return restrictionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RestrictionTypeEnum getRestrictionType() {
    return restrictionType;
  }


  public void setRestrictionType(RestrictionTypeEnum restrictionType) {
    this.restrictionType = restrictionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdRestrictionInfo sendBirdRestrictionInfo = (SendBirdRestrictionInfo) o;
    return Objects.equals(this.description, sendBirdRestrictionInfo.description) &&
        Objects.equals(this.endAt, sendBirdRestrictionInfo.endAt) &&
        Objects.equals(this.restrictionType, sendBirdRestrictionInfo.restrictionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, endAt, restrictionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdRestrictionInfo {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    restrictionType: ").append(toIndentedString(restrictionType)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("end_at");
    openapiFields.add("restriction_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SendBirdRestrictionInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SendBirdRestrictionInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SendBirdRestrictionInfo is not found in the empty JSON string", SendBirdRestrictionInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SendBirdRestrictionInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SendBirdRestrictionInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("restriction_type") != null && !jsonObj.get("restriction_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `restriction_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("restriction_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SendBirdRestrictionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SendBirdRestrictionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SendBirdRestrictionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SendBirdRestrictionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SendBirdRestrictionInfo>() {
           @Override
           public void write(JsonWriter out, SendBirdRestrictionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SendBirdRestrictionInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SendBirdRestrictionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SendBirdRestrictionInfo
  * @throws IOException if the JSON string is invalid with respect to SendBirdRestrictionInfo
  */
  public static SendBirdRestrictionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SendBirdRestrictionInfo.class);
  }

 /**
  * Convert an instance of SendBirdRestrictionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

