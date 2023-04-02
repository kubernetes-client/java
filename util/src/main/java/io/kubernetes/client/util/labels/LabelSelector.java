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

import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1LabelSelectorRequirement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * The type Label selector matches labels by requirements.
 * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
 */
public class LabelSelector implements Predicate<Map<String, String>> {

  public static final String LABEL_SELECTOR_OP_IN = "In";
  public static final String LABEL_SELECTOR_OP_NOT_IN = "NotIn";
  public static final String LABEL_SELECTOR_OP_EXISTS = "Exists";
  public static final String LABEL_SELECTOR_OP_DOES_NOT_EXIST = "DoesNotExist";

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

  /**
   * Transform a V1LabelSelector to LabelSelector
   *
   * @param ps V1LabelSelector from spec
   * @return the transformed LabelSelector
   */
  public static LabelSelector parse(V1LabelSelector ps) throws IllegalArgumentException {
    int matcherNum = 0;
    if (ps.getMatchLabels() != null) matcherNum = ps.getMatchLabels().size();
    if (ps.getMatchExpressions() != null) matcherNum = ps.getMatchExpressions().size();
    List<LabelMatcher> matchers = new ArrayList<>(matcherNum);
    if (ps.getMatchLabels() != null) {
      for (Map.Entry<String, String> entry : ps.getMatchLabels().entrySet()) {
        LabelMatcher m = EqualityMatcher.equal(entry.getKey(), entry.getValue());
        matchers.add(m);
      }
    }
    if (ps.getMatchExpressions() != null) {
      for (V1LabelSelectorRequirement expr : ps.getMatchExpressions()) {
        switch (expr.getOperator()) {
          case LABEL_SELECTOR_OP_IN:
            matchers.add(SetMatcher.in(expr.getKey(), expr.getValues().toArray(new String[0])));
            break;
          case LABEL_SELECTOR_OP_NOT_IN:
            matchers.add(SetMatcher.notIn(expr.getKey(), expr.getValues().toArray(new String[0])));
            break;
          case LABEL_SELECTOR_OP_EXISTS:
            matchers.add(SetMatcher.exists(expr.getKey()));
            break;
          case LABEL_SELECTOR_OP_DOES_NOT_EXIST:
            matchers.add(SetMatcher.notExists(expr.getKey()));
            break;
          default:
            throw new IllegalArgumentException(
                expr.getOperator() + " is not a valid pod selector operator");
        }
      }
    }
    return LabelSelector.and(matchers.toArray(matchers.toArray(new LabelMatcher[0])));
  }

  private LabelMatcher[] labelMatchers;

  @Override
  public boolean test(Map<String, String> labels) {
    return Arrays.stream(labelMatchers)
        .allMatch(matcher -> matcher.test(labels.get(matcher.getKey())));
  }

  @Override
  public String toString() {
    return Arrays.stream(labelMatchers).map(m -> m.toString()).collect(Collectors.joining(","));
  }
}
