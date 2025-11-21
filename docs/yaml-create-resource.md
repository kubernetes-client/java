# Creating Kubernetes Resources from YAML

This feature allows you to create Kubernetes resources from YAML without having to specify the resource type upfront, similar to `kubectl create -f file.yaml`.

## Overview

The `Yaml.createResource()` methods automatically:
1. Parse the YAML to extract `apiVersion` and `kind`
2. Determine the appropriate Java class for the resource type
3. Load the YAML into that strongly-typed object
4. Use the GenericKubernetesApi to create the resource in the cluster

## Usage

### Create from YAML String

```java
ApiClient client = Config.defaultClient();

String yaml = 
    "apiVersion: v1\n" +
    "kind: ConfigMap\n" +
    "metadata:\n" +
    "  name: my-config\n" +
    "  namespace: default\n" +
    "data:\n" +
    "  key: value\n";

Object resource = Yaml.createResource(client, yaml);
```

### Create from YAML File

```java
ApiClient client = Config.defaultClient();
File yamlFile = new File("my-resource.yaml");

Object resource = Yaml.createResource(client, yamlFile);
```

### Create from Reader

```java
ApiClient client = Config.defaultClient();
Reader reader = new FileReader("my-resource.yaml");

Object resource = Yaml.createResource(client, reader);
```

## Type Casting

The returned object is the strongly-typed Kubernetes object, so you can cast it if needed:

```java
Object result = Yaml.createResource(client, yaml);

if (result instanceof V1ConfigMap) {
    V1ConfigMap configMap = (V1ConfigMap) result;
    System.out.println("Created ConfigMap: " + configMap.getMetadata().getName());
}
```

## Supported Resources

This feature works with any Kubernetes resource type that is registered in the ModelMapper, including:
- Core resources (Pod, Service, ConfigMap, Secret, etc.)
- Apps resources (Deployment, StatefulSet, DaemonSet, etc.)
- Custom resources that have been registered

## Error Handling

The method throws:
- `IOException` if there's an error reading or parsing the YAML
- `ApiException` if there's an error creating the resource in the cluster

```java
try {
    Object resource = Yaml.createResource(client, yaml);
    System.out.println("Resource created successfully");
} catch (IOException e) {
    System.err.println("Failed to parse YAML: " + e.getMessage());
} catch (ApiException e) {
    System.err.println("Failed to create resource: " + e.getMessage());
}
```

## Comparison with Kubectl

This feature provides Java equivalent functionality to:

```bash
kubectl create -f resource.yaml
```

Instead of having to know the resource type in advance and use type-specific APIs:

```java
// Old way - you need to know it's a ConfigMap
V1ConfigMap configMap = Yaml.loadAs(yaml, V1ConfigMap.class);
CoreV1Api api = new CoreV1Api();
api.createNamespacedConfigMap("default", configMap).execute();

// New way - works with any resource type
Object resource = Yaml.createResource(client, yaml);
```

## Discovery and Resource Mapping

The feature uses API discovery to determine the correct resource plural name and API group. On first use, it may perform discovery to refresh the ModelMapper cache. Subsequent calls will use the cached information.

## See Also

- [YamlCreateResourceExample.java](../examples/examples-release-latest/src/main/java/io/kubernetes/client/examples/YamlCreateResourceExample.java) - Complete working example
- [YamlCreateResourceTest.java](../util/src/test/java/io/kubernetes/client/util/YamlCreateResourceTest.java) - Comprehensive tests
