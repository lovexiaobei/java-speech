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
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface StreamingRecognizeResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.StreamingRecognizeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. If set, returns a [google.rpc.Status][google.rpc.Status]
   * message that specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. If set, returns a [google.rpc.Status][google.rpc.Status]
   * message that specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. If set, returns a [google.rpc.Status][google.rpc.Status]
   * message that specifies the error for the operation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results (the interim results).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  java.util.List<com.google.cloud.speech.v1.StreamingRecognitionResult> getResultsList();
  /**
   *
   *
   * <pre>
   * Output only. This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results (the interim results).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  com.google.cloud.speech.v1.StreamingRecognitionResult getResults(int index);
  /**
   *
   *
   * <pre>
   * Output only. This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results (the interim results).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  int getResultsCount();
  /**
   *
   *
   * <pre>
   * Output only. This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results (the interim results).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.StreamingRecognitionResultOrBuilder>
      getResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. This repeated list contains zero or more results that
   * correspond to consecutive portions of the audio currently being processed.
   * It contains zero or one `is_final=true` result (the newly settled portion),
   * followed by zero or more `is_final=false` results (the interim results).
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.StreamingRecognitionResult results = 2;</code>
   */
  com.google.cloud.speech.v1.StreamingRecognitionResultOrBuilder getResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Indicates the type of speech event.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.StreamingRecognizeResponse.SpeechEventType speech_event_type = 4;
   * </code>
   */
  int getSpeechEventTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Indicates the type of speech event.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.StreamingRecognizeResponse.SpeechEventType speech_event_type = 4;
   * </code>
   */
  com.google.cloud.speech.v1.StreamingRecognizeResponse.SpeechEventType getSpeechEventType();
}
