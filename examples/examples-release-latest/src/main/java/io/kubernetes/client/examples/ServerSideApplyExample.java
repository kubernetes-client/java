/*
Copyright 2026 The Kubernetes Authors.
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
package io.kubernetes.client.examples;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ConfigMapList;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.ServerSideApply;
import java.io.IOException;
import java.util.Map;

/**
 * Demonstrates server-side apply using the {@link ServerSideApply} helper.
 *
 * <p>Server-side apply lets you declare the desired state of a resource and have the API server
 * merge it based on field ownership. Re-applying the same manifest is idempotent, and {@code
 * forceConflicts} lets a field manager take ownership of fields owned by someone else.
 *
 * <p>This example applies a {@code ConfigMap}, mutates one field and re-applies it, and finally
 * runs a dry-run apply that the server validates without persisting.
 *
 * <p>Run with:
 *
 * <pre>{@code
 * mvn exec:java \
 *   -Dexec.mainClass="io.kubernetes.client.examples.ServerSideApplyExample"
 * }</pre>
 */
public final class ServerSideApplyExample {

  private static final String FIELD_MANAGER = "server-side-apply-example";

  private ServerSideApplyExample() {}

  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();

    V1ConfigMap configMap =
        new V1ConfigMap()
            .apiVersion("v1")
            .kind("ConfigMap")
            .metadata(new V1ObjectMeta().name("ssa-example").namespace("default"))
            .data(Map.of("greeting", "hello"));

    // First apply creates the ConfigMap and records the fields owned by this field manager.
    V1ConfigMap applied =
        ServerSideApply.apply(
            client, V1ConfigMap.class, V1ConfigMapList.class, configMap, FIELD_MANAGER);
    System.out.println("applied: " + applied.getData());

    // Re-applying an updated manifest is idempotent; forceConflicts takes ownership of any field
    // that another manager may have changed in the meantime.
    configMap.data(Map.of("greeting", "hello again"));
    V1ConfigMap updated =
        ServerSideApply.builder(client)
            .apiTypeClass(V1ConfigMap.class)
            .apiListTypeClass(V1ConfigMapList.class)
            .resource(configMap)
            .fieldManager(FIELD_MANAGER)
            .forceConflicts(true)
            .apply();
    System.out.println("updated: " + updated.getData());

    // A dry-run apply is validated by the server but never persisted.
    configMap.data(Map.of("greeting", "not persisted"));
    V1ConfigMap dryRun =
        ServerSideApply.builder(client)
            .apiTypeClass(V1ConfigMap.class)
            .apiListTypeClass(V1ConfigMapList.class)
            .resource(configMap)
            .fieldManager(FIELD_MANAGER)
            .dryRun()
            .apply();
    System.out.println("dry-run (not persisted): " + dryRun.getData());
  }
}
