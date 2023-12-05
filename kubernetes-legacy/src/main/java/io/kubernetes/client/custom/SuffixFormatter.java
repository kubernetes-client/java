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

import java.util.HashMap;
import java.util.Map;

public class SuffixFormatter {

  private static final Map<String, BaseExponent> suffixToBinary =
      new HashMap<String, BaseExponent>() {
        {
          put("", new BaseExponent(2, 0, Quantity.Format.BINARY_SI));
          put("Ki", new BaseExponent(2, 10, Quantity.Format.BINARY_SI));
          put("Mi", new BaseExponent(2, 20, Quantity.Format.BINARY_SI));
          put("Gi", new BaseExponent(2, 30, Quantity.Format.BINARY_SI));
          put("Ti", new BaseExponent(2, 40, Quantity.Format.BINARY_SI));
          put("Pi", new BaseExponent(2, 50, Quantity.Format.BINARY_SI));
          put("Ei", new BaseExponent(2, 60, Quantity.Format.BINARY_SI));
        }
      };

  private static final Map<String, BaseExponent> suffixToDecimal =
      new HashMap<String, BaseExponent>() {
        {
          put("n", new BaseExponent(10, -9, Quantity.Format.DECIMAL_SI));
          put("u", new BaseExponent(10, -6, Quantity.Format.DECIMAL_SI));
          put("m", new BaseExponent(10, -3, Quantity.Format.DECIMAL_SI));
          put("", new BaseExponent(10, 0, Quantity.Format.DECIMAL_SI));
          put("k", new BaseExponent(10, 3, Quantity.Format.DECIMAL_SI));
          put("M", new BaseExponent(10, 6, Quantity.Format.DECIMAL_SI));
          put("G", new BaseExponent(10, 9, Quantity.Format.DECIMAL_SI));
          put("T", new BaseExponent(10, 12, Quantity.Format.DECIMAL_SI));
          put("P", new BaseExponent(10, 15, Quantity.Format.DECIMAL_SI));
          put("E", new BaseExponent(10, 18, Quantity.Format.DECIMAL_SI));
        }
      };

  private static final Map<BaseExponent, String> decimalToSuffix =
      new HashMap<BaseExponent, String>() {
        {
          for (Entry<String, BaseExponent> entry : suffixToDecimal.entrySet()) {
            put(entry.getValue(), entry.getKey());
          }
        }
      };

  private static final Map<BaseExponent, String> binaryToSuffix =
      new HashMap<BaseExponent, String>() {
        {
          for (Entry<String, BaseExponent> entry : suffixToBinary.entrySet()) {
            put(entry.getValue(), entry.getKey());
          }
        }
      };

  public BaseExponent parse(final String suffix) {
    final BaseExponent decimalSuffix = suffixToDecimal.get(suffix);
    if (decimalSuffix != null) {
      return decimalSuffix;
    }

    final BaseExponent binarySuffix = suffixToBinary.get(suffix);
    if (binarySuffix != null) {
      return binarySuffix;
    }

    if (suffix.length() > 0 && (suffix.charAt(0) == 'E' || suffix.charAt(0) == 'e')) {
      return extractDecimalExponent(suffix);
    }

    throw new QuantityFormatException("Could not parse suffix");
  }

  private BaseExponent extractDecimalExponent(String suffix) {
    try {
      final int exponent = Integer.parseInt(suffix.substring(1));
      return new BaseExponent(10, exponent, Quantity.Format.DECIMAL_EXPONENT);
    } catch (final NumberFormatException e) {
      throw new QuantityFormatException("Can't parse decimal exponent from " + suffix.substring(1));
    }
  }

  public String format(final Quantity.Format format, final int exponent) {
    switch (format) {
      case DECIMAL_SI:
        return getDecimalSiSuffix(exponent);
      case BINARY_SI:
        return getBinarySiSuffix(exponent);
      case DECIMAL_EXPONENT:
        return exponent == 0 ? "" : "e" + exponent;
      default:
        throw new IllegalStateException("Can't format " + format + " with exponent " + exponent);
    }
  }

  private String getBinarySiSuffix(int exponent) {
    final String suffix =
        binaryToSuffix.get(new BaseExponent(2, exponent, Quantity.Format.BINARY_SI));
    if (suffix == null) {
      throw new IllegalArgumentException("No suffix for exponent" + exponent);
    }
    return suffix;
  }

  private String getDecimalSiSuffix(int exponent) {
    final String suffix =
        decimalToSuffix.get(new BaseExponent(10, exponent, Quantity.Format.DECIMAL_SI));
    if (suffix == null) {
      throw new IllegalArgumentException("No suffix for exponent" + exponent);
    }
    return suffix;
  }
}
