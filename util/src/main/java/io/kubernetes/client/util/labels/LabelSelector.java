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

import io.kubernetes.client.fluent.Predicate;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The type Label selector matches labels by requirements.
 * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
 */
public class LabelSelector implements Predicate<Map<String, String>> {

  LabelSelector(LabelMatcher... matchers) {
    this.labelMatchers = matchers;
  }

  /**
   * Constructs a new label selector from a conjunction of label matcher.
   *
   * @param matchers the label matchers
   * @return the label selector
   */
  public static LabelSelector and(LabelMatcher... matchers) {
    return new LabelSelector(matchers);
  }

  /**
   * Constructs a new label selector that matches everything.
   *
   * @return the empty label selector
   */
  public static LabelSelector empty() {
    return and();
  }

  private LabelMatcher[] labelMatchers;

  @Override
  public Boolean apply(Map<String, String> labels) {
    return Arrays.stream(labelMatchers)
        .allMatch(matcher -> matcher.test(labels.get(matcher.getKey())));
  }

  @Override
  public String toString() {
    return Arrays.stream(labelMatchers).map(m -> m.toString()).collect(Collectors.joining(","));
  }
}
