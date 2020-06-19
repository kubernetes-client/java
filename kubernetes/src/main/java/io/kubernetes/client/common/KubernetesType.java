package io.kubernetes.client.common;


/**
 * Equivalence to TypeMeta from kubernetes/client-go.
 *
 * TypeMeta describes an individual object in an API response or request
 * with strings representing the type of the object and its API schema version.
 * Structures that are versioned or persisted should inline TypeMeta.
 */
public interface KubernetesType {

    /**
     * Gets api version.
     *
     * APIVersion defines the versioned schema of this representation of an object.
     * Servers should convert recognized schemas to the latest internal value, and
     * may reject unrecognized values.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     *
     * @return the api version
     */
    String getApiVersion();

    /**
     * Gets kind.
     *
     * Kind is a string value representing the REST resource this object represents.
     * Servers may infer this from the endpoint the client submits requests to.
     * Cannot be updated.
     * In CamelCase.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     *
     * @return the kind
     */
    String getKind();
}