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
package io.kubernetes.client.extended.leaderelection;

import io.kubernetes.client.openapi.ApiException;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicReference;

/** Makes simulated {@link Lock} objects that behave as if they were backed by real API server. */
public class LockSmith {
  private AtomicReference<Resource> lockResourceRef = new AtomicReference<>();

  public Lock makeLock(String identity) {
    return new SimulatedLock(identity);
  }

  private class SimulatedLock implements Lock {
    private final String identity;

    public SimulatedLock(String identity) {
      this.identity = identity;
    }

    @Override
    public LeaderElectionRecord get() throws ApiException {
      if (lockResourceRef.get() == null) {
        throw new ApiException("Record Not Found", HttpURLConnection.HTTP_NOT_FOUND, null, null);
      }

      return lockResourceRef.get().record;
    }

    @Override
    public boolean create(LeaderElectionRecord record) {
      return lockResourceRef.compareAndSet(null, new Resource(record));
    }

    @Override
    public boolean update(LeaderElectionRecord record) {
      Resource res = lockResourceRef.get();
      if (res == null) {
        return false;
      } else {
        Resource newResource = new Resource(res.version + 1, record);
        return lockResourceRef.compareAndSet(res, newResource);
      }
    }

    @Override
    public String identity() {
      return identity;
    }

    @Override
    public String describe() {
      return "simulated/lock";
    }
  }

  private static class Resource {
    final int version;
    final LeaderElectionRecord record;

    public Resource(LeaderElectionRecord record) {
      this.version = 0;
      this.record = record;
    }

    public Resource(int version, LeaderElectionRecord record) {
      this.version = version;
      this.record = record;
    }
  }
}
