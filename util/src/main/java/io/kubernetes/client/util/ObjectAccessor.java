package io.kubernetes.client.util;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** ObjectAccessor is a set of utils which accesses common fields from objects dynamically */
public class ObjectAccessor {

  private static final String METHOD_NAME_GET_METADATA = "getMetadata";

  public static V1ObjectMeta objectMetadata(Object obj) throws ObjectMetaReflectException {
    try {
      Method mdField = obj.getClass().getMethod(METHOD_NAME_GET_METADATA);
      return (V1ObjectMeta) mdField.invoke(obj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new ObjectMetaReflectException(e);
    }
  }

  public static String namespace(Object obj) throws ObjectMetaReflectException {
    return objectMetadata(obj).getNamespace();
  }

  public static String name(Object obj) throws ObjectMetaReflectException {
    return objectMetadata(obj).getName();
  }
}
