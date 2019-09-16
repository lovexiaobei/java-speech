/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

public interface LongRunningRecognizeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionConfig config = 1;</code>
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionConfig config = 1;</code>
   */
  com.google.cloud.speech.v1p1beta1.RecognitionConfig getConfig();
  /**
   *
   *
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionConfig config = 1;</code>
   */
  com.google.cloud.speech.v1p1beta1.RecognitionConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * *Required* The audio data to be recognized.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionAudio audio = 2;</code>
   */
  boolean hasAudio();
  /**
   *
   *
   * <pre>
   * *Required* The audio data to be recognized.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionAudio audio = 2;</code>
   */
  com.google.cloud.speech.v1p1beta1.RecognitionAudio getAudio();
  /**
   *
   *
   * <pre>
   * *Required* The audio data to be recognized.
   * </pre>
   *
   * <code>.google.cloud.speech.v1p1beta1.RecognitionAudio audio = 2;</code>
   */
  com.google.cloud.speech.v1p1beta1.RecognitionAudioOrBuilder getAudioOrBuilder();
}
