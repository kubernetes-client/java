/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.util;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** ObjectAccessor is a set of utils which accesses common fields from objects dynamically */
public class ObjectAccessor {

  private static final String METHOD_NAME_GET_METADATA = "getMetadata";

  @Deprecated // use KubernetesObject instead
  public static V1ObjectMeta objectMetadata(Object obj) throws ObjectMetaReflectException {
    try {
      Method mdField = obj.getClass().getMethod(METHOD_NAME_GET_METADATA);
      return (V1ObjectMeta) mdField.invoke(obj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new ObjectMetaReflectException(e);
    }
  }

  @Deprecated // use KubernetesObject instead
  public static String namespace(Object obj) throws ObjectMetaReflectException {
    return objectMetadata(obj).getNamespace();
  }

  @Deprecated // use KubernetesObject instead
  public static String name(Object obj) throws ObjectMetaReflectException {
    return objectMetadata(obj).getName();
  }
}
