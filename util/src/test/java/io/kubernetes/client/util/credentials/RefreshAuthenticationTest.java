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
package io.kubernetes.client.util.credentials;

import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.okForContentType;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;

import io.kubernetes.client.Resources;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.util.KubeConfig;

import java.io.IOException;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;

class RefreshAuthenticationTest {
    @RegisterExtension
    static WireMockExtension apiServer = WireMockExtension.newInstance().options(options().dynamicPort()).build();

    private int refreshCount;
    private Instant instant;
    private MockClock clock;

    @BeforeEach
    void setup() {
        final ApiClient client = new ApiClient();
        client.setBasePath("http://localhost:" + apiServer.getPort());
        this.instant = Instant.now();
        this.clock = new MockClock(instant);
        RefreshAuthentication auth = new RefreshAuthentication(
                () -> {
                    refreshCount++;
                    return "foo " + refreshCount;
                }, Duration.ofSeconds(60),
                this.clock);
        auth.provide(client);
        Configuration.setDefaultApiClient(client);

        refreshCount = 0;
    }

    @Test
    void tokenProvided() throws ApiException {
        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/pods")).willReturn(okForContentType("application/json",
                        "{\"items\":[]}")));
        CoreV1Api api = new CoreV1Api();

        api.listPodForAllNamespaces().execute();
        apiServer.verify(
                1,
                getRequestedFor(urlPathEqualTo("/api/v1/pods"))
                        .withHeader("Authorization", equalTo("Bearer foo 1")));
        assertThat(refreshCount).isEqualTo(1);
    }

    @Test
    void tokenDoesntRefreshEarly() throws ApiException {
        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/pods")).willReturn(okForContentType("application/json",
                        "{\"items\":[]}")));
        CoreV1Api api = new CoreV1Api();

        api.listPodForAllNamespaces().execute();
        api.listPodForAllNamespaces().execute();

        apiServer.verify(
                2,
                getRequestedFor(urlPathEqualTo("/api/v1/pods"))
                        .withHeader("Authorization", equalTo("Bearer foo 1")));
        assertThat(refreshCount).isEqualTo(1);
    }

    @Test
    void tokenRefreshes() throws ApiException {
        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/pods")).willReturn(okForContentType("application/json",
                        "{\"items\":[]}")));
        CoreV1Api api = new CoreV1Api();

        api.listPodForAllNamespaces().execute();
        clock.setInstant(instant.plusSeconds(70));
        api.listPodForAllNamespaces().execute();

        apiServer.verify(
                1,
                getRequestedFor(urlPathEqualTo("/api/v1/pods"))
                        .withHeader("Authorization", equalTo("Bearer foo 1")));
        apiServer.verify(
                1,
                getRequestedFor(urlPathEqualTo("/api/v1/pods"))
                        .withHeader("Authorization", equalTo("Bearer foo 2")));
        assertThat(refreshCount).isEqualTo(2);
    }

    static class MockClock extends Clock {
        Instant now;

        public MockClock(Instant start) {
            this.now = start;
        }

        public void setInstant(Instant instant) {
            this.now = instant;
        }

        @Override
        public Instant instant() {
            return now;
        }

        @Override
        public ZoneId getZone() {
            return ZoneOffset.UTC;
        }

        @Override
        public Clock withZone(ZoneId zone) {
            throw new UnsupportedOperationException();
        }
    }
}
