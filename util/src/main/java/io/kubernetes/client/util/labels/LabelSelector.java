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
