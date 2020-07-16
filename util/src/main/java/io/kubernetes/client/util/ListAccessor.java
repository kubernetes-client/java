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

import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/** ListAccessor is a set of utils which accesses common fields from list objects dynamically */
public class ListAccessor {

  private static final String METHOD_NAME_GET_ITEMS = "getItems";
  private static final String METHOD_NAME_GET_LIST_METADATA = "getMetadata";

  @Deprecated // use KubernetesListObject instead
  public static V1ListMeta listMetadata(Object listObj) throws ObjectMetaReflectException {
    try {
      Method mdField = listObj.getClass().getMethod(METHOD_NAME_GET_LIST_METADATA);
      return (V1ListMeta) mdField.invoke(listObj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new ObjectMetaReflectException(e);
    }
  }

  @Deprecated // use KubernetesListObject instead
  public static <ApiType> List<ApiType> getItems(Object listObj) throws ObjectMetaReflectException {
    try {
      Method getItemsMethod = listObj.getClass().getMethod(METHOD_NAME_GET_ITEMS);
      return (List<ApiType>) getItemsMethod.invoke(listObj);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      throw new ObjectMetaReflectException(e);
    }
  }
}
