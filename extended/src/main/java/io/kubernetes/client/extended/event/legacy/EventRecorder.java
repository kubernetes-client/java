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
package io.kubernetes.client.extended.event.legacy;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.event.EventType;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import java.util.Map;

public interface EventRecorder {

  void event(KubernetesObject object, EventType t, String reason, String format, String... args);

  void event(
      KubernetesObject object,
      Map<String, String> attachedAnnotation,
      EventType t,
      String reason,
      String format,
      String... args);

  void event(V1ObjectReference ref, EventType t, String reason, String format, String... args);

  void event(
      V1ObjectReference ref,
      Map<String, String> attachedAnnotation,
      EventType t,
      String reason,
      String format,
      String... args);
}
