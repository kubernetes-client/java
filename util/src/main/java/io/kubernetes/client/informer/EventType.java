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
package io.kubernetes.client.informer;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum EventType {
  ADDED,

  MODIFIED,

  DELETED,

  BOOKMARK,

  ERROR;

  private static final Map<String, EventType> TYPES =
      Arrays.stream(EventType.values()).collect(Collectors.toMap(Enum::name, Function.identity()));

  /**
   * returns the corresponding EventType by type.
   *
   * @param type specific code
   * @return corresponding EventType
   * @deprecated will be removed in a future release. use : findByType
   */
  @Deprecated
  public static EventType getByType(String type) {
    if (type != null && type.length() > 0) {
      for (EventType eventType : EventType.values()) {
        if (eventType.name().equalsIgnoreCase(type)) {
          return eventType;
        }
      }
    }
    return null;
  }

  /**
   * returns the corresponding EventType by type, wrapped in an {@link Optional}
   *
   * @param type specific code
   * @return an Optional describing the EventType
   */
  public static Optional<EventType> findByType(String type) {
    return Optional.ofNullable(TYPES.get(String.valueOf(type).toUpperCase()));
  }
}
