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
package io.kubernetes.client.extended.event.legacy;

import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.models.CoreV1Event;
import java.util.Optional;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.MutablePair;

public class EventCorrelator {

  protected EventAggregator aggregator;
  protected Predicate<CoreV1Event> filter;
  protected EventLogger logger;

  public EventCorrelator() {
    final int maxLRUCacheEntries = 4096;

    this.filter = new EventSpamFilter(maxLRUCacheEntries, EventUtils::getSpamKey)::filter;
    this.aggregator =
        new EventAggregator(
            maxLRUCacheEntries,
            EventUtils::getAggregatedAndLocalKeyByReason,
            EventUtils::getAggregatedMessageByReason);
    this.logger = new EventLogger(maxLRUCacheEntries, EventUtils::getEventKey);
  }

  public Optional<MutablePair<CoreV1Event, V1Patch>> correlate(CoreV1Event event) {
    MutablePair<CoreV1Event, String> aggregatedResult = this.aggregator.aggregate(event);
    CoreV1Event aggregatedEvent = aggregatedResult.getLeft();
    String cacheKey = aggregatedResult.getRight();
    MutablePair<CoreV1Event, V1Patch> observeResult =
        this.logger.observe(aggregatedEvent, cacheKey);
    if (!this.filter.test(event)) {
      return Optional.empty();
    }
    return Optional.of(observeResult);
  }

  public void updateState(CoreV1Event event) {
    this.logger.updateState(event);
  }
}
