package io.kubernetes.client.fluent;

import io.sundr.builder.annotations.ExternalBuildables;

@ExternalBuildables(
        editableEnabled = false,
        generateBuilderPackage = true,
        builderPackage = "io.kuberntes.client.fluent",
        value = {"io.kubernetes.client.models"}
)
public class Config {
}
