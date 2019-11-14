package io.kubernetes.client.util;

import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/** ListAccessor is a set of utils which accesses common fields from list objects dynamically */
public class ListAccessor {

  private static final String METHOD_NAME_GET_ITEMS = "getItems";
  private static final String METHOD_NAME_GET_LIST_METADATA = "getMetadata";

  public static V1ListMeta listMetadata(Object listObj) throws ObjectMetaReflectException {
    try {
      Method mdField = listObj.getClass().getMethod(METHOD_NAME_GET_LIST_METADATA);
      return (V1ListMeta) mdField.invoke(listObj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new ObjectMetaReflectException(e);
    }
  }

  public static <ApiType> List<ApiType> getItems(Object listObj) throws ObjectMetaReflectException {
    try {
      Method getItemsMethod = listObj.getClass().getMethod(METHOD_NAME_GET_ITEMS);
      return (List<ApiType>) getItemsMethod.invoke(listObj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new ObjectMetaReflectException(e);
    }
  }
}
