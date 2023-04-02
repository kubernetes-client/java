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
package io.kubernetes.client.apimachinery;

public enum KubernetesVerb {
  GET("get"),
  LIST("list"),
  CREATE("create"),
  UPDATE("update"),
  DELETE("delete"),
  PATCH("patch"),
  WATCH("watch"),
  DELETE_COLLECTION("deleteCollection");

  private final String value;

  KubernetesVerb(String value) {
    this.value = value;
  }

  public static KubernetesVerb of(
      String httpVerb, boolean hasNamePathParam, boolean hasWatchParam) {
    if (hasWatchParam) {
      return WATCH;
    }
    switch (httpVerb) {
      case "GET":
        if (!hasNamePathParam) {
          return LIST;
        }
        return GET;
      case "POST":
        return CREATE;
      case "PUT":
        return UPDATE;
      case "PATCH":
        return PATCH;
      case "DELETE":
        if (!hasNamePathParam) {
          return DELETE_COLLECTION;
        }
        return DELETE;
    }
    throw new IllegalArgumentException("invalid HTTP verb for kubernetes client");
  }

  public String value() {
    return value;
  }
}
