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

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Set-based matcher for label-selection.
 * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#set-based-requirement
 */
public class SetMatcher implements LabelMatcher {

  SetMatcher(String key, SetMatcher.Operator operator) {
    this(key, operator, new String[] {});
  }

  /**
   * Instantiates a new Set matcher.
   *
   * @param key the matching label key
   * @param operator the matching label operator
   * @param values the values
   */
  SetMatcher(String key, SetMatcher.Operator operator, String[] values) {
    this.key = key;
    this.operator = operator;
    this.values = values;
  }

  private SetMatcher.Operator operator;
  private String key;
  private String[] values;

  /**
   * The "in" set matcher. Matches if the label exists in the set.
   *
   * @param key the key
   * @param values the values
   * @return the set matcher
   */
  public static SetMatcher in(String key, String... values) {
    return new SetMatcher(key, Operator.IN, values);
  }

  /**
   * The "not in" set matcher. Matches if the label doesn't exist in the set.
   *
   * @param key the key
   * @param values the values
   * @return the set matcher
   */
  public static SetMatcher notIn(String key, String... values) {
    return new SetMatcher(key, Operator.NOT_IN, values);
  }

  /**
   * The "exists" set matcher. Matches if the label is present in the set.
   *
   * @param key the key
   * @return the set matcher
   */
  public static SetMatcher exists(String key) {
    return new SetMatcher(key, Operator.EXISTS);
  }

  /**
   * The "not exists" set matcher. Matches if the label is not present in the set.
   *
   * @param key the key
   * @return the set matcher
   */
  public static SetMatcher notExists(String key) {
    return new SetMatcher(key, Operator.NOT_EXISTS);
  }

  @Override
  public String toString() {
    switch (operator) {
      case IN:
      case NOT_IN:
        return new StringBuilder()
            .append(key)
            .append(" ")
            .append(operator.name)
            .append(" ")
            .append("(")
            .append(Arrays.stream(this.values).collect(Collectors.joining(",")))
            .append(")")
            .toString();
      case EXISTS:
      case NOT_EXISTS:
        return operator.name + key;
      default:
        throw new IllegalStateException("unknown operator " + operator.name);
    }
  }

  @Override
  public String getKey() {
    return key;
  }

  @Override
  public boolean test(String s) {
    return operator.with(values).test(s);
  }

  private enum Operator {
    IN(
        "in",
        args -> {
          return v -> contains(args, v);
        }),
    NOT_IN(
        "notin",
        args -> {
          return v -> !contains(args, v);
        }),
    EXISTS(
        "",
        args -> {
          return v -> v != null;
        }),
    NOT_EXISTS(
        "!",
        args -> {
          return v -> v == null;
        });

    Operator(String name, Function<String[], Predicate<String>> matcherFunc) {
      this.name = name;
      this.matcherFunc = matcherFunc;
    }

    private final String name;
    private final Function<String[], Predicate<String>> matcherFunc;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
      return name;
    }

    Predicate<String> with(String... values) {
      return matcherFunc.apply(values);
    }

    private static boolean contains(String[] strs, String s) {
      return Arrays.stream(strs).anyMatch(arg -> arg.equals(s));
    }
  }
}
