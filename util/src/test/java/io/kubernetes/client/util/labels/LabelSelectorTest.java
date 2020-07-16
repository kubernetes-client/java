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
import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

public class LabelSelectorTest {

  @Test
  public void normalLabelSelectionEqualShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(equal("foo", "v1"));
    assertTrue(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            }));
    assertFalse(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v2");
              }
            }));
    assertEquals("foo = v1", labelSelector.toString());
  }

  @Test
  public void normalLabelSelectionNotEqualShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(notEqual("foo", "v1"));
    assertTrue(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v2");
              }
            }));
    assertFalse(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            }));
    assertEquals("foo != v1", labelSelector.toString());
  }

  @Test
  public void normalLabelSelectionInShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(in("foo", "v1", "v2"));
    assertTrue(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            }));
    assertTrue(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v2");
              }
            }));
    assertFalse(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v3");
              }
            }));
    assertEquals("foo in (v1,v2)", labelSelector.toString());
  }

  @Test
  public void normalLabelSelectionNotInShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(notIn("foo", "v1", "v2"));
    assertFalse(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            }));
    assertFalse(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v2");
              }
            }));
    assertTrue(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v3");
              }
            }));
    assertEquals("foo notin (v1,v2)", labelSelector.toString());
  }

  @Test
  public void normalLabelSelectionConjuctionShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(in("foo", "v1", "v2"), equal("fok", "v1"));
    assertTrue(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
                put("fok", "v1");
              }
            }));
    assertFalse(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v2");
              }
            }));
    assertFalse(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("fok", "v1");
              }
            }));
    assertEquals("foo in (v1,v2),fok = v1", labelSelector.toString());
  }

  @Test
  public void normalLabelSelectionExistsShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(exists("foo"));
    assertTrue(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            }));
    assertFalse(labelSelector.apply(new HashMap<String, String>()));
    assertFalse(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("fok", "v1");
              }
            }));
    assertEquals("foo", labelSelector.toString());
  }

  @Test
  public void normalLabelSelectionNotExistsShouldWork() {
    LabelSelector labelSelector = LabelSelector.and(notExists("foo"));
    assertFalse(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            }));
    assertTrue(labelSelector.apply(new HashMap<String, String>()));
    assertTrue(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("fok", "v1");
              }
            }));
    assertEquals("!foo", labelSelector.toString());
  }

  @Test
  public void emptyLabelSelectorShouldWork() {
    LabelSelector labelSelector = LabelSelector.empty();
    assertTrue(
        labelSelector.apply(
            new HashMap<String, String>() {
              {
                put("foo", "v1");
              }
            }));
    assertEquals("", labelSelector.toString());
  }
}
