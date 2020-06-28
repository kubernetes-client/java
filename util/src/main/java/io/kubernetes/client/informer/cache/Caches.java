package io.kubernetes.client.informer.cache;

import com.google.common.base.Strings;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ObjectAccessor;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.util.Collections;
import java.util.List;

/** A set of helper utilities for constructing a cache. */
public class Caches {

  /** NAMESPACE_INDEX is the default index function for caching objects */
  public static final String NAMESPACE_INDEX = "namespace";

  /**
   * deletionHandlingMetaNamespaceKeyFunc checks for DeletedFinalStateUnknown objects before calling
   * metaNamespaceKeyFunc.
   *
   * @param <ApiType> the type parameter
   * @param object specific object
   * @return the key
   */
  public static <ApiType extends KubernetesObject> String deletionHandlingMetaNamespaceKeyFunc(
      ApiType object) {
    if (object instanceof DeltaFIFO.DeletedFinalStateUnknown) {
      DeltaFIFO.DeletedFinalStateUnknown<ApiType> deleteObj =
          (DeltaFIFO.DeletedFinalStateUnknown<ApiType>) object;
      return deleteObj.getKey();
    }
    return metaNamespaceKeyFunc(object);
  }

  /**
   * MetaNamespaceKeyFunc is a convenient default KeyFunc which knows how to make keys for API
   * objects which implement HasMetadata Interface. The key uses the format <namespace>/<name>
   * unless <namespace> is empty, then it's just <name>.
   *
   * @param obj specific object
   * @return the key
   */
  public static String metaNamespaceKeyFunc(KubernetesObject obj) {
    V1ObjectMeta metadata = obj.getMetadata();
    if (!Strings.isNullOrEmpty(metadata.getNamespace())) {
      return metadata.getNamespace() + "/" + metadata.getName();
    }
    return metadata.getName();
  }

  /**
   * metaNamespaceIndexFunc is a default index function that indexes based on an object's namespace.
   *
   * @param obj specific object
   * @return the indexed value
   */
  public static List<String> metaNamespaceIndexFunc(Object obj) {
    try {
      V1ObjectMeta metadata = ObjectAccessor.objectMetadata(obj);
      if (metadata == null) {
        return Collections.emptyList();
      }
      return Collections.singletonList(metadata.getNamespace());
    } catch (ObjectMetaReflectException e) {
      // NOTE(yue9944882): might want to handle this as a checked exception
      throw new RuntimeException(e);
    }
  }
}
