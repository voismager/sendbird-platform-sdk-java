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
import org.openapitools.client.model.SendBirdChannelResponse;
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendBirdUser;

/**
 * InlineResponse20071ReportLogs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-07T15:20:09.800379Z[Europe/London]")
public class InlineResponse20071ReportLogs {
  public static final String SERIALIZED_NAME_REPORT_TYPE = "report_type";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE)
  private String reportType;

  public static final String SERIALIZED_NAME_REPORT_CATEGORY = "report_category";
  @SerializedName(SERIALIZED_NAME_REPORT_CATEGORY)
  private String reportCategory;

  public static final String SERIALIZED_NAME_REPORTING_USER = "reporting_user";
  @SerializedName(SERIALIZED_NAME_REPORTING_USER)
  private SendBirdUser reportingUser;

  public static final String SERIALIZED_NAME_OFFENDING_USER = "offending_user";
  @SerializedName(SERIALIZED_NAME_OFFENDING_USER)
  private SendBirdUser offendingUser;

  public static final String SERIALIZED_NAME_REPORTED_MESSAGE = "reported_message";
  @SerializedName(SERIALIZED_NAME_REPORTED_MESSAGE)
  private SendBirdMessageResponse reportedMessage;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private SendBirdChannelResponse channel;

  public static final String SERIALIZED_NAME_REPORT_DESCRIPTION = "report_description";
  @SerializedName(SERIALIZED_NAME_REPORT_DESCRIPTION)
  private String reportDescription;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private BigDecimal createdAt;

  public InlineResponse20071ReportLogs() { 
  }

  public InlineResponse20071ReportLogs reportType(String reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportType() {
    return reportType;
  }


  public void setReportType(String reportType) {
    this.reportType = reportType;
  }


  public InlineResponse20071ReportLogs reportCategory(String reportCategory) {
    
    this.reportCategory = reportCategory;
    return this;
  }

   /**
   * Get reportCategory
   * @return reportCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportCategory() {
    return reportCategory;
  }


  public void setReportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
  }


  public InlineResponse20071ReportLogs reportingUser(SendBirdUser reportingUser) {
    
    this.reportingUser = reportingUser;
    return this;
  }

   /**
   * Get reportingUser
   * @return reportingUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdUser getReportingUser() {
    return reportingUser;
  }


  public void setReportingUser(SendBirdUser reportingUser) {
    this.reportingUser = reportingUser;
  }


  public InlineResponse20071ReportLogs offendingUser(SendBirdUser offendingUser) {
    
    this.offendingUser = offendingUser;
    return this;
  }

   /**
   * Get offendingUser
   * @return offendingUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdUser getOffendingUser() {
    return offendingUser;
  }


  public void setOffendingUser(SendBirdUser offendingUser) {
    this.offendingUser = offendingUser;
  }


  public InlineResponse20071ReportLogs reportedMessage(SendBirdMessageResponse reportedMessage) {
    
    this.reportedMessage = reportedMessage;
    return this;
  }

   /**
   * Get reportedMessage
   * @return reportedMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdMessageResponse getReportedMessage() {
    return reportedMessage;
  }


  public void setReportedMessage(SendBirdMessageResponse reportedMessage) {
    this.reportedMessage = reportedMessage;
  }


  public InlineResponse20071ReportLogs channel(SendBirdChannelResponse channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendBirdChannelResponse getChannel() {
    return channel;
  }


  public void setChannel(SendBirdChannelResponse channel) {
    this.channel = channel;
  }


  public InlineResponse20071ReportLogs reportDescription(String reportDescription) {
    
    this.reportDescription = reportDescription;
    return this;
  }

   /**
   * Get reportDescription
   * @return reportDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportDescription() {
    return reportDescription;
  }


  public void setReportDescription(String reportDescription) {
    this.reportDescription = reportDescription;
  }


  public InlineResponse20071ReportLogs createdAt(BigDecimal createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20071ReportLogs inlineResponse20071ReportLogs = (InlineResponse20071ReportLogs) o;
    return Objects.equals(this.reportType, inlineResponse20071ReportLogs.reportType) &&
        Objects.equals(this.reportCategory, inlineResponse20071ReportLogs.reportCategory) &&
        Objects.equals(this.reportingUser, inlineResponse20071ReportLogs.reportingUser) &&
        Objects.equals(this.offendingUser, inlineResponse20071ReportLogs.offendingUser) &&
        Objects.equals(this.reportedMessage, inlineResponse20071ReportLogs.reportedMessage) &&
        Objects.equals(this.channel, inlineResponse20071ReportLogs.channel) &&
        Objects.equals(this.reportDescription, inlineResponse20071ReportLogs.reportDescription) &&
        Objects.equals(this.createdAt, inlineResponse20071ReportLogs.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, reportCategory, reportingUser, offendingUser, reportedMessage, channel, reportDescription, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20071ReportLogs {\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
    sb.append("    reportingUser: ").append(toIndentedString(reportingUser)).append("\n");
    sb.append("    offendingUser: ").append(toIndentedString(offendingUser)).append("\n");
    sb.append("    reportedMessage: ").append(toIndentedString(reportedMessage)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    reportDescription: ").append(toIndentedString(reportDescription)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

}

