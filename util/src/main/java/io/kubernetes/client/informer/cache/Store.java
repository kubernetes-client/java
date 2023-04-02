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

public interface Store<ApiType> {

  /**
   * add inserts an item into the store.
   *
   * @param obj specific obj
   */
  void add(ApiType obj);

  /**
   * update sets an item in the store to its updated state.
   *
   * @param obj specific obj
   */
  void update(ApiType obj);

  /**
   * delete removes an item from the store.
   *
   * @param obj specific obj
   */
  void delete(ApiType obj);

  /**
   * Replace will delete the contents of 'c', using instead the given list.
   *
   * @param list list of objects
   * @param resourceVersion specific resource version
   */
  void replace(List<ApiType> list, String resourceVersion);

  /** resync will send a resync event for each item. */
  void resync();

  /**
   * listKeys returns a list of all the keys of the object currently in the store.
   *
   * @return list of all keys
   */
  List<String> listKeys();

  /**
   * get returns the requested item.
   *
   * @param obj specific obj
   * @return the requested item if exist
   */
  Object get(ApiType obj);

  /**
   * getByKey returns the request item with specific key.
   *
   * @param key specific key
   * @return the request item
   */
  ApiType getByKey(String key);

  /**
   * list returns a list of all the items.
   *
   * @return list of all the items
   */
  List<ApiType> list();
}
