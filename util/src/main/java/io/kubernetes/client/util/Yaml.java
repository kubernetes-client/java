/*
Copyright 2018 The Kubernetes Authors.
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

import com.google.common.reflect.ClassPath;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Yaml {
  private static org.yaml.snakeyaml.Yaml yaml = new org.yaml.snakeyaml.Yaml();
  private static Map<String, Class<?>> classes = new HashMap<>();

  static final Logger logger = LoggerFactory.getLogger(Yaml.class);

  public static String getApiGroupVersion(String name) {
    if (name.startsWith("AppsV1beta2")) {
      return "apps/v1beta2";
    }
    if (name.startsWith("AppsV1beta1")) {
      return "apps/v1beta1";
    }
    if (name.startsWith("AppsV1")) {
      return "apps/v1";
    }
    if (name.startsWith("ExtensionsV1beta1")) {
      return "extensions/v1beta1";
    }
    if (name.startsWith("ExtensionsV1")) {
      return "extensions/v1";
    }
    if (name.startsWith("V1beta1")) {
      return "v1beta1";
    }
    if (name.startsWith("V1beta2")) {
      return "v1beta2";
    }
    if (name.startsWith("V1alpha1")) {
      return "v1alpha1";
    }
    if (name.startsWith("V2beta1")) {
      return "v2beta1";
    }
    if (name.startsWith("V2alpha1")) {
      return "v2alpha1";
    }
    if (name.startsWith("V1")) {
      return "v1";
    }
    return name;
  }

  private static void initModelMap() throws IOException {
    ClassPath cp = ClassPath.from(ClassLoader.getSystemClassLoader());
    Set<ClassPath.ClassInfo> allClasses = cp.getTopLevelClasses("io.kubernetes.client.models");

    for (ClassPath.ClassInfo clazz : allClasses) {
      String groupVersion = getApiGroupVersion(clazz.getSimpleName());
      int len = groupVersion.replace("/", "").length();
      String name = clazz.getSimpleName().substring(len);
      classes.put(groupVersion + "/" + name, clazz.load());
    }
  }

  static {
    try {
      initModelMap();
    } catch (Exception ex) {
      logger.error("Unexpected exception while loading classes: " + ex);
    }
  }

  /**
   * Add a mapping from API Group/version/kind to a Class to use when calling <code>load(...)</code>
   * .
   *
   * <p>Shouldn't really be needed as most API Group/Version/Kind are loaded dynamically at startup.
   */
  public static void addModelMap(String apiGroupVersion, String kind, Class<?> clazz) {
    classes.put(apiGroupVersion + "/" + kind, clazz);
  }

  /**
   * Load an API object from a YAML string representation. Returns a concrete typed object (e.g.
   * V1Pod)
   *
   * @param content The YAML content
   * @return An instantiation of the object.
   * @throws IOException If an error occurs while reading the YAML.
   */
  public static Object load(String content) throws IOException {
    return load(new StringReader(content));
  }

  /**
   * Load an API object from a YAML file. Returns a concrete typed object (e.g. V1Pod)
   *
   * @param f The file to load.
   * @return An instantiation of the object.
   * @throws IOException If an error occurs while reading the YAML.
   */
  public static Object load(File f) throws IOException {
    return load(new FileReader(f));
  }

  /**
   * Load an API object from a stream of data. Returns a concrete typed object (e.g. V1Pod)
   *
   * @param reader The stream to load.
   * @return An instantiation of the object.
   * @throws IOException If an error occurs while reading the YAML.
   */
  public static Object load(Reader reader) throws IOException {
    Map<String, Object> data = yaml.load(reader);
    String kind = (String) data.get("kind");
    if (kind == null) {
      throw new IOException("Missing kind in YAML file!");
    }
    String apiVersion = (String) data.get("apiVersion");
    if (apiVersion == null) {
      throw new IOException("Missing apiVersion in YAML file!");
    }

    Class<?> clazz = (Class<?>) classes.get(apiVersion + "/" + kind);
    if (clazz == null) {
      throw new IOException(
          "Unknown apiVersionKind: "
              + apiVersion
              + "/"
              + kind
              + " known kinds are: "
              + classes.toString());
    }
    return loadAs(new StringReader(yaml.dump(data)), clazz);
  }

  /**
   * Load an API object from a YAML string representation. Returns a concrete typed object using the
   * type specified.
   *
   * @param content The YAML content
   * @param clazz The class of object to return.
   * @return An instantiation of the object.
   * @throws IOException If an error occurs while reading the YAML.
   */
  public static <T> T loadAs(String content, Class<T> clazz) {
    return yaml.loadAs(new StringReader(content), clazz);
  }

  /**
   * Load an API object from a YAML file. Returns a concrete typed object using the type specified.
   *
   * @param f The YAML file
   * @param clazz The class of object to return.
   * @return An instantiation of the object.
   * @throws IOException If an error occurs while reading the YAML.
   */
  public static <T> T loadAs(File f, Class<T> clazz) throws IOException {
    return yaml.loadAs(new FileReader(f), clazz);
  }

  /**
   * Load an API object from a YAML stream. Returns a concrete typed object using the type
   * specified.
   *
   * @param reader The YAML stream
   * @param clazz The class of object to return.
   * @return An instantiation of the object.
   * @throws IOException If an error occurs while reading the YAML.
   */
  public static <T> T loadAs(Reader reader, Class<T> clazz) {
    return yaml.loadAs(reader, clazz);
  }
}
