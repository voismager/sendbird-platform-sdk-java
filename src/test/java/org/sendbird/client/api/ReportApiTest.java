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


package org.sendbird.client.api;

import org.sendbird.client.ApiException;
import org.openapitools.client.model.ListReportsOnChannelByUrlResponse;
import org.openapitools.client.model.ListReportsOnMessageByIdResponse;
import org.openapitools.client.model.ListReportsOnUserByIdResponse;
import org.openapitools.client.model.ListReportsResponse;
import org.openapitools.client.model.ReportChannelByUrlData;
import org.openapitools.client.model.ReportChannelByUrlResponse;
import org.openapitools.client.model.ReportMessageByIdData;
import org.openapitools.client.model.ReportMessageByIdResponse;
import org.openapitools.client.model.ReportUserByIdData;
import org.openapitools.client.model.ReportUserByIdResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportApi
 */
@Ignore
public class ReportApiTest {

    private final ReportApi api = new ReportApi();

    
    /**
     * List reports
     *
     * ## List reports  Retrieves a list of reports within an application regardless of object types.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listReportsTest() throws ApiException {
        String apiToken = null;
        String token = null;
        Integer limit = null;
        Integer startTs = null;
        Integer endTs = null;
                ListReportsResponse response = api.listReports(apiToken, token, limit, startTs, endTs);
        // TODO: test validations
    }
    
    /**
     * List reports on a channel
     *
     * ## List reports on a channel  Retrieves a list of reports on a channel that has offensive messages or abusive activities.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-channel ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which is reported for offensive messages or inappropriate activities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listReportsOnChannelByUrlTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String token = null;
        Integer limit = null;
                ListReportsOnChannelByUrlResponse response = api.listReportsOnChannelByUrl(apiToken, channelType, channelUrl, token, limit);
        // TODO: test validations
    }
    
    /**
     * List reports on a message
     *
     * ## List reports on a message  Retrieves a list of reports on a message which contains suspicious, harassing, or inappropriate content.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel where the reported message is in.  &#x60;message_id&#x60;      Type: string      Description: Specifies the unique ID of the reported message.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listReportsOnMessageByIdTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        String token = null;
        Integer limit = null;
                ListReportsOnMessageByIdResponse response = api.listReportsOnMessageById(apiToken, channelType, channelUrl, messageId, token, limit);
        // TODO: test validations
    }
    
    /**
     * List reports on a user
     *
     * ## List reports on a user  Retrieves a list of reports on a user who sends an offensive message.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-list-reports-on-a-user ----------------------------   &#x60;offending_user_id&#x60;      Type: string      Description: Specifies the unique ID of the user who has sent the message to report.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listReportsOnUserByIdTest() throws ApiException {
        String apiToken = null;
        String offendingUserId = null;
        String token = null;
        Integer limit = null;
                ListReportsOnUserByIdResponse response = api.listReportsOnUserById(apiToken, offendingUserId, token, limit);
        // TODO: test validations
    }
    
    /**
     * Report a channel
     *
     * ## Report a channel  Reports a channel that has offensive messages or abusive activities.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-channel ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportChannelByUrlTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        ReportChannelByUrlData reportChannelByUrlData = null;
                ReportChannelByUrlResponse response = api.reportChannelByUrl(apiToken, channelType, channelUrl, reportChannelByUrlData);
        // TODO: test validations
    }
    
    /**
     * Report a message
     *
     * ## Report a message  Reports a message which contains suspicious, harassing, or inappropriate content.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-message ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportMessageByIdTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        ReportMessageByIdData reportMessageByIdData = null;
                ReportMessageByIdResponse response = api.reportMessageById(apiToken, channelType, channelUrl, messageId, reportMessageByIdData);
        // TODO: test validations
    }
    
    /**
     * Report a user
     *
     * ## Report a user  Reports a user who sends an offensive message in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-report-a-user ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reportUserByIdTest() throws ApiException {
        String apiToken = null;
        String offendingUserId = null;
        ReportUserByIdData reportUserByIdData = null;
                ReportUserByIdResponse response = api.reportUserById(apiToken, offendingUserId, reportUserByIdData);
        // TODO: test validations
    }
    
    /**
     * View a moderated message
     *
     * ## View a moderated message  Retrieves information on a message that has been moderated by the [profanity filter](https://sendbird.com/docs/chat/v3/platform-api/guides/filter-and-moderation#2-profanity-filter).  https://sendbird.com/docs/chat/v3/platform-api/guides/report-content-and-subject#2-view-a-moderated-message ----------------------------
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void viewModeratedMessageByIdTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
                Map<String, String> response = api.viewModeratedMessageById(apiToken, channelType, channelUrl, messageId);
        // TODO: test validations
    }
    
}
