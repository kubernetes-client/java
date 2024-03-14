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

import io.kubernetes.client.extended.event.legacy.EventAggregator;
import io.kubernetes.client.extended.event.legacy.EventUtils;
import io.kubernetes.client.openapi.models.CoreV1Event;
import io.kubernetes.client.openapi.models.CoreV1EventBuilder;
import io.kubernetes.client.openapi.models.V1EventSource;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import org.junit.jupiter.api.Test;

class EventAggregatorTest {

  @Test
  void spammingEventsShouldBeAggregated() {
    String aggregatedMessage = "noxu";
    EventAggregator aggregator =
        new EventAggregator(
            100, EventUtils::getAggregatedAndLocalKeyByReason, event -> aggregatedMessage);
    for (int i = 0; i < aggregator.getMaxEvents() - 1; i++) {
      String message =
          aggregator
              .aggregate(
                  new CoreV1EventBuilder()
                      .withSource(new V1EventSource())
                      .withInvolvedObject(new V1ObjectReference())
                      .withMessage("foo: " + i)
                      .build())
              .getLeft()
              .getMessage();
      assertThat(message).isNotEqualTo(aggregatedMessage);
    }
    CoreV1Event aggregatedEvent =
        aggregator
            .aggregate(
                new CoreV1EventBuilder()
                    .withSource(new V1EventSource())
                    .withInvolvedObject(new V1ObjectReference())
                    .withMessage("not_noxu")
                    .build())
            .getLeft();
    assertThat(aggregatedEvent.getMessage()).isEqualTo(aggregatedMessage);
  }
}
