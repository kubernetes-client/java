package io.kubernetes.client.util;

import io.kubernetes.client.ApiClient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.IOException;

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
}