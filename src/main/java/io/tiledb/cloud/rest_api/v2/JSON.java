/*
 * Tiledb Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 1.4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tiledb.cloud.rest_api.v2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;

import io.tiledb.cloud.rest_api.v2.model.AWSCredential;
import io.tiledb.cloud.rest_api.v2.model.AWSRole;
import io.tiledb.cloud.rest_api.v2.model.AccessCredential;
import io.tiledb.cloud.rest_api.v2.model.AccessCredentialCredential;
import io.tiledb.cloud.rest_api.v2.model.AccessCredentialRole;
import io.tiledb.cloud.rest_api.v2.model.AccessCredentialToken;
import io.tiledb.cloud.rest_api.v2.model.AccessCredentialsData;
import io.tiledb.cloud.rest_api.v2.model.Array;
import io.tiledb.cloud.rest_api.v2.model.ArrayActivityLog;
import io.tiledb.cloud.rest_api.v2.model.ArrayActivityLogData;
import io.tiledb.cloud.rest_api.v2.model.ArrayDirectory;
import io.tiledb.cloud.rest_api.v2.model.ArrayFetch;
import io.tiledb.cloud.rest_api.v2.model.ArrayMetadata;
import io.tiledb.cloud.rest_api.v2.model.ArrayMetadataEntry;
import io.tiledb.cloud.rest_api.v2.model.ArraySchema;
import io.tiledb.cloud.rest_api.v2.model.ArraySchemaEntry;
import io.tiledb.cloud.rest_api.v2.model.ArraySchemaMap;
import io.tiledb.cloud.rest_api.v2.model.Attribute;
import io.tiledb.cloud.rest_api.v2.model.AttributeBufferHeader;
import io.tiledb.cloud.rest_api.v2.model.AttributeBufferSize;
import io.tiledb.cloud.rest_api.v2.model.AzureCredential;
import io.tiledb.cloud.rest_api.v2.model.AzureToken;
import io.tiledb.cloud.rest_api.v2.model.DeleteAndUpdateTileLocation;
import io.tiledb.cloud.rest_api.v2.model.Dimension;
import io.tiledb.cloud.rest_api.v2.model.DimensionTileExtent;
import io.tiledb.cloud.rest_api.v2.model.Domain;
import io.tiledb.cloud.rest_api.v2.model.DomainArray;
import io.tiledb.cloud.rest_api.v2.model.Error;
import io.tiledb.cloud.rest_api.v2.model.FileUploaded;
import io.tiledb.cloud.rest_api.v2.model.Filter;
import io.tiledb.cloud.rest_api.v2.model.FilterData;
import io.tiledb.cloud.rest_api.v2.model.FilterPipeline;
import io.tiledb.cloud.rest_api.v2.model.FloatScaleConfig;
import io.tiledb.cloud.rest_api.v2.model.FragmentMetadata;
import io.tiledb.cloud.rest_api.v2.model.GCPInteroperabilityCredential;
import io.tiledb.cloud.rest_api.v2.model.GCPServiceAccountKey;
import io.tiledb.cloud.rest_api.v2.model.GenericTileOffsets;
import io.tiledb.cloud.rest_api.v2.model.GroupContentActivity;
import io.tiledb.cloud.rest_api.v2.model.GroupContentActivityAsset;
import io.tiledb.cloud.rest_api.v2.model.GroupContentActivityResponse;
import io.tiledb.cloud.rest_api.v2.model.GroupContentsChangesRequest;
import io.tiledb.cloud.rest_api.v2.model.GroupContentsChangesRequestGroupChanges;
import io.tiledb.cloud.rest_api.v2.model.GroupContentsRetrievalRequest;
import io.tiledb.cloud.rest_api.v2.model.GroupContentsRetrievalResponse;
import io.tiledb.cloud.rest_api.v2.model.GroupCreationRequest;
import io.tiledb.cloud.rest_api.v2.model.GroupCreationRequestGroupDetails;
import io.tiledb.cloud.rest_api.v2.model.GroupCreationResponse;
import io.tiledb.cloud.rest_api.v2.model.GroupMember;
import io.tiledb.cloud.rest_api.v2.model.GroupMetadataRetrievalRequest;
import io.tiledb.cloud.rest_api.v2.model.GroupMetadataUpdateRequest;
import io.tiledb.cloud.rest_api.v2.model.GroupRegistrationRequest;
import io.tiledb.cloud.rest_api.v2.model.GroupRegistrationRequestGroupDetails;
import io.tiledb.cloud.rest_api.v2.model.Metadata;
import io.tiledb.cloud.rest_api.v2.model.MetadataEntry;
import io.tiledb.cloud.rest_api.v2.model.NonEmptyDomain;
import io.tiledb.cloud.rest_api.v2.model.NonEmptyDomainList;
import io.tiledb.cloud.rest_api.v2.model.NotebookUploaded;
import io.tiledb.cloud.rest_api.v2.model.PaginationMetadata;
import io.tiledb.cloud.rest_api.v2.model.Query;
import io.tiledb.cloud.rest_api.v2.model.QueryReader;
import io.tiledb.cloud.rest_api.v2.model.ReadState;
import io.tiledb.cloud.rest_api.v2.model.Subarray;
import io.tiledb.cloud.rest_api.v2.model.SubarrayPartitioner;
import io.tiledb.cloud.rest_api.v2.model.SubarrayPartitionerCurrent;
import io.tiledb.cloud.rest_api.v2.model.SubarrayPartitionerState;
import io.tiledb.cloud.rest_api.v2.model.SubarrayRanges;
import io.tiledb.cloud.rest_api.v2.model.TileDBConfig;
import io.tiledb.cloud.rest_api.v2.model.TileDBConfigEntriesInner;
import io.tiledb.cloud.rest_api.v2.model.TimestampedURI;
import io.tiledb.cloud.rest_api.v2.model.Writer;
import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new AWSCredential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AWSRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AccessCredential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AccessCredentialCredential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AccessCredentialRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AccessCredentialToken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AccessCredentialsData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Array.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ArrayActivityLog.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ArrayActivityLogData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ArrayDirectory.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ArrayFetch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ArrayMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ArrayMetadataEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ArraySchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ArraySchemaEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ArraySchemaMap.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Attribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AttributeBufferHeader.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AttributeBufferSize.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AzureCredential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AzureToken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new DeleteAndUpdateTileLocation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Dimension.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new DimensionTileExtent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Domain.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new DomainArray.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Error.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new FileUploaded.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Filter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new FilterData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new FilterPipeline.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new FloatScaleConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new FragmentMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GCPInteroperabilityCredential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GCPServiceAccountKey.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GenericTileOffsets.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupContentActivity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupContentActivityAsset.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupContentActivityResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupContentsChangesRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupContentsChangesRequestGroupChanges.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupContentsRetrievalRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupContentsRetrievalResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupCreationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupCreationRequestGroupDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupCreationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupMember.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupMetadataRetrievalRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupMetadataUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupRegistrationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new GroupRegistrationRequestGroupDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Metadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new MetadataEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new NonEmptyDomain.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new NonEmptyDomainList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new NotebookUploaded.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new PaginationMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Query.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new QueryReader.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new ReadState.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Subarray.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SubarrayPartitioner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SubarrayPartitionerCurrent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SubarrayPartitionerState.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new SubarrayRanges.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TileDBConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TileDBConfigEntriesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new TimestampedURI.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new Writer.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
