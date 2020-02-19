package io.kubernetes.client.extended.event;

import static org.junit.Assert.assertEquals;

import io.kubernetes.client.extended.event.legacy.EventSpamFilter;
import io.kubernetes.client.extended.event.legacy.EventUtils;
import io.kubernetes.client.openapi.models.V1Event;
import io.kubernetes.client.openapi.models.V1EventBuilder;
import io.kubernetes.client.openapi.models.V1EventSourceBuilder;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import java.time.Duration;
import org.junit.Test;

public class EventSpamFilterTest {

  @Test
  public void testSpammingEventFiltering() {
    int burst = 10;
    EventSpamFilter filter =
        new EventSpamFilter(
            100, EventUtils::getSpamKey, burst, Duration.ofDays(1), 1); // never refill
    V1Event spammingEvent1 =
        new V1EventBuilder()
            .withMessage("1")
            .withSource(new V1EventSourceBuilder().withComponent("c1").build())
            .withInvolvedObject(new V1ObjectReference())
            .build();
    V1Event spammingEvent2 =
        new V1EventBuilder()
            .withMessage("2")
            .withSource(new V1EventSourceBuilder().withComponent("c1").build())
            .withInvolvedObject(new V1ObjectReference())
            .build();
    V1Event spammingEvent3 =
        new V1EventBuilder()
            .withMessage("3")
            .withSource(new V1EventSourceBuilder().withComponent("c2").build())
            .withInvolvedObject(new V1ObjectReference())
            .build();
    for (int i = 0; i < burst; i++) {
      assertEquals(true, filter.filter(spammingEvent1));
    }
    assertEquals(false, filter.filter(spammingEvent1));
    assertEquals(false, filter.filter(spammingEvent2));
    assertEquals(true, filter.filter(spammingEvent3));
  }
}
