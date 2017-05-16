package io.kubernetes.client.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

/**
 * KubeConfig represents a kubernetes client configuration
 */
public class KubeConfig {
    // Note to the reader: I considered creating a Config object
    // and parsing into that instead of using Maps, but honestly
    // this seemed cleaner than a bunch of boilerplate classes

    private ArrayList<Object> clusters;
    private ArrayList<Object> contexts;
    private ArrayList<Object> users;
    Map<String, Object> currentContext;
    Map<String, Object> currentCluster;
    Map<String, Object> currentUser;

    /**
     * Load a Kubernetes config from the default location
     */
    public static KubeConfig loadDefaultKubeConfig() throws FileNotFoundException {
        File homeDir = new File(System.getenv("HOME"));
        File config = new File(new File(homeDir, ".kube"), "config");
        return loadKubeConfig(new FileReader(config));
    }

    /**
     * Load a Kubernetes config from a Reader
     */
    public static KubeConfig loadKubeConfig(Reader input) {
        Yaml yaml = new Yaml(new SafeConstructor());
        Object config = yaml.load(input);
        Map<String, Object> configMap = (Map<String, Object>)config;

        String currentContext = (String)configMap.get("current-context");
        ArrayList<Object> contexts = (ArrayList<Object>)configMap.get("contexts");
        ArrayList<Object> clusters = (ArrayList<Object>)configMap.get("clusters");
        ArrayList<Object> users = (ArrayList<Object>)configMap.get("users");

        KubeConfig kubeConfig = new KubeConfig(contexts, clusters, users);
        kubeConfig.setContext(currentContext);

        return kubeConfig;
    }

    public KubeConfig(ArrayList<Object> contexts,
        ArrayList<Object> clusters,
        ArrayList<Object> users) {
        this.contexts = contexts;
        this.clusters = clusters;
        this.users = users;
    }

    public void setContext(String context) {
        currentCluster = null;
        currentUser = null;
        currentContext = (Map<String, Object>) findObject(contexts, context).get("context");
        if (currentContext == null) {
            return;
        }
        String cluster = (String) currentContext.get("cluster");
        String user = (String) currentContext.get("user");

        if (cluster != null) {
            currentCluster = (Map<String, Object>) findObject(clusters, cluster).get("cluster");
        }
        if (user != null) {
            currentUser = (Map<String, Object>) findObject(users, user).get("user");
        }
    }

    public String getServer() {
        return getData(currentCluster, "server");
    }

    public String getCertificateAuthorityData() {
        return getData(currentCluster, "certificate-authority-data");
    }

    public String getCertificateAuthorityFile() {
        return getData(currentCluster, "certificate-authority");
    }

    public String getClientCertificateFile() {
        return getData(currentUser, "client-certificate");
    }

    public String getClientCertificateData() {
        return getData(currentUser, "client-certificate-data");
    }

    public String getClientKeyFile() {
        return getData(currentUser, "client-key");
    }

    public String getClientKeyData() {
        return getData(currentUser, "client-key-data");
    }

    public String getUsername() {
        return getData(currentUser, "username");
    }

    public String getPassword() {
        return getData(currentUser, "password");
    }

    public String getAccessToken() {
        if (currentUser == null) {
            return null;
        } 
        Object authProvider = currentUser.get("auth-provider");
        if (authProvider != null) {
            Map<String, Object> authProviderMap = (Map<String, Object>) authProvider;
            Map<String, Object> authConfig = (Map<String, Object>) authProviderMap.get("config");
            if (authConfig != null) {
                return (String) authConfig.get("access-token");
            }
        }
        return null;
    }

    private static String getData(Map<String, Object> obj, String key) {
        if (obj == null) {
            return null;
        }
        return (String) obj.get(key);
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