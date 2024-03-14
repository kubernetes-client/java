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

import org.junit.jupiter.api.Test;

class SuffixFormatterTest {

  @Test
  void parseBinaryKi() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("Ki");
    assertThat(baseExponent.getBase()).isEqualTo(2);
    assertThat(baseExponent.getExponent()).isEqualTo(10);
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.BINARY_SI);
  }

  @Test
  void parseDecimalZero() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("");
    assertThat(baseExponent.getBase()).isEqualTo(10);
    assertThat(baseExponent.getExponent()).isZero();
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.DECIMAL_SI);
  }

  @Test
  void parseDecimalK() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("k");
    assertThat(baseExponent.getBase()).isEqualTo(10);
    assertThat(baseExponent.getExponent()).isEqualTo(3);
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.DECIMAL_SI);
  }

  @Test
  void parseDecimalExponent() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("E2");
    assertThat(baseExponent.getBase()).isEqualTo(10);
    assertThat(baseExponent.getExponent()).isEqualTo(2);
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.DECIMAL_EXPONENT);
  }

  @Test
  void parseDecimalExponentPositive() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("e+3");
    assertThat(baseExponent.getBase()).isEqualTo(10);
    assertThat(baseExponent.getExponent()).isEqualTo(3);
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.DECIMAL_EXPONENT);
  }

  @Test
  void parseDecimalExponentNegative() {
    final BaseExponent baseExponent = new SuffixFormatter().parse("e-3");
    assertThat(baseExponent.getBase()).isEqualTo(10);
    assertThat(baseExponent.getExponent()).isEqualTo(-3);
    assertThat(baseExponent.getFormat()).isEqualTo(Quantity.Format.DECIMAL_EXPONENT);
  }

  @Test
  void parseBad() {
    assertThatThrownBy(() -> new SuffixFormatter().parse("eKi"))
        .isInstanceOf(QuantityFormatException.class);
  }

  @Test
  void formatZeroDecimalExponent() {
    final String formattedString =
        new SuffixFormatter().format(Quantity.Format.DECIMAL_EXPONENT, 0);
    assertThat(formattedString).isEmpty();
  }

  @Test
  void formatDecimalExponent() {
    final String formattedString =
        new SuffixFormatter().format(Quantity.Format.DECIMAL_EXPONENT, 3);
    assertThat(formattedString).isEqualTo("e3");
  }

  @Test
  void formatZeroDecimalSi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, 0);
    assertThat(formattedString).isEmpty();
  }

  @Test
  void formatBadDecimalSi() {
    assertThatThrownBy(() -> new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, 2))
        .isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  void formatDecimalSi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, 3);
    assertThat(formattedString).isEqualTo("k");
  }

  @Test
  void formatNegativeDecimalSi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.DECIMAL_SI, -6);
    assertThat(formattedString).isEqualTo("u");
  }

  @Test
  void formatBinarySi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.BINARY_SI, 10);
    assertThat(formattedString).isEqualTo("Ki");
  }

  @Test
  void formatNoExponentBinarySi() {
    final String formattedString = new SuffixFormatter().format(Quantity.Format.BINARY_SI, 0);
    assertThat(formattedString).isEmpty();
  }

  @Test
  void formatBadBinarySi() {
    assertThatThrownBy(() -> new SuffixFormatter().format(Quantity.Format.BINARY_SI, 4))
        .isInstanceOf(IllegalArgumentException.class);
  }
}
