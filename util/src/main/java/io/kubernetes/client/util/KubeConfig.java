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

import io.kubernetes.client.util.authenticators.Authenticator;
import io.kubernetes.client.util.authenticators.AzureActiveDirectoryAuthenticator;
import io.kubernetes.client.util.authenticators.GCPAuthenticator;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

/** KubeConfig represents a kubernetes client configuration */
public class KubeConfig {
  private static final Logger log = LoggerFactory.getLogger(KubeConfig.class);

  // Defaults for where to find a kubeconfig file
  public static final String ENV_HOME = "HOME";
  public static final String KUBEDIR = ".kube";
  public static final String KUBECONFIG = "config";
  private static Map<String, Authenticator> authenticators = new HashMap<>();

  // Note to the reader: I considered creating a Config object
  // and parsing into that instead of using Maps, but honestly
  // this seemed cleaner than a bunch of boilerplate classes

  private ArrayList<Object> clusters;
  private ArrayList<Object> contexts;
  private ArrayList<Object> users;
  String currentContextName;
  Map<String, Object> currentContext;
  Map<String, Object> currentCluster;
  Map<String, Object> currentUser;
  String currentNamespace;
  Object preferences;
  ConfigPersister persister;

  public static void registerAuthenticator(Authenticator auth) {
    synchronized (authenticators) {
      authenticators.put(auth.getName(), auth);
    }
  }

  static {
    registerAuthenticator(new GCPAuthenticator());
    registerAuthenticator(new AzureActiveDirectoryAuthenticator());
  }

  /** Load a Kubernetes config from a Reader */
  public static KubeConfig loadKubeConfig(Reader input) {
    Yaml yaml = new Yaml(new SafeConstructor());
    Object config = yaml.load(input);
    Map<String, Object> configMap = (Map<String, Object>) config;

    String currentContext = (String) configMap.get("current-context");
    ArrayList<Object> contexts = (ArrayList<Object>) configMap.get("contexts");
    ArrayList<Object> clusters = (ArrayList<Object>) configMap.get("clusters");
    ArrayList<Object> users = (ArrayList<Object>) configMap.get("users");
    Object preferences = configMap.get("preferences");

    KubeConfig kubeConfig = new KubeConfig(contexts, clusters, users);
    kubeConfig.setContext(currentContext);
    kubeConfig.setPreferences(preferences);

    return kubeConfig;
  }

  public KubeConfig(
      ArrayList<Object> contexts, ArrayList<Object> clusters, ArrayList<Object> users) {
    this.contexts = contexts;
    this.clusters = clusters;
    this.users = users;
  }

  public String getCurrentContext() {
    return currentContextName;
  }

  public boolean setContext(String context) {
    if (context == null) {
      return false;
    }
    currentContextName = context;
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
    currentNamespace = (String) currentContext.get("namespace");
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

  public ArrayList<Object> getContexts() {
    return contexts;
  }

  public ArrayList<Object> getClusters() {
    return clusters;
  }

  public ArrayList<Object> getUsers() {
    return users;
  }

  public String getNamespace() {
    return currentNamespace;
  }

  public Object getPreferences() {
    return preferences;
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
        String name = (String) authProviderMap.get("name");
        Authenticator auth = authenticators.get(name);
        if (auth != null) {
          if (auth.isExpired(authConfig)) {
            authConfig = auth.refresh(authConfig);
            if (persister != null) {
              try {
                persister.save(contexts, clusters, users, preferences, currentContextName);
              } catch (IOException ex) {
                log.error("Failed to persist new token", ex);
              }
            }
          }
          return auth.getToken(authConfig);
        } else {
          log.error("Unknown auth provider: " + name);
        }
      }
    }
    if (currentUser.containsKey("token")) {
      return (String) currentUser.get("token");
    }
    if (currentUser.containsKey("tokenFile")) {
      String tokenFile = (String) currentUser.get("tokenFile");
      try {
        byte[] data = Files.readAllBytes(FileSystems.getDefault().getPath(tokenFile));
        return new String(data, "UTF-8");
      } catch (IOException ex) {
        log.error("Failed to read token file", ex);
      }
    }
    return null;
  }

  public boolean verifySSL() {
    if (currentCluster == null) {
      return false;
    }
    if (currentCluster.containsKey("insecure-skip-tls-verify")) {
      return !((Boolean) currentCluster.get("insecure-skip-tls-verify")).booleanValue();
    }
    return true;
  }

  /**
   * Set persistence for this config.
   *
   * @param persister The persistence to use, or null to not persist the config.
   */
  public void setPersistConfig(ConfigPersister persister) {
    this.persister = persister;
  }

  public void setPreferences(Object preferences) {
    this.preferences = preferences;
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
      Map<String, Object> map = (Map<String, Object>) obj;
      if (name.equals((String) map.get("name"))) {
        return map;
      }
    }
    return null;
  }

  public static byte[] getDataOrFile(final String data, final String file) throws IOException {
    if (data != null) {
      return Base64.decodeBase64(data);
    }
    if (file != null) {
      return Files.readAllBytes(Paths.get(file));
    }
    return null;
  }
}
