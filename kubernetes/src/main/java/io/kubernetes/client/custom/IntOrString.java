package io.kubernetes.client.custom;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

@JsonAdapter(IntOrString.IntOrStringAdapter.class)
public class IntOrString {
    private final boolean isInt;
    private final String strValue;
    private final Integer intValue;

    public IntOrString(final String value) {
        this.isInt = false;
        this.strValue = value;
        this.intValue = null;
    }

    public IntOrString(final int value) {
        this.isInt = true;
        this.intValue = value;
        this.strValue = null;
    }

    public boolean isInteger() {
        return isInt;
    }

    public String getStrValue() {
        if (isInt) {
            throw new IllegalStateException("Not a string");
        }
        return strValue;
    }

    public Integer getIntValue() {
        if (!isInt) {
            throw new IllegalStateException("Not an integer");
        }
        return intValue;
    }

    public static class IntOrStringAdapter extends TypeAdapter<IntOrString> {
        @Override
        public void write(JsonWriter jsonWriter, IntOrString intOrString) throws IOException {
            if (intOrString.isInteger()) {
                jsonWriter.value(intOrString.getIntValue());
            } else {
                jsonWriter.value(intOrString.getStrValue());
            }
        }

        @Override
        public IntOrString read(JsonReader jsonReader) throws IOException {
            final JsonToken nextToken = jsonReader.peek();
            if (nextToken == JsonToken.NUMBER) {
                return new IntOrString(jsonReader.nextInt());
            } else if (nextToken == JsonToken.STRING) {
                return new IntOrString(jsonReader.nextString());
            } else {
                throw new IllegalStateException("Could not deserialize to IntOrString. Was " + nextToken);
            }
        }
    }
}
