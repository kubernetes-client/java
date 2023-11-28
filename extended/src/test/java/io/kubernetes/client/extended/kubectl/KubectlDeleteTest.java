/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client.extended.kubectl;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.assertThrows;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.stubbing.Scenario;
import io.kubernetes.client.extended.kubectl.Kubectl;
import io.kubernetes.client.extended.kubectl.KubectlDelete;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.BatchV1Api;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.ModelMapper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class KubectlDeleteTest {

    private ApiClient apiClient;

    private static final byte[] DISCOVERY_API;

    static {
        try {
            DISCOVERY_API = KubectlDeleteTest.class
                    .getClassLoader()
                    .getResourceAsStream("discovery-api.json")
                    .readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException("Failed to load resource", e);
        }
    }

    private static final byte[]  DISCOVERY_APIV1;

    static {
        try {
            DISCOVERY_APIV1 = KubectlDeleteTest.class
                    .getClassLoader()
                    .getResourceAsStream("discovery-api-v1.json")
                    .readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static final byte[] ADD_JOB;

    static {
        try {
            ADD_JOB = KubectlDeleteTest.class
                    .getClassLoader()
                    .getResourceAsStream("deleted-add-job.json").readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final byte[]  GET_BATCH;

    static {
        try {
            GET_BATCH = KubectlDeleteTest.class
                    .getClassLoader()
                    .getResourceAsStream("deleted-get-batch.json").readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final byte[]  DELETED_FIRST;

    static {
        try {
            DELETED_FIRST = KubectlDeleteTest.class
                    .getClassLoader()
                    .getResourceAsStream("deleted-success.json").readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final byte[]  DELETED_SECOND;

    static {
        try {
            DELETED_SECOND = KubectlDeleteTest.class
                    .getClassLoader()
                    .getResourceAsStream("deleted-not-found.json").readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final byte[]  DISCOVERY_APIS;

    static {
        try {
            DISCOVERY_APIS = KubectlDeleteTest.class
                    .getClassLoader()
                    .getResourceAsStream("discovery-apis.json").readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Rule public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().dynamicPort());

    @Before
    public void setup() {
        apiClient = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
    }

    @Test
    public void testKubectlDelete() throws KubectlException, IOException, ApiException {
        wireMockRule.stubFor(
                post(urlPathEqualTo("/apis/batch/v1/namespaces/foo/jobs"))
                        .willReturn(
                                aResponse()
                                        .withStatus(201)
                                        .withBody(ADD_JOB)));
        wireMockRule.stubFor(
                delete(urlPathEqualTo("/apis/batch%2Fv1/batch%2Fv1/namespaces/foo/jobs/bar"))
                        .inScenario("JobDeletionScenario")
                        .whenScenarioStateIs(Scenario.STARTED)
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withBody(DELETED_FIRST)
                        )
                        .willSetStateTo("SecondCall")
        );

        wireMockRule.stubFor(
                delete(urlPathEqualTo("/apis/batch%2Fv1/batch%2Fv1/namespaces/foo/jobs/bar"))
                        .inScenario("JobDeletionScenario")
                        .whenScenarioStateIs("SecondCall")
                        .willReturn(aResponse()
                                .withStatus(404)
                                .withBody(DELETED_SECOND)
                        )
        );


        wireMockRule.stubFor(
                get(urlPathEqualTo("/api"))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody(DISCOVERY_API)));
        wireMockRule.stubFor(
                get(urlPathEqualTo("/apis"))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody(DISCOVERY_APIS)));
        wireMockRule.stubFor(
                get(urlPathEqualTo("/api/v1"))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody(DISCOVERY_APIV1)));
        wireMockRule.stubFor(
                get(urlPathEqualTo("/apis/batch/v1/"))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody(GET_BATCH)));

        V1JobSpec v1JobSpec = new V1JobSpec()
                .template(new V1PodTemplateSpec()
                        .spec(new V1PodSpec()
                                .containers(java.util.Arrays.asList(new V1Container()
                                        .name("hello")
                                        .image("busybox")
                                        .command(java.util.Arrays.asList("sh", "-c", "echo Hello World!"))))
                                .restartPolicy("Never")));
        V1Job job = new V1Job()
                .apiVersion("batch/v1")
                .kind("Job")
                .metadata(new V1ObjectMeta().name("bar"))
                .spec(v1JobSpec);
        BatchV1Api api = new BatchV1Api();
        api.setApiClient(apiClient);
        api.createNamespacedJob("foo", job, null, null, null, "Strict");
        ModelMapper.addModelMap(api.getAPIResources().getGroupVersion(), job.getApiVersion(), job.getKind(), "jobs", true, V1Job.class);

        KubectlDelete<V1Job> kubectlDelete = Kubectl.delete(V1Job.class);
        kubectlDelete.apiClient(apiClient);
        kubectlDelete.namespace("foo").name("bar");
        kubectlDelete.execute();

        assertThrows(KubectlException.class, () -> {
            KubectlDelete<V1Job> kubectlDelete2 = Kubectl.delete(V1Job.class);
            kubectlDelete2.apiClient(apiClient);
            kubectlDelete2.namespace("foo").name("bar");
            kubectlDelete2.execute();
        });

        KubectlDelete<V1Job> kubectlDelete2 = Kubectl.delete(V1Job.class);
        kubectlDelete2.apiClient(apiClient);
        kubectlDelete2.namespace("foo").name("bar").ignoreNotFound(true);
        kubectlDelete2.execute();
    }
}
