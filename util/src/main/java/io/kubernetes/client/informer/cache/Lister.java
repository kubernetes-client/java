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
package io.kubernetes.client.informer.cache;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.util.Strings;
import java.util.List;

/** Lister interface is used to list cached items from a running informer. */
public class Lister<ApiType extends KubernetesObject> {

  private String namespace;

  private String indexName;

  private Indexer<ApiType> indexer;

  public Lister(Indexer<ApiType> indexer) {
    this(indexer, null, Caches.NAMESPACE_INDEX);
  }

  public Lister(Indexer<ApiType> indexer, String namespace) {
    this(indexer, namespace, Caches.NAMESPACE_INDEX);
  }

  public Lister(Indexer<ApiType> indexer, String namespace, String indexName) {
    this.indexer = indexer;
    this.namespace = namespace;
    this.indexName = indexName;
  }

  public List<ApiType> list() {
    if (Strings.isNullOrEmpty(namespace)) {
      return indexer.list();
    } else {
      return indexer.byIndex(this.indexName, namespace);
    }
  }

  public ApiType get(String name) {
    String key = name;
    if (!Strings.isNullOrEmpty(namespace)) {
      key = namespace + "/" + name;
    }
    return indexer.getByKey(key);
  }

  public Lister<ApiType> namespace(String namespace) {
    return new Lister<ApiType>(this.indexer, namespace, Caches.NAMESPACE_INDEX);
  }
}
