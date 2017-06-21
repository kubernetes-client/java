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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

/**
 * KubeConfig represents a kubernetes client configuration
 */
public class KubeConfig {
    // Defaults for where to find a kubeconfig file
    public static final String ENV_HOME = "HOME";
    public static final String KUBEDIR = ".kube";
    public static final String KUBECONFIG = "config";

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
        File config = new File(new File(System.getenv(ENV_HOME), KUBEDIR), KUBECONFIG);
        if (!config.exists()) {
            return null;
        }
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

    public boolean setContext(String context) {
        currentCluster = null;
        currentUser = null;
        Map<String, Object> ctx = findObject(contexts, context);
        if (ctx == null) {
            return false;
        }
        currentContext = (Map<String, Object>) ctx.get("context");
        if (currentContext == null) {
            return false;
        }
        String cluster = (String) currentContext.get("cluster");
        String user = (String) currentContext.get("user");

        if (cluster != null) {
            Map<String, Object> obj = findObject(clusters, cluster);
            if (obj != null) {
                currentCluster = (Map<String, Object>) obj.get("cluster");
            }
        }
        if (user != null) {
            Map<String, Object> obj = findObject(users, user);
            if (obj != null) {
                currentUser = (Map<String, Object>) obj.get("user");
            }
        }
        return true;
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
                Date expiry = (Date) authConfig.get("expiry");
                if (expiry != null) {
                    if (expiry.compareTo(new Date()) <= 0) {
                        // TODO: Generate new token here...
                        throw new IllegalStateException("Token is expired!");
                    }
                }
                return (String) authConfig.get("access-token");
            }
        }
        if (currentUser.containsKey("token")) {
            return (String) currentUser.get("token");
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
        if (list == null) {
            return null;
        }
        for (Object obj : list) {
            Map<String, Object> map = (Map<String, Object>)obj;
            if (name.equals((String)map.get("name"))) {
                return map;
            }
        }
        return null;
    }
}