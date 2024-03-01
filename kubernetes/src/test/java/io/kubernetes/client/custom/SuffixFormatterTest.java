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

import org.junit.Test;

public class SuffixFormatterTest {

  @Test
  public void testParseBinaryKi() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("Ki");
    assertThat(baseExponent.getBase()).isEqualTo(2);
    assertThat(baseExponent.getExponent()).isEqualTo(10);
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.BINARY_SI);
  }

  @Test
  public void testParseDecimalZero() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("");
    assertThat(baseExponent.getBase()).isEqualTo(10);
    assertThat(baseExponent.getExponent()).isZero();
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.DECIMAL_SI);
  }

  @Test
  public void testParseDecimalK() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("k");
    assertThat(baseExponent.getBase()).isEqualTo(10);
    assertThat(baseExponent.getExponent()).isEqualTo(3);
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.DECIMAL_SI);
  }

  @Test
  public void testParseDecimalExponent() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("E2");
    assertThat(baseExponent.getBase()).isEqualTo(10);
    assertThat(baseExponent.getExponent()).isEqualTo(2);
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.DECIMAL_EXPONENT);
  }

  @Test
  public void testParseDecimalExponentPositive() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("e+3");
    assertThat(baseExponent.getBase()).isEqualTo(10);
    assertThat(baseExponent.getExponent()).isEqualTo(3);
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.DECIMAL_EXPONENT);
  }

  @Test
  public void testParseDecimalExponentNegative() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("e-3");
    assertThat(baseExponent.getBase()).isEqualTo(10);
    assertThat(baseExponent.getExponent()).isEqualTo(-3);
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.DECIMAL_EXPONENT);
  }

  @Test(expected = QuantityFormatException.class)
  public void testParseBad() {
    new SuffixFormatter().parse("eKi");
  }

  @Test
  public void testFormatZeroDecimalExponent() {
    final String formattedString =
        new SuffixFormatter().format(Quantity.Format.DECIMAL_EXPONENT, 0);
    assertThat(formattedString).isEmpty();
  }

  @Test
  public void testFormatDecimalExponent() {
    final String formattedString =
        new SuffixFormatter().format(Quantity.Format.DECIMAL_EXPONENT, 3);
    assertThat(formattedString).isEqualTo("e3");
  }

  @Test
  public void testFormatZeroDecimalSi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, 0);
    assertThat(formattedString).isEmpty();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFormatBadDecimalSi() {
    new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, 2);
  }

  @Test
  public void testFormatDecimalSi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, 3);
    assertThat(formattedString).isEqualTo("k");
  }

  @Test
  public void testFormatNegativeDecimalSi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, -6);
    assertThat(formattedString).isEqualTo("u");
  }

  @Test
  public void testFormatBinarySi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.BINARY_SI, 10);
    assertThat(formattedString).isEqualTo("Ki");
  }

  @Test
  public void testFormatNoExponentBinarySi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.BINARY_SI, 0);
    assertThat(formattedString).isEmpty();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFormatBadBinarySi() {
    new SuffixFormatter().format(Quantity.Format.BINARY_SI, 4);
  }
}
