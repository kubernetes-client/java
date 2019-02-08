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
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.custom.Quantity;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okio.ByteString;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.ScalarNode;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Represent;
import org.yaml.snakeyaml.representer.Representer;

public class Yaml {
  private static Map<String, Class<?>> classes = new HashMap<>();
  private static Map<String, String> apiGroups = new HashMap<>();
  private static List<String> apiVersions = new ArrayList<>();

  static final Logger logger = LoggerFactory.getLogger(Yaml.class);

  private static void initApiGroupMap() {
    apiGroups.put("Admissionregistration", "admissionregistration.k8s.io");
    apiGroups.put("Apiextensions", "apiextensions.k8s.io");
    apiGroups.put("Apiregistration", "apiregistration.k8s.io");
    apiGroups.put("Apps", "apps");
    apiGroups.put("Authentication", "authentication.k8s.io");
    apiGroups.put("Authorization", "authorization.k8s.io");
    apiGroups.put("Autoscaling", "autoscaling");
    apiGroups.put("Extensions", "extensions");
    apiGroups.put("Batch", "batch");
    apiGroups.put("Certificates", "certificates.k8s.io");
    apiGroups.put("Networking", "networking.k8s.io");
    apiGroups.put("Policy", "policy");
    apiGroups.put("RbacAuthorization", "rbac.authorization.k8s.io");
    apiGroups.put("Scheduling", "scheduling.k8s.io");
    apiGroups.put("Settings", "settings.k8s.io");
    apiGroups.put("Storage", "storage.k8s.io");
  }

  private static void initApiVersionList() {
    // Order important
    apiVersions.add("V2beta1");
    apiVersions.add("V2alpha1");
    apiVersions.add("V1beta2");
    apiVersions.add("V1beta1");
    apiVersions.add("V1alpha1");
    apiVersions.add("V1");
  }

  private static Pair<String, String> getApiGroup(String name) {
    MutablePair<String, String> parts = new MutablePair<>();
    for (String prefix : apiGroups.keySet()) {
      if (name.startsWith(prefix)) {
        parts.left = apiGroups.get(prefix);
        parts.right = name.substring(prefix.length());
        break;
      }
    }
    if (parts.left == null) parts.right = name;

    return parts;
  }

  private static Pair<String, String> getApiVersion(String name) {
    MutablePair<String, String> parts = new MutablePair<>();
    for (String version : apiVersions) {
      if (name.startsWith(version)) {
        parts.left = version.toLowerCase();
        parts.right = name.substring(version.length());
        break;
      }
    }
    if (parts.left == null) parts.right = name;

    return parts;
  }

  private static void initModelMap() throws IOException {
    initApiGroupMap();
    initApiVersionList();

    ClassPath cp = ClassPath.from(Yaml.class.getClassLoader());
    Set<ClassPath.ClassInfo> allClasses = cp.getTopLevelClasses("io.kubernetes.client.models");

    for (ClassPath.ClassInfo clazz : allClasses) {
      String modelName = "";
      Pair<String, String> nameParts = getApiGroup(clazz.getSimpleName());
      modelName += nameParts.getLeft() == null ? "" : nameParts.getLeft() + "/";

      nameParts = getApiVersion(nameParts.getRight());
      modelName += nameParts.getLeft() == null ? "" : nameParts.getLeft() + "/";
      modelName += nameParts.getRight();

      classes.put(modelName, clazz.load());
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
    Map<String, Object> data = getSnakeYaml().load(reader);
    return modelMapper(data);
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
    return getSnakeYaml().loadAs(new StringReader(content), clazz);
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
    return getSnakeYaml().loadAs(new FileReader(f), clazz);
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
    return getSnakeYaml().loadAs(reader, clazz);
  }

  /**
   * Load list of instantiated API objects from a YAML string representation. Returns list of
   * concrete typed objects (e.g. { V1Pod, V1SERVICE })
   *
   * <p>Order of API objects in list will be preserved according to order of objects in YAML string.
   *
   * @param content The YAML content
   * @return List of instantiated objects.
   * @throws IOException If an error occurs while reading the YAML.
   */
  public static List<Object> loadAll(String content) throws IOException {
    return loadAll(new StringReader(content));
  }

  /**
   * Load list of instantiated API objects from a YAML file. Returns list of concrete typed objects
   * (e.g. { V1Pod, V1SERVICE })
   *
   * <p>Order of API objects in list will be preserved according to order of objects in YAML file.
   *
   * @param f The file to load.
   * @return List of instantiated of the objects.
   * @throws IOException If an error occurs while reading the YAML.
   */
  public static List<Object> loadAll(File f) throws IOException {
    return loadAll(new FileReader(f));
  }

  /**
   * Load list of instantiated API objects from a stream of data. Returns list of concrete typed
   * objects (e.g. { V1Pod, V1SERVICE })
   *
   * <p>Order of API objects in list will be preserved according to order of objects in stream of
   * data.
   *
   * @param reader The stream to load.
   * @return List of instantiated of the objects.
   * @throws IOException If an error occurs while reading the YAML.
   */
  public static List<Object> loadAll(Reader reader) throws IOException {
    Iterable<Object> iterable = getSnakeYaml().loadAll(reader);
    List<Object> list = new ArrayList<Object>();
    for (Object object : iterable) {
      if (object != null) {
        try {
          list.add(modelMapper((Map<String, Object>) object));
        } catch (ClassCastException ex) {
          logger.error("Unexpected exception while casting: " + ex);
        }
      }
    }

    return list;
  }

  /**
   * Takes an API object and returns a YAML String representing that object.
   *
   * @param object The API object to dump.
   * @return A YAML String representing the API object.
   */
  public static String dump(Object object) {
    return getSnakeYaml().dump(object);
  }

  /**
   * Takes an API object and writes a YAML string representing that object to the writer.
   *
   * @param object The API object to dump
   * @param writer The writer to write the YAML to.
   */
  public static void dump(Object object, Writer writer) {
    getSnakeYaml().dump(object, writer);
  }

  /**
   * Takes an Iterator of YAML API objects and returns a YAML string representing all of them
   *
   * @param data The list of YAML API objects
   * @return A String representing the list of YAML API objects.
   */
  public static String dumpAll(Iterator<? extends Object> data) {
    return getSnakeYaml().dumpAll(data);
  }

  /**
   * Takes an Iterator of YAML API objects and writes a YAML String representing all of them.
   *
   * @param data The list of YAML API objects.
   * @param output The writer to output the YAML String to.
   */
  public static void dumpAll(Iterator<? extends Object> data, Writer output) {
    getSnakeYaml().dumpAll(data, output);
  }

  /** Defines constructor logic for custom types in this library. */
  public static class CustomConstructor extends Constructor {
    @Override
    protected Object constructObject(Node node) {
      if (node.getType() == IntOrString.class) {
        return constructIntOrString((ScalarNode) node);
      }
      if (node.getType() == byte[].class) {
        return constructByteArray((ScalarNode) node);
      }

      if (node.getType() == org.joda.time.DateTime.class) {
        return constructDateTime((ScalarNode) node);
      }

      return super.constructObject(node);
    }

    private IntOrString constructIntOrString(ScalarNode node) {
      try {
        return new IntOrString(Integer.parseInt(node.getValue()));
      } catch (NumberFormatException err) {
        return new IntOrString(node.getValue());
      }
    }

    private byte[] constructByteArray(ScalarNode node) {
      return ByteString.decodeBase64(node.getValue()).toByteArray();
    }

    private Object constructDateTime(ScalarNode node) {
      return new DateTime(((ScalarNode) node).getValue(), DateTimeZone.UTC);
    }
  }

  public static class CustomRepresenter extends Representer {
    public CustomRepresenter() {
      this.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
      this.representers.put(IntOrString.class, new RepresentIntOrString());
      this.representers.put(byte[].class, new RepresentByteArray());
      this.representers.put(Quantity.class, new RepresentQuantity());
      this.representers.put(DateTime.class, new RepresentDateTime());
    }

    private class RepresentDateTime implements Represent {
      @Override
      public Node representData(Object data) {
        return CustomRepresenter.this.representData(data.toString());
      }
    }

    private class RepresentIntOrString implements Represent {
      @Override
      public Node representData(Object data) {
        IntOrString intOrString = (IntOrString) data;
        if (intOrString.isInteger()) {
          return CustomRepresenter.this.representData(intOrString.getIntValue());
        } else {
          return CustomRepresenter.this.representData(intOrString.getStrValue());
        }
      }
    }

    private class RepresentByteArray implements Represent {
      @Override
      public Node representData(Object data) {
        String value = ByteString.of((byte[]) data).base64();
        return representScalar(Tag.STR, value);
      }
    }

    private class RepresentQuantity implements Represent {
      @Override
      public Node representData(Object data) {
        Quantity quantity = (Quantity) data;
        return representScalar(Tag.STR, quantity.toSuffixedString());
      }
    }

    /**
     * This returns the ordering of properties that by convention should appear at the beginning of
     * a Yaml object in Kubernetes.
     */
    private int getPropertyPosition(String property) {
      switch (property) {
        case "apiVersion":
          return 0;
        case "kind":
          return 1;
        case "metadata":
          return 2;
        case "spec":
          return 3;
        case "type":
          return 4;
        default:
          return Integer.MAX_VALUE;
      }
    }

    @Override
    protected MappingNode representJavaBean(Set<Property> properties, Object javaBean) {
      MappingNode node = super.representJavaBean(properties, javaBean);
      // Always set the tag to MAP so that SnakeYaml doesn't print out the class name as a tag.
      node.setTag(Tag.MAP);
      // Sort the output of our map so that we put certain keys, such as apiVersion, first.
      Collections.sort(
          node.getValue(),
          new Comparator<NodeTuple>() {
            @Override
            public int compare(NodeTuple a, NodeTuple b) {
              String nameA = ((ScalarNode) a.getKeyNode()).getValue();
              String nameB = ((ScalarNode) b.getKeyNode()).getValue();
              int intCompare =
                  Integer.compare(getPropertyPosition(nameA), getPropertyPosition(nameB));
              if (intCompare != 0) {
                return intCompare;
              } else {
                return nameA.compareTo(nameB);
              }
            }
          });
      return node;
    }

    @Override
    protected NodeTuple representJavaBeanProperty(
        Object javaBean, Property property, Object propertyValue, Tag customTag) {
      // returning null for a null property value means we won't output it in the Yaml
      if (propertyValue == null) {
        return null;
      }
      return super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
    }
  }

  /** @return An instantiated SnakeYaml Object. */
  public static org.yaml.snakeyaml.Yaml getSnakeYaml() {
    return new org.yaml.snakeyaml.Yaml(new CustomConstructor(), new CustomRepresenter());
  }

  /**
   * @param data Map that will be converted to concrete API object.
   * @return An instantiation of the object.
   * @throws IOException
   */
  private static Object modelMapper(Map<String, Object> data) throws IOException {
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
      // Attempt to detect class from version and kind alone
      if (apiVersion.contains("/")) {
        clazz = (Class<?>) classes.get(apiVersion.split("/")[1] + "/" + kind);
      }
    }
    if (clazz == null) {
      throw new IOException(
          "Unknown apiVersionKind: "
              + apiVersion
              + "/"
              + kind
              + " known kinds are: "
              + classes.toString());
    }
    return loadAs(new StringReader(getSnakeYaml().dump(data)), clazz);
  }
}
