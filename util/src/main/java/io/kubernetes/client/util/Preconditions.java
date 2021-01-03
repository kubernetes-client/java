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
package io.kubernetes.client.util;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * support for different invariant checks, like for a example a non-null argument being passed to a
 * method that does not support nulls.
 *
 * @author wind57
 */
public final class Preconditions {

  private Preconditions() {
    throw new AssertionError("not supported");
  }

  /**
   * @param validate argument to be validated
   * @param predicate to check against
   * @param errorSupplier the error message generator
   * @param <T>
   * @return T if Predicate does not match
   * @throws IllegalArgumentException if predicate returns true
   */
  public static <T> T precondition(
      T validate, Predicate<? super T> predicate, Supplier<String> errorSupplier) {
    if (predicate.test(validate)) {
      throw new IllegalArgumentException(errorSupplier.get());
    }
    return validate;
  }
}
