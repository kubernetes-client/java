package io.kubernetes.client.util;

import io.kubernetes.client.util.exception.TypeMetaReflectException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TypeAccessor {

  private static final String METHOD_NAME_GET_APIVERSION = "getApiVersion";
  private static final String METHOD_NAME_GET_KIND = "getKind";

  public static String apiVersion(Object obj) throws TypeMetaReflectException {
    try {
      Method mdField = obj.getClass().getMethod(METHOD_NAME_GET_APIVERSION);
      return (String) mdField.invoke(obj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new TypeMetaReflectException(e);
    }
  }

  public static String kind(Object obj) throws TypeMetaReflectException {
    try {
      Method mdField = obj.getClass().getMethod(METHOD_NAME_GET_KIND);
      return (String) mdField.invoke(obj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new TypeMetaReflectException(e);
    }
  }
}
