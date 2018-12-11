/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.compare_comply.v1.model;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * Basic information about the input document.
 */
public class Document extends GenericModel {

  private String title;
  private String html;
  private String hash;
  private String label;

  /**
   * Gets the title.
   *
   * Document title, if detected.
   *
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Gets the html.
   *
   * The input document converted into HTML format.
   *
   * @return the html
   */
  public String getHtml() {
    return html;
  }

  /**
   * Gets the hash.
   *
   * The MD5 hash value of the input document.
   *
   * @return the hash
   */
  public String getHash() {
    return hash;
  }

  /**
   * Gets the label.
   *
   * The label applied to the input document with the calling method's `file1_label` or `file2_label` value.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }
}