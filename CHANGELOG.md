# 14.0.0

* Feature
  * Supports GCP token refreshing. (#1810)
  * Adding Kubectl rollout related implementation. (#1813)
  * Bump CRD Model generator to v1.0.6. (#1915)
* Bugfixes
  * Make YAML serializer properly cope with CRD' `x-kubernetes-..` extension. (#1804)
  * Fix GCPAuthenticator to compose a correct command. (#1824)
  * Fix WebSocketStreamHandler.write() to calculate 'remaining' bytes properly. (#1835)
  * Tweak call for CoreV1 group properly. (#1880)
  * Surface api exception in metrics client. (#1937)
* Misc
  * Upgraded maven wrapper. (#1874)
  * Minor dependency updates.
  * Fixes test flakiness

# 13.0.1

* Bugfixes
  * Fixes informer list-watching options when working based on generic api. (#1908)
  * Fixes an NPE issue upon api discovery. (#1924)
  * Fixes stale watch handling issue for informer. (#1905)
  * Make informer properly handle the expired resource-version upon listing. (#1928)

# 13.0.0

* Features
  * Bump kubernetes api spec to `v1.21.x`.
  * Compatibility w/ JDK 16.
  * Separate fluent builder classes (and also its generator) to new modules 
    `client-java-api-fluent` and `client-java-api-fluent-gen`.
  * Support `@KubernetesInformers` annotation on bean method so we can skip 
    declaring a nested class. (#1603)
  * Jittering informer's client-side timeout. (#1656)
  * Published a `client-java-admission-review` module via manual module generation.
* Bugfix
  * ModelMapper now registers lister kind. (#1658)
  * Defaulting a 200 status code upon successful response. (#1672)
  * Fixes security issues from SnakeYaml's dynamic serialization. (#1676)
  * Fixes duplicate informer-resync calls. (#1727)
* Misc
  * Improving loggings
  * Upgrading a few dependencies
  * Test flakiness

# 12.0.0

* Features
  * Kubernetes spec to `v1.20.x`
  * Switching datetime library from joda-time to jdk's OffsetDateTime (#1418)
    * Joda-time is under deprecation
    * Support millis-second precision in timestamp
  * Introducing DynamicKubernetesApi which extends GenericKubernetesApi and 
    packs kubernetes resources into a dynamic object. (#1528)
  * Adding `updateStatus()` convenience for GenericKubernetesApi (#1470)
* Bugfix
  * Fixes the patch content sent by event-logger. (#1559, #1569)
* Misc
  * Clarifying graceful shutdown behaviors for leader-elector (#1460)
  * Falling-back to BKS when JKS is not available (#1504)
  * Refactoring @LoadBalancer annotation spring extension (#1518)
  * Refactoring @KubernetesInformer annotation spring extension (#1532)

# 11.0.0

* Kubernetes spec to `v1.19.x`
* Bug fixes

# 10.0.0
* Kubernetes spec to `v1.18.x`
* Implementation of `kubectl` equivalent utilities
* Custom resource definitions for common add-on APIs
* Prometheus instrumentation
* Metrics support
* Bug fixes

# 9.0.2
* Kubernetes spec to `v1.17.x`
* Bug fixes

# 8.0.2
* Kubernetes spec to `v1.16.x`
* Bug fixes

# 7.0.0
Changes since 6.0.1

* Bump kubernetes openapi spec version to `v1.15.7`.
* Migrate underlying code-generator library from `swagger-codegen` to `openapi-codegen`.
* Move/rename generated OpenAPI packages (including apis, models..) from `io.kubernetes.client` 
  to `io.kubernetes.client.openapi` for OSGi integration. (#737)
* Default patch format of `CustomObjectApi` move from `application/merge-patch+json` to `application/json-patch+json`. 
* Backport kubernetes upstream client-go informer fix to prevent notification leakage. (#731)
* Add new required `renewDeadline` option for leader-election utilities.
* Provide label-selector filtering utilities. 

# 4.0.0-alpha1
Changes since 3.0.0
Changes since 4.0.0-beta1
* Fix DateTime string generation. (#500)
* Update proto buff files for 1.13.0 (#498)
* Improve auth tests, fix a bug in credential parsing (#465)
* NPE System.getenv(ENV_HOME) returns null on Windows (#455)
* Fix serialization of null quantities  (#442)
* Fix Quantity serialization
* Add merge in ProtoClient
* Invoke async callback on unexpected exceptions
* Update to 1.12 generated code. Fix a few compile errors w/ the new code.

*Note*
This library includes an update to the generated Kubernetes code which may contain breaking API changes.

# 3.0.0
Changes Since 2.0.0

* Expand HOME detection on Windows.
* Changed to set USERPROFILE on Windows environment.
* Add utilities for copying files.
* shutdown okhttp client after exec call
* add constructDateTime to snakeYaml CustomConstructor
* Dropped reference to gson internal API
* Implemented equals method for Quantity
* set content-type to merge-patch+json while building nodePatchCall
* support client certificate chain
* feat (#137): Introduce builder generation.
* Close watches more cleanly.
* Avoid use SystemClassLoader on Yaml.
* Add config file persistence.
* Support refresh for Azure Active Directory tokens.
* Regenerate client for Kubernetes 1.11

*Note*
This library includes an update to the generated Kubernetes code which may contain breaking API changes.

# 2.0.0

Changes since 1.0.0:

* Update Guava dependency. #301 
* Added OSGi support and updated plugins #291 #292
* Client overwriting my app's logback configuration #276 #284
* Support equals() for IntOrString #283
* Close the response body in the case of error. #281
* Add a warning and an exception if a watch is created with debugging enabled. #280
* Update to 1.10 API.

*Note*
This library includes an update to the generated Kubernetes code which may contain breaking API changes.

# 1.0.0
* Fix a bug with HTML escaping byte arrays (#240)
* Fix a bug with YAML parsing IntOrString types (#242)

# 1.0.0-beta3

## Fixes

* Fix a bug where bearer-token auth didn't work pod to pod
  (https://github.com/kubernetes-client/java/issues/180)
* Improve SSH key handling
  (https://github.com/kubernetes-client/java/pull/198, https://github.com/kubernetes-client/java/pull/200)

## Enhancements

* Add a custom ConfigBuilder
  (https://github.com/kubernetes-client/java/pull/171)
* Add support for easy YAML loading
  (https://github.com/kubernetes-client/java/pull/207)
* Add support for Azure AAD Authentication
  (https://github.com/kubernetes-client/java/pull/201)


# 1.0.0-beta2

## Fixes

* Fix a bug when Watch returns a Status object
  ([#165](https://github.com/kubernetes-client/java/pull/165)).
* Add support for Quantity type
  ([#129](https://github.com/kubernetes-client/java/pull/129)).
* Add support for IntOrString
  ([#108](https://github.com/kubernetes-client/java/pull/108)).
* Fix some leaks by calling close
  ([#106](https://github.com/kubernetes-client/java/pull/165)).

# 1.0.0-beta1

This is the first beta release of this client.

## Features

* Support for Kubernetes 1.8 
  ([#84](https://github.com/kubernetes-client/java/pull/84)).

## Fixes

* Allow kubeconfig to be loaded without current-context
  ([#81](https://github.com/kubernetes-client/java/pull/81)).

# 0.2.0

## Fixes

* Correctly configure in-cluster token-based authentication
  ([#75](https://github.com/kubernetes-client/java/pull/75)).

## Features

* Allow client to be instantiated with a custom `context`
  ([#65](https://github.com/kubernetes-client/java/pull/65)), 

* Protocol buffer client 
  ([#67](https://github.com/kubernetes-client/java/pull/67)), 
  ([#69](https://github.com/kubernetes-client/java/pull/69)), 
  ([#71](https://github.com/kubernetes-client/java/pull/71)).

## Miscellanious 

* Rename `client-java-util` package to `client-java`
  ([#73)](https://github.com/kubernetes-client/java/pull/73)).

# 0.1.0

Initial release of client
