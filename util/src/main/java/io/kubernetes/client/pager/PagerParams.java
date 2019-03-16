/*
Copyright 2019 The Kubernetes Authors.
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
package io.kubernetes.client.pager;

public class PagerParams {

  private Integer limit;
  private String continueToken;

  public PagerParams(Integer limit) {
    this.limit = limit;
  }

  public PagerParams(Integer limit, String continueToken) {
    this.limit = limit;
    this.continueToken = continueToken;
  }

  public Integer getLimit() {
    return limit;
  }

  public String getContinue() {
    return continueToken;
  }

  public void setContinue(String continueToken) {
    this.continueToken = continueToken;
  }
}
