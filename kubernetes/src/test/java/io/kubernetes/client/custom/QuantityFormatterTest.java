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

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class QuantityFormatterTest {

  @Test
  public void testEqualsAfterSerialAndDeSerial() {
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

    Assert.assertEquals(quantity,deSerial);
  }

  @Test
  public void testParsePlain() {
    final Quantity quantity = new QuantityFormatter().parse("1");
    assertThat(quantity.getFormat(), is(Quantity.Format.DECIMAL_SI));
    assertThat(quantity.getNumber(), is(BigDecimal.valueOf(1)));
  }

  @Test
  public void testParseFractional() {
    final Quantity quantity = new QuantityFormatter().parse("0.001");
    assertThat(quantity.getFormat(), is(Quantity.Format.DECIMAL_SI));
    assertThat(quantity.getNumber(), is(BigDecimal.valueOf(0.001)));
  }

  @Test
  public void testParseFractionalUnit() {
    final Quantity quantity = new QuantityFormatter().parse("0.001m");
    assertThat(quantity.getFormat(), is(Quantity.Format.DECIMAL_SI));
    assertThat(quantity.getNumber(), is(new BigDecimal("0.000001")));
  }

  @Test
  public void testParseBinarySi() {
    final Quantity quantity = new QuantityFormatter().parse("1Ki");
    assertThat(quantity.getFormat(), is(Quantity.Format.BINARY_SI));
    assertThat(quantity.getNumber(), is(BigDecimal.valueOf(1024)));
  }

  @Test
  public void testParseLargeNumeratorBinarySi() {
    final Quantity quantity = new QuantityFormatter().parse("32Mi");
    assertThat(quantity.getFormat(), is(Quantity.Format.BINARY_SI));
    assertThat(
        quantity.getNumber(), is(BigDecimal.valueOf(2).pow(20).multiply(BigDecimal.valueOf(32))));
  }

  @Test
  public void testParseExponent() {
    final Quantity quantity = new QuantityFormatter().parse("1e3");
    assertThat(quantity.getFormat(), is(Quantity.Format.DECIMAL_EXPONENT));
    assertThat(quantity.getNumber(), is(BigDecimal.valueOf(1000)));
  }

  @Test
  public void testParseNegativeExponent() {
    final Quantity quantity = new QuantityFormatter().parse("1e-3");
    assertThat(quantity.getFormat(), is(Quantity.Format.DECIMAL_EXPONENT));
    assertThat(quantity.getNumber(), is(BigDecimal.valueOf(0.001)));
  }

  @Test(expected = QuantityFormatException.class)
  public void testParseBad() {
    new QuantityFormatter().parse("4e9e");
  }

  @Test
  public void testFormatPlain() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(new BigDecimal("100"), Quantity.Format.DECIMAL_SI));
    assertThat(formattedString, is("100"));
  }

  @Test
  public void testFormatDecimalSi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(new BigDecimal("100000"), Quantity.Format.DECIMAL_SI));
    assertThat(formattedString, is("100k"));
  }

  @Test
  public void testFormatFractionalDecimalSi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(new BigDecimal("100.001"), Quantity.Format.DECIMAL_SI));
    assertThat(formattedString, is("100001m"));
  }

  @Test
  public void testFormatBinarySi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(new BigDecimal(2).pow(20), Quantity.Format.BINARY_SI));
    assertThat(formattedString, is("1Mi"));
  }

  @Test
  public void testFormatLessThan1024BinarySi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(128), Quantity.Format.BINARY_SI));
    assertThat(formattedString, is("128"));
  }

  @Test
  public void testFormatNon1024BinarySi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(2056), Quantity.Format.BINARY_SI));
    assertThat(formattedString, is("2056"));
  }

  @Test
  public void testFormatFractionalBinarySi() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(123.123), Quantity.Format.BINARY_SI));
    assertThat(formattedString, is("123123m"));
  }

  @Test
  public void testFormatDecimalExponent() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(1000000), Quantity.Format.DECIMAL_EXPONENT));
    assertThat(formattedString, is("1e6"));
  }

  @Test
  public void testFormatEnforceExpOf3DecimalExponent() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(100000), Quantity.Format.DECIMAL_EXPONENT));
    assertThat(formattedString, is("100e3"));
  }

  @Test
  public void testFormatNoExpDecimalExponent() {
    final String formattedString =
        new QuantityFormatter()
            .format(new Quantity(BigDecimal.valueOf(12345), Quantity.Format.DECIMAL_EXPONENT));
    assertThat(formattedString, is("12345"));
  }

  @Test
  public void testFormatLargeDecimalExponent() {
    final String formattedString2 =
            new QuantityFormatter()
                    .format(new Quantity(Float.toString(123456789012.f)));
    assertThat(formattedString2, is("123456791e3"));
  }
}
