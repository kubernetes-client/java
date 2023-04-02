# Re-Write a Kubernetes Replicas-Controller in Java

__TL;DR__: This tutorial will show you how to re-write a replicaset-controller
(kube-controller-manager) in Java. This tutorial requires you to have a basic knowledge 
of spring-boot framework and maven commands and you're will be able write your own custom
Java kubernetes controller similarly after reading this document. The complete example project 
is available at [yue9944882/replicaset-controller](https://github.com/yue9944882/replicaset-controller)
and a working image example is also at [ghcr.io/yue9944882/java-replicaset-controller](https://github.com/users/yue9944882/packages/container/package/java-replicaset-controller).


### Setup Environment

Please check that you have the following required development toolings installed in your local
environment:

- __JDK 8+__: Necessary Java development environment.
- __Maven__: Greater than 3.0.0+.
- __KinD__: (Optional) For verifying the controller in a real kubernetes cluster. https://kind.sigs.k8s.io/docs/user/quick-start/


### Writing Project


#### Necessary Plugins for pom.xml

Creating a new repo following the standard maven project structure, and ensure the following 
plugins are present in the [pom.xml](https://github.com/yue9944882/replicaset-controller/blob/master/pom.xml):

- __Maven Compiler Plugin__: Setting language level to 8.
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <configuration>
        <source>8</source>
        <target>8</target>
    </configuration>
</plugin>
```
- __Spring Boot Maven Plugin__: For building thinner docker images following the standard spring-boot plugins:
```xml
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <version>2.3.4.RELEASE</version>
</plugin>
```

#### Introducing Spring Integration Dependency

Adding the following dependency to your `pom.xml`.

```xml
<dependency>
	<groupId>io.kubernetes</groupId>
	<artifactId>client-java-spring-integration</artifactId>
	<version>${ >= 11.0.0 recommended}</version>
</dependency>
```

The dependency will auto-configure the necessary configuration beans for injecting informers
and reconcilers to your application. And note that you can disable the configuration beans by
setting the following properties in your spring context:


```text
kubernetes.informer.enabled=false   # disables informer injection
kubernetes.reconciler.enabled=false # disables reconciler injection
```

#### Adding a Main Class 

So that the project can be packaged as a executable jar. See the example class [here](https://github.com/yue9944882/replicaset-controller/blob/master/src/main/java/com/github/yue9944882/kubernetes/Application.java).

##### Loading Post-Processor Spring Beans (Required only if you're using < 11.0.0 releases)

Adding the following annotation to whatever Java class under spring context, so that processors can be activated.

```java
@ComponentScan("io.kubernetes.client.spring.extended.controller")
```

Corresponding example is available [here](https://github.com/yue9944882/replicaset-controller/blob/master/src/main/java/com/github/yue9944882/kubernetes/config/ControllerConfiguration.java#L20).

#### Declaring Your Informer Factory

You're supposed to create a new class (can be a inner-class) extending `io.kubernetes.client.informer.SharedInformerFactory`,
and then put `@KubernetesInformers` annotation on the new class to configure the informer-factory list-watching the specified
kubernetes resources. See the example at [here](https://github.com/yue9944882/replicaset-controller/blob/c8dda02fe444d7154117b9bf0583557502694e1b/src/main/java/com/github/yue9944882/kubernetes/config/ControllerConfiguration.java#L46-L64).
The following code is an example of registering a pod-informer and replicaset-informer to the informer-factory.

```java
@KubernetesInformers({
        @KubernetesInformer( // Adding a pod-informer to the factory for list-watching pod resources
                apiTypeClass = V1Pod.class,
                apiListTypeClass = V1PodList.class,
                groupVersionResource =
                @GroupVersionResource(
                        apiGroup = "",
                        apiVersion = "v1",
                        resourcePlural = "pods")),
        @KubernetesInformer( // Adding a replicaset-informer to the factory for list-watching replicaset resources
                apiTypeClass = V1ReplicaSet.class,
                apiListTypeClass = V1ReplicaSetList.class,
                groupVersionResource =
                @GroupVersionResource(
                        apiGroup = "apps",
                        apiVersion = "v1",
                        resourcePlural = "replicasets")),
})
class ControllerSharedInformerFactory extends SharedInformerFactory {
}
```

And don't forget to register `ControllerSharedInformerFactory` as a bean to the spring context. See [here](https://github.com/yue9944882/replicaset-controller/blob/c8dda02fe444d7154117b9bf0583557502694e1b/src/main/java/com/github/yue9944882/kubernetes/config/ControllerConfiguration.java#L28-L33).
The registered informer-factory won't be running unless you explcitly calls `startAllRegisteredInformers` somewhere else,
the method is the trigger to run the controller, so hold it carefully until you're ready :). In the example project, the 
informer-factory was started inside `ControllerManager#run`.

As a deeper insight, it's the [KubernetesInformerFactoryProcessor](https://github.com/kubernetes-client/java/blob/master/spring/src/main/java/io/kubernetes/client/spring/extended/controller/KubernetesInformerFactoryProcessor.java) 
parsing the `@KubernetesInformers` annotation on informer-factory class and then register `SharedInformer` and 
`Lister` beans for the kubernetes resource classes. You can easily acquire them by `@Autowired` (for >= 11.0.0 release) 
or declaring them as parameters in the bean method. See this example source to see the per-resource informer/lister 
bean registration [here](https://github.com/yue9944882/replicaset-controller/blob/c8dda02fe444d7154117b9bf0583557502694e1b/src/main/java/com/github/yue9944882/kubernetes/config/ControllerConfiguration.java#L35-L43).


#### Declaring Your Reconciler

Now the informer-factory's ready, it will keep receiving watching events from kubernetes cluster after started. And by 
this step you will be actually writing a controller subscribing events from the cluster. First of all, create a new class 
implementing the `Reconciler` interface and register the class as a bean in the spring context:


```java
public class ReplicaSetReconciler implements Reconciler {...}
```

Then add a `@KubernetesReconciler` annotation on the reconciler class to explictly mark the class so that it can be 
processed by [KubernetesReconcilerConfigurer](https://github.com/kubernetes-client/java/blob/master/spring/src/main/java/io/kubernetes/client/spring/extended/controller/KubernetesReconcilerConfigurer.java).
The processor will be wiring the reconciler class to the informer-factory together so that the event can be delivered to 
the reconciler. In the `@KubernetesReconciler` annotation, you're also requried to uniquely name the reconciler by setting
`value` property and set `@KubernetesReconcilerWatches` property to set what kind of kubernetes resources the reconciler 
need to keep notified. Note that the `@KubernetesReconcilerWatches` configuration won't raise a new watch connection, all 
the watch connections are managed by informer-factory and they're multiplex'd. Simply put, it's justing adding an in-memory watcher
to the watch connection. For more detail, take a look at the example code [here](https://github.com/yue9944882/replicaset-controller/blob/c8dda02fe444d7154117b9bf0583557502694e1b/src/main/java/com/github/yue9944882/kubernetes/ReplicaSetReconciler.java#L27-L40).


#### Injecting Informer/Lister using @Autowired (Optional for >= 11.0.0 releases)

You can easily acquire `SharedInformer` and `Lister` instances via `@Autowired` annotations instead of passing them from
the bean constructor, see the following example:

```java
public class ReplicaSetReconciler implements Reconciler {
    @Autowired private SharedInformer<V1Pod> podInformer;
    @Autowired private Lister<V1Pod> podLister;
    @Autowired private SharedInformer<V1Node> nodeInformer;
    @Autowired private Lister<V1Node> nodeLister;
    ...
}
```

Note that the type parameter for the informer and lister i.e. the kubernetes api resource type must be declared in your 
`@KubernetesInformers` annotation.

#### Setting Event-Filter or ReadyFunc for your reconciler

Both the event-filter method and ready-func method is supposed to be "public" access.

```java
public class ReplicaSetReconciler implements Reconciler {
    ...
    @AddWatchEventFilter(apiTypeClass = V1Pod.class)
    public boolean onAddFilter(V1Pod pod) {
      return true; // returns true to handle the event
    }
    
    @UpdateWatchEventFilter(apiTypeClass = V1Pod.class)
    public boolean onUpdateFilter(V1Pod oldPod, V1Pod newPod) {
      return true; // returns true to handle the event
    }
    
    @DeleteWatchEventFilter(apiTypeClass = V1Pod.class)
    public boolean onDeleteFilter(V1Pod pod) {
      return true; // returns true to handle the event
    }
    
    @KubernetesReconcilerReadyFunc
    public boolean podInformerCacheReady() {
      return podInformer.hasSynced(); // return true if reconciler is ready to run.
    }
    ..
}
```

#### Creating Your Controller Bean (Required for >= 11.0.0 releases)

The controller bean is the entry bean to run your reconciler class definition. You're supposed to create a controller 
bean instance using `KubernetesControllerFactory`:


```java
@Configuration
public class MyConfiguration {
    ...
    @Bean
    public KubernetesControllerFactory replicasetController(
        SharedInformerFactory sharedInformerFactory,
        Reconciler reconciler) {
      return new KubernetesControllerFactory(sharedInformerFactory, reconciler);
    }
    ...
}
```

#### Running the Reconcilers

Now both the informer-factory and the reconciler are set, the last step is to stitch them together by adding a starter
(or a `CommandLineRunner`) or a bean implemeting `InitializingBean` as is shown in the following approaches:


- (Option 1) Run it immediately.
```java
@Component
public class ControllerStarter implements InitializingBean {

    @Resource
    private SharedInformerFactory sharedInformerFactory;

    @Resource(name = "replicaset-reconciler")
    private Controller replicasetController;

    @Override
    public void afterPropertiesSet() throws Exception {
        sharedInformerFactory.startAllRegisteredInformers();
        Executors.newSingleThreadExecutor().submit(replicasetController);
    }
}
```

- (Option 2) Pack the informer-factory and the reconciler into a controller-manager instance.
```java
@Component
public class ControllerStarter implements InitializingBean {

    @Resource
    private SharedInformerFactory sharedInformerFactory;

    @Resource(name = "replicaset-reconciler")
    private Controller replicasetController;

    @Override
    public void afterPropertiesSet() throws Exception {
        ControllerManager controllerManager = new ControllerManager(sharedInformerFactory, replicasetController);
        Executors.newSingleThreadExecutor().submit(controllerManager);
    }
}
```

- (Option 3) Pack the informer-factory and the reconciler into a leader-election HA controller-manager.
```java
@Component
public class ControllerStarter implements InitializingBean {

    @Resource
    private SharedInformerFactory sharedInformerFactory;

    @Resource(name = "replicaset-reconciler")
    private Controller replicasetController;

    @Override
    public void afterPropertiesSet() throws Exception {
        ControllerManager controllerManager = new ControllerManager(sharedInformerFactory, replicasetController);

        String appNamespace = "default";
        String appName = "java-replicaset-controller";
        String lockHolderIdentityName = UUID.randomUUID().toString(); // Anything unique
        EndpointsLock lock = new EndpointsLock(appNamespace, appName, lockHolderIdentityName);

        LeaderElectionConfig leaderElectionConfig =
            new LeaderElectionConfig(
                lock, Duration.ofMillis(10000), Duration.ofMillis(8000), Duration.ofMillis(2000));
        ExecutorService pool = Executors.newSingleThreadExecutor();
        try (LeaderElector leaderElector = new LeaderElector(leaderElectionConfig)) {
          leaderElector.run(
              () -> pool.submit(controllerManager),
              () -> pool.shutdown());
        }
    }
}
```


#### *Optional*: Using spring-boot maven plugin to Build Image

Run the command to build a thinner image for your controller:

```bash
mvn spring-boot:build-image
```

For running the image in a real cluster, please following the instructions [here](https://github.com/yue9944882/replicaset-controller#run-this-project-in-a-new-kind-cluster).