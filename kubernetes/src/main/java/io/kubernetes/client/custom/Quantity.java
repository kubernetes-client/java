/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.custom;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;
import org.apache.commons.lang3.ObjectUtils;

@JsonAdapter(Quantity.QuantityAdapter.class)
public class Quantity {

  private final BigDecimal number;
  private Format format;

  public enum Format {
    DECIMAL_EXPONENT(10),
    DECIMAL_SI(10),
    BINARY_SI(2);

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
    final Quantity quantity = fromString(value);
    this.number = quantity.number;
    this.format = quantity.format;
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
    return "Quantity{" + "number=" + number + ", format=" + format + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Quantity otherQuantity = (Quantity) o;
    return ObjectUtils.compare(this.number, otherQuantity.number) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(number);
  }

  public static class QuantityAdapter extends TypeAdapter<Quantity> {
    @Override
    public void write(JsonWriter jsonWriter, Quantity quantity) throws IOException {
      jsonWriter.value(quantity != null ? quantity.toSuffixedString() : null);
    }

    @Override
    public Quantity read(JsonReader jsonReader) throws IOException {
      return Quantity.fromString(jsonReader.nextString());
    }
  }
}
