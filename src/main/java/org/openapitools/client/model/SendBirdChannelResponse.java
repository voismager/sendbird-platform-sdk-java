/*
 * Sendbird Platform SDK
 * Sendbird Platform API SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendbird.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SendBirdGroupChannel;
import org.openapitools.client.model.SendBirdGroupChannelChannel;
import org.openapitools.client.model.SendBirdGroupChannelCreatedBy;
import org.openapitools.client.model.SendBirdGroupChannelDisappearingMessage;
import org.openapitools.client.model.SendBirdGroupChannelSmsFallback;
import org.openapitools.client.model.SendBirdMember;
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendBirdOpenChannel;
import org.openapitools.client.model.SendBirdUser;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.sendbird.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T21:22:01.103596+09:00[Asia/Seoul]")
@JsonDeserialize(using=SendBirdChannelResponse.SendBirdChannelResponseDeserializer.class)
@JsonSerialize(using = SendBirdChannelResponse.SendBirdChannelResponseSerializer.class)
public class SendBirdChannelResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SendBirdChannelResponse.class.getName());

    public static class SendBirdChannelResponseSerializer extends StdSerializer<SendBirdChannelResponse> {
        public SendBirdChannelResponseSerializer(Class<SendBirdChannelResponse> t) {
            super(t);
        }

        public SendBirdChannelResponseSerializer() {
            this(null);
        }

        @Override
        public void serialize(SendBirdChannelResponse value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class SendBirdChannelResponseDeserializer extends StdDeserializer<SendBirdChannelResponse> {
        public SendBirdChannelResponseDeserializer() {
            this(SendBirdChannelResponse.class);
        }

        public SendBirdChannelResponseDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public SendBirdChannelResponse deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize SendBirdGroupChannel
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(SendBirdGroupChannel.class);
                SendBirdChannelResponse ret = new SendBirdChannelResponse();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'SendBirdChannelResponse'", e);
            }

            // deserialize SendBirdOpenChannel
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(SendBirdOpenChannel.class);
                SendBirdChannelResponse ret = new SendBirdChannelResponse();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'SendBirdChannelResponse'", e);
            }

            throw new IOException(String.format("Failed deserialization for SendBirdChannelResponse: no match found"));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public SendBirdChannelResponse getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "SendBirdChannelResponse cannot be null");
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SendBirdChannelResponse() {
        super("anyOf", Boolean.FALSE);
    }

    public SendBirdChannelResponse(SendBirdGroupChannel o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SendBirdChannelResponse(SendBirdOpenChannel o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SendBirdGroupChannel", new GenericType<SendBirdGroupChannel>() {
        });
        schemas.put("SendBirdOpenChannel", new GenericType<SendBirdOpenChannel>() {
        });
        JSON.registerDescendants(SendBirdChannelResponse.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SendBirdChannelResponse.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * SendBirdGroupChannel, SendBirdOpenChannel
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(SendBirdGroupChannel.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SendBirdOpenChannel.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SendBirdGroupChannel, SendBirdOpenChannel");
    }

    /**
     * Get the actual instance, which can be the following:
     * SendBirdGroupChannel, SendBirdOpenChannel
     *
     * @return The actual instance (SendBirdGroupChannel, SendBirdOpenChannel)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SendBirdGroupChannel`. If the actual instance is not `SendBirdGroupChannel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SendBirdGroupChannel`
     * @throws ClassCastException if the instance is not `SendBirdGroupChannel`
     */
    public SendBirdGroupChannel getSendBirdGroupChannel() throws ClassCastException {
        return (SendBirdGroupChannel)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SendBirdOpenChannel`. If the actual instance is not `SendBirdOpenChannel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SendBirdOpenChannel`
     * @throws ClassCastException if the instance is not `SendBirdOpenChannel`
     */
    public SendBirdOpenChannel getSendBirdOpenChannel() throws ClassCastException {
        return (SendBirdOpenChannel)super.getActualInstance();
    }

}

