package io.kubernetes.client.util;

import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.util.List;

/** Reflect is a set of utils which extracts metadata from objects dynamically */
@Deprecated
public class Reflect {

  public static V1ObjectMeta objectMetadata(Object obj) throws ObjectMetaReflectException {
    return ObjectAccessor.objectMetadata(obj);
  }

  public static String namespace(Object obj) throws ObjectMetaReflectException {
    return ObjectAccessor.namespace(obj);
  }

  public static V1ListMeta listMetadata(Object listObj) throws ObjectMetaReflectException {
    return ListAccessor.listMetadata(listObj);
  }

  public static <ApiType> List<ApiType> getItems(Object listObj) throws ObjectMetaReflectException {
    return ListAccessor.getItems(listObj);
  }
}
