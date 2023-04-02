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

import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.Watchable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MockWatch<ApiType> implements Watchable<ApiType> {

  public MockWatch(Watch.Response<ApiType>... events) {
    this.events = new ArrayList<>(Arrays.asList(events));
  }

  private List<Watch.Response<ApiType>> events;

  private boolean closed;

  public boolean isClosed() {
    return this.closed;
  }

  @Override
  public void close() throws IOException {
    closed = true;
  }

  @Override
  public Iterator<Watch.Response<ApiType>> iterator() {
    // not implemented
    return null;
  }

  @Override
  public boolean hasNext() {
    return !this.events.isEmpty();
  }

  @Override
  public Watch.Response<ApiType> next() {
    Watch.Response<ApiType> event = events.get(0);
    this.events.remove(0);
    return event;
  }
}
