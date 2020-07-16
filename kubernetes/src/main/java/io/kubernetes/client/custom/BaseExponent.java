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

public class BaseExponent {

  private final int base;
  private final int exponent;
  private final Quantity.Format format;

  public BaseExponent(final int base, final int exponent, final Quantity.Format format) {
    this.base = base;
    this.exponent = exponent;
    this.format = format;
  }

  public int getBase() {
    return base;
  }

  public int getExponent() {
    return exponent;
  }

  public Quantity.Format getFormat() {
    return format;
  }

  @Override
  public String toString() {
    return "BaseExponent{" + "base=" + base + ", exponent=" + exponent + ", format=" + format + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    BaseExponent that = (BaseExponent) o;

    return base == that.base && exponent == that.exponent && format == that.format;
  }

  @Override
  public int hashCode() {
    return this.toString().hashCode();
  }
}
