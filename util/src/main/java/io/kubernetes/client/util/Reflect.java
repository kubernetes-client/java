package io.kubernetes.client.util;

import io.kubernetes.client.models.V1ObjectMeta;
import java.lang.reflect.Field;

public class Reflect {
  public static V1ObjectMeta objectMetadata(Object obj)
      throws NoSuchFieldException, IllegalAccessException {
    Field mdField = obj.getClass().getDeclaredField("metadata");
    return (V1ObjectMeta) mdField.get(obj);
  }
}
