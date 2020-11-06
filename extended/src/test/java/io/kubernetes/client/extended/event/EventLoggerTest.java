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
package io.kubernetes.client.extended.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.event.legacy.EventLogger;
import io.kubernetes.client.extended.event.legacy.EventUtils;
import io.kubernetes.client.openapi.models.CoreV1Event;
import io.kubernetes.client.openapi.models.CoreV1EventBuilder;
import io.kubernetes.client.openapi.models.V1EventSourceBuilder;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder;
import org.apache.commons.lang3.tuple.MutablePair;
import org.junit.Test;

public class EventLoggerTest {

  @Test
  public void testPatchComputing() {
    CoreV1Event event1 =
        new CoreV1EventBuilder()
            .withSource(new V1EventSourceBuilder().build())
            .withMetadata(new V1ObjectMeta())
            .withInvolvedObject(new V1ObjectReferenceBuilder().build())
            .withCount(1)
            .withMessage("foo1")
            .build();
    CoreV1Event event2 =
        new CoreV1EventBuilder()
            .withSource(new V1EventSourceBuilder().build())
            .withMetadata(new V1ObjectMeta())
            .withInvolvedObject(new V1ObjectReferenceBuilder().build())
            .withCount(2)
            .withMessage("foo2")
            .build();
    String aggregatedKey = EventUtils.getAggregatedAndLocalKeyByReason(event1).getRight();
    EventLogger eventLogger = new EventLogger(100, EventUtils::getEventKey);
    MutablePair<CoreV1Event, V1Patch> result1 = eventLogger.observe(event1, aggregatedKey);
    assertEquals(event1, result1.getLeft());
    assertNull(result1.getRight());

    MutablePair<CoreV1Event, V1Patch> result2 = eventLogger.observe(event2, aggregatedKey);
    assertEquals(event2, result2.getLeft());
    assertNotNull(result2.getRight());
  }
}
