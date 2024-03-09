/*
Copyright 2023 The Kubernetes Authors.
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

import com.amazonaws.auth.AWSSessionCredentialsProvider;
import com.amazonaws.auth.BasicSessionCredentials;
import io.kubernetes.client.openapi.ApiClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EKSAuthenticationTest {

    @Mock
    private AWSSessionCredentialsProvider provider;

    @Mock
    private ApiClient apiClient;

    private String region = "us-west-2";

    private String clusterName = "test-2";

  @Test
  void provideApiClient() {
        when(provider.getCredentials()).thenReturn(new BasicSessionCredentials("ak", "sk", "session"));
        EKSAuthentication authentication = new EKSAuthentication(provider, region, clusterName);
        authentication.provide(apiClient);
        verify(apiClient).setApiKey(anyString());
        verify(apiClient).setApiKeyPrefix(anyString());
    }
}
