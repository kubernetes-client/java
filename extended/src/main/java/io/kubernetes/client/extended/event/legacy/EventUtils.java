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

import io.kubernetes.client.openapi.models.CoreV1Event;
import java.time.OffsetDateTime;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.tuple.MutablePair;

public class EventUtils {

  public static String generateName(String referencedObjectName, OffsetDateTime timestamp) {
    return referencedObjectName + "." + RandomStringUtils.randomAlphanumeric(12);
  }

  public static String getAggregatedMessageByReason(CoreV1Event event) {
    return "(combined from similar events): " + event.getMessage();
  }

  public static MutablePair<String, String> getAggregatedAndLocalKeyByReason(CoreV1Event event) {
    return new MutablePair<String, String>(
        String.join(
            "",
            event.getSource().getComponent(),
            event.getSource().getHost(),
            event.getInvolvedObject().getKind(),
            event.getInvolvedObject().getNamespace(),
            event.getInvolvedObject().getName(),
            event.getInvolvedObject().getUid(),
            event.getInvolvedObject().getApiVersion(),
            event.getType(),
            event.getReason()),
        event.getMessage());
  }

  public static String getEventKey(CoreV1Event event) {
    return String.join(
        "",
        event.getSource().getComponent(),
        event.getSource().getHost(),
        event.getInvolvedObject().getKind(),
        event.getInvolvedObject().getNamespace(),
        event.getInvolvedObject().getName(),
        event.getInvolvedObject().getFieldPath(),
        event.getInvolvedObject().getUid(),
        event.getInvolvedObject().getApiVersion(),
        event.getType(),
        event.getReason(),
        event.getMessage());
  }

  public static String getSpamKey(CoreV1Event event) {
    return String.join(
        "",
        event.getSource().getComponent(),
        event.getSource().getHost(),
        event.getInvolvedObject().getKind(),
        event.getInvolvedObject().getNamespace(),
        event.getInvolvedObject().getName(),
        event.getInvolvedObject().getUid(),
        event.getApiVersion());
  }
}
