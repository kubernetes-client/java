package io.kubernetes.client.extended.event.legacy;

import io.kubernetes.client.openapi.models.V1Event;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang3.tuple.MutablePair;
import org.joda.time.DateTime;

public class EventUtils {

  public static String generateName(String referencedObjectName, DateTime timestamp) {
    return referencedObjectName + "." + RandomStringUtils.randomAlphanumeric(12);
  }

  public static String getAggregatedMessageByReason(V1Event event) {
    return "(combined from similar events): " + event.getMessage();
  }

  public static MutablePair<String, String> getAggregatedAndLocalKeyByReason(V1Event event) {
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

  public static String getEventKey(V1Event event) {
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

  public static String getSpamKey(V1Event event) {
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
