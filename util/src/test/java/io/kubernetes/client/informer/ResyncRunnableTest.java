/*
Copyright 2021 The Kubernetes Authors.
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

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.kubernetes.client.informer.cache.DeltaFIFO;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/** @author wind57 */
@ExtendWith(MockitoExtension.class)
class ResyncRunnableTest {

  @Mock private DeltaFIFO deltaFIFO;

  @Mock private Supplier<Boolean> shouldResync;

  @Test
  void nullSupplier() {
    when(shouldResync.get()).thenReturn(true);
    ResyncRunnable underTest = new ResyncRunnable(deltaFIFO, shouldResync);
    underTest.run();
    verify(deltaFIFO, Mockito.times(1)).resync();
    verify(shouldResync, Mockito.times(1)).get();
  }

  @Test
  void supplierReturnsFalse() {
    when(shouldResync.get()).thenReturn(false);
    ResyncRunnable underTest = new ResyncRunnable(deltaFIFO, shouldResync);
    underTest.run();
    verify(deltaFIFO, Mockito.never()).resync();
    verify(shouldResync, Mockito.times(1)).get();
  }

  @Test
  void supplierReturnsTrue() {
    when(shouldResync.get()).thenReturn(true);
    ResyncRunnable underTest = new ResyncRunnable(deltaFIFO, shouldResync);
    underTest.run();
    verify(deltaFIFO, Mockito.times(1)).resync();
    verify(shouldResync, Mockito.times(1)).get();
  }

  // "() -> null" is going to be treated as false
  @Test
  void supplierReturnsNull() {
    when(shouldResync.get()).thenReturn(null);
    ResyncRunnable underTest = new ResyncRunnable(deltaFIFO, shouldResync);
    underTest.run();
    verify(deltaFIFO, Mockito.never()).resync();
    verify(shouldResync, Mockito.times(1)).get();
  }
}
