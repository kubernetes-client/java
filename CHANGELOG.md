# 25.0.0 (November 25, 2025)

* Features
  * Bump Kubernetes API spec to v1.34.
  * Add support for v5 of the streaming protocol. ([#3800](https://github.com/kubernetes-client/java/pull/3800))
  * Add terminal resize support in ExecProcess. ([#3801](https://github.com/kubernetes-client/java/pull/3801))
  * Enable reuse of cached informers in SharedInformerFactory. ([#3856](https://github.com/kubernetes-client/java/pull/3856))
  * Add ApiClient integration to ClientBuilder. ([#4152](https://github.com/kubernetes-client/java/pull/4152))
  * Migrate EKS authentication from AWS SDK 1.x to 2.x. ([#4113](https://github.com/kubernetes-client/java/pull/4113))
* Bugfixes
  * Fix missing continue token when building cluster list call. ([#3930](https://github.com/kubernetes-client/java/pull/3930))
  * Fix NPE in KubectlTop when pods are down. ([#4087](https://github.com/kubernetes-client/java/pull/4087))
  * Fix fieldManager parameter in makeClusterCreateCallBuilder. ([#4140](https://github.com/kubernetes-client/java/pull/4140))
  * Fix patch workflow compatibility for Linux environments. ([#4055](https://github.com/kubernetes-client/java/pull/4055))
* Misc
  * Remove unused dependencies (jakarta.ws.rs-api and others). ([#3907](https://github.com/kubernetes-client/java/pull/3907), [#3909](https://github.com/kubernetes-client/java/pull/3909))
  * Refactor to use StandardCharsets. ([#4188](https://github.com/kubernetes-client/java/pull/4188))

# 24.0.0 (May 26, 2025)

* Features
  * Bump Kubernetes API spec to v1.33.
* Misc
  * API client code regenerated for the Kubernetes 1.33 release cycle.

# 23.0.0 (February 24, 2025)

* Features
  * Bump Kubernetes API spec to v1.32.
* Misc
  * API client code regenerated for the Kubernetes 1.32 release cycle.

# 22.0.1 (February 12, 2025)

* Misc
  * Regenerate OpenAPI models for upstream Kubernetes 1.31 patch release.

# 22.0.0 (November 19, 2024)

* Features
  * Bump Kubernetes API spec to v1.31.
* Misc
  * API client code regenerated for the Kubernetes 1.31 release cycle.

# 21.0.1 (July 30, 2024)

* Misc
  * Patch release — dependency and stability updates.

# 21.0.0 (June 21, 2024)

* Features
  * Bump Kubernetes API spec to v1.30.
* Misc
  * API client code regenerated for the Kubernetes 1.30 release cycle.

# 20.0.1 (March 13, 2024)

* Misc
  * Patch release — bug fixes and dependency updates.

# 20.0.0 (February 7, 2024)

* Features
  * Bump Kubernetes API spec to v1.29.
* Breaking Changes
  * Optional parameters are now consolidated into a single options object, changing the method signatures across the generated API client. ([#3019](https://github.com/kubernetes-client/java/pull/3019))
  * Java 8 support has been removed. Java 11 or later is now required.
  * A legacy SDK module is available with the `-legacy` suffix (e.g., `20.0.0-legacy`) for users who prefer the previous interface.

# 19.0.1 (March 14, 2024)

* Misc
  * Patch release — bug fixes and dependency updates.

# 19.0.0 (January 10, 2024)

* Features
  * Bump Kubernetes API spec to v1.28.
* Misc
  * API client code regenerated for the Kubernetes 1.28 release cycle.

# 18.0.1 (July 10, 2023)

* Misc
  * Patch release — bug fixes and dependency updates.

# 18.0.0 (March 3, 2023)

* Features
  * Bump Kubernetes API spec to v1.27.
* Misc
  * API client code regenerated for the Kubernetes 1.27 release cycle.

# 17.0.2 (April 14, 2023)

* Misc
  * Patch release — bug fixes and dependency updates.

# 17.0.1 (January 31, 2023)

* Misc
  * Patch release — bug fixes and dependency updates.

# 17.0.0 (December 8, 2022)

* Features
  * Bump Kubernetes API spec to v1.26.
  * Add support for v1 exec credentials.
* Misc
  * API client code regenerated for the Kubernetes 1.26 release cycle.
  * Multiple dependency updates and bug fixes.

# 16.0.3 (January 31, 2023)

* Misc
  * Patch release — bug fixes and dependency updates.

# 16.0.2 (November 3, 2022)

* Bugfixes
  * Cherry-picked bug fixes from the main branch.

# 16.0.1 (October 20, 2022)

* Bugfixes
  * Bump snakeyaml to 1.33 to address security vulnerability.

# 16.0.0 (June 28, 2022)

* Features
  * Bump Kubernetes API spec to v1.25.
* Misc
  * API client code regenerated for the Kubernetes 1.25 release cycle.

# 15.0.2 (January 30, 2023)

* Misc
  * Patch release — bug fixes and dependency updates.

# 15.0.0

* Features
  * Bump Kubernetes API spec to v1.24.
* Misc
  * API client code regenerated for the Kubernetes 1.24 release cycle.

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
