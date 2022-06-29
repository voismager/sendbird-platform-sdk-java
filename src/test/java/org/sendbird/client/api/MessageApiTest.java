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
import org.openapitools.client.model.AddEmojiCategoriesResponse;
import org.openapitools.client.model.AddEmojisData;
import org.openapitools.client.model.AddEmojisResponse;
import org.openapitools.client.model.AddExtraDataToMessageData;
import org.openapitools.client.model.AddExtraDataToMessageResponse;
import org.openapitools.client.model.AddReactionToAMessageData;
import org.openapitools.client.model.AddReactionToAMessageResponse;
import org.openapitools.client.model.EnableReactionsData;
import org.openapitools.client.model.EnableReactionsResponse;
import org.openapitools.client.model.GcMarkAllMessagesAsDeliveredData;
import org.openapitools.client.model.GcMarkAllMessagesAsDeliveredResponse;
import org.openapitools.client.model.GcMarkAllMessagesAsReadData;
import org.openapitools.client.model.GcViewNumberOfEachMembersUnreadMessagesResponse;
import org.openapitools.client.model.GetStatisticsDailyResponse;
import org.openapitools.client.model.GetStatisticsMonthlyResponse;
import org.openapitools.client.model.GetStatisticsResponse;
import org.openapitools.client.model.ListAllEmojisAndEmojiCategoriesResponse;
import org.openapitools.client.model.ListAnnouncementGroupsResponse;
import org.openapitools.client.model.ListAnnouncementsResponse;
import org.openapitools.client.model.ListEmojisResponse;
import org.openapitools.client.model.ListMessagesResponse;
import org.openapitools.client.model.ListReactionsOfMessageResponse;
import org.openapitools.client.model.RemoveReactionFromAMessageResponse;
import org.openapitools.client.model.ScheduleAnnouncementData;
import org.openapitools.client.model.ScheduleAnnouncementResponse;
import org.openapitools.client.model.SendBirdEmoji;
import org.openapitools.client.model.SendBirdEmojiCategory;
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendMessageData;
import org.openapitools.client.model.UpdateAnnouncementByIdData;
import org.openapitools.client.model.UpdateAnnouncementByIdResponse;
import org.openapitools.client.model.UpdateEmojiCategoryUrlByIdData;
import org.openapitools.client.model.UpdateEmojiUrlByKeyData;
import org.openapitools.client.model.UpdateExtraDataInMessageData;
import org.openapitools.client.model.UpdateExtraDataInMessageResponse;
import org.openapitools.client.model.UpdateMessageByIdData;
import org.openapitools.client.model.UseDefaultEmojisData;
import org.openapitools.client.model.UseDefaultEmojisResponse;
import org.openapitools.client.model.ViewTotalNumberOfMessagesInChannelResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessageApi
 */
@Disabled
public class MessageApiTest {

    private final MessageApi api = new MessageApi();

    /**
     * Add emoji categories
     *
     * ## Add emoji categories  Adds a list of one or more new emoji categories to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emoji-categories
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEmojiCategoriesTest() throws ApiException {
        String apiToken = null;
        Object body = null;
        AddEmojiCategoriesResponse response = api.addEmojiCategories(apiToken, body);
        // TODO: test validations
    }

    /**
     * Add emojis
     *
     * ## Add emojis  Adds a list of one or more new emojis to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-add-emojis
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addEmojisTest() throws ApiException {
        String apiToken = null;
        AddEmojisData addEmojisData = null;
        AddEmojisResponse response = api.addEmojis(apiToken, addEmojisData);
        // TODO: test validations
    }

    /**
     * Add extra data to a message
     *
     * ## Add extra data to a message  Adds one or more key-values items which store additional information for a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-extra-data-to-a-message ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addExtraDataToMessageTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        AddExtraDataToMessageData addExtraDataToMessageData = null;
        AddExtraDataToMessageResponse response = api.addExtraDataToMessage(apiToken, channelType, channelUrl, messageId, addExtraDataToMessageData);
        // TODO: test validations
    }

    /**
     * Add a reaction to a message
     *
     * ## Add a reaction to a message  Adds a specific reaction to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-add-a-reaction-to-a-message ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addReactionToAMessageTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        AddReactionToAMessageData addReactionToAMessageData = null;
        AddReactionToAMessageResponse response = api.addReactionToAMessage(apiToken, channelType, channelUrl, messageId, addReactionToAMessageData);
        // TODO: test validations
    }

    /**
     * Delete an emoji
     *
     * ## Delete an emoji  Deletes an emoji from the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEmojiByKeyTest() throws ApiException {
        String apiToken = null;
        String emojiKey = null;
        api.deleteEmojiByKey(apiToken, emojiKey);
        // TODO: test validations
    }

    /**
     * Delete an emoji category
     *
     * ## Delete an emoji category  Deletes an emoji category with the specified ID.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-delete-an-emoji-category ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEmojiCategoryByIdTest() throws ApiException {
        String apiToken = null;
        String emojiCategoryId = null;
        Object response = api.deleteEmojiCategoryById(apiToken, emojiCategoryId);
        // TODO: test validations
    }

    /**
     * Delete a message
     *
     * ## Delete a message  Deletes a message from a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-delete-a-message ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMessageByIdTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        Object response = api.deleteMessageById(apiToken, channelType, channelUrl, messageId);
        // TODO: test validations
    }

    /**
     * Enable reactions
     *
     * ## Enable reactions  Turn on or off reactions in a Sendbird application.  &gt; __Note__: This action also allows reactions in UIKit.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-enable-reactions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableReactionsTest() throws ApiException {
        String apiToken = null;
        EnableReactionsData enableReactionsData = null;
        EnableReactionsResponse response = api.enableReactions(apiToken, enableReactionsData);
        // TODO: test validations
    }

    /**
     * Mark all messages as delivered
     *
     * ## Mark all messages as delivered  Marks all messages in a group channel as delivered for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-delivered ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcMarkAllMessagesAsDeliveredTest() throws ApiException {
        String apiToken = null;
        String channelUrl = null;
        GcMarkAllMessagesAsDeliveredData gcMarkAllMessagesAsDeliveredData = null;
        GcMarkAllMessagesAsDeliveredResponse response = api.gcMarkAllMessagesAsDelivered(apiToken, channelUrl, gcMarkAllMessagesAsDeliveredData);
        // TODO: test validations
    }

    /**
     * Mark all messages as read
     *
     * ## Mark all messages as read  Marks all messages in a group channel as read for a given user. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-mark-all-messages-as-read ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcMarkAllMessagesAsReadTest() throws ApiException {
        String apiToken = null;
        String channelUrl = null;
        GcMarkAllMessagesAsReadData gcMarkAllMessagesAsReadData = null;
        Object response = api.gcMarkAllMessagesAsRead(apiToken, channelUrl, gcMarkAllMessagesAsReadData);
        // TODO: test validations
    }

    /**
     * View number of each member&#39;s unread messages
     *
     * ## View number of each member&#39;s unread messages  Retrieves the total number of each member&#39;s unread messages in a group channel. This action is only applicable for users in a group channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-number-of-each-member-s-unread-messages ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gcViewNumberOfEachMembersUnreadMessagesTest() throws ApiException {
        String apiToken = null;
        String channelUrl = null;
        String userIds = null;
        GcViewNumberOfEachMembersUnreadMessagesResponse response = api.gcViewNumberOfEachMembersUnreadMessages(apiToken, channelUrl, userIds);
        // TODO: test validations
    }

    /**
     * Get an emoji
     *
     * ## Get an emoji  Retrieves an emoji with the specified key.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmojiByKeyTest() throws ApiException {
        String apiToken = null;
        String emojiKey = null;
        SendBirdEmoji response = api.getEmojiByKey(apiToken, emojiKey);
        // TODO: test validations
    }

    /**
     * Get an emoji category
     *
     * ## Get an emoji category  Retrieves an emoji category with the specified ID, including its emojis.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-get-an-emoji-category ----------------------------   &#x60;emoji_category_id&#x60;      Type: int      Description: Specifies the unique ID of the emoji category to retrieve.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmojiCategoryByIdTest() throws ApiException {
        String apiToken = null;
        String emojiCategoryId = null;
        SendBirdEmojiCategory response = api.getEmojiCategoryById(apiToken, emojiCategoryId);
        // TODO: test validations
    }

    /**
     * Get statistics - weekly
     *
     * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatisticsTest() throws ApiException {
        String apiToken = null;
        GetStatisticsResponse response = api.getStatistics(apiToken);
        // TODO: test validations
    }

    /**
     * Get statistics - daily
     *
     * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatisticsDailyTest() throws ApiException {
        String apiToken = null;
        String startDate = null;
        String endDate = null;
        String startWeek = null;
        String endWeek = null;
        String startMonth = null;
        String endMonth = null;
        String announcementGroup = null;
        GetStatisticsDailyResponse response = api.getStatisticsDaily(apiToken, startDate, endDate, startWeek, endWeek, startMonth, endMonth, announcementGroup);
        // TODO: test validations
    }

    /**
     * Get statistics - monthly
     *
     * ## Get statistics  Retrieves the daily, weekly or monthly statistics of an announcement or an announcement group.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-get-statistics ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatisticsMonthlyTest() throws ApiException {
        String apiToken = null;
        GetStatisticsMonthlyResponse response = api.getStatisticsMonthly(apiToken);
        // TODO: test validations
    }

    /**
     * List all emojis and emoji categories
     *
     * ## List all emojis and emoji categories  Retrieves a list of all emoji categories registered to the application, including their emojis.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-all-emojis-and-emoji-categories
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllEmojisAndEmojiCategoriesTest() throws ApiException {
        String apiToken = null;
        ListAllEmojisAndEmojiCategoriesResponse response = api.listAllEmojisAndEmojiCategories(apiToken);
        // TODO: test validations
    }

    /**
     * List announcement groups
     *
     * ## List announcement groups  Retrieves a list of announcement groups.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcement-groups ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAnnouncementGroupsTest() throws ApiException {
        String apiToken = null;
        String token = null;
        Integer limit = null;
        ListAnnouncementGroupsResponse response = api.listAnnouncementGroups(apiToken, token, limit);
        // TODO: test validations
    }

    /**
     * List announcements
     *
     * ## List announcements  Retrieves a list of announcements.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-list-announcements ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAnnouncementsTest() throws ApiException {
        String apiToken = null;
        String token = null;
        Integer limit = null;
        String order = null;
        String status = null;
        String announcementGroup = null;
        ListAnnouncementsResponse response = api.listAnnouncements(apiToken, token, limit, order, status, announcementGroup);
        // TODO: test validations
    }

    /**
     * List emojis
     *
     * ## List emojis  Retrieves a list of all emojis registered to the application.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-list-emojis
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEmojisTest() throws ApiException {
        String apiToken = null;
        ListEmojisResponse response = api.listEmojis(apiToken);
        // TODO: test validations
    }

    /**
     * List messages
     *
     * ## List messages  Retrieves a list of past messages of a channel.  &gt; This message retrieval is one of Sendbird&#39;s [premium features](https://sendbird.com/docs/chat/v3/platform-api/guides/application#-3-sendbird-s-premium-features). Contact our [sales team](https://get.sendbird.com/talk-to-sales.html) for further assistance.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-messages ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel to retrieve a list of past messages.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMessagesTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        Integer messageTs = null;
        Integer messageId = null;
        Integer prevLimit = null;
        Integer nextLimit = null;
        Boolean include = null;
        Boolean reverse = null;
        String senderId = null;
        String senderIds = null;
        String operatorFilter = null;
        String customTypes = null;
        String messageType = null;
        Boolean includingRemoved = null;
        Boolean includeReactions = null;
        Boolean withSortedMetaArray = null;
        Boolean showSubchannelMessagesOnly = null;
        String userId = null;
        String customType = null;
        Boolean withMetaArray = null;
        ListMessagesResponse response = api.listMessages(apiToken, channelType, channelUrl, messageTs, messageId, prevLimit, nextLimit, include, reverse, senderId, senderIds, operatorFilter, customTypes, messageType, includingRemoved, includeReactions, withSortedMetaArray, showSubchannelMessagesOnly, userId, customType, withMetaArray);
        // TODO: test validations
    }

    /**
     * List reactions of a message
     *
     * ## List reactions of a message  Retrieves a list of reactions made to a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-list-reactions-of-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to add a reaction to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listReactionsOfMessageTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        Boolean listUsers = null;
        ListReactionsOfMessageResponse response = api.listReactionsOfMessage(apiToken, channelType, channelUrl, messageId, listUsers);
        // TODO: test validations
    }

    /**
     * Migrate messages
     *
     * ## Migrate messages  Using our migration API, you can migrate the messages from another system into a Sendbird system&#39;s [channel](https://sendbird.com/docs/chat/v3/platform-api/guides/channel-types) which consists of users, messages, and other chat-related data.  &gt; To turn on this feature, [contact our support team](https://dashboard.sendbird.com/settings/contact_us).  There are three things to do in advance before the migration. Follow the instructions below:  1. Register the users of your current chat solution to your Sendbird application. You can migrate the users into the Sendbird system using the [user creation API](https://sendbird.com/docs/chat/v3/platform-api/guides/user#2-create-a-user). 2. Create either an [open](https://sendbird.com/docs/chat/v3/platform-api/guides/open-channel#2-create-a-channel) or a [group](https://sendbird.com/docs/chat/v3/platform-api/guides/group-channel#2-create-a-channel) channel to migrate the messages of your chat solution. The Sendbird system doesn&#39;t create a channel for your migration automatically. 3. The maximum number of migrated messages per call is 100. To avoid the failure during your migration, you must adjust the number of messages to process at once via the API.  https://sendbird.com/docs/chat/v3/platform-api/guides/migration#2-migrate-messages ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void migrateMessagesByUrlTest() throws ApiException {
        String apiToken = null;
        String targetChannelUrl = null;
        Object body = null;
        api.migrateMessagesByUrl(apiToken, targetChannelUrl, body);
        // TODO: test validations
    }

    /**
     * Remove extra data from a message
     *
     * ## Remove extra data from a message  Removes specific items from a message by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-extra-data-from-a-message ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeExtraDataFromMessageTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        List<String> keys = null;
        Object response = api.removeExtraDataFromMessage(apiToken, channelType, channelUrl, messageId, keys);
        // TODO: test validations
    }

    /**
     * Remove a reaction from a message
     *
     * ## Remove a reaction from a message  Removes a specific reaction from a message.  &gt; __Note__: Currently, this action is only available in group channels.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-remove-a-reaction-from-a-message ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeReactionFromAMessageTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        String userId = null;
        String reaction = null;
        RemoveReactionFromAMessageResponse response = api.removeReactionFromAMessage(apiToken, channelType, channelUrl, messageId, userId, reaction);
        // TODO: test validations
    }

    /**
     * Schedule an announcement
     *
     * ## Schedule an announcement  Schedules a new announcement. You can also schedule an announcement in the [Sendbird Dashboard](https://dashboard.sendbird.com).  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-schedule-an-announcement
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void scheduleAnnouncementTest() throws ApiException {
        String apiToken = null;
        ScheduleAnnouncementData scheduleAnnouncementData = null;
        ScheduleAnnouncementResponse response = api.scheduleAnnouncement(apiToken, scheduleAnnouncementData);
        // TODO: test validations
    }

    /**
     * Send a message
     *
     * ## Send a message  Sends a message to a channel. You can send a text message, a file message, and an admin message.  &gt;__Note__: With Sendbird Chat SDKs and the platform API, any type of files in messages can be uploaded to Sendbird server.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-send-a-message ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendMessageTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        SendMessageData sendMessageData = null;
        SendBirdMessageResponse response = api.sendMessage(apiToken, channelType, channelUrl, sendMessageData);
        // TODO: test validations
    }

    /**
     * Translate a message into other languages
     *
     * ## Translate a message into other languages  Translates a message into specific languages. Only text messages of which type is MESG can be translated into other languages.  &gt; __Note__: Message translation is powered by [Google Cloud Translation API recognition engine](https://cloud.google.com/translate/). Find language codes supported by the engine in the [Miscellaneous](https://sendbird.com/docs/chat/v3/platform-api/guides/Miscellaneous) page or visit the [Language Support](https://cloud.google.com/translate/docs/languages) for Google Cloud Translation.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-translate-a-message-into-other-languages ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void translateMessageIntoOtherLanguagesTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        Object body = null;
        SendBirdMessageResponse response = api.translateMessageIntoOtherLanguages(apiToken, channelType, channelUrl, messageId, body);
        // TODO: test validations
    }

    /**
     * Update an announcement
     *
     * ## Update an announcement  Updates information of a specific announcement before it starts or changes the status of a specific announcement after it starts. For the 2 different applications, refer to the request body below.  &gt;__Note__: Updating information of an announcement is possible only when the announcement status is scheduled, indicating it hasn&#39;t started yet.  https://sendbird.com/docs/chat/v3/platform-api/guides/announcements#2-update-an-announcement ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAnnouncementByIdTest() throws ApiException {
        String apiToken = null;
        String uniqueId = null;
        UpdateAnnouncementByIdData updateAnnouncementByIdData = null;
        UpdateAnnouncementByIdResponse response = api.updateAnnouncementById(apiToken, uniqueId, updateAnnouncementByIdData);
        // TODO: test validations
    }

    /**
     * Update an emoji category URL
     *
     * ## Update an emoji category URL  Updates the URL of an emoji category with the specified ID.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-category-url ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmojiCategoryUrlByIdTest() throws ApiException {
        String apiToken = null;
        String emojiCategoryId = null;
        UpdateEmojiCategoryUrlByIdData updateEmojiCategoryUrlByIdData = null;
        SendBirdEmojiCategory response = api.updateEmojiCategoryUrlById(apiToken, emojiCategoryId, updateEmojiCategoryUrlByIdData);
        // TODO: test validations
    }

    /**
     * Update an emoji URL
     *
     * ## Update an emoji URL  Updates the image URL of an emoji with the specified key.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-update-an-emoji-url ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmojiUrlByKeyTest() throws ApiException {
        String apiToken = null;
        String emojiKey = null;
        UpdateEmojiUrlByKeyData updateEmojiUrlByKeyData = null;
        SendBirdEmoji response = api.updateEmojiUrlByKey(apiToken, emojiKey, updateEmojiUrlByKeyData);
        // TODO: test validations
    }

    /**
     * Update extra data in a message
     *
     * ## Update extra data in a message  Updates the values of specific items by their keys.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-extra-data-in-a-message ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateExtraDataInMessageTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        UpdateExtraDataInMessageData updateExtraDataInMessageData = null;
        UpdateExtraDataInMessageResponse response = api.updateExtraDataInMessage(apiToken, channelType, channelUrl, messageId, updateExtraDataInMessageData);
        // TODO: test validations
    }

    /**
     * Update a message
     *
     * ## Update a message  Updates information on a message in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-update-a-message ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMessageByIdTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        UpdateMessageByIdData updateMessageByIdData = null;
        SendBirdMessageResponse response = api.updateMessageById(apiToken, channelType, channelUrl, messageId, updateMessageByIdData);
        // TODO: test validations
    }

    /**
     * Use default emojis
     *
     * ## Use default emojis  Determines whether to use the 7 default emojis initially provided.  https://sendbird.com/docs/chat/v3/platform-api/guides/emojis#2-use-default-emojis
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void useDefaultEmojisTest() throws ApiException {
        String apiToken = null;
        UseDefaultEmojisData useDefaultEmojisData = null;
        UseDefaultEmojisResponse response = api.useDefaultEmojis(apiToken, useDefaultEmojisData);
        // TODO: test validations
    }

    /**
     * View a message
     *
     * ## View a message  Retrieves information on a message.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-a-message ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.  &#x60;message_id&#x60;      Type: long      Description: Specifies the unique ID of the message to retrieve.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewMessageByIdTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        String messageId = null;
        Boolean withSortedMetaArray = null;
        Boolean withMetaArray = null;
        SendBirdMessageResponse response = api.viewMessageById(apiToken, channelType, channelUrl, messageId, withSortedMetaArray, withMetaArray);
        // TODO: test validations
    }

    /**
     * View total number of messages in a channel
     *
     * ## View total number of messages in a channel  Retrieves the total number of messages in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/messages#2-view-total-number-of-messages-in-a-channel ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewTotalNumberOfMessagesInChannelTest() throws ApiException {
        String apiToken = null;
        String channelType = null;
        String channelUrl = null;
        ViewTotalNumberOfMessagesInChannelResponse response = api.viewTotalNumberOfMessagesInChannel(apiToken, channelType, channelUrl);
        // TODO: test validations
    }

}
