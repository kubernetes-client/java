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

import java.util.List;
import java.util.Map;
import java.util.function.Function;

/** Indexer extends Store interface and adds index/de-index methods. */
public interface Indexer<ApiType> extends Store<ApiType> {

  /**
   * Retrieve list of objects that match on the named indexing function.
   *
   * @param indexName specific indexing function
   * @return matched objects
   */
  List<ApiType> index(String indexName, ApiType obj);

  /**
   * IndexKeys returns the set of keys that match on the named indexing function.
   *
   * @param indexName specific indexing function
   * @param indexKey specific index key
   * @return matched keys
   */
  List<String> indexKeys(String indexName, String indexKey);

  /**
   * ByIndex lists object that match on the named indexing function with the exact key.
   *
   * @param indexName specific indexing function
   * @param indexKey specific index key
   * @return matched objects
   */
  List<ApiType> byIndex(String indexName, String indexKey);

  /**
   * Return the indexers registered with the store.
   *
   * @return registered indexers
   */
  Map<String, Function<ApiType, List<String>>> getIndexers();

  /**
   * Add additional indexers to the store.
   *
   * @param indexers indexers to add
   */
  void addIndexers(Map<String, Function<ApiType, List<String>>> indexers);
}
