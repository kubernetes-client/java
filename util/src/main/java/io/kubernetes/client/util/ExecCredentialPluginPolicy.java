/*
Copyright 2026 The Kubernetes Authors.
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

import io.kubernetes.client.util.exception.ExecCredentialPluginDeniedException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;
import org.yaml.snakeyaml.error.YAMLException;

/**
 * Policy controlling which kubeconfig exec credential plugins may be run.
 *
 * <p>The semantics mirror the {@code credentialPluginPolicy} and {@code credentialPluginAllowlist}
 * fields of a kubectl <a href="https://kubernetes.io/docs/reference/kubectl/kuberc/">kuberc</a>
 * file:
 *
 * <ul>
 *   <li>{@link #ALLOW_ALL} ({@code AllowAll}): any plugin may run. This is the default, for
 *       backwards compatibility.
 *   <li>{@link #DENY_ALL} ({@code DenyAll}): no plugin may run.
 *   <li>{@link #allowlist(String...)} ({@code Allowlist}): a plugin may run only if its command
 *       matches at least one allowlist entry. An entry matches if it is exactly equal to the
 *       plugin's command, or if both the entry and the plugin's command resolve (using {@code
 *       PATH}) to the same executable path. Symlinks and shell globs are not resolved.
 * </ul>
 *
 * <p>A policy can be supplied directly by the application, or loaded from a kuberc file using
 * {@link #fromKubeRc(Reader)} / {@link #fromDefaultKubeRc()}. When a plugin is denied, an {@link
 * ExecCredentialPluginDeniedException} is thrown before any process is started.
 *
 * <p>This policy is a defense-in-depth measure, not a sandbox: it does not restrict plugin
 * arguments, environment variables or executable contents.
 */
public final class ExecCredentialPluginPolicy {
  private static final Logger log = LoggerFactory.getLogger(ExecCredentialPluginPolicy.class);

  public static final String ENV_KUBERC = "KUBERC";
  public static final String ENV_KUBECTL_KUBERC = "KUBECTL_KUBERC";
  public static final String KUBERC_OFF = "off";
  public static final String KUBERC = "kuberc";
  public static final String KUBERC_API_GROUP = "kubectl.config.k8s.io";
  public static final String KUBERC_KIND = "Preference";

  /** The type of a credential plugin policy, as spelled in a kuberc file. */
  public enum PolicyType {
    ALLOW_ALL("AllowAll"),
    DENY_ALL("DenyAll"),
    ALLOWLIST("Allowlist");

    private final String value;

    PolicyType(String value) {
      this.value = value;
    }

    /** @return the kuberc spelling of this policy type. */
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return value;
    }
  }

  /** Allows any exec credential plugin to run. */
  public static final ExecCredentialPluginPolicy ALLOW_ALL =
      new ExecCredentialPluginPolicy(PolicyType.ALLOW_ALL, Collections.emptyList());

  /** Prevents all exec credential plugins from running. */
  public static final ExecCredentialPluginPolicy DENY_ALL =
      new ExecCredentialPluginPolicy(PolicyType.DENY_ALL, Collections.emptyList());

  private final PolicyType type;
  private final List<String> allowlist;

  private ExecCredentialPluginPolicy(PolicyType type, List<String> allowlist) {
    this.type = type;
    this.allowlist = allowlist;
  }

  /**
   * Creates an {@code Allowlist} policy.
   *
   * @param commands plugin commands which may run; either basenames (resolved using {@code PATH})
   *     or paths. Must not be empty, and each entry must be non-empty and normalized.
   * @return an immutable allowlist policy
   * @throws IllegalArgumentException if the allowlist or one of its entries is invalid
   */
  public static ExecCredentialPluginPolicy allowlist(String... commands) {
    if (commands == null) {
      throw new IllegalArgumentException(
          "credential plugin policy set to \"Allowlist\", but allowlist is unspecified");
    }
    return allowlist(Arrays.asList(commands));
  }

  /**
   * Creates an {@code Allowlist} policy.
   *
   * @param commands plugin commands which may run; see {@link #allowlist(String...)}
   * @return an immutable allowlist policy
   * @throws IllegalArgumentException if the allowlist or one of its entries is invalid
   */
  public static ExecCredentialPluginPolicy allowlist(List<String> commands) {
    if (commands == null) {
      throw new IllegalArgumentException(
          "credential plugin policy set to \"Allowlist\", but allowlist is unspecified");
    }
    if (commands.isEmpty()) {
      throw new IllegalArgumentException(
          "credential plugin policy set to \"Allowlist\", but allowlist is empty; use \"DenyAll\" policy instead");
    }
    List<String> copy = new ArrayList<>(commands.size());
    for (int i = 0; i < commands.size(); i++) {
      String command = commands.get(i);
      if (command == null || command.isEmpty()) {
        throw new IllegalArgumentException(
            "misconfigured credential plugin allowlist: empty allowlist entry #" + (i + 1));
      }
      String cleaned = clean(command);
      if (cleaned == null) {
        throw new IllegalArgumentException(
            "misconfigured credential plugin allowlist: invalid file path: \"" + command + "\"");
      }
      if (!command.equals(cleaned)) {
        throw new IllegalArgumentException(
            "misconfigured credential plugin allowlist: non-normalized file path: \""
                + command
                + "\" vs \""
                + cleaned
                + "\"");
      }
      copy.add(command);
    }
    return new ExecCredentialPluginPolicy(PolicyType.ALLOWLIST, Collections.unmodifiableList(copy));
  }

  /**
   * Loads the credential plugin policy from a kuberc document.
   *
   * @param input reader for a kuberc ({@code kind: Preference}) YAML document
   * @return the policy; {@link #ALLOW_ALL} if {@code credentialPluginPolicy} is unset or empty
   * @throws IllegalArgumentException if the document or the policy is invalid
   */
  @SuppressWarnings("unchecked")
  public static ExecCredentialPluginPolicy fromKubeRc(Reader input) {
    Object document;
    try {
      document = new Yaml(new SafeConstructor(new LoaderOptions())).load(input);
    } catch (YAMLException ex) {
      throw new IllegalArgumentException("kuberc: failed to parse: " + ex.getMessage(), ex);
    }
    return fromKubeRcDocument(document);
  }

  @SuppressWarnings("unchecked")
  private static ExecCredentialPluginPolicy fromKubeRcDocument(Object document) {
    if (document == null) {
      return ALLOW_ALL;
    }
    if (!(document instanceof Map)) {
      throw new IllegalArgumentException("kuberc: expected a YAML mapping");
    }
    Map<String, Object> preference = (Map<String, Object>) document;

    Object apiVersion = preference.get("apiVersion");
    if (!(apiVersion instanceof String)
        || !((String) apiVersion).startsWith(KUBERC_API_GROUP + "/")) {
      throw new IllegalArgumentException("kuberc: unsupported apiVersion: " + apiVersion);
    }
    Object kind = preference.get("kind");
    if (!KUBERC_KIND.equals(kind)) {
      throw new IllegalArgumentException("kuberc: unsupported kind: " + kind);
    }

    Object policy = preference.get("credentialPluginPolicy");
    Object allowlist = preference.get("credentialPluginAllowlist");
    if (policy != null && !(policy instanceof String)) {
      throw new IllegalArgumentException("kuberc: credentialPluginPolicy must be a string");
    }
    String policyName = policy == null ? "" : (String) policy;
    switch (policyName) {
      case "":
      case "AllowAll":
      case "DenyAll":
        if (allowlist != null) {
          throw new IllegalArgumentException(
              "misconfigured credential plugin allowlist: plugin policy is \""
                  + policyName
                  + "\" but allowlist is non-nil");
        }
        return "DenyAll".equals(policyName) ? DENY_ALL : ALLOW_ALL;
      case "Allowlist":
        return allowlist(parseAllowlist(allowlist));
      default:
        throw new IllegalArgumentException("unknown plugin policy: \"" + policyName + "\"");
    }
  }

  @SuppressWarnings("unchecked")
  private static List<String> parseAllowlist(Object allowlist) {
    if (allowlist == null) {
      return null;
    }
    if (!(allowlist instanceof List)) {
      throw new IllegalArgumentException("kuberc: credentialPluginAllowlist must be a list");
    }
    List<Object> entries = (List<Object>) allowlist;
    List<String> commands = new ArrayList<>(entries.size());
    for (int i = 0; i < entries.size(); i++) {
      Object entry = entries.get(i);
      if (entry != null && !(entry instanceof Map)) {
        throw new IllegalArgumentException(
            "kuberc: credentialPluginAllowlist entry #" + (i + 1) + " must be a mapping");
      }
      Map<String, Object> fields = entry == null ? Collections.emptyMap() : (Map<String, Object>) entry;
      String command = stringField(fields, "command", i);
      String name = stringField(fields, "name", i);
      if (!command.isEmpty() && !name.isEmpty()) {
        throw new IllegalArgumentException(
            "misconfigured credential plugin allowlist: entry #"
                + (i + 1)
                + " specifies both \"name\" and \"command\"");
      }
      // "name" is a deprecated alias for "command".
      commands.add(command.isEmpty() ? name : command);
    }
    return commands;
  }

  private static String stringField(Map<String, Object> fields, String key, int index) {
    Object value = fields.get(key);
    if (value == null) {
      return "";
    }
    if (!(value instanceof String)) {
      throw new IllegalArgumentException(
          "kuberc: credentialPluginAllowlist entry #" + (index + 1) + " field \"" + key + "\" must be a string");
    }
    return (String) value;
  }

  /**
   * Loads the credential plugin policy from a kuberc file.
   *
   * @param kuberc the kuberc file
   * @return the policy
   * @throws IOException if the file cannot be read
   * @throws IllegalArgumentException if the document or the policy is invalid
   */
  public static ExecCredentialPluginPolicy fromKubeRc(File kuberc) throws IOException {
    try (Reader reader =
        new InputStreamReader(new FileInputStream(kuberc), StandardCharsets.UTF_8)) {
      return fromKubeRc(reader);
    }
  }

  /**
   * Loads the credential plugin policy from the kuberc file that kubectl would use, following the
   * same rules as kubectl:
   *
   * <ul>
   *   <li>If {@code $KUBECTL_KUBERC} is {@code false}, or {@code $KUBERC} is {@code off}, kuberc is
   *       disabled and {@link #ALLOW_ALL} is returned.
   *   <li>If {@code $KUBERC} is set, that file is used and must exist and be valid.
   *   <li>Otherwise {@code $HOME/.kube/kuberc} is used if it exists. If it is missing, {@link
   *       #ALLOW_ALL} is returned; if it cannot be read or parsed, a warning is logged and {@link
   *       #ALLOW_ALL} is returned.
   * </ul>
   *
   * In all cases an invalid policy (for example an empty allowlist) results in an exception.
   *
   * @return the policy
   * @throws IOException if an explicitly specified kuberc file cannot be read
   * @throws IllegalArgumentException if the policy is invalid
   */
  public static ExecCredentialPluginPolicy fromDefaultKubeRc() throws IOException {
    return fromDefaultKubeRc(System.getenv(ENV_KUBECTL_KUBERC), System.getenv(ENV_KUBERC), homeDir());
  }

  static ExecCredentialPluginPolicy fromDefaultKubeRc(
      String featureGate, String kubercEnv, File homeDir) throws IOException {
    if ("false".equalsIgnoreCase(featureGate) || KUBERC_OFF.equals(kubercEnv)) {
      return ALLOW_ALL;
    }
    if (kubercEnv != null && !kubercEnv.isEmpty()) {
      return fromKubeRc(new File(kubercEnv));
    }
    if (homeDir == null) {
      return ALLOW_ALL;
    }
    File kuberc = new File(new File(homeDir, KubeConfig.KUBEDIR), KUBERC);
    if (!kuberc.exists()) {
      return ALLOW_ALL;
    }
    Object document;
    try (Reader reader =
        new InputStreamReader(new FileInputStream(kuberc), StandardCharsets.UTF_8)) {
      document = new Yaml(new SafeConstructor(new LoaderOptions())).load(reader);
    } catch (FileNotFoundException ex) {
      return ALLOW_ALL;
    } catch (IOException | YAMLException ex) {
      log.warn("kuberc: no preferences loaded from {}: {}", kuberc, ex.getMessage());
      return ALLOW_ALL;
    }
    return fromKubeRcDocument(document);
  }

  private static File homeDir() {
    for (String env : new String[] {KubeConfig.ENV_HOME, "USERPROFILE"}) {
      String home = System.getenv(env);
      if (home != null && !home.isEmpty()) {
        return new File(home);
      }
    }
    String home = System.getProperty("user.home");
    return home == null || home.isEmpty() ? null : new File(home);
  }

  /** @return the type of this policy. */
  public PolicyType getType() {
    return type;
  }

  /** @return the (immutable) allowlist; empty unless the type is {@code Allowlist}. */
  public List<String> getAllowlist() {
    return allowlist;
  }

  /**
   * Checks whether a plugin command may run.
   *
   * @param command the plugin command (after any kubeconfig-relative path resolution)
   * @return the command to execute. For an {@code Allowlist} policy this is the resolved
   *     executable path, so that the executable which was checked is the one that runs.
   * @throws ExecCredentialPluginDeniedException if the plugin may not run
   */
  public String checkAllowed(String command) {
    return checkAllowed(command, System.getenv("PATH"), System.getenv("PATHEXT"), isWindows());
  }

  String checkAllowed(String command, String pathEnv, String pathExt, boolean windows) {
    switch (type) {
      case ALLOW_ALL:
        return command;
      case DENY_ALL:
        throw new ExecCredentialPluginDeniedException(
            command, "plugin \"" + command + "\" not allowed: policy set to \"DenyAll\"");
      case ALLOWLIST:
      default:
        break;
    }

    String cleaned = command == null ? null : clean(command);
    if (cleaned == null || cleaned.isEmpty()) {
      throw new ExecCredentialPluginDeniedException(
          command, "plugin path \"" + command + "\" is not permitted by the credential plugin allowlist");
    }
    String resolved = lookPath(cleaned, pathEnv, pathExt, windows);
    if (allowlist.contains(cleaned)) {
      return resolved != null ? resolved : cleaned;
    }
    if (resolved == null) {
      throw new ExecCredentialPluginDeniedException(
          command,
          "plugin path \""
              + cleaned
              + "\" cannot be resolved for credential plugin allowlist check");
    }
    if (allowlist.contains(resolved)) {
      return resolved;
    }
    for (String entry : allowlist) {
      if (resolved.equals(lookPath(entry, pathEnv, pathExt, windows))) {
        return resolved;
      }
    }
    throw new ExecCredentialPluginDeniedException(
        command,
        "plugin path \"" + resolved + "\" is not permitted by the credential plugin allowlist");
  }

  /**
   * Resolves a command to an executable the way {@code exec.LookPath} does: commands containing a
   * path separator are used as-is, others are searched for in {@code PATH}. Relative {@code PATH}
   * entries are ignored. Symlinks are not resolved.
   *
   * @return the resolved path, or null if no executable is found
   */
  static String lookPath(String command, String pathEnv, String pathExt, boolean windows) {
    if (command == null || command.isEmpty() || command.indexOf('\0') >= 0) {
      return null;
    }
    List<String> extensions = executableExtensions(command, pathExt, windows);
    boolean hasSeparator = command.indexOf('/') >= 0 || (windows && command.indexOf('\\') >= 0);
    if (hasSeparator) {
      return findExecutable(command, extensions, windows);
    }
    if (pathEnv == null || pathEnv.isEmpty()) {
      return null;
    }
    String separator = windows ? ";" : File.pathSeparator;
    for (String dir : pathEnv.split(java.util.regex.Pattern.quote(separator))) {
      if (windows && dir.length() > 1 && dir.startsWith("\"") && dir.endsWith("\"")) {
        dir = dir.substring(1, dir.length() - 1);
      }
      if (dir.isEmpty()) {
        continue;
      }
      Path dirPath;
      try {
        dirPath = Paths.get(dir);
      } catch (InvalidPathException ex) {
        continue;
      }
      if (!dirPath.isAbsolute()) {
        continue;
      }
      String found =
          findExecutable(dirPath.resolve(command).normalize().toString(), extensions, windows);
      if (found != null) {
        return found;
      }
    }
    return null;
  }

  private static String findExecutable(String candidate, List<String> extensions, boolean windows) {
    for (String ext : extensions) {
      String file = candidate + ext;
      try {
        Path path = Paths.get(file);
        if (Files.exists(path)
            && !Files.isDirectory(path)
            && (windows || Files.isExecutable(path))) {
          return file;
        }
      } catch (InvalidPathException ex) {
        return null;
      }
    }
    return null;
  }

  private static List<String> executableExtensions(String command, String pathExt, boolean windows) {
    if (!windows) {
      return Collections.singletonList("");
    }
    String exts = pathExt == null || pathExt.isEmpty() ? ".com;.exe;.bat;.cmd" : pathExt;
    List<String> result = new ArrayList<>();
    String lower = command.toLowerCase(Locale.ROOT);
    boolean hasKnownExt = false;
    for (String ext : exts.split(";")) {
      if (!ext.isEmpty() && lower.endsWith(ext.toLowerCase(Locale.ROOT))) {
        hasKnownExt = true;
      }
    }
    if (hasKnownExt) {
      result.add("");
      return result;
    }
    for (String ext : exts.split(";")) {
      if (!ext.isEmpty()) {
        result.add(ext.startsWith(".") ? ext : "." + ext);
      }
    }
    return result;
  }

  /** Lexically normalizes a path, like Go's {@code filepath.Clean}; symlinks are not resolved. */
  static String clean(String path) {
    if (path.isEmpty()) {
      return ".";
    }
    try {
      String normalized = Paths.get(path).normalize().toString();
      return normalized.isEmpty() ? "." : normalized;
    } catch (InvalidPathException ex) {
      return null;
    }
  }

  private static boolean isWindows() {
    return System.getProperty("os.name", "").toLowerCase(Locale.ROOT).startsWith("windows");
  }

  @Override
  public String toString() {
    return type == PolicyType.ALLOWLIST ? type + allowlist.toString() : type.toString();
  }
}
