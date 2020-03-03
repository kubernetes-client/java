package io.kubernetes.client.extended.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.event.legacy.EventAggregator;
import io.kubernetes.client.extended.event.legacy.EventCorrelator;
import io.kubernetes.client.extended.event.legacy.EventSpamFilter;
import io.kubernetes.client.extended.event.legacy.EventUtils;
import io.kubernetes.client.openapi.models.V1Event;
import io.kubernetes.client.openapi.models.V1EventBuilder;
import io.kubernetes.client.openapi.models.V1EventSource;
import io.kubernetes.client.openapi.models.V1EventSourceBuilder;
import io.kubernetes.client.openapi.models.V1ObjectMetaBuilder;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.tuple.MutablePair;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EventCorrelatorTest {

  @Parameter(0)
  public V1Event[] previousEvents;

  @Parameter(1)
  public V1Event newEvent;

  @Parameter(2)
  public V1Event expectedEvent;

  @Parameter(3)
  public Boolean expectedSkip;

  // creates the test data
  @Parameters
  public static Collection<Object[]> data() {
    V1ObjectReference podRef =
        new V1ObjectReferenceBuilder()
            .withApiVersion("v1")
            .withName("my-pod")
            .withNamespace("default")
            .build();
    V1EventSource source = new V1EventSourceBuilder().withComponent("foo").withHost("bar").build();
    V1Event firstEvent =
        new V1EventBuilder()
            .withMetadata(new V1ObjectMetaBuilder().withName("").withNamespace("").build())
            .withSource(source)
            .withInvolvedObject(podRef)
            .withReason("first")
            .withCount(1)
            .withMessage("am a first")
            .build();
    V1Event duplicatedEvent =
        new V1EventBuilder()
            .withMetadata(new V1ObjectMetaBuilder().withName("").withNamespace("").build())
            .withSource(source)
            .withInvolvedObject(podRef)
            .withReason("duplicated")
            .withCount(1)
            .withMessage("am a dup")
            .build();
    V1Event similarEvent =
        new V1EventBuilder()
            .withMetadata(new V1ObjectMetaBuilder().withName("").withNamespace("").build())
            .withSource(source)
            .withInvolvedObject(podRef)
            .withReason("similar")
            .withCount(1)
            .withMessage("am a similar")
            .build();
    V1Event aggregateEvent =
        new V1EventBuilder()
            .withMetadata(new V1ObjectMetaBuilder().withName("").withNamespace("").build())
            .withSource(source)
            .withInvolvedObject(podRef)
            .withReason("similar")
            .withCount(1)
            .withMessage(EventUtils.getAggregatedMessageByReason(similarEvent))
            .build();
    Object[][] data =
        new Object[][] {
          {
            // create a single event should work
            new V1Event[] {}, deepCopy(firstEvent), deepCopy(firstEvent).count(1), false,
          },
          {
            // the same event should just count
            new V1Event[] {
              deepCopy(duplicatedEvent),
            },
            deepCopy(duplicatedEvent),
            deepCopy(duplicatedEvent).count(2),
            false,
          },
          {
            // the same event should just count even if more than aggregate
            deepCopyFor(duplicatedEvent, EventAggregator.DEFAULT_MAX_EVENT_LOCAL_KEYS),
            deepCopy(duplicatedEvent),
            deepCopy(duplicatedEvent).count(EventAggregator.DEFAULT_MAX_EVENT_LOCAL_KEYS + 1),
            false,
          },
          {
            // the same event is spam if too frequent
            deepCopyFor(duplicatedEvent, EventSpamFilter.DEFAULT_TOKEN_BUCKET_CAPACITY + 1),
            deepCopy(duplicatedEvent),
            null,
            true,
          },
          {
            // similar events should be aggregated
            deepCopyWithSimilarMessageFor(
                similarEvent,
                similarEvent.getMessage(),
                EventAggregator.DEFAULT_MAX_EVENT_LOCAL_KEYS - 1),
            deepCopy(similarEvent),
            deepCopy(aggregateEvent),
            false,
          },
          {
            // similar events many times should count the aggregate
            deepCopyWithSimilarMessageFor(
                similarEvent,
                similarEvent.getMessage(),
                EventAggregator.DEFAULT_MAX_EVENT_LOCAL_KEYS),
            deepCopy(similarEvent),
            deepCopy(aggregateEvent).count(2),
            false,
          },
        };
    return Arrays.asList(data);
  }

  @Test
  public void testEventCorrelate() throws InterruptedException {
    EventCorrelator correlator = new EventCorrelator();
    for (V1Event event : previousEvents) {
      DateTime now = DateTime.now();
      event.setFirstTimestamp(now);
      event.setLastTimestamp(now);
      Optional<MutablePair<V1Event, V1Patch>> result = correlator.correlate(event);
      if (!result.isPresent()) {
        correlator.updateState(event);
      }
    }
    Thread.sleep(100);
    DateTime now = DateTime.now();
    newEvent.setFirstTimestamp(now);
    newEvent.setLastTimestamp(now);
    Optional<MutablePair<V1Event, V1Patch>> result = correlator.correlate(newEvent);

    assertEquals(expectedSkip, !result.isPresent());
    if (!expectedSkip) {
      V1Event correlatedEvent = result.get().getLeft();
      correlatedEvent.setMetadata(new V1ObjectMetaBuilder().withName("").withNamespace("").build());
      validateEvent(expectedEvent, correlatedEvent);
    }
  }

  private void validateEvent(V1Event expectedEvent, V1Event actualEvent) {
    V1Event recvEvent = new V1EventBuilder(actualEvent).build();
    assertNotEquals(0, recvEvent.getFirstTimestamp().getMillis());
    assertNotEquals(0, recvEvent.getLastTimestamp().getMillis());
    if (actualEvent.getFirstTimestamp().equals(actualEvent.getLastTimestamp())) {
      if (expectedEvent.getCount() > 1) {
        fail("firstTimestamp and lastTimestamp must not be equal to indicate compression happen");
      }
    } else {
      if (expectedEvent.getCount() == 1) {
        fail("firstTimestamp and lastTimestamp must be equal to indicate there's only one event");
      }
    }
    // clear the timestamps
    recvEvent.setFirstTimestamp(expectedEvent.getFirstTimestamp());
    recvEvent.setLastTimestamp(expectedEvent.getLastTimestamp());

    if (!recvEvent.getMetadata().getName().startsWith(expectedEvent.getMetadata().getName())) {
      fail("prefix doesnt match");
    }

    assertEquals(expectedEvent, recvEvent);
  }

  private static V1Event deepCopy(V1Event event) {
    return new V1EventBuilder(event).build();
  }

  private static V1Event[] deepCopyFor(V1Event event, int count) {
    List<V1Event> events = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      events.add(new V1EventBuilder(event).build());
    }
    return events.stream().toArray(V1Event[]::new);
  }

  private static V1Event[] deepCopyWithSimilarMessageFor(
      V1Event event, String messagePrefix, int count) {
    List<V1Event> events = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      events.add(new V1EventBuilder(event).withMessage(messagePrefix + "-" + i).build());
    }
    return events.stream().toArray(V1Event[]::new);
  }
}
