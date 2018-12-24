package io.kubernetes.client.util.common;

import java.util.Collection;
import java.util.Map;

public class Collections {

  public static boolean isEmptyMap(Map map) {
    return map == null || map.isEmpty();
  }

  public static boolean isEmptyCollection(Collection collection) {
    return collection == null || collection.isEmpty();
  }
}
