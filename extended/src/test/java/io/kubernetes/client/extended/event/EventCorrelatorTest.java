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

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.event.legacy.EventAggregator;
import io.kubernetes.client.extended.event.legacy.EventCorrelator;
import io.kubernetes.client.extended.event.legacy.EventSpamFilter;
import io.kubernetes.client.extended.event.legacy.EventUtils;
import io.kubernetes.client.openapi.models.CoreV1Event;
import io.kubernetes.client.openapi.models.CoreV1EventBuilder;
import io.kubernetes.client.openapi.models.V1EventSource;
import io.kubernetes.client.openapi.models.V1EventSourceBuilder;
import io.kubernetes.client.openapi.models.V1ObjectMetaBuilder;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.tuple.MutablePair;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class EventCorrelatorTest {
  // creates the test data
  static Collection<Object[]> data() {
    V1ObjectReference podRef =
        new V1ObjectReferenceBuilder()
            .withApiVersion("v1")
            .withName("my-pod")
            .withNamespace("default")
            .build();
    V1EventSource source = new V1EventSourceBuilder().withComponent("foo").withHost("bar").build();
    CoreV1Event firstEvent =
        new CoreV1EventBuilder()
            .withMetadata(new V1ObjectMetaBuilder().withName("").withNamespace("").build())
            .withSource(source)
            .withInvolvedObject(podRef)
            .withReason("first")
            .withCount(1)
            .withMessage("am a first")
            .build();
    CoreV1Event duplicatedEvent =
        new CoreV1EventBuilder()
            .withMetadata(new V1ObjectMetaBuilder().withName("").withNamespace("").build())
            .withSource(source)
            .withInvolvedObject(podRef)
            .withReason("duplicated")
            .withCount(1)
            .withMessage("am a dup")
            .build();
    CoreV1Event similarEvent =
        new CoreV1EventBuilder()
            .withMetadata(new V1ObjectMetaBuilder().withName("").withNamespace("").build())
            .withSource(source)
            .withInvolvedObject(podRef)
            .withReason("similar")
            .withCount(1)
            .withMessage("am a similar")
            .build();
    CoreV1Event aggregateEvent =
        new CoreV1EventBuilder()
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
            new CoreV1Event[] {}, deepCopy(firstEvent), deepCopy(firstEvent).count(1), false,
          },
          {
            // the same event should just count
            new CoreV1Event[] {
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

  @MethodSource("data")
  @ParameterizedTest
  void eventCorrelate(
      CoreV1Event[] previousEvents,
      CoreV1Event newEvent,
      CoreV1Event expectedEvent,
      Boolean expectedSkip)
      throws Exception {
    EventCorrelator correlator = new EventCorrelator();
    for (CoreV1Event event : previousEvents) {
      OffsetDateTime now = OffsetDateTime.now();
      event.setFirstTimestamp(now);
      event.setLastTimestamp(now);
      Optional<MutablePair<CoreV1Event, V1Patch>> result = correlator.correlate(event);
      if (result.isEmpty()) {
        correlator.updateState(event);
      }
    }
    Thread.sleep(100);
    OffsetDateTime now = OffsetDateTime.now();
    newEvent.setFirstTimestamp(now);
    newEvent.setLastTimestamp(now);
    Optional<MutablePair<CoreV1Event, V1Patch>> result = correlator.correlate(newEvent);

    assertThat(result.isEmpty()).isEqualTo(expectedSkip);
    if (!expectedSkip) {
      CoreV1Event correlatedEvent = result.get().getLeft();
      correlatedEvent.setMetadata(new V1ObjectMetaBuilder().withName("").withNamespace("").build());
      validateEvent(expectedEvent, correlatedEvent);
    }
  }

  private void validateEvent(CoreV1Event expectedEvent, CoreV1Event actualEvent) {
    CoreV1Event recvEvent = new CoreV1EventBuilder(actualEvent).build();
    assertThat(recvEvent.getFirstTimestamp().toInstant().toEpochMilli()).isNotEqualTo(0);
    assertThat(recvEvent.getLastTimestamp().toInstant().toEpochMilli()).isNotEqualTo(0);
    if (actualEvent.getFirstTimestamp().equals(actualEvent.getLastTimestamp())) {
      assertThat(expectedEvent.getCount())
          .withFailMessage("firstTimestamp and lastTimestamp must not be equal to indicate compression happen")
          .isLessThanOrEqualTo(1);
    } else {
      assertThat(expectedEvent.getCount())
          .withFailMessage("firstTimestamp and lastTimestamp must be equal to indicate there's only one event")
          .isNotEqualTo(1);
    }
    // clear the timestamps
    recvEvent.setFirstTimestamp(expectedEvent.getFirstTimestamp());
    recvEvent.setLastTimestamp(expectedEvent.getLastTimestamp());

    assertThat(recvEvent.getMetadata().getName())
        .withFailMessage("prefix doesnt match")
        .startsWith(expectedEvent.getMetadata().getName());

    assertThat(recvEvent).isEqualTo(expectedEvent);
  }

  private static CoreV1Event deepCopy(CoreV1Event event) {
    return new CoreV1EventBuilder(event).build();
  }

  private static CoreV1Event[] deepCopyFor(CoreV1Event event, int count) {
    List<CoreV1Event> events = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      events.add(new CoreV1EventBuilder(event).build());
    }
    return events.stream().toArray(CoreV1Event[]::new);
  }

  private static CoreV1Event[] deepCopyWithSimilarMessageFor(
      CoreV1Event event, String messagePrefix, int count) {
    List<CoreV1Event> events = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      events.add(new CoreV1EventBuilder(event).withMessage(messagePrefix + "-" + i).build());
    }
    return events.stream().toArray(CoreV1Event[]::new);
  }
}
