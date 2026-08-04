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

import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.PatchUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Demonstrates JSON-patching a namespaced custom object.
 *
 * <p>The generated patch API defaults to {@code application/json}. Kubernetes patch requests must
 * instead use a patch-specific media type, which {@link PatchUtils} supplies.
 *
 * <p>Run with arguments {@code <group> <version> <namespace> <plural> <name> <patch-file>}. For
 * example:
 *
 * <pre>{@code
 * mvn exec:java \
 *   -Dexec.mainClass="io.kubernetes.client.examples.PatchCustomObjectExample" \
 *   -Dexec.args="example.com v1 default widgets my-widget /tmp/widget-patch.json"
 * }</pre>
 */
public final class PatchCustomObjectExample {

  private PatchCustomObjectExample() {}

  public static void main(String[] args) throws IOException, ApiException {
    if (args.length != 6) {
      throw new IllegalArgumentException(
          "Expected arguments: <group> <version> <namespace> <plural> <name> <patch-file>");
    }

    ApiClient client = Config.defaultClient();
    CustomObjectsApi api = new CustomObjectsApi(client);
    String patchJson = Files.readString(Path.of(args[5]));

    Object result =
        PatchUtils.patch(
            Object.class,
            () ->
                api.patchNamespacedCustomObject(
                        args[0],
                        args[1],
                        args[2],
                        args[3],
                        args[4],
                        new V1Patch(patchJson))
                    .buildCall(null),
            V1Patch.PATCH_FORMAT_JSON_PATCH,
            client);

    System.out.println(result);
  }
}
