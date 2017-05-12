package io.kubernetes.client.util;

import io.kubernetes.client.ApiClient;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;

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
        result.setAccessToken(builder.toString());

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
        KubeConfig config = KubeConfig.loadKubeConfig(input);
        ApiClient client = new ApiClient();
        client.setBasePath(config.getServer());

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
            ex.printStackTrace();
        }

        // It's silly to have to do it in this order, but each SSL setup
        // consumes the CA cert, so if we do this before the client certs
        // are injected the cert input stream is exhausted and things get
        // grumpy'
        String caCert = config.getCertificateAuthorityData();
        String caCertFile = config.getCertificateAuthorityFile();
        if (caCert != null) {
            try {
                client.setSslCaCert(new ByteArrayInputStream(caCert.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
        } else if (caCertFile != null) {
            try {
                client.setSslCaCert(new FileInputStream(caCertFile));
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }

        String token = config.getAccessToken();
        if (token != null) {
            client.setAccessToken(token);
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
     *   <li>If $KUBECONFIG is defined, use that config file
     *   <li>If $HOME/.kube/confg can be found, use that.
     *   <li>If the in-cluster service account can be found, assume in cluster config.
     *   <li>Default to localhost:8080 as a last resort.
     * <ul>
     * 
     * @returns The best APIClient given the previously described rules
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