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

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.common.KubernetesType;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1JSONSchemaProps;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import okio.ByteString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.constructor.BaseConstructor;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.constructor.SafeConstructor;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.ScalarNode;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Represent;
import org.yaml.snakeyaml.representer.Representer;

/** The type Yaml. */
public class Yaml {

  static final Logger logger = LoggerFactory.getLogger(Yaml.class);

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
    Map<String, Object> data = getSnakeYaml(null).load(reader);
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
    return getSnakeYaml(clazz).loadAs(new StringReader(content), clazz);
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
    return getSnakeYaml(clazz).loadAs(new FileReader(f), clazz);
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
    return getSnakeYaml(clazz).loadAs(reader, clazz);
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
    Iterable<Object> iterable = getSnakeYaml(null).loadAll(reader);
    List<Object> list = new ArrayList<Object>();
    for (Object object : iterable) {
      if (object != null) {
        try {
          list.add(modelMapper((Map<String, Object>) object));
        } catch (ClassCastException ex) {
          logger.error("Unexpected exception while casting: {}", ex);
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
    return getSnakeYaml(object.getClass()).dump(object);
  }

  /**
   * Takes an API object and writes a YAML string representing that object to the writer.
   *
   * @param object The API object to dump
   * @param writer The writer to write the YAML to.
   */
  public static void dump(Object object, Writer writer) {
    getSnakeYaml(object.getClass()).dump(object, writer);
  }

  /**
   * Takes an Iterator of YAML API objects and returns a YAML string representing all of them
   *
   * @param data The list of YAML API objects
   * @return A String representing the list of YAML API objects.
   */
  public static String dumpAll(Iterator<? extends KubernetesType> data) {
    return getSnakeYaml(null).dumpAll(data);
  }

  /**
   * Takes an Iterator of YAML API objects and writes a YAML String representing all of them.
   *
   * @param data The list of YAML API objects.
   * @param output The writer to output the YAML String to.
   */
  public static void dumpAll(Iterator<? extends KubernetesType> data, Writer output) {
    getSnakeYaml(null).dumpAll(data, output);
  }

  /** Defines constructor logic for custom types in this library. */
  public static class CustomConstructor extends Constructor {
    public CustomConstructor(Class<?> type, LoaderOptions loaderConfig) {
      super(type, loaderConfig);
    }

    @Override
    protected Object constructObject(Node node) {
      if (node.getType() == IntOrString.class) {
        return constructIntOrString((ScalarNode) node);
      }
      if (node.getType() == byte[].class) {
        return constructByteArray((ScalarNode) node);
      }
      if (node.getType() == OffsetDateTime.class) {
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
      if (node.getValue() == null || "null".equalsIgnoreCase(node.getValue())) {
        return null;
      } else {
        return OffsetDateTime.parse(node.getValue());
      }
    }
  }

  public static class CustomRepresenter extends Representer {
    public CustomRepresenter() {
      super(new DumperOptions());
      this.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
      this.representers.put(IntOrString.class, new RepresentIntOrString());
      this.representers.put(byte[].class, new RepresentByteArray());
      this.representers.put(Quantity.class, new RepresentQuantity());
      this.representers.put(OffsetDateTime.class, new RepresentDateTime());
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
      // Always set the tag to MAP so that SnakeYaml doesn't print out the class name as a
      // tag.
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

  /**
   * Instantiate a snake yaml with a default {@link SafeConstructor}.
   *
   * <p>DEPRECATED: Use the parameterized "getSnakeYaml" constructing method below to get rid of
   * vulnerability from dynamic type serialization.
   *
   * @return the snake yaml
   */
  @Deprecated
  public static org.yaml.snakeyaml.Yaml getSnakeYaml() {
    return getSnakeYaml(null);
  }

  /**
   * Instantiate a snake yaml with the target model type specified.. Optionally, passing custom type
   * descriptions if the target serialized name differs from the actual field name.
   *
   * @param type the target model type
   * @param typeDescriptions additional type descriptions for customizing the serializer
   * @return the new snake yaml instance
   */
  public static org.yaml.snakeyaml.Yaml getSnakeYaml(
      Class<?> type, TypeDescription... typeDescriptions) {
    return getSnakeYaml(type, null, null, typeDescriptions);
  }

  /**
   * Instantiate a snake yaml with the target model type, and the dump/load option specified..
   * Optionally, passing custom type descriptions if the target serialized name differs from the
   * actual field name.
   *
   * @param type the target model type
   * @param dumperOptions the dumper options
   * @param loaderOptions the loader options
   * @param typeDescriptions additional type descriptions for customizing the serializer
   * @return the new snake yaml instance
   */
  public static org.yaml.snakeyaml.Yaml getSnakeYaml(
      Class<?> type,
      DumperOptions dumperOptions,
      LoaderOptions loaderOptions,
      TypeDescription... typeDescriptions) {
    if (loaderOptions == null) {
      loaderOptions = new LoaderOptions();
    }
    loaderOptions.setEnumCaseSensitive(false);

    BaseConstructor constructor = new SafeConstructor(loaderOptions);
    Representer representer = new CustomRepresenter();
    if (type != null) {
      constructor = new CustomConstructor(type, loaderOptions);
    }
    // register builtin type descriptions
    registerBuiltinGsonCompatibles(constructor, representer);
    for (TypeDescription desc : typeDescriptions) {
      registerCustomTypeDescriptions(constructor, representer, desc);
    }
    if (dumperOptions == null) {
      dumperOptions = new DumperOptions();
      dumperOptions.setDefaultFlowStyle(representer.getDefaultFlowStyle());
      dumperOptions.setDefaultScalarStyle(representer.getDefaultScalarStyle());
      dumperOptions.setAllowReadOnlyProperties(
          representer.getPropertyUtils().isAllowReadOnlyProperties());
      dumperOptions.setTimeZone(representer.getTimeZone());
    }
    return new org.yaml.snakeyaml.Yaml(constructor, representer, dumperOptions, loaderOptions);
  }

  /**
   * Instantiate a new {@link TypeDescription} which will load the {@link SerializedName} via
   * reflection so that yaml serialization can work for the custom gson serialized name.
   *
   * @param modelClass the kubenretes api model class
   * @param gsonTaggedFields the custom serialized names tagged by gson
   * @return the type description
   */
  public static TypeDescription newGsonCompatibleTypeDescription(
      Class modelClass, String... gsonTaggedFields) {
    TypeDescription desc = new TypeDescription(modelClass);
    List<String> excluding = new ArrayList<>();
    for (String targetGsonAnnotation : gsonTaggedFields) {
      Field field =
          Arrays.stream(modelClass.getDeclaredFields())
              .filter(f -> f.getAnnotation(SerializedName.class) != null)
              .filter(
                  f -> targetGsonAnnotation.equals(f.getAnnotation(SerializedName.class).value()))
              .findAny()
              .orElseThrow(
                  () ->
                      new IllegalArgumentException(
                          "Api model class "
                              + modelClass.getSimpleName()
                              + " doesn't have field with Gson @SerializedName with value "
                              + targetGsonAnnotation));
      Method getterMethod =
          tryFindGetterMethod(modelClass, field)
              .orElseThrow(
                  () ->
                      new IllegalArgumentException(
                          "Cannot find getter method for "
                              + targetGsonAnnotation
                              + " on api model class "
                              + modelClass.getSimpleName()));
      Method setterMethod =
          tryFindSetterMethod(modelClass, field)
              .orElseThrow(
                  () ->
                      new IllegalArgumentException(
                          "Cannot find setter method for "
                              + targetGsonAnnotation
                              + " on api model class "
                              + modelClass.getSimpleName()));

      desc.substituteProperty(
          targetGsonAnnotation, field.getType(), getterMethod.getName(), setterMethod.getName());
      excluding.add(field.getName());
    }
    desc.setExcludes(excluding.toArray(new String[0]));
    return desc;
  }

  private static void registerBuiltinGsonCompatibles(
      BaseConstructor constructor, Representer representer) {
    // TODO: Are there more builtin api classes need these explicit substitution below
    String[] crdOpenApiExtensions =
        new String[] {
          "x-kubernetes-embedded-resource",
          "x-kubernetes-int-or-string",
          "x-kubernetes-list-map-keys",
          "x-kubernetes-list-type",
          "x-kubernetes-map-type",
          "x-kubernetes-preserve-unknown-fields",
        };
    registerCustomTypeDescriptions(
        constructor,
        representer,
        newGsonCompatibleTypeDescription(V1JSONSchemaProps.class, crdOpenApiExtensions));
  }

  private static void registerCustomTypeDescriptions(
      BaseConstructor constructor,
      Representer representer,
      TypeDescription... addtionalTypeDescriptions) {
    Arrays.stream(addtionalTypeDescriptions)
        .forEach(
            desc -> {
              constructor.addTypeDescription(desc);
              representer.addTypeDescription(desc);
            });
  }

  private static Optional<Method> tryFindGetterMethod(Class modelClass, Field targetField) {
    return Arrays.stream(modelClass.getDeclaredMethods())
        .filter(f -> f.getName().startsWith("get"))
        .filter(f -> f.getName().equalsIgnoreCase("get" + targetField.getName()))
        .findAny();
  }

  private static Optional<Method> tryFindSetterMethod(Class modelClass, Field targetField) {
    return Arrays.stream(modelClass.getDeclaredMethods())
        .filter(f -> f.getName().startsWith("set"))
        .filter(f -> f.getName().equalsIgnoreCase("set" + targetField.getName()))
        .findAny();
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

    Class<?> clazz = ModelMapper.getApiTypeClass(apiVersion, kind);
    if (clazz == null) {
      throw new IOException(
          "Unknown apiVersionKind " + apiVersion + "/" + kind + " is it registered?");
    }
    return loadAs(new StringReader(getSnakeYaml(clazz).dump(data)), clazz);
  }

  @Deprecated
  public static void addModelMap(String apiGroupVersion, String kind, Class<?> clazz) {
    ModelMapper.addModelMap(apiGroupVersion, kind, clazz);
  }
}
