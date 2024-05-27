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

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import io.kubernetes.client.persister.ConfigPersister;
import io.kubernetes.client.util.authenticators.Authenticator;
import io.kubernetes.client.util.authenticators.GCPAuthenticator;
import io.kubernetes.client.util.authenticators.OpenIDConnectAuthenticator;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

/** KubeConfig represents a kubernetes client configuration */
public class KubeConfig {
  private static final Logger log = LoggerFactory.getLogger(KubeConfig.class);

  // Defaults for where to find a kubeconfig file
  public static final String ENV_HOME = "HOME";
  public static final String KUBEDIR = ".kube";
  public static final String KUBECONFIG = "config";
  public static final String CRED_TOKEN_KEY = "token";
  public static final String CRED_CLIENT_CERTIFICATE_DATA_KEY = "clientCertificateData";
  public static final String CRED_CLIENT_KEY_DATA_KEY = "clientKeyData";
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
  private File file;

  public static void registerAuthenticator(Authenticator auth) {
    synchronized (authenticators) {
      authenticators.put(auth.getName(), auth);
    }
  }

  static {
    registerAuthenticator(new GCPAuthenticator());
    registerAuthenticator(new OpenIDConnectAuthenticator());
  }

  /** Load a Kubernetes config from a Reader */
  public static KubeConfig loadKubeConfig(Reader input) {
    Yaml yaml = new Yaml(new SafeConstructor(new LoaderOptions()));
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

  @SuppressWarnings("unchecked")
  public Map<String, String> getCredentials() {
    if (currentUser == null) {
      return null;
    }

    Map<String, String> credentials = new HashMap<>();

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
          credentials.put(CRED_TOKEN_KEY, auth.getToken(authConfig));
          return credentials;
        } else {
          log.error("Unknown auth provider: {}", name);
        }
      }
    }
    Map<String, String> credentialsViaExecCredential =
        getCredentialsViaExecCredential((Map<String, Object>) currentUser.get("exec"));
    if (credentialsViaExecCredential != null) {
      return credentialsViaExecCredential;
    }
    if (currentUser.containsKey("token")) {
      credentials.put(CRED_TOKEN_KEY, (String) currentUser.get("token"));
      return credentials;
    }
    if (currentUser.containsKey("tokenFile")) {
      String tokenFile = (String) currentUser.get("tokenFile");
      try {
        byte[] data = Files.readAllBytes(FileSystems.getDefault().getPath(tokenFile));
        credentials.put(CRED_TOKEN_KEY, new String(data, StandardCharsets.UTF_8));
        return credentials;
      } catch (IOException ex) {
        log.error("Failed to read token file", ex);
      }
    }
    return null;
  }

  /**
   * Attempt to create an access token or client certificate by running a configured external
   * program.
   *
   * @see <a
   *     href="https://kubernetes.io/docs/reference/access-authn-authz/authentication/#client-go-credential-plugins">
   *     Authenticating » client-go credential plugins</a>
   */
  @SuppressWarnings("unchecked")
  private Map<String, String> getCredentialsViaExecCredential(Map<String, Object> execMap) {
    if (execMap == null) {
      return null;
    }

    Map<String, String> credentials = new HashMap<>();

    String apiVersion = (String) execMap.get("apiVersion");
    /**
     * Some history here: v1 was added in kubernetes 1.21
     * (https://github.com/kubernetes/kubernetes/pull/102890) v1alpha1 was removed in Kubernetes
     * 1.24 (https://github.com/kubernetes/kubernetes/pull/108616) We need to leave v1alpha1 for now
     * to support backwards compatability, but we will likely want to remove it eventually after
     * Kubernetes 1.23 is no longer supported }
     */
    if (!"client.authentication.k8s.io/v1".equals(apiVersion)
        && !"client.authentication.k8s.io/v1beta1".equals(apiVersion)
        && !"client.authentication.k8s.io/v1alpha1".equals(apiVersion)) {
      log.error("Unrecognized user.exec.apiVersion: {}", apiVersion);
      return null;
    }
    String command = (String) execMap.get("command");
    JsonElement root = runExec(command, (List) execMap.get("args"), (List) execMap.get("env"));
    if (root == null) {
      return null;
    }
    if (!"ExecCredential".equals(root.getAsJsonObject().get("kind").getAsString())) {
      log.error("Unrecognized kind in response");
      return null;
    }
    if (!apiVersion.equals(root.getAsJsonObject().get("apiVersion").getAsString())) {
      log.error("Mismatched apiVersion in response");
      return null;
    }
    JsonObject status = root.getAsJsonObject().get("status").getAsJsonObject();
    JsonElement token = status.get("token");
    if (token == null) {
      if (status.get("clientCertificateData") != null && status.get("clientKeyData") != null) {
        log.debug("Obtained a client certificate from {}", command);
        credentials.put(
            CRED_CLIENT_CERTIFICATE_DATA_KEY, status.get("clientCertificateData").getAsString());
        credentials.put(CRED_CLIENT_KEY_DATA_KEY, status.get("clientKeyData").getAsString());
        return credentials;
      } else {
        log.warn("No token or certificates produced by {}", command);
        return null;
      }
    }
    log.debug("Obtained a token from {}", command);
    credentials.put(CRED_TOKEN_KEY, token.getAsString());
    return credentials;
    // TODO cache tokens between calls, up to .status.expirationTimestamp
    // TODO a 401 is supposed to force a refresh,
    // but KubeconfigAuthentication hardcodes AccessTokenAuthentication which does not support
    // that
    // and anyway ClientBuilder only calls Authenticator.provide once per ApiClient;
    // we would need to do it on every request
  }

  private JsonElement runExec(String command, List<String> args, List<Map<String, String>> env) {
    List<String> argv = new ArrayList<>();
    if (command.contains("/") || command.contains("\\")) {
      // Spec is unclear on what should be treated as a “relative command path”.
      // This clause should cover anything not resolved from $PATH / %Path%.
      Path resolvedCommand;
      if (file != null) {
        // If we know where the Kubeconfig was located, use that as the base.
        resolvedCommand = file.toPath().getParent().resolve(command).normalize();
      } else {
        // Otherwise, try the current working directory
        resolvedCommand = Paths.get(command).normalize();
      }
      if (!Files.exists(resolvedCommand)) {
        log.error("No such file: {}", resolvedCommand);
        return null;
      }
      // Not checking isRegularFile or isExecutable here; leave that to ProcessBuilder.start.
      log.debug("Resolved {} to {}", command, resolvedCommand);
      argv.add(resolvedCommand.toString());
    } else {
      argv.add(command);
    }
    if (args != null) {
      argv.addAll(args);
    }
    ProcessBuilder pb = new ProcessBuilder(argv);
    if (env != null) {
      for (Map<String, String> entry : env) {
        pb.environment().put(entry.get("name"), entry.get("value"));
      }
    }
    pb.redirectError(ProcessBuilder.Redirect.INHERIT);
    try {
      Process proc = pb.start();
      JsonElement root;
      try (InputStream is = proc.getInputStream();
          Reader r = new InputStreamReader(is, StandardCharsets.UTF_8)) {
        root = JsonParser.parseReader(r);
      } catch (JsonParseException x) {
        log.error("Failed to parse output of {}", command, x);
        return null;
      }
      int r = proc.waitFor();
      if (r != 0) {
        log.error("{} failed with exit code {}", command, r);
        return null;
      }
      return root;
    } catch (IOException | InterruptedException x) {
      log.error("Failed to run {}", command, x);
      return null;
    }
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

  /**
   * Indicates a file from which this configuration was loaded.
   *
   * @param file a file path, available for use when resolving relative file paths
   */
  public void setFile(File file) {
    this.file = file;
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
      if (name.equals(map.get("name"))) {
        return map;
      }
    }
    return null;
  }

  public byte[] getDataOrFileRelative(final String data, final String path) throws IOException {
    String resolvedPath = path;
    if (resolvedPath != null && this.file != null) {
      resolvedPath = this.file.toPath().getParent().resolve(path).normalize().toString();
    }
    return getDataOrFile(data, resolvedPath);
  }

  private static byte[] getDataOrFile(final String data, final String file) throws IOException {
    if (data != null) {
      return Base64.decodeBase64(data);
    }
    if (file != null) {
      return Files.readAllBytes(Paths.get(file));
    }
    return null;
  }
}
