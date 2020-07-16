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

public enum EventType {
  ADDED,

  MODIFIED,

  DELETED,

  BOOKMARK,

  ERROR;

  /**
   * getByType returns the corresponding EventType by type.
   *
   * @param type specific code
   * @return corresponding EventType
   */
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
}
