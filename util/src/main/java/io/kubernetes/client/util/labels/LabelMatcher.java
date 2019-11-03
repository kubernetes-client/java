package io.kubernetes.client.util.labels;

/**
 * The interface LabelValueMatcher is a boolean test checking whether a label value meets
 * requirements.
 */
public interface LabelMatcher {
  String getKey();
  /**
   * Returns true if a label value matches.
   *
   * @param s the label value
   * @return the boolean
   */
  boolean test(String s);
}
