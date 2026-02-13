/*
Copyright 2024 The Kubernetes Authors.
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
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.openapi.models.V1Secret;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResourceListTest {

    private ApiClient apiClient;

    private static final String MULTI_RESOURCE_YAML =
            "apiVersion: v1\n" +
            "kind: ConfigMap\n" +
            "metadata:\n" +
            "  name: test-configmap\n" +
            "  namespace: default\n" +
            "data:\n" +
            "  key: value\n" +
            "---\n" +
            "apiVersion: v1\n" +
            "kind: Secret\n" +
            "metadata:\n" +
            "  name: test-secret\n" +
            "  namespace: default\n" +
            "type: Opaque\n" +
            "data:\n" +
            "  password: cGFzc3dvcmQ=\n";

    private static final String POD_YAML =
            "apiVersion: v1\n" +
            "kind: Pod\n" +
            "metadata:\n" +
            "  name: test-pod\n" +
            "  namespace: default\n" +
            "spec:\n" +
            "  containers:\n" +
            "  - name: nginx\n" +
            "    image: nginx:latest\n";

    @BeforeEach
    void setup() {
        apiClient = new ClientBuilder().setBasePath("http://localhost:8080").build();
    }

    // ========== Loading Tests ==========

    @Test
    void fromStream_singleResource_createsResourceList() throws IOException {
        InputStream is = new ByteArrayInputStream(POD_YAML.getBytes(StandardCharsets.UTF_8));

        ResourceList resourceList = ResourceList.fromStream(apiClient, is);

        assertThat(resourceList).isNotNull();
        assertThat(resourceList.getResources()).hasSize(1);
        assertThat(resourceList.getResources().get(0)).isInstanceOf(V1Pod.class);
    }

    @Test
    void fromStream_multipleResources_createsResourceList() throws IOException {
        InputStream is = new ByteArrayInputStream(MULTI_RESOURCE_YAML.getBytes(StandardCharsets.UTF_8));

        ResourceList resourceList = ResourceList.fromStream(apiClient, is);

        assertThat(resourceList).isNotNull();
        assertThat(resourceList.getResources()).hasSize(2);
        assertThat(resourceList.getResources().get(0)).isInstanceOf(V1ConfigMap.class);
        assertThat(resourceList.getResources().get(1)).isInstanceOf(V1Secret.class);
    }

    @Test
    void fromYaml_createsResourceList() throws IOException {
        ResourceList resourceList = ResourceList.fromYaml(apiClient, POD_YAML);

        assertThat(resourceList).isNotNull();
        assertThat(resourceList.getResources()).hasSize(1);
    }

    @Test
    void getResources_returnsImmutableList() throws IOException {
        ResourceList resourceList = ResourceList.fromYaml(apiClient, POD_YAML);
        List<Object> resources = resourceList.getResources();

        assertThatThrownBy(() -> resources.add(new V1Pod()))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    // ========== from() Factory Tests ==========

    @Test
    void from_withResources_createsResourceList() {
        V1Pod pod1 = createPod("pod1", "default");
        V1Pod pod2 = createPod("pod2", "default");

        ResourceList resourceList = ResourceList.from(apiClient, pod1, pod2);

        assertThat(resourceList.getResources()).hasSize(2);
    }

    @Test
    void from_withResourceList_createsResourceList() {
        V1Pod pod1 = createPod("pod1", "default");
        V1Pod pod2 = createPod("pod2", "default");

        ResourceList resourceList = ResourceList.from(apiClient, List.of(pod1, pod2));

        assertThat(resourceList.getResources()).hasSize(2);
    }

    // ========== Utility Method Tests ==========

    @Test
    void getResources_size_returnsCorrectCount() throws IOException {
        ResourceList resourceList = ResourceList.fromYaml(apiClient, MULTI_RESOURCE_YAML);

        assertThat(resourceList.getResources().size()).isEqualTo(2);
    }

    @Test
    void getResources_isEmpty_emptyList_returnsTrue() {
        ResourceList resourceList = ResourceList.from(apiClient, List.of());

        assertThat(resourceList.getResources().isEmpty()).isTrue();
    }

    @Test
    void getResources_isEmpty_nonEmptyList_returnsFalse() throws IOException {
        ResourceList resourceList = ResourceList.fromYaml(apiClient, POD_YAML);

        assertThat(resourceList.getResources().isEmpty()).isFalse();
    }

    // ========== Error Handling Tests ==========

    @Test
    void fromStream_nullInput_throwsNullPointerException() {
        assertThatThrownBy(() -> ResourceList.fromStream(apiClient, null))
                .isInstanceOf(NullPointerException.class);
    }

    // ========== Chaining Tests ==========

    @Test
    void inNamespace_returnsThis() throws IOException {
        ResourceList resourceList = ResourceList.fromYaml(apiClient, POD_YAML);

        ResourceList result = resourceList.inNamespace("custom-ns");

        assertThat(result).isSameAs(resourceList);
    }

    @Test
    void continueOnError_returnsThis() throws IOException {
        ResourceList resourceList = ResourceList.fromYaml(apiClient, POD_YAML);

        ResourceList result = resourceList.continueOnError(true);

        assertThat(result).isSameAs(resourceList);
    }

    // ========== Resource Loading and Metadata Tests ==========

    @Test
    void fromYaml_loadsConfigMap_withCorrectMetadata() throws IOException {
        ResourceList resourceList = ResourceList.fromYaml(apiClient, MULTI_RESOURCE_YAML);

        V1ConfigMap configMap = (V1ConfigMap) resourceList.getResources().get(0);
        assertThat(configMap.getMetadata().getName()).isEqualTo("test-configmap");
        assertThat(configMap.getMetadata().getNamespace()).isEqualTo("default");
    }

    @Test
    void fromYaml_loadsSecret_withCorrectMetadata() throws IOException {
        ResourceList resourceList = ResourceList.fromYaml(apiClient, MULTI_RESOURCE_YAML);

        V1Secret secret = (V1Secret) resourceList.getResources().get(1);
        assertThat(secret.getMetadata().getName()).isEqualTo("test-secret");
        assertThat(secret.getMetadata().getNamespace()).isEqualTo("default");
    }

    @Test
    void fromYaml_loadsPod_withCorrectMetadata() throws IOException {
        ResourceList resourceList = ResourceList.fromYaml(apiClient, POD_YAML);

        V1Pod pod = (V1Pod) resourceList.getResources().get(0);
        assertThat(pod.getMetadata().getName()).isEqualTo("test-pod");
        assertThat(pod.getMetadata().getNamespace()).isEqualTo("default");
    }

    private V1Pod createPod(String name, String namespace) {
        V1ObjectMeta metadata = new V1ObjectMeta().name(name);
        if (namespace != null) {
            metadata.namespace(namespace);
        }
        return new V1Pod()
                .apiVersion("v1")
                .kind("Pod")
                .metadata(metadata)
                .spec(new V1PodSpec());
    }
}
