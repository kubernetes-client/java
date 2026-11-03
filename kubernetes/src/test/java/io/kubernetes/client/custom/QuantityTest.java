/*
Copyright 2024 The Kubernetes Authors.
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

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuantityTest {

  @Test
  void containsInSet() {
    final List<String> values = List.of("0.5Gi", "0.5G", "1Gi", "1G", "500Mi", "500M", "500m", "0.5", "1");
    final Set<Quantity> set1 = values.stream().map(Quantity::fromString).collect(Collectors.toSet());
    final Set<Quantity> set2 = values.stream().map(Quantity::fromString).collect(Collectors.toSet());

    assertEquals(set1, set2, "Sets of equal elements are not equal");
  }

  @Test
  void equalQuantitiesWithDifferentScaleHaveEqualHashCode() {
    // "1" parses to scale 0; "1000m" parses to 1000 * 10^-3 = 1.000 (scale 3). They are equal by
    // value, so the equals/hashCode contract requires equal hash codes (and HashSet membership).
    final Quantity a = Quantity.fromString("1");
    final Quantity b = Quantity.fromString("1000m");

    assertEquals(a, b, "quantities with the same value should be equal");
    assertEquals(
        a.hashCode(), b.hashCode(), "equal quantities must have equal hash codes (equals/hashCode contract)");
    assertEquals(Set.of(a), Set.of(b), "equal quantities must be interchangeable as hash-set members");
  }
}
