package io.kubernetes.client.util;

import io.kubernetes.client.models.V1ObjectMeta;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
  public static V1ObjectMeta objectMetadata(Object obj)
      throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    Method mdField = obj.getClass().getDeclaredMethod("getMetadata");
    return (V1ObjectMeta) mdField.invoke(obj);
  }

  public static String namespace(Object obj)
      throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    return objectMetadata(obj).getNamespace();
  }
}
