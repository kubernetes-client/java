package io.kubernetes.client.overloading;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1PodTemplate;
import io.kubernetes.client.openapi.apis.CoreV1Api;

/*
    * This class is used to overload the CoreV1Api class.
 */

public class Pods{
    private CoreV1Api api;
    Pods(CoreV1Api api){
        this.api = api;
    }
    public V1Pod createNamespacedPod(String namespace, V1Pod body) throws ApiException {
        return api.createNamespacedPod(namespace, body, null, null, null, null);
    }

    public V1Pod deleteNamespacedPod(String name, String namespace) throws ApiException {
        return api.deleteNamespacedPod(name, namespace, null, null, null, null, null, null);
    }

    public V1PodList listNamespacedPod(String namespace) throws ApiException {
        return api.listNamespacedPod(namespace, null, null, null, null, null, null, null, null, null, null, null);
    }

    public V1PodTemplate createNamespacedPodTemplate(String namespace, V1PodTemplate body) throws ApiException {
        return api.createNamespacedPodTemplate(namespace, body, null, null, null, null);
    }

}
