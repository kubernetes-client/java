/*
Copyright 2017 The Kubernetes Authors.
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

import io.kubernetes.client.ApiClient;
import org.apache.log4j.Logger;

import javax.net.ssl.KeyManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Config {
    public static final String SERVICEACCOUNT_ROOT =
        "/var/run/secrets/kubernetes.io/serviceaccount";
    public static final String SERVICEACCOUNT_CA_PATH =
        SERVICEACCOUNT_ROOT + "/ca.crt";
    public static final String SERVICEACCOUNT_TOKEN_PATH =
        SERVICEACCOUNT_ROOT + "/token";
    public static final String ENV_KUBECONFIG = "KUBECONFIG";
    public static final String ENV_SERVICE_HOST = "KUBERNETES_SERVICE_HOST";
    public static final String ENV_SERVICE_PORT = "KUBERNETES_SERVICE_PORT";
    // The last resort host to try
    public static final String DEFAULT_FALLBACK_HOST = "http://localhost:8080";

    private static final Logger log = Logger.getLogger(Config.class);

    public static ApiClient fromCluster() throws IOException {
        String host = System.getenv(ENV_SERVICE_HOST);
        String port = System.getenv(ENV_SERVICE_PORT);

        FileInputStream caCert = new FileInputStream(SERVICEACCOUNT_CA_PATH);
        BufferedReader tokenReader = new BufferedReader(new FileReader(SERVICEACCOUNT_TOKEN_PATH));
        StringBuilder builder = new StringBuilder();
        for (String line = tokenReader.readLine(); line != null; line = tokenReader.readLine()) {
            builder.append(line);
        }
        ApiClient result = new ApiClient();
        result.setBasePath("https://" + host + ":" + port);
        result.setSslCaCert(caCert);
        result.setApiKey("Bearer " + builder.toString());

        return result;
    }

    public static ApiClient fromUrl(String url) {
        return fromUrl(url, true);
    }

    public static ApiClient fromUrl(String url, boolean validateSSL) {
        return new ApiClient()
            .setBasePath(url)
            .setVerifyingSsl(validateSSL);
    }

    public static ApiClient fromUserPassword(String url, String user, String password) {
        return fromUserPassword(url, user, password, true);
    }

    public static ApiClient fromUserPassword(String url, String user, String password, boolean validateSSL) {
        ApiClient client = fromUrl(url, validateSSL);
        client.setUsername(user);
        client.setPassword(password);
        return client;
    }

    public static ApiClient fromToken(String url, String token) {
        return fromToken(url, token, true);
    }

    public static ApiClient fromToken(String url, String token, boolean validateSSL) {
        ApiClient client = fromUrl(url, validateSSL);
        client.setAccessToken(token);
        return client;
    }

    public static ApiClient fromConfig(String fileName) throws IOException {
        return fromConfig(new FileReader(fileName));
    }

    public static ApiClient fromConfig(InputStream stream) {
        return fromConfig(new InputStreamReader(stream));
    }

    public static ApiClient fromConfig(Reader input) {
        return fromConfig(KubeConfig.loadKubeConfig(input));
    }

    public static ApiClient fromConfig(KubeConfig config) {
        ApiClient client = new ApiClient();
        String server = config.getServer();
        if (!server.startsWith("http://") && !server.startsWith("https://")) {
            if (server.indexOf(":443") != -1) {
                server = "https://" + server;
            } else {
                server = "http://" + server;
            }
        }
        client.setBasePath(server);

        try {
            KeyManager[] mgrs = SSLUtils.keyManagers(
                config.getClientCertificateData(),
                config.getClientCertificateFile(),
                config.getClientKeyData(),
                config.getClientKeyFile(),
                "RSA", "",
                null, null);
            client.setKeyManagers(mgrs);
        } catch (Exception ex) {
            log.error("Failed to invoke build key managers", ex);
        }

        if (config.verifySSL()) {
            // It's silly to have to do it in this order, but each SSL setup
            // consumes the CA cert, so if we do this before the client certs
            // are injected the cert input stream is exhausted and things get
            // grumpy'
            String caCert = config.getCertificateAuthorityData();
            String caCertFile = config.getCertificateAuthorityFile();
            if (caCert != null || caCertFile != null) {
                try {
                    client.setSslCaCert(SSLUtils.getInputStreamFromDataOrFile(caCert, caCertFile));
                } catch (FileNotFoundException ex) {
                    log.error("Failed to find CA Cert file", ex);
                }
            }
        } else {
            client.setVerifyingSsl(false);
        }

        String token = config.getAccessToken();
        if (token != null) {
            // This is kind of a hack, except not, because I don't think we actually
            // want to use oauth here.
            client.setApiKey("Bearer " + token);
        }

        String username = config.getUsername();
        if (username != null) {
            client.setUsername(username);
        }

        String password = config.getPassword();
        if (password != null) {
            client.setPassword(password);
        }

        return client;
    }

    /**
     * Easy client creation, follows this plan
     * <ul>
     *   <li>If $KUBECONFIG is defined, use that config file.</li>
     *   <li>If $HOME/.kube/confg can be found, use that.</li>
     *   <li>If the in-cluster service account can be found, assume in cluster config.</li>
     *   <li>Default to localhost:8080 as a last resort.</li>
     * </ul>
     * 
     * @return The best APIClient given the previously described rules
     */
    public static ApiClient defaultClient() throws IOException {
        String kubeConfig = System.getenv(ENV_KUBECONFIG);
        if (kubeConfig != null) {
            return fromConfig(new FileReader(kubeConfig));
        }
        File config = new File(
            new File(System.getenv(KubeConfig.ENV_HOME),
                     KubeConfig.KUBEDIR),
            KubeConfig.KUBECONFIG);
        if (config.exists()) {
            return fromConfig(new FileReader(config));
        }
        File clusterCA = new File(SERVICEACCOUNT_CA_PATH);
        if (clusterCA.exists()) {
            return fromCluster();
        }
        ApiClient client = new ApiClient();
        client.setBasePath(DEFAULT_FALLBACK_HOST);
        return client;
    }
}
