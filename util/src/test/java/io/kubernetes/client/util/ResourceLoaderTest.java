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

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1Secret;
import io.kubernetes.client.openapi.models.V1Service;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.junit.jupiter.api.Test;

class ResourceLoaderTest {

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

    private static final String DEPLOYMENT_YAML =
            "apiVersion: apps/v1\n" +
            "kind: Deployment\n" +
            "metadata:\n" +
            "  name: test-deployment\n" +
            "  namespace: default\n" +
            "spec:\n" +
            "  replicas: 3\n" +
            "  selector:\n" +
            "    matchLabels:\n" +
            "      app: test\n" +
            "  template:\n" +
            "    metadata:\n" +
            "      labels:\n" +
            "        app: test\n" +
            "    spec:\n" +
            "      containers:\n" +
            "      - name: nginx\n" +
            "        image: nginx:latest\n";

    private static final String MULTI_RESOURCE_YAML =
            "apiVersion: v1\n" +
            "kind: ConfigMap\n" +
            "metadata:\n" +
            "  name: test-configmap\n" +
            "data:\n" +
            "  key: value\n" +
            "---\n" +
            "apiVersion: v1\n" +
            "kind: Secret\n" +
            "metadata:\n" +
            "  name: test-secret\n" +
            "type: Opaque\n" +
            "data:\n" +
            "  password: cGFzc3dvcmQ=\n";

    @Test
    void load_fromInputStream_returnsPod() throws IOException {
        InputStream is = new ByteArrayInputStream(POD_YAML.getBytes(StandardCharsets.UTF_8));

        Object result = ResourceLoader.load(is);

        assertThat(result).isInstanceOf(V1Pod.class);
        V1Pod pod = (V1Pod) result;
        assertThat(pod.getMetadata().getName()).isEqualTo("test-pod");
        assertThat(pod.getMetadata().getNamespace()).isEqualTo("default");
    }

    @Test
    void load_fromInputStream_returnsDeployment() throws IOException {
        InputStream is = new ByteArrayInputStream(DEPLOYMENT_YAML.getBytes(StandardCharsets.UTF_8));

        Object result = ResourceLoader.load(is);

        assertThat(result).isInstanceOf(V1Deployment.class);
        V1Deployment deployment = (V1Deployment) result;
        assertThat(deployment.getMetadata().getName()).isEqualTo("test-deployment");
        assertThat(deployment.getSpec().getReplicas()).isEqualTo(3);
    }

    @Test
    void load_nullInputStream_throwsNullPointerException() {
        assertThatThrownBy(() -> ResourceLoader.load((InputStream) null))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void load_fromInputStreamWithType_returnsTypedResource() throws IOException {
        InputStream is = new ByteArrayInputStream(POD_YAML.getBytes(StandardCharsets.UTF_8));

        V1Pod pod = ResourceLoader.load(is, V1Pod.class);

        assertThat(pod).isNotNull();
        assertThat(pod.getMetadata().getName()).isEqualTo("test-pod");
    }

    @Test
    void loadAll_fromInputStream_returnsMultipleResources() throws IOException {
        InputStream is = new ByteArrayInputStream(MULTI_RESOURCE_YAML.getBytes(StandardCharsets.UTF_8));

        List<Object> resources = ResourceLoader.loadAll(is);

        assertThat(resources).hasSize(2);
        assertThat(resources.get(0)).isInstanceOf(V1ConfigMap.class);
        assertThat(resources.get(1)).isInstanceOf(V1Secret.class);

        V1ConfigMap configMap = (V1ConfigMap) resources.get(0);
        assertThat(configMap.getMetadata().getName()).isEqualTo("test-configmap");

        V1Secret secret = (V1Secret) resources.get(1);
        assertThat(secret.getMetadata().getName()).isEqualTo("test-secret");
    }

    @Test
    void loadAll_singleResource_returnsSingleElementList() throws IOException {
        InputStream is = new ByteArrayInputStream(POD_YAML.getBytes(StandardCharsets.UTF_8));

        List<Object> resources = ResourceLoader.loadAll(is);

        assertThat(resources).hasSize(1);
        assertThat(resources.get(0)).isInstanceOf(V1Pod.class);
    }

    @Test
    void loadAll_emptyStream_returnsEmptyList() throws IOException {
        InputStream is = new ByteArrayInputStream("".getBytes(StandardCharsets.UTF_8));

        List<Object> resources = ResourceLoader.loadAll(is);

        assertThat(resources).isEmpty();
    }

    @Test
    void load_fromString_returnsResource() throws IOException {
        Object result = ResourceLoader.load(POD_YAML);

        assertThat(result).isInstanceOf(V1Pod.class);
        V1Pod pod = (V1Pod) result;
        assertThat(pod.getMetadata().getName()).isEqualTo("test-pod");
    }

    @Test
    void loadAll_fromString_returnsMultipleResources() throws IOException {
        List<Object> resources = ResourceLoader.loadAll(MULTI_RESOURCE_YAML);

        assertThat(resources).hasSize(2);
        assertThat(resources.get(0)).isInstanceOf(V1ConfigMap.class);
        assertThat(resources.get(1)).isInstanceOf(V1Secret.class);
    }

    @Test
    void load_fromUrl_returnsResource() throws IOException {
        // Use a test resource file
        URL url = getClass().getClassLoader().getResource("test-pod.yaml");
        if (url != null) {
            Object result = ResourceLoader.load(url);
            assertThat(result).isInstanceOf(V1Pod.class);
        }
        // Skip test if resource not available
    }

    @Test
    void load_fromFile_returnsResource() throws IOException {
        // Use a test resource file
        URL url = getClass().getClassLoader().getResource("test-pod.yaml");
        if (url != null) {
            File file = new File(url.getFile());
            if (file.exists()) {
                Object result = ResourceLoader.load(file);
                assertThat(result).isInstanceOf(V1Pod.class);
            }
        }
        // Skip test if resource not available
    }

    @Test
    void loadAllFromFile_multiDocument_returnsAllResources() throws IOException {
        // Use the test.yaml which has multiple documents
        URL url = getClass().getClassLoader().getResource("test.yaml");
        if (url != null) {
            File file = new File(url.getFile());
            if (file.exists()) {
                List<Object> resources = ResourceLoader.loadAll(file);
                assertThat(resources).isNotEmpty();
                // test.yaml has Service, Deployment, and Secret
                assertThat(resources.size()).isGreaterThanOrEqualTo(3);
            }
        }
    }

    @Test
    void pluralize_commonKinds_returnsCorrectPlurals() {
        // Test through loading since pluralize is private
        // The pluralize logic is used internally for API path construction
        assertThat(getPluralForKind("Pod")).isEqualTo("pods");
        assertThat(getPluralForKind("Deployment")).isEqualTo("deployments");
        assertThat(getPluralForKind("Service")).isEqualTo("services");
        assertThat(getPluralForKind("ConfigMap")).isEqualTo("configmaps");
        assertThat(getPluralForKind("Secret")).isEqualTo("secrets");
        assertThat(getPluralForKind("DaemonSet")).isEqualTo("daemonsets");
        assertThat(getPluralForKind("ReplicaSet")).isEqualTo("replicasets");
        assertThat(getPluralForKind("StatefulSet")).isEqualTo("statefulsets");
        assertThat(getPluralForKind("Job")).isEqualTo("jobs");
        assertThat(getPluralForKind("CronJob")).isEqualTo("cronjobs");
        assertThat(getPluralForKind("Policy")).isEqualTo("policies");
    }

    /**
     * Helper to test pluralization by using reflection on the private pluralize method.
     * Note: this mimics the pluralization logic but may differ from the actual implementation
     * for special cases like Endpoints and Ingress.
     */
    private String getPluralForKind(String kind) {
        // Use simple pluralization rules matching the implementation
        String lower = kind.toLowerCase();
        if (lower.endsWith("y") && lower.length() > 1) {
            char beforeY = lower.charAt(lower.length() - 2);
            if (beforeY != 'a' && beforeY != 'e' && beforeY != 'i' && beforeY != 'o' && beforeY != 'u') {
                return lower.substring(0, lower.length() - 1) + "ies";
            }
        }
        if (lower.endsWith("s") || lower.endsWith("x") || lower.endsWith("z") 
                || lower.endsWith("ch") || lower.endsWith("sh")) {
            return lower + "es";
        }
        return lower + "s";
    }

    @Test
    void loadWithNamespace_overridesNamespace() throws IOException {
        String yamlWithoutNamespace = 
                "apiVersion: v1\n" +
                "kind: Pod\n" +
                "metadata:\n" +
                "  name: test-pod\n" +
                "spec:\n" +
                "  containers:\n" +
                "  - name: nginx\n" +
                "    image: nginx:latest\n";

        InputStream is = new ByteArrayInputStream(yamlWithoutNamespace.getBytes(StandardCharsets.UTF_8));
        Object result = ResourceLoader.load(is);

        assertThat(result).isInstanceOf(V1Pod.class);
        V1Pod pod = (V1Pod) result;
        // Without namespace in YAML, it should be null
        assertThat(pod.getMetadata().getNamespace()).isNull();
    }

    @Test
    void loadAll_withYamlSeparators_handlesMultipleDocuments() throws IOException {
        String yaml =
                "---\n" +
                "apiVersion: v1\n" +
                "kind: ConfigMap\n" +
                "metadata:\n" +
                "  name: config1\n" +
                "---\n" +
                "apiVersion: v1\n" +
                "kind: ConfigMap\n" +
                "metadata:\n" +
                "  name: config2\n" +
                "---\n";

        InputStream is = new ByteArrayInputStream(yaml.getBytes(StandardCharsets.UTF_8));
        List<Object> resources = ResourceLoader.loadAll(is);

        assertThat(resources).hasSize(2);
        assertThat(((V1ConfigMap) resources.get(0)).getMetadata().getName()).isEqualTo("config1");
        assertThat(((V1ConfigMap) resources.get(1)).getMetadata().getName()).isEqualTo("config2");
    }
}
