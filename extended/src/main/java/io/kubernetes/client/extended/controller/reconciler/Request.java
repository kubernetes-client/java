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
package io.kubernetes.client.extended.controller.reconciler;

/**
 * The type Request contains the information necessary to reconcile a resource object. This includes
 * the information to uniquely identify the object - its Name and Namespace. Note that it does NOT
 * contain information about any specific Event or the object contents itself.
 */
public class Request {

  private String name;
  private String namespace;

  /**
   * Instantiates a new Request specifying the name. Works for cluster-scoped resource.
   *
   * @param name the resource object name
   */
  public Request(String name) {
    this(null, name);
  }

  /**
   * Instantiates a new Request specifying the name and namespace. Works for namespace-scoped
   * resource.
   *
   * @param namespace the resource object namespace
   * @param name the resource object name
   */
  public Request(String namespace, String name) {
    this.name = name;
    this.namespace = namespace;
  }

  /**
   * Gets namespace.
   *
   * @return the namespace
   */
  public String getNamespace() {
    return namespace;
  }

  /**
   * Sets namespace.
   *
   * @param namespace the namespace
   */
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Request{" + "name='" + name + '\'' + ", namespace='" + namespace + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Request request = (Request) o;

    if (name != null ? !name.equals(request.name) : request.name != null) return false;
    return namespace != null ? namespace.equals(request.namespace) : request.namespace == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (namespace != null ? namespace.hashCode() : 0);
    return result;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }
}
