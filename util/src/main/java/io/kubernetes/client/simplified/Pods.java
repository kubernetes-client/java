/*
Copyright 2023 The Kubernetes Authors.
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
package io.kubernetes.client.simplified;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1PodTemplate;
import io.kubernetes.client.openapi.apis.CoreV1Api;

/*
    * This class is used to overload the CoreV1Api class methods for Pods.
 */

public class Pods{
    private CoreV1Api api;
    Pods(CoreV1Api api){
        this.api = api;
    }
    public V1Pod createNamespacedPod(String namespace, V1Pod body) throws ApiException {
        return api.createNamespacedPod(namespace, body).execute();
    }

    public V1Pod deleteNamespacedPod(String name, String namespace) throws ApiException {
        return api.deleteNamespacedPod(name, namespace).execute();
    }

    public V1PodList listNamespacedPod(String namespace) throws ApiException {
        return api.listNamespacedPod(namespace).execute();
    }

    public V1PodTemplate createNamespacedPodTemplate(String namespace, V1PodTemplate body) throws ApiException {
        return api.createNamespacedPodTemplate(namespace, body).execute();
    }

}
