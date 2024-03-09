/*
Copyright 2022 The Kubernetes Authors.
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

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.kubernetes.client.util.KubeConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class KubeconfigAuthenticationTest {

  @Mock private KubeConfig kubeConfig;

  @Test
  void certificateAuthenticationFromExecCommand() throws IOException {
    Map<String, String> certCredentials = new HashMap<>();
    certCredentials.put(KubeConfig.CRED_CLIENT_CERTIFICATE_DATA_KEY, "cert");
    certCredentials.put(KubeConfig.CRED_CLIENT_KEY_DATA_KEY, "key");
    when(kubeConfig.getCredentials()).thenReturn(certCredentials);

    KubeconfigAuthentication kubeconfigAuthentication = new KubeconfigAuthentication(kubeConfig);

    assertThat(kubeconfigAuthentication.getDelegateAuthentication())
        .isInstanceOf(ClientCertificateAuthentication.class);
  }

  @Test
  void certificateAuthenticationFromKubeConfig() throws IOException {
    when(kubeConfig.getDataOrFileRelative(any(), any())).thenReturn("data".getBytes());

    KubeconfigAuthentication kubeconfigAuthentication = new KubeconfigAuthentication(kubeConfig);

    assertThat(kubeconfigAuthentication.getDelegateAuthentication())
        .isInstanceOf(ClientCertificateAuthentication.class);
    verify(kubeConfig, times(2)).getDataOrFileRelative(any(), any());
  }

  @Test
  void usernamePasswordAuthenticationFromKubeConfig() throws IOException {
    when(kubeConfig.getUsername()).thenReturn("user");
    when(kubeConfig.getPassword()).thenReturn("password");

    KubeconfigAuthentication kubeconfigAuthentication = new KubeconfigAuthentication(kubeConfig);

    assertThat(kubeconfigAuthentication.getDelegateAuthentication())
        .isInstanceOf(UsernamePasswordAuthentication.class);
  }

  @Test
  void accessTokenAuthenticationFromExecComand() throws IOException {
    Map<String, String> certCredentials = new HashMap<>();
    certCredentials.put(KubeConfig.CRED_TOKEN_KEY, "token");
    when(kubeConfig.getCredentials()).thenReturn(certCredentials);

    KubeconfigAuthentication kubeconfigAuthentication = new KubeconfigAuthentication(kubeConfig);

    assertThat(kubeconfigAuthentication.getDelegateAuthentication())
        .isInstanceOf(AccessTokenAuthentication.class);
  }

  @Test
  void dummyAuthentication() throws IOException {
    KubeconfigAuthentication kubeconfigAuthentication = new KubeconfigAuthentication(kubeConfig);

    assertThat(kubeconfigAuthentication.getDelegateAuthentication())
        .isInstanceOf(DummyAuthentication.class);
  }
}
