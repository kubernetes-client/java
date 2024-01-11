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
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1DeploymentList;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.apis.AppsV1Api;

/*
 * This class is used to overload the AppsV1Api class methods for Deployments.
 */
public class Deployments {
    private AppsV1Api api;
    Deployments(AppsV1Api api){
        this.api = api;
    }

    public V1Deployment createNamespacedDeployment(String namespace, V1Deployment body) throws ApiException {
        return api.createNamespacedDeployment(namespace, body).execute();
    }

    public V1Status deleteNamespacedDeployment(String name, String namespace) throws ApiException {
        return api.deleteNamespacedDeployment(name, namespace).execute();
    }

    public V1DeploymentList listNamespacedDeployment(String namespace) throws ApiException {
        return api.listNamespacedDeployment(namespace).execute();
    }

    public V1DeploymentList listDeploymentForAllNamespaces() throws ApiException {
        return api.listDeploymentForAllNamespaces().execute();
    }

    public V1Deployment replaceNamespacedDeployment(String name, String namespace, V1Deployment body) throws ApiException {
        return api.replaceNamespacedDeployment(name, namespace, body).execute();
    }

    public V1Deployment patchNamespacedDeployment(String name, String namespace, V1Patch body) throws ApiException {
        return api.patchNamespacedDeployment(name, namespace, body).execute();
    }
}
