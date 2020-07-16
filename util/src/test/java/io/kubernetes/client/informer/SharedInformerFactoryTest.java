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
package io.kubernetes.client.informer;

import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.util.CallGeneratorParams;
import org.junit.Test;

public class SharedInformerFactoryTest {
  @Test
  public void shutdownInformerFactoryInstantlyAfterStarting() {
    CoreV1Api api = new CoreV1Api();
    SharedInformerFactory factory = new SharedInformerFactory();
    factory.sharedIndexInformerFor(
        (CallGeneratorParams params) -> {
          return api.listNamespaceCall(
              null,
              null,
              null,
              null,
              null,
              null,
              params.resourceVersion,
              params.timeoutSeconds,
              params.watch,
              null);
        },
        V1Namespace.class,
        V1NamespaceList.class);

    factory.startAllRegisteredInformers();
    factory.stopAllRegisteredInformers();
  }
}
