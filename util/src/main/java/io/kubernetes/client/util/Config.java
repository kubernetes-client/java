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
package io.kubernetes.client.util;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.credentials.AccessTokenAuthentication;
import io.kubernetes.client.util.credentials.UsernamePasswordAuthentication;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Config {
  private static final Logger log = LoggerFactory.getLogger(Config.class);

  public static final String SERVICEACCOUNT_ROOT = "/var/run/secrets/kubernetes.io/serviceaccount";
  public static final String SERVICEACCOUNT_CA_PATH = SERVICEACCOUNT_ROOT + "/ca.crt";
  public static final String SERVICEACCOUNT_TOKEN_PATH = SERVICEACCOUNT_ROOT + "/token";
  public static final String SERVICEACCOUNT_NAMESPACE_PATH = SERVICEACCOUNT_ROOT + "/namespace";
  public static final String ENV_KUBECONFIG = "KUBECONFIG";
  public static final String ENV_SERVICE_HOST = "KUBERNETES_SERVICE_HOST";
  public static final String ENV_SERVICE_PORT = "KUBERNETES_SERVICE_PORT";
  // The last resort host to try
  public static final String DEFAULT_FALLBACK_HOST = "http://localhost:8080";

  public static ApiClient fromCluster() throws IOException {
    return ClientBuilder.cluster().build();
  }

  public static ApiClient fromUrl(String url) {
    return fromUrl(url, true);
  }

  public static ApiClient fromUrl(String url, boolean validateSSL) {
    return new ApiClient().setBasePath(url).setVerifyingSsl(validateSSL);
  }

  public static ApiClient fromUserPassword(String url, String user, String password) {
    return fromUserPassword(url, user, password, true);
  }

  public static ApiClient fromUserPassword(
      String url, String user, String password, boolean validateSSL) {
    return new ClientBuilder()
        .setBasePath(url)
        .setAuthentication(new UsernamePasswordAuthentication(user, password))
        .setVerifyingSsl(validateSSL)
        .build();
  }

  public static ApiClient fromToken(String url, String token) {
    return fromToken(url, token, true);
  }

  public static ApiClient fromToken(String url, String token, boolean validateSSL) {
    return new ClientBuilder()
        .setBasePath(url)
        .setAuthentication(new AccessTokenAuthentication(token))
        .setVerifyingSsl(validateSSL)
        .build();
  }

  public static ApiClient fromConfig(String fileName) throws IOException {
    try (BufferedReader bufferedReader =
        new BufferedReader(
            new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8.name()))) {
      KubeConfig config = KubeConfig.loadKubeConfig(bufferedReader);
      config.setFile(new File(fileName));
      return fromConfig(config);
    }
  }

  public static ApiClient fromConfig(InputStream stream) throws IOException {
    return fromConfig(new InputStreamReader(stream, StandardCharsets.UTF_8.name()));
  }

  public static ApiClient fromConfig(Reader input) throws IOException {
    return fromConfig(KubeConfig.loadKubeConfig(input));
  }

  public static ApiClient fromConfig(KubeConfig config) throws IOException {
    return ClientBuilder.kubeconfig(config).build();
  }

  /**
   * Easy client creation, follows this plan
   *
   * <ul>
   *   <li>If $KUBECONFIG is defined, use that config file.
   *   <li>If $HOME/.kube/config can be found, use that.
   *   <li>If the in-cluster service account can be found, assume in cluster config.
   *   <li>Default to localhost:8080 as a last resort.
   * </ul>
   *
   * @return The best APIClient given the previously described rules
   */
  public static ApiClient defaultClient() throws IOException {
    return ClientBuilder.standard().build();
  }
}
