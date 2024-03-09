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

import static io.kubernetes.client.util.labels.EqualityMatcher.equal;
import static io.kubernetes.client.util.labels.EqualityMatcher.notEqual;
import static io.kubernetes.client.util.labels.SetMatcher.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.kubernetes.client.openapi.models.V1LabelSelectorRequirement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

class LabelSelectorTest {

  @Test
  void normalLabelSelectionEqualShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(equal("foo", "v1"));
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            })).isTrue();
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v2");
              }
            })).isFalse();
    assertThat(labelSelector).hasToString("foo = v1");
  }

  @Test
  void normalLabelSelectionNotEqualShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(notEqual("foo", "v1"));
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v2");
              }
            })).isTrue();
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            })).isFalse();
    assertThat(labelSelector).hasToString("foo != v1");
  }

  @Test
  void normalLabelSelectionInShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(in("foo", "v1", "v2"));
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            })).isTrue();
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v2");
              }
            })).isTrue();
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v3");
              }
            })).isFalse();
    assertThat(labelSelector).hasToString("foo in (v1,v2)");
  }

  @Test
  void normalLabelSelectionNotInShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(notIn("foo", "v1", "v2"));
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            })).isFalse();
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v2");
              }
            })).isFalse();
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v3");
              }
            })).isTrue();
    assertThat(labelSelector).hasToString("foo notin (v1,v2)");
  }

  @Test
  void normalLabelSelectionConjuctionShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(in("foo", "v1", "v2"), equal("fok", "v1"));
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
                put("fok", "v1");
              }
            })).isTrue();
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v2");
              }
            })).isFalse();
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("fok", "v1");
              }
            })).isFalse();
    assertThat(labelSelector).hasToString("foo in (v1,v2),fok = v1");
  }

  @Test
  void normalLabelSelectionExistsShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(exists("foo"));
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            })).isTrue();
    assertThat(labelSelector.test(new HashMap<String, String>())).isFalse();
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("fok", "v1");
              }
            })).isFalse();
    assertThat(labelSelector).hasToString("foo");
  }

  @Test
  void normalLabelSelectionNotExistsShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(notExists("foo"));
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            })).isFalse();
    assertThat(labelSelector.test(new HashMap<String, String>())).isTrue();
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("fok", "v1");
              }
            })).isTrue();
    assertThat(labelSelector).hasToString("!foo");
  }

  @Test
  void emptyLabelSelectorShouldWork() {
    LabelSelector labelSelector = LabelSelector.empty();
    assertThat(
        labelSelector.test(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            })).isTrue();
    assertThat(labelSelector.toString()).isEmpty();
  }

  @Test
  void parseWithLabelsShouldWork() throws IllegalArgumentException {
    HashMap<String, String> labels =
        new HashMap<String, String>() {
          {
            put("app1", "foo");
            put("app2", "bar");
          }
        };
    V1LabelSelector v1LabelSelector = new V1LabelSelector().matchLabels(labels);
    LabelSelector labelSelector = LabelSelector.parse(v1LabelSelector);
    HashMap<String, String> testSelector =
        new HashMap<String, String>() {
          {
            put("app1", "foo");
            put("app2", "bar");
          }
        };
    assertThat(labelSelector.test(testSelector)).isTrue();
    testSelector.remove("app1");
    assertThat(labelSelector.test(testSelector)).isFalse();
  }

  @Test
  void parseWithExpressionsShouldWork() throws IllegalArgumentException {
    List<V1LabelSelectorRequirement> exprs =
        new LinkedList<V1LabelSelectorRequirement>() {
          {
            add(
                new V1LabelSelectorRequirement()
                    .key("key1")
                    .values(
                        new LinkedList<String>() {
                          {
                            add("value1");
                            add("value2");
                          }
                        })
                    .operator(LabelSelector.LABEL_SELECTOR_OP_IN));
            add(
                new V1LabelSelectorRequirement()
                    .key("key2")
                    .values(
                        new LinkedList<String>() {
                          {
                            add("value3");
                            add("value4");
                          }
                        })
                    .operator(LabelSelector.LABEL_SELECTOR_OP_NOT_IN));
            add(
                new V1LabelSelectorRequirement()
                    .key("key3")
                    .operator(LabelSelector.LABEL_SELECTOR_OP_EXISTS));
            add(
                new V1LabelSelectorRequirement()
                    .key("key4")
                    .operator(LabelSelector.LABEL_SELECTOR_OP_DOES_NOT_EXIST));
          }
        };
    V1LabelSelector v1LabelSelector = new V1LabelSelector().matchExpressions(exprs);
    LabelSelector labelSelector = LabelSelector.parse(v1LabelSelector);
    HashMap<String, String> testSelector =
        new HashMap<String, String>() {
          {
            put("key1", "value1");
            put("key2", "value5");
            put("key3", "");
          }
        };
    assertThat(labelSelector.test(testSelector)).isTrue();
  }

  @Test
  void parseWithLabelsAndExpressionsShouldWork() throws IllegalArgumentException {
    HashMap<String, String> labels =
        new HashMap<String, String>() {
          {
            put("app1", "foo");
            put("app2", "bar");
          }
        };
    List<V1LabelSelectorRequirement> exprs =
        new LinkedList<V1LabelSelectorRequirement>() {
          {
            add(
                new V1LabelSelectorRequirement()
                    .key("key1")
                    .values(
                        new LinkedList<String>() {
                          {
                            add("value1");
                            add("value2");
                          }
                        })
                    .operator(LabelSelector.LABEL_SELECTOR_OP_IN));
            add(
                new V1LabelSelectorRequirement()
                    .key("key2")
                    .values(
                        new LinkedList<String>() {
                          {
                            add("value3");
                            add("value4");
                          }
                        })
                    .operator(LabelSelector.LABEL_SELECTOR_OP_NOT_IN));
            add(
                new V1LabelSelectorRequirement()
                    .key("key3")
                    .operator(LabelSelector.LABEL_SELECTOR_OP_EXISTS));
            add(
                new V1LabelSelectorRequirement()
                    .key("key4")
                    .operator(LabelSelector.LABEL_SELECTOR_OP_DOES_NOT_EXIST));
          }
        };
    V1LabelSelector v1LabelSelector =
        new V1LabelSelector().matchExpressions(exprs).matchLabels(labels);
    LabelSelector labelSelector = LabelSelector.parse(v1LabelSelector);
    HashMap<String, String> testSelector =
        new HashMap<String, String>() {
          {
            put("app1", "foo");
            put("app2", "bar");
            put("key1", "value1");
            put("key2", "value5");
            put("key3", "");
          }
        };
    assertThat(labelSelector.test(testSelector)).isTrue();
  }

  @Test
  void parseWithWrongOpShouldThrowIllegalArgumentException() {
    List<V1LabelSelectorRequirement> exprs =
        new LinkedList<V1LabelSelectorRequirement>() {
          {
            add(
                new V1LabelSelectorRequirement()
                    .key("key1")
                    .values(
                        new LinkedList<String>() {
                          {
                            add("value1");
                            add("value2");
                          }
                        })
                    .operator("WrongOp"));
          }
        };
    V1LabelSelector v1LabelSelector = new V1LabelSelector().matchExpressions(exprs);
    assertThatThrownBy(() -> LabelSelector.parse(v1LabelSelector))
        .isInstanceOf(IllegalArgumentException.class);
  }
}
