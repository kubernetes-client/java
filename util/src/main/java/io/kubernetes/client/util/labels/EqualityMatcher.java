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
package io.kubernetes.client.util.labels;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Equality-based matcher for label-selection.
 * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#equality-based-requirement
 */
public class EqualityMatcher implements LabelMatcher {

  EqualityMatcher(String key, Operator operator, String value) {
    this.key = key;
    this.operator = operator;
    this.value = value;
  }

  private Operator operator;
  private String key;
  private String value;

  /**
   * The "equal" matcher. Matches a label iff the label is present and equal.
   *
   * @param key the matching label key
   * @param value the matching label value
   * @return the equality matcher
   */
  public static EqualityMatcher equal(String key, String value) {
    return new EqualityMatcher(key, Operator.EQUAL, value);
  }

  /**
   * The "not equal" matcher. Matches a label iff the label is not present or not equal.
   *
   * @param key the matching label key
   * @param value the matching label value
   * @return the equality matcher
   */
  public static EqualityMatcher notEqual(String key, String value) {
    return new EqualityMatcher(key, Operator.NOT_EQUAL, value);
  }

  @Override
  public String toString() {
    return new StringBuilder()
        .append(key)
        .append(" ")
        .append(operator.name)
        .append(" ")
        .append(value)
        .toString();
  }

  @Override
  public boolean test(String s) {
    return operator.with(value).test(s);
  }

  @Override
  public String getKey() {
    return key;
  }

  private enum Operator {
    EQUAL(
        "=",
        arg -> {
          return v -> arg.equals(v);
        }),
    DOUBLE_EQUAL(
        "==",
        arg -> {
          return v -> arg.equals(v);
        }),
    NOT_EQUAL(
        "!=",
        arg -> {
          return v -> !arg.equals(v);
        });

    Operator(String name, Function<String, Predicate<String>> matcherFunc) {
      this.name = name;
      this.matcherFunc = matcherFunc;
    }

    private final String name;
    private final Function<String, Predicate<String>> matcherFunc;

    Predicate<String> with(String value) {
      return matcherFunc.apply(value);
    }
  }
}
