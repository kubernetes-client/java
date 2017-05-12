package io.kubernetes.client.util;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodList;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

public class Config {
    private static final String SERVICEACCOUNT_ROOT =
        "/var/run/secrets/kubernetes.io/serviceaccount";
    private static final String SERVICEACCOUNT_CA_PATH =
        SERVICEACCOUNT_ROOT + "/ca.crt";
    private static final String SERVICEACCOUNT_TOKEN_PATH =
        SERVICEACCOUNT_ROOT + "/token";

    public static ApiClient fromCluster() throws IOException {
        String host = System.getenv("KUBERNETES_SERVICE_HOST");
        String port = System.getenv("KUBERNETES_SERVICE_PORT");

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
        // Note to the reader: I considered creating a Config object
        // and parsing into that instead of using Maps, but honestly
        // this seemed cleaner than a bunch of boilerplate classes
        Yaml yaml = new Yaml(new SafeConstructor());
        Object config = yaml.load(input);
        Map<String, Object> configMap = (Map<String, Object>)config;

        ArrayList<Object> clusters = (ArrayList<Object>)configMap.get("clusters");
        ArrayList<Object> contexts = (ArrayList<Object>)configMap.get("contexts");
        ArrayList<Object> users = (ArrayList<Object>)configMap.get("users");
        String currentContext = (String)configMap.get("current-context");

        Map<String, Object> contextMap = findObject(contexts, currentContext);
        if (contextMap == null) {
            return null;
        }
        contextMap = (Map<String, Object>)contextMap.get("context");

        String user = (String)contextMap.get("user");
        String cluster = (String)contextMap.get("cluster");

        Map<String, Object> clusterMap = findObject(clusters, cluster);
        if (clusterMap == null) {
            return null;
        }
        clusterMap = (Map<String, Object>)clusterMap.get("cluster");

        Map<String, Object> userMap = findObject(users, user);
        if (user == null) {
            return null;
        }
        userMap = (Map<String, Object>)userMap.get("user");

        String server = (String) clusterMap.get("server");
        String caCert = (String) clusterMap.get("certificate-authority-data");
        String caCertFile = (String) clusterMap.get("certificate-authority");

        ApiClient client = new ApiClient();
        client.setBasePath(server);

        String clientCertificate = (String) userMap.get("client-certificate");
        String clientCertificateData = (String) userMap.get("client-certificate-data");
        String clientKey = (String) userMap.get("client-key");
        String clientKeyData = (String) userMap.get("client-key-data");

        try {
            KeyManager[] mgrs = SSLUtils.keyManagers(
                clientCertificateData, clientCertificate,
                clientKeyData, clientKey,
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

        Object authProvider = userMap.get("auth-provider");
        if (authProvider != null) {
            Map<String, Object> authProviderMap = (Map<String, Object>) authProvider;
            Map<String, Object> authConfig = (Map<String, Object>) authProviderMap.get("config");
            if (authConfig != null) {
                String token = (String) authConfig.get("access-token");
                client.setAccessToken(token);
            }
        }

        return client;
    }

    private static Map<String, Object> findObject(ArrayList<Object> list, String name) {
        for (Object obj : list) {
            Map<String, Object> map = (Map<String, Object>)obj;
            if (name.equals((String)map.get("name"))) {
                return map;
            }
        }
        return null;
    }
}
