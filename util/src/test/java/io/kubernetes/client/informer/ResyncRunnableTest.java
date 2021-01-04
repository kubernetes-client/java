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

import io.kubernetes.client.informer.cache.DeltaFIFO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/** @author wind57 */
@RunWith(MockitoJUnitRunner.class)
public class ResyncRunnableTest {

  @Mock private DeltaFIFO deltaFIFO;

  @Test
  public void testNullSupplier() {
    ResyncRunnable underTest = new ResyncRunnable(deltaFIFO, null);
    underTest.run();
    verify(deltaFIFO, Mockito.times(1)).resync();
  }

  @Test
  public void testSupplierReturnsFalse() {
    ResyncRunnable underTest = new ResyncRunnable(deltaFIFO, () -> false);
    underTest.run();
    verify(deltaFIFO, Mockito.never()).resync();
  }

  @Test
  public void testSupplierReturnsTrue() {
    ResyncRunnable underTest = new ResyncRunnable(deltaFIFO, () -> true);
    underTest.run();
    verify(deltaFIFO, Mockito.times(1)).resync();
  }

  // "() -> null" is going to be treated as false
  @Test
  public void testSupplierReturnsNull() {
    ResyncRunnable underTest = new ResyncRunnable(deltaFIFO, () -> null);
    underTest.run();
    verify(deltaFIFO, Mockito.never()).resync();
  }
}
