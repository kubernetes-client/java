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

import io.kubernetes.client.extended.event.legacy.EventSpamFilter;
import io.kubernetes.client.extended.event.legacy.EventUtils;
import io.kubernetes.client.openapi.models.CoreV1Event;
import io.kubernetes.client.openapi.models.CoreV1EventBuilder;
import io.kubernetes.client.openapi.models.V1EventSourceBuilder;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import java.time.Duration;
import org.junit.jupiter.api.Test;

class EventSpamFilterTest {

  @Test
  void spammingEventFiltering() {
    int burst = 10;
    EventSpamFilter filter =
        new EventSpamFilter(
            100, EventUtils::getSpamKey, burst, Duration.ofDays(1), 1); // never refill
    CoreV1Event spammingEvent1 =
        new CoreV1EventBuilder()
            .withMessage("1")
            .withSource(new V1EventSourceBuilder().withComponent("c1").build())
            .withInvolvedObject(new V1ObjectReference())
            .build();
    CoreV1Event spammingEvent2 =
        new CoreV1EventBuilder()
            .withMessage("2")
            .withSource(new V1EventSourceBuilder().withComponent("c1").build())
            .withInvolvedObject(new V1ObjectReference())
            .build();
    CoreV1Event spammingEvent3 =
        new CoreV1EventBuilder()
            .withMessage("3")
            .withSource(new V1EventSourceBuilder().withComponent("c2").build())
            .withInvolvedObject(new V1ObjectReference())
            .build();
    for (int i = 0; i < burst; i++) {
      assertThat(filter.filter(spammingEvent1)).isTrue();
    }
    assertThat(filter.filter(spammingEvent1)).isFalse();
    assertThat(filter.filter(spammingEvent2)).isFalse();
    assertThat(filter.filter(spammingEvent3)).isTrue();
  }
}
