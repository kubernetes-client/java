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
package io.kubernetes.client;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/** Helper class to represent directory tree */
public class TreeNode {
  boolean isDir;
  String name;
  boolean isRoot;
  List<TreeNode> children;

  public TreeNode(boolean isDir, String name, boolean isRoot) {
    this.isDir = isDir;
    this.name = name;
    this.isRoot = isRoot;
    this.children = new ArrayList<>();
  }

  public boolean isDir() {
    return isDir;
  }

  public void setDir(boolean dir) {
    isDir = dir;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isRoot() {
    return isRoot;
  }

  public void setRoot(boolean root) {
    isRoot = root;
  }

  public List<TreeNode> getChildren() {
    return children;
  }

  public void setChildren(List<TreeNode> children) {
    this.children = children;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this).toString();
  }
}
