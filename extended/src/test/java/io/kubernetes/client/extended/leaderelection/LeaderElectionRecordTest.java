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

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import org.junit.jupiter.api.Test;

class LeaderElectionRecordTest {

  // Two records that differ only by having a null renewTime must still be equal to each
  // other when every other field (including renewTime, which is null on both) matches.
  @Test
  void equalWhenRenewTimeIsNullOnBoth() {
    Date acquireTime = new Date(1000L);
    LeaderElectionRecord a = new LeaderElectionRecord("holder", 15, acquireTime, null, 3);
    LeaderElectionRecord b = new LeaderElectionRecord("holder", 15, acquireTime, null, 3);

    assertThat(a).isEqualTo(b);
    assertThat(b).isEqualTo(a);
    assertThat(a.hashCode()).isEqualTo(b.hashCode());
  }

  // When one record has a null renewTime and the other does not, they must be unequal,
  // regardless of the holderIdentity value.
  @Test
  void notEqualWhenOnlyOneRenewTimeIsNull() {
    Date acquireTime = new Date(1000L);
    Date renewTime = new Date(2000L);
    LeaderElectionRecord nullRenew = new LeaderElectionRecord("holder", 15, acquireTime, null, 3);
    LeaderElectionRecord withRenew =
        new LeaderElectionRecord("holder", 15, acquireTime, renewTime, 3);

    assertThat(nullRenew).isNotEqualTo(withRenew);
    assertThat(withRenew).isNotEqualTo(nullRenew);
  }
}
