/*
Copyright 2025 The Kubernetes Authors.
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
package io.kubernetes.client.util;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesObject;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesTypeAdaptorFactory;
import java.io.IOException;
import org.junit.jupiter.api.Test;

/** Tests for Watch with DynamicKubernetesObject */
class WatchDynamicObjectTest {
  
  @Test
  void watchAddedEventShouldPreserveRawData() throws IOException {
    JSON json = new JSON();
    // Register the DynamicKubernetesTypeAdaptorFactory to properly handle
    // DynamicKubernetesObject
    json.setGson(
        json.getGson()
            .newBuilder()
            .registerTypeAdapterFactory(new DynamicKubernetesTypeAdaptorFactory())
            .create());
    Watch<DynamicKubernetesObject> watch =
        new Watch<>(
            json,
            null,
            new TypeToken<Watch.Response<DynamicKubernetesObject>>() {}.getType(),
            null);

    String addedEvent = "{\"type\":\"ADDED\","
        + "\"object\":{"
        + "\"apiVersion\":\"v1\","
        + "\"kind\":\"Pod\","
        + "\"metadata\":{\"name\":\"test-pod\",\"namespace\":\"default\"},"
        + "\"spec\":{\"containers\":[{\"name\":\"nginx\",\"image\":\"nginx:latest\"}]}"
        + "}}";

    Watch.Response<DynamicKubernetesObject> response = watch.parseLine(addedEvent);
    assertThat(response.type).isEqualTo("ADDED");
    assertThat(response.object).isNotNull();
    assertThat(response.object.getMetadata()).isNotNull();
    assertThat(response.object.getMetadata().getName()).isEqualTo("test-pod");

    // Check that raw data is preserved
    assertThat(response.object.getRaw()).isNotNull();
    // Should have more than just metadata
    assertThat(response.object.getRaw().size()).isGreaterThan(2);
    assertThat(response.object.getRaw().has("spec")).isTrue();
    assertThat(response.object.getRaw().get("spec")).isNotNull();
  }
  
  @Test
  void watchModifiedEventShouldPreserveRawData() throws IOException {
    JSON json = new JSON();
    // Register the DynamicKubernetesTypeAdaptorFactory to properly handle
    // DynamicKubernetesObject
    json.setGson(
        json.getGson()
            .newBuilder()
            .registerTypeAdapterFactory(new DynamicKubernetesTypeAdaptorFactory())
            .create());
    Watch<DynamicKubernetesObject> watch =
        new Watch<>(
            json,
            null,
            new TypeToken<Watch.Response<DynamicKubernetesObject>>() {}.getType(),
            null);

    String modifiedEvent = "{\"type\":\"MODIFIED\","
        + "\"object\":{"
        + "\"apiVersion\":\"v1\","
        + "\"kind\":\"Pod\","
        + "\"metadata\":{\"name\":\"test-pod\",\"namespace\":\"default\"},"
        + "\"spec\":{\"containers\":[{\"name\":\"nginx\",\"image\":\"nginx:1.19\"}]}"
        + "}}";

    Watch.Response<DynamicKubernetesObject> response = watch.parseLine(modifiedEvent);
    assertThat(response.type).isEqualTo("MODIFIED");
    assertThat(response.object).isNotNull();
    assertThat(response.object.getMetadata()).isNotNull();
    assertThat(response.object.getMetadata().getName()).isEqualTo("test-pod");

    // Check that raw data is preserved
    assertThat(response.object.getRaw()).isNotNull();
    // Should have more than just metadata
    assertThat(response.object.getRaw().size()).isGreaterThan(2);
    assertThat(response.object.getRaw().has("spec")).isTrue();
    assertThat(response.object.getRaw().get("spec")).isNotNull();
  }
}
