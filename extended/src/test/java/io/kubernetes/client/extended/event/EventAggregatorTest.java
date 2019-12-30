package io.kubernetes.client.extended.event;

import static org.junit.Assert.*;

import io.kubernetes.client.extended.event.legacy.EventAggregator;
import io.kubernetes.client.extended.event.legacy.EventUtils;
import io.kubernetes.client.openapi.models.*;
import org.junit.Test;

public class EventAggregatorTest {

  @Test
  public void testSpammingEventsShouldBeAggregated() {
    String aggregatedMessage = "noxu";
    EventAggregator aggregator =
        new EventAggregator(
            100, EventUtils::getAggregatedAndLocalKeyByReason, event -> aggregatedMessage);
    for (int i = 0; i < aggregator.getMaxEvents() - 1; i++) {
      String message =
          aggregator
              .aggregate(
                  new V1EventBuilder()
                      .withSource(new V1EventSource())
                      .withInvolvedObject(new V1ObjectReference())
                      .withMessage("foo: " + i)
                      .build())
              .getLeft()
              .getMessage();
      assertNotEquals(aggregatedMessage, message);
    }
    V1Event aggregatedEvent =
        aggregator
            .aggregate(
                new V1EventBuilder()
                    .withSource(new V1EventSource())
                    .withInvolvedObject(new V1ObjectReference())
                    .withMessage("not_noxu")
                    .build())
            .getLeft();
    assertEquals(aggregatedMessage, aggregatedEvent.getMessage());
  }
}
