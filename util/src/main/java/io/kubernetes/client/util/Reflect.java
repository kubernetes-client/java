package io.kubernetes.client.util;

import io.kubernetes.client.models.V1ListMeta;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/** Reflect is a set of utils which extracts metadata from objects dynamically */
public class Reflect {

  public static V1ObjectMeta objectMetadata(Object obj) throws ObjectMetaReflectException {
    try {
      Method mdField = obj.getClass().getDeclaredMethod("getMetadata");
      return (V1ObjectMeta) mdField.invoke(obj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new ObjectMetaReflectException(e);
    }
  }

  public static String namespace(Object obj) throws ObjectMetaReflectException {
    return objectMetadata(obj).getNamespace();
  }

  public static V1ListMeta listMetadata(Object listObj) throws ObjectMetaReflectException {
    try {
      Method mdField = listObj.getClass().getDeclaredMethod("getMetadata");
      return (V1ListMeta) mdField.invoke(listObj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new ObjectMetaReflectException(e);
    }
  }

  public static <ApiType> List<ApiType> getItems(Object listObj) throws ObjectMetaReflectException {
    try {
      Method getItemsMethod = listObj.getClass().getMethod("getItems");
      return (List<ApiType>) getItemsMethod.invoke(listObj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new ObjectMetaReflectException(e);
    }
  }
}
