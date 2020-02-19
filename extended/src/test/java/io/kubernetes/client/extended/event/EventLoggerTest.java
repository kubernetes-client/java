package io.kubernetes.client.extended.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.event.legacy.EventLogger;
import io.kubernetes.client.extended.event.legacy.EventUtils;
import io.kubernetes.client.openapi.models.V1Event;
import io.kubernetes.client.openapi.models.V1EventBuilder;
import io.kubernetes.client.openapi.models.V1EventSourceBuilder;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder;
import org.apache.commons.lang3.tuple.MutablePair;
import org.junit.Test;

public class EventLoggerTest {

  @Test
  public void testPatchComputing() {
    V1Event event1 =
        new V1EventBuilder()
            .withSource(new V1EventSourceBuilder().build())
            .withMetadata(new V1ObjectMeta())
            .withInvolvedObject(new V1ObjectReferenceBuilder().build())
            .withCount(1)
            .withMessage("foo1")
            .build();
    V1Event event2 =
        new V1EventBuilder()
            .withSource(new V1EventSourceBuilder().build())
            .withMetadata(new V1ObjectMeta())
            .withInvolvedObject(new V1ObjectReferenceBuilder().build())
            .withCount(2)
            .withMessage("foo2")
            .build();
    String aggregatedKey = EventUtils.getAggregatedAndLocalKeyByReason(event1).getRight();
    EventLogger eventLogger = new EventLogger(100, EventUtils::getEventKey);
    MutablePair<V1Event, V1Patch> result1 = eventLogger.observe(event1, aggregatedKey);
    assertEquals(event1, result1.getLeft());
    assertNull(result1.getRight());

    MutablePair<V1Event, V1Patch> result2 = eventLogger.observe(event2, aggregatedKey);
    assertEquals(event2, result2.getLeft());
    assertNotNull(result2.getRight());
  }
}
