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

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class QuantityFormatterTest {

  @Test
  void equalsAfterSerialAndDeSerial() {
    testSerialDeSerial("0.5Gi");
    testSerialDeSerial("0.5G");
    testSerialDeSerial("1Gi");
    testSerialDeSerial("1G");
    testSerialDeSerial("500Mi");
    testSerialDeSerial("500M");
    testSerialDeSerial("500m");
    testSerialDeSerial("0.5");
    testSerialDeSerial("1");
  }

  private static void testSerialDeSerial(String value) {
    Quantity quantity = Quantity.fromString(value);
    // simulate the serialize-method
    String suffixedString = quantity.toSuffixedString();
    // simulate the deserialize-method, @see io.kubernetes.client.custom.Quantity.QuantityAdapter
    Quantity deSerial = Quantity.fromString(suffixedString);

    assertThat(deSerial).isEqualTo(quantity);
  }

  @Test
  void parsePlain() {
    final Quantity quantity = new QuantityFormatter().parse("1");
    assertThat(quantity.getFormat()).isEqualTo(Quantity.Format.DECIMAL_SI);
    assertThat(quantity.getNumber()).isEqualTo(BigDecimal.valueOf(1));
  }

  @Test
  void parseFractional() {
    final Quantity quantity = new QuantityFormatter().parse("0.001");
    assertThat(quantity.getFormat()).isEqualTo(Quantity.Format.DECIMAL_SI);
    assertThat(quantity.getNumber()).isEqualTo(BigDecimal.valueOf(0.001));
  }

  @Test
  void parseFractionalUnit() {
    final Quantity quantity = new QuantityFormatter().parse("0.001m");
    assertThat(quantity.getFormat()).isEqualTo(Quantity.Format.DECIMAL_SI);
    assertThat(quantity.getNumber()).isEqualTo(new BigDecimal("0.000001"));
  }

  @Test
  void parseBinarySi() {
    final Quantity quantity = new QuantityFormatter().parse("1Ki");
    assertThat(quantity.getFormat()).isEqualTo(Quantity.Format.BINARY_SI);
    assertThat(quantity.getNumber()).isEqualTo(BigDecimal.valueOf(1024));
  }

  @Test
  void parseLargeNumeratorBinarySi() {
    final Quantity quantity = new QuantityFormatter().parse("32Mi");
    assertThat(quantity.getFormat()).isEqualTo(Quantity.Format.BINARY_SI);
    assertThat(
        quantity.getNumber()).isEqualTo(BigDecimal.valueOf(2).pow(20).multiply(BigDecimal.valueOf(32)));
  }

  @Test
  void parseExponent() {
    final Quantity quantity = new QuantityFormatter().parse("1e3");
    assertThat(quantity.getFormat()).isEqualTo(Quantity.Format.DECIMAL_EXPONENT);
    assertThat(quantity.getNumber()).isEqualTo(BigDecimal.valueOf(1000));
  }

  @Test
  void parseNegativeExponent() {
    final Quantity quantity = new QuantityFormatter().parse("1e-3");
    assertThat(quantity.getFormat()).isEqualTo(Quantity.Format.DECIMAL_EXPONENT);
    assertThat(quantity.getNumber()).isEqualTo(BigDecimal.valueOf(0.001));
  }

  @Test
  void parseBad() {
    assertThatThrownBy(() -> new QuantityFormatter().parse("4e9e"))
        .isInstanceOf(QuantityFormatException.class);
  }

  @Test
  void formatPlain() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(new BigDecimal("100"), Quantity.Format.DECIMAL_SI));
    assertThat(formattedString).isEqualTo("100");
  }

  @Test
  void formatDecimalSi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(new BigDecimal("100000"), Quantity.Format.DECIMAL_SI));
    assertThat(formattedString).isEqualTo("100k");
  }

  @Test
  void formatFractionalDecimalSi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(new BigDecimal("100.001"), Quantity.Format.DECIMAL_SI));
    assertThat(formattedString).isEqualTo("100001m");
  }

  @Test
  void formatBinarySi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(new BigDecimal(2).pow(20), Quantity.Format.BINARY_SI));
    assertThat(formattedString).isEqualTo("1Mi");
  }

  @Test
  void formatLessThan1024BinarySi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(128), Quantity.Format.BINARY_SI));
    assertThat(formattedString).isEqualTo("128");
  }

  @Test
  void formatNon1024BinarySi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(2056), Quantity.Format.BINARY_SI));
    assertThat(formattedString).isEqualTo("2056");
  }

  @Test
  void formatFractionalBinarySi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(123.123), Quantity.Format.BINARY_SI));
    assertThat(formattedString).isEqualTo("123123m");
  }

  @Test
  void formatDecimalExponent() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(1000000), Quantity.Format.DECIMAL_EXPONENT));
    assertThat(formattedString).isEqualTo("1e6");
  }

  @Test
  void formatEnforceExpOf3DecimalExponent() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(100000), Quantity.Format.DECIMAL_EXPONENT));
    assertThat(formattedString).isEqualTo("100e3");
  }

  @Test
  void formatNoExpDecimalExponent() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(12345), Quantity.Format.DECIMAL_EXPONENT));
    assertThat(formattedString).isEqualTo("12345");
  }

  @Test
  void formatLargeDecimalExponent() {
    final String formattedString2 =
            new QuantityFormatter()
                    .format(new Quantity(Float.toString(123456789012.f)));
    // Note: Beginning with JRE 21, this rounds down to 123456790e3
    assertThat(formattedString2).isIn("123456791e3", "123456790e3");
  }
}
