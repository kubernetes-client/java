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
package io.kubernetes.client.informer;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.informer.cache.Indexer;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/*
 * SharedIndexInformer extends SharedInformer and provides indexer operability additionally.
 */
public interface SharedIndexInformer<ApiType extends KubernetesObject>
    extends SharedInformer<ApiType> {

  /**
   * Add indexers.
   *
   * @param indexers the indexers
   */
  void addIndexers(Map<String, Function<ApiType, List<String>>> indexers);

  /**
   * getIndexer returns the internal indexer store.
   *
   * @return the internal indexer store
   */
  Indexer<ApiType> getIndexer();
}
