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
package io.kubernetes.client.e2e.ssl;

import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.KubeConfig;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import nl.altindag.log.LogCaptor;
import nl.altindag.log.model.LogEvent;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Base64;
import java.util.Optional;

import static io.kubernetes.client.util.KubeConfig.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

class SSLTest {

    @Test
    void buildClientWithReloadableSslConfiguration() throws Exception {
        LogCaptor logCaptor = LogCaptor.forRoot();

        ApiClient apiClient = ClientBuilder.defaultClient();
        apiClient.setSslCaCert(null);

        SharedInformerFactory informerFactory = new SharedInformerFactory(apiClient);

        GenericKubernetesApi<V1Namespace, V1NamespaceList> api =
                new GenericKubernetesApi<>(
                        V1Namespace.class,
                        V1NamespaceList.class,
                        "",
                        "v1",
                        "namespaces",
                        apiClient);

        SharedIndexInformer<V1Namespace> nsInformer = informerFactory.sharedIndexInformerFor(api, V1Namespace.class, 0);
        Lister<V1Namespace> nsLister = new Lister<>(nsInformer.getIndexer());

        try {
            informerFactory.startAllRegisteredInformers();

            await().untilAsserted(() -> {
                nsInformer.hasSynced();
                Optional<Throwable> certificateNotFoundException = getCertificateNotFoundException(logCaptor);
                assertThat(certificateNotFoundException).isPresent();
            });

            logCaptor.clearLogs();

            Optional<byte[]> certificateAuthorityData = findConfigInHomeDir().flatMap(SSLTest::getCertificateAuthorityData);
            assertThat(certificateAuthorityData).isPresent();
            apiClient.setSslCaCert(new ByteArrayInputStream(certificateAuthorityData.get()));

            await()
                    .untilAsserted(
                            () -> {
                                assertThat(nsInformer.hasSynced()).isTrue();
                                assertThat(nsLister.list()).isNotEmpty();
                                Optional<Throwable> certificateNotFoundException = getCertificateNotFoundException(logCaptor);
                                assertThat(certificateNotFoundException).isEmpty();
                            });
        } finally {
            informerFactory.stopAllRegisteredInformers(true);
            logCaptor.close();
        }
    }

    private static Optional<byte[]> getCertificateAuthorityData(File configInHomeDir) {
        try (InputStream inputStream = Files.newInputStream(configInHomeDir.toPath());
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            KubeConfig kubeConfig = KubeConfig.loadKubeConfig(bufferedReader);
            String certificateAuthorityData = kubeConfig.getCertificateAuthorityData();
            return Optional.of(Base64.getDecoder().decode(certificateAuthorityData));
        } catch (IOException e) {
            return Optional.empty();
        }
    }

    private static Optional<Throwable> getCertificateNotFoundException(LogCaptor logCaptor) {
        return logCaptor.getLogEvents().stream()
                .map(LogEvent::getThrowable)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .filter(exception -> exception.getMessage().contains("unable to find valid certification path to requested target"))
                .findAny();
    }

    private static Optional<File> findConfigInHomeDir() {
        final File homeDir = findHomeDir();
        if (homeDir != null) {
            final File config = new File(new File(homeDir, KUBEDIR), KUBECONFIG);
            if (config.exists()) {
                return Optional.of(config);
            }
        }
        return Optional.empty();
    }

    private static File findHomeDir() {
        final String envHome = System.getenv(ENV_HOME);
        if (envHome != null && envHome.length() > 0) {
            final File config = new File(envHome);
            if (config.exists()) {
                return config;
            }
        }
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            String homeDrive = System.getenv("HOMEDRIVE");
            String homePath = System.getenv("HOMEPATH");
            if (homeDrive != null
                    && homeDrive.length() > 0
                    && homePath != null
                    && homePath.length() > 0) {
                File homeDir = new File(new File(homeDrive), homePath);
                if (homeDir.exists()) {
                    return homeDir;
                }
            }
            String userProfile = System.getenv("USERPROFILE");
            if (userProfile != null && userProfile.length() > 0) {
                File profileDir = new File(userProfile);
                if (profileDir.exists()) {
                    return profileDir;
                }
            }
        }
        return null;
    }

}
