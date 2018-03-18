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
