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
