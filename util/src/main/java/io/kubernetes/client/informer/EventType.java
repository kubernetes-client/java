package io.kubernetes.client.informer;

public enum EventType {
  ADDED,

  MODIFIED,

  DELETED,

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
