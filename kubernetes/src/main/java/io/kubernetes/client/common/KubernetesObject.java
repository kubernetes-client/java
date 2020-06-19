package io.kubernetes.client.common;

import io.kubernetes.client.openapi.models.V1ObjectMeta;

/**
 * Common accessors for kubernetes object.
 */
public interface KubernetesObject extends KubernetesType {

    /**
     * Gets metadata.
     *
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects
     * users must create.
     *
     * @return the metadata
     */
    V1ObjectMeta getMetadata();
}