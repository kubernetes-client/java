package io.kubernetes.client.custom;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.math.BigDecimal;

@JsonAdapter(Quantity.QuantityAdapter.class)
public class Quantity {

    private final BigDecimal number;
    private Format format;

    public enum Format {
        DECIMAL_EXPONENT(10), DECIMAL_SI(10), BINARY_SI(2);

        private int base;

        Format(final int base) {
            this.base = base;
        }

        public int getBase() {
            return base;
        }
    }

    public Quantity(final BigDecimal number, final Format format) {
        this.number = number;
        this.format = format;
    }

    public Quantity(final String value) {
        this.number = fromString(value).number;
        this.format = fromString(value).format;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public Format getFormat() {
        return format;
    }

    public static Quantity fromString(final String value) {
        return new QuantityFormatter().parse(value);
    }

    public String toSuffixedString() {
        return new QuantityFormatter().format(this);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "number=" + number +
                ", format=" + format +
                '}';
    }

    public class QuantityAdapter extends TypeAdapter<Quantity> {
        @Override
        public void write(JsonWriter jsonWriter, Quantity quantity) throws IOException {
            jsonWriter.value(quantity.toSuffixedString());
        }

        @Override
        public Quantity read(JsonReader jsonReader) throws IOException {
            return Quantity.fromString(jsonReader.nextString());
        }
    }
}
