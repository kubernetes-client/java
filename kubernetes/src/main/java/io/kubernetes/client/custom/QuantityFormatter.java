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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.apache.commons.lang3.tuple.Pair;

public class QuantityFormatter {

  private static final String PARTS_RE = "[eEinumkKMGTP]+";

  public Quantity parse(final String value) {
    if (value == null || value.isEmpty()) {
      throw new QuantityFormatException("");
    }
    final String[] parts = value.split(PARTS_RE);
    final BigDecimal numericValue = parseNumericValue(parts[0]);
    final String suffix = value.substring(parts[0].length());
    final BaseExponent baseExponent = new SuffixFormatter().parse(suffix);
    final BigDecimal unitMultiplier =
        BigDecimal.valueOf(baseExponent.getBase())
            .pow(baseExponent.getExponent(), MathContext.DECIMAL64);
    final BigDecimal unitlessValue = numericValue.multiply(unitMultiplier);
    return new Quantity(unitlessValue, baseExponent.getFormat());
  }

  private static BigDecimal parseNumericValue(String part) {
    try {
      return new BigDecimal(part);
    } catch (final NumberFormatException e) {
      throw new QuantityFormatException("Unable to parse numeric part of quantity: " + part);
    }
  }

  public String format(final Quantity quantity) {
    switch (quantity.getFormat()) {
      case DECIMAL_SI:
      case DECIMAL_EXPONENT:
        return toBase10String(quantity);
      case BINARY_SI:
        if (isFractional(quantity)) {
          return toBase10String(new Quantity(quantity.getNumber(), Quantity.Format.DECIMAL_SI));
        }
        return toBase1024String(quantity);
      default:
        throw new IllegalArgumentException("Can't format a " + quantity.getFormat() + " quantity");
    }
  }

  private boolean isFractional(Quantity quantity) {
    return quantity.getNumber().scale() > 0;
  }

  private String toBase1024String(final Quantity quantity) {
    final BigDecimal amount = quantity.getNumber();
    final BigInteger value = amount.unscaledValue();
    final int exponent = -amount.scale();
    final Pair<BigInteger, Integer> resultAndTimes = removeFactorsForBase(value, BigInteger.valueOf(1024));
    return resultAndTimes.getLeft()
        + new SuffixFormatter()
            .format(quantity.getFormat(), exponent + resultAndTimes.getRight() * 10);
  }

  private String toBase10String(final Quantity quantity) {
    final BigDecimal amount = quantity.getNumber();
    final BigInteger value = amount.unscaledValue();
    final int exponent = -amount.scale();
    final Pair<BigInteger, Integer> resultAndTimes = removeFactorsForBase(value, BigInteger.TEN);
    final int postFactoringExponent = exponent + resultAndTimes.getRight();
    final Pair<BigInteger, Integer> valueAndExponent =
        ensureExponentIsMultipleOf3(resultAndTimes.getLeft(), postFactoringExponent);
    return valueAndExponent.getLeft()
        + new SuffixFormatter().format(quantity.getFormat(), valueAndExponent.getRight());
  }

  private Pair<BigInteger, Integer> ensureExponentIsMultipleOf3(final BigInteger mantissa, final int exponent) {
    final long exponentRemainder = exponent % 3;
    if (exponentRemainder == 1 || exponentRemainder == -2) {
      return Pair.of(mantissa.multiply(BigInteger.TEN), exponent - 1);
    } else if (exponentRemainder == -1 || exponentRemainder == 2) {
      return Pair.of(mantissa.multiply(BigInteger.valueOf(100)), exponent - 2);
    } else {
      return Pair.of(mantissa, exponent);
    }
  }

  private Pair<BigInteger, Integer> removeFactorsForBase(final BigInteger value, final BigInteger base) {
    int times = 0;
    BigInteger result = value;
    while (result.compareTo(base) >= 0 && result.mod(base).equals(BigInteger.ZERO)) {
      times++;
      result = result.divide(base);
    }
    return Pair.of(result, times);
  }
}
