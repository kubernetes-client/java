package io.kubernetes.client.common;

import io.kubernetes.client.openapi.models.V1ListMeta;

import java.util.List;

/**
 * Common accessors for kubernetes list object.
 */
public interface KubernetesListObject extends KubernetesType {

    /**
     * Gets list metadata.
     *
     * ListMeta describes metadata that synthetic resources must have, including lists and
     * various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
     *
     *
     * @return the metadata
     */
    V1ListMeta getMetadata();

    /**
     * Gets the object items.
     *
     * @return the items
     */
    List<? extends KubernetesObject> getItems();
}