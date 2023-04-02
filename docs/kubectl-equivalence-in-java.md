#Kubectl Equivalence in Java

__TL;DR__: Used to kubectl? Now our Kubernetes Java client library has released a set of 
helpful client utilities which has a similar input argument interface as the kubectl binary.
Especially the developers who're already familiar with kubectl commands, after reading this 
document, you will know how to build programs that interact with Kubernetes as easily as kubectl.


### What is Java Kubectl

The Java Kubectl is not only a more user-friendly wrapper for our direct HTTP Kubernetes client,
but also contains the implementation of commonly-used kubectl advanced commands. All these kubectl 
equivalences are accessible as a group of static helper functions under `io.kubernetes.client.extended.kubectl.Kubectl` 
class. You can import them by adding the following dependency to your project:

```xml
<dependency>
	<groupId>io.kubernetes</groupId>
	<artifactId>client-java-extended</artifactId>
	<version>${latest project version}</version>
</dependency>
```

Now you're all set, invoke the kubectl commands as Java static functions wherever you like in 
your project.

#### (Optional) Setting a Global Client-Config

Kubectl static helpers don't know its client-config (or kubeconfig if the name makes more sense to 
you) unless you set it when your application starts. You can either specify the client-config upon 
invoking kubectl helpers or simply set a global config at the start of your application:

```java
Configuration.setDefaultApiClient(ClientBuilder.defaultClient());
```

This will create a client on either a client, or a container in Kubernetes.

### Manifest of Supported Commands 


#### Kubectl get

You can either query a single resource or list multiple resources using the `Kubectl#get` helper depending
on whether you're passing `name()` in the flow. Here are few illustrative examples for querying pod 
resources:

```java
// kubectl get -n default pod foo
V1Pod pod = Kubectl.get(V1Pod.class)
                .namespace("default")
                .name("foo")
                .execute();
// kubectl get -n default pod
List<V1Pod> pods = Kubectl.get(V1Pod.class)
                .namespace("default")
                .execute();
// kubectl get pod --all-namespaces
List<V1Pod> pods = Kubectl.get(V1Pod.class)
                .execute();
```

#### Kubectl create

Currently the `Kubectl#create` helper only accepts a desired instance of resource object, you need to do the 
deserialization of a resource object or manually craft an instance of the resource.

```java
// kubectl create -f <file>
V1Pod creatingPod = /* load it from file or else */;
V1Pod createdPod = Kubectl.create(V1Pod.class)
                .resource(creatingPod)
                .execute();
```

#### Kubectl delete

`Kubectl#delete` works the same as `kubectl delete` command.

```java
// kubectl delete -n default pod foo
V1Pod deletedPod = Kubectl.delete(V1Pod.class)
                .namespace("default")
                .name("foo")
                .execute();
```

#### Kubectl patch

`Kubectl#patch` works the same as `kubectl patch` command.

```java
// kubectl patch --type='strategic' --patch="{\"metadata\":{\"labels\":{\"foo\":\"bar\"}}"
V1Pod patchedPod = Kubectl.patch(V1Pod.class)
                .patchType(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH)
                .patchContent(new V1Patch("{\"metadata\":{\"labels\":{\"foo\":\"bar\"}}"))
                .execute();
```

#### Kubectl apply

Note that for now only server-side apply is supported, so your apiserver version is required to
be greater than or equal to 1.18.0. `Kubectl#apply` works the same as `kubectl apply --server-side=true`.

```java
// kubectl apply --server-side=true --field-manager=java-kubectl --force-conflict=true -f <file>
V1Pod applyingPod = /* load it from file or else */;
V1Pod appliedPod = Kubectl.apply(V1Pod.class)
                .fieldManager("java-kubectl")
                .forceConflict(true)
                .resource(applyingPod)
                .execute();
```

#### Kubectl scale

```java
// kubectl scale -n default rs foo --replicas=2
V1ReplicaSet scaledRs = Kubectl.scale(V1ReplicaSet.class)
                .namespace("default")
                .name("foo")
                .replicas(2)
                .execute();
```


#### Kubectl drain

```java
// kubectl drain node1
V1Node drainedNode = Kubectl.drain()
                .name("node1")
                .execute();
```


#### Kubectl cordon/uncordon

```java
// kubectl cordon node1
V1Node cordondNode = Kubectl.cordon()
                .name("node1")
                .execute();
// kubectl uncordon node1
V1Node uncordondNode = Kubectl.uncordon()
                .name("node1")
                .execute();
```

#### Kubectl taint

```java
// kubectl taint nodes foo dedicated:NoSchedule
V1Node taintedNode = Kubectl.taint()
                .addTaint("dedicated", "NoSchedule")
                .execute()
// kubectl taint nodes foo dedicated=special-user:NoSchedule
V1Node taintedNode = Kubectl.taint()
                .addTaint("dedicated", "special-user", "NoSchedule")
                .execute()
// kubectl taint nodes foo dedicated:NoSchedule-
V1Node taintedNode = Kubectl.taint()
                .removeTaint("dedicated", "NoSchedule")
                .execute()
```



#### Kubectl label/annotate

```java
// kubectl label -n default pod foo key1=value1 key2=value2
V1Pod labelledPod = Kubectl.label(V1Pod)
                .addLabel("key1", "value1")
                .addLabel("key2", "value2")
                .namespace("default")
                .name("foo")
                .execute();
// kubectl annotate -n default pod foo key1=value1 key2=value2
V1Pod annotatedPod = Kubectl.annotate(V1Pod)
                .addLabel("key1", "value1")
                .addLabel("key2", "value2")
                .namespace("default")
                .name("foo")
                .execute();
```

#### Kubectl api-resources

```java
// kubectl api-resources
Set<Discovery.APIResource> apiResourceSet = Kubectl.apiResources()
                .execute()
```

#### Kubectl exec

```java
// kubectl exec -n default foo -c test-container echo test
int retCode = Kubectl.exec()
                .namespace("default")
                .name("foo")
                .container("test-container")
                .command(new String[]{"echo","test"})
                .execute();
```


#### Kubectl logs

```java
// kubectl logs -n default foo -c test-container
InputStream logStream = Kubectl.log()
                .namespace("default")
                .name("foo")
                .container("test-container")
                .execute();
```

#### Kubectl top

```java
// kubectl top node
List<Pair<V1Node, NodeMetrics>> metrics = Kubectl.top(V1Node.class, NodeMetrics.class)
                .metric("cpu")
                .execute();
```

### Advanced Tips

#### API Discovery for custom models

Kubernetes allows you to extend new kubernetes API types by either [CustomResourceDefinition](https://kubernetes.io/docs/tasks/extend-kubernetes/custom-resources/custom-resource-definitions/)
or [APIServerAggregation](https://kubernetes.io/docs/tasks/extend-kubernetes/setup-extension-api-server/),
and api-discovery is basically a process of discovering new kubernetes resources types from the client-side. 
The java client is managing all the api-discovery information at `io.kubernetes.client.util.ModelMapper`.
In order to make the java client know the connection between new kubernetes api and custom Java models, you're 
supposed to manually set up the mappings for them by:

```java
ModelMapper.addModelMap(
  "example.io",  // api-group
  "v1",          // api-version
  "Foo",         // kind name -- camel-case'd singular resource name.
  "foos",        // resource name -- lowercase plural resource name
  true,          // is namespace-scoped
  Foo.class);    // java model class
```
