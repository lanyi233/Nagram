// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.


// This file is autogenerated by
//     base/android/jni_generator/jni_generator.py
// For
//     org/webrtc/YuvHelper

#ifndef org_webrtc_YuvHelper_JNI
#define org_webrtc_YuvHelper_JNI

#include <jni.h>

#include "webrtc/sdk/android/src/jni/jni_generator_helper.h"


// Step 1: Forward declarations.

JNI_REGISTRATION_EXPORT extern const char kClassPath_org_webrtc_YuvHelper[];
const char kClassPath_org_webrtc_YuvHelper[] = "org/webrtc/YuvHelper";
// Leaking this jclass as we cannot use LazyInstance from some threads.
JNI_REGISTRATION_EXPORT std::atomic<jclass> g_org_webrtc_YuvHelper_clazz(nullptr);
#ifndef org_webrtc_YuvHelper_clazz_defined
#define org_webrtc_YuvHelper_clazz_defined
inline jclass org_webrtc_YuvHelper_clazz(JNIEnv* env) {
  return base::android::LazyGetClass(env, kClassPath_org_webrtc_YuvHelper,
      &g_org_webrtc_YuvHelper_clazz);
}
#endif


// Step 2: Constants (optional).


// Step 3: Method stubs.
namespace  webrtc {
namespace jni {

static void JNI_YuvHelper_CopyPlane(JNIEnv* env, const base::android::JavaParamRef<jobject>& src,
    jint srcStride,
    const base::android::JavaParamRef<jobject>& dst,
    jint dstStride,
    jint width,
    jint height);

JNI_GENERATOR_EXPORT void Java_org_webrtc_YuvHelper_nativeCopyPlane(
    JNIEnv* env,
    jclass jcaller,
    jobject src,
    jint srcStride,
    jobject dst,
    jint dstStride,
    jint width,
    jint height) {
  return JNI_YuvHelper_CopyPlane(env, base::android::JavaParamRef<jobject>(env, src), srcStride,
      base::android::JavaParamRef<jobject>(env, dst), dstStride, width, height);
}

static void JNI_YuvHelper_I420Copy(JNIEnv* env, const base::android::JavaParamRef<jobject>& srcY,
    jint srcStrideY,
    const base::android::JavaParamRef<jobject>& srcU,
    jint srcStrideU,
    const base::android::JavaParamRef<jobject>& srcV,
    jint srcStrideV,
    const base::android::JavaParamRef<jobject>& dstY,
    jint dstStrideY,
    const base::android::JavaParamRef<jobject>& dstU,
    jint dstStrideU,
    const base::android::JavaParamRef<jobject>& dstV,
    jint dstStrideV,
    jint width,
    jint height);

JNI_GENERATOR_EXPORT void Java_org_webrtc_YuvHelper_nativeI420Copy(
    JNIEnv* env,
    jclass jcaller,
    jobject srcY,
    jint srcStrideY,
    jobject srcU,
    jint srcStrideU,
    jobject srcV,
    jint srcStrideV,
    jobject dstY,
    jint dstStrideY,
    jobject dstU,
    jint dstStrideU,
    jobject dstV,
    jint dstStrideV,
    jint width,
    jint height) {
  return JNI_YuvHelper_I420Copy(env, base::android::JavaParamRef<jobject>(env, srcY), srcStrideY,
      base::android::JavaParamRef<jobject>(env, srcU), srcStrideU,
      base::android::JavaParamRef<jobject>(env, srcV), srcStrideV,
      base::android::JavaParamRef<jobject>(env, dstY), dstStrideY,
      base::android::JavaParamRef<jobject>(env, dstU), dstStrideU,
      base::android::JavaParamRef<jobject>(env, dstV), dstStrideV, width, height);
}

static void JNI_YuvHelper_I420ToNV12(JNIEnv* env, const base::android::JavaParamRef<jobject>& srcY,
    jint srcStrideY,
    const base::android::JavaParamRef<jobject>& srcU,
    jint srcStrideU,
    const base::android::JavaParamRef<jobject>& srcV,
    jint srcStrideV,
    const base::android::JavaParamRef<jobject>& dstY,
    jint dstStrideY,
    const base::android::JavaParamRef<jobject>& dstUV,
    jint dstStrideUV,
    jint width,
    jint height);

JNI_GENERATOR_EXPORT void Java_org_webrtc_YuvHelper_nativeI420ToNV12(
    JNIEnv* env,
    jclass jcaller,
    jobject srcY,
    jint srcStrideY,
    jobject srcU,
    jint srcStrideU,
    jobject srcV,
    jint srcStrideV,
    jobject dstY,
    jint dstStrideY,
    jobject dstUV,
    jint dstStrideUV,
    jint width,
    jint height) {
  return JNI_YuvHelper_I420ToNV12(env, base::android::JavaParamRef<jobject>(env, srcY), srcStrideY,
      base::android::JavaParamRef<jobject>(env, srcU), srcStrideU,
      base::android::JavaParamRef<jobject>(env, srcV), srcStrideV,
      base::android::JavaParamRef<jobject>(env, dstY), dstStrideY,
      base::android::JavaParamRef<jobject>(env, dstUV), dstStrideUV, width, height);
}

static void JNI_YuvHelper_I420Rotate(JNIEnv* env, const base::android::JavaParamRef<jobject>& srcY,
    jint srcStrideY,
    const base::android::JavaParamRef<jobject>& srcU,
    jint srcStrideU,
    const base::android::JavaParamRef<jobject>& srcV,
    jint srcStrideV,
    const base::android::JavaParamRef<jobject>& dstY,
    jint dstStrideY,
    const base::android::JavaParamRef<jobject>& dstU,
    jint dstStrideU,
    const base::android::JavaParamRef<jobject>& dstV,
    jint dstStrideV,
    jint srcWidth,
    jint srcHeight,
    jint rotationMode);

JNI_GENERATOR_EXPORT void Java_org_webrtc_YuvHelper_nativeI420Rotate(
    JNIEnv* env,
    jclass jcaller,
    jobject srcY,
    jint srcStrideY,
    jobject srcU,
    jint srcStrideU,
    jobject srcV,
    jint srcStrideV,
    jobject dstY,
    jint dstStrideY,
    jobject dstU,
    jint dstStrideU,
    jobject dstV,
    jint dstStrideV,
    jint srcWidth,
    jint srcHeight,
    jint rotationMode) {
  return JNI_YuvHelper_I420Rotate(env, base::android::JavaParamRef<jobject>(env, srcY), srcStrideY,
      base::android::JavaParamRef<jobject>(env, srcU), srcStrideU,
      base::android::JavaParamRef<jobject>(env, srcV), srcStrideV,
      base::android::JavaParamRef<jobject>(env, dstY), dstStrideY,
      base::android::JavaParamRef<jobject>(env, dstU), dstStrideU,
      base::android::JavaParamRef<jobject>(env, dstV), dstStrideV, srcWidth, srcHeight,
      rotationMode);
}

static void JNI_YuvHelper_ABGRToI420(JNIEnv* env, const base::android::JavaParamRef<jobject>& src,
    jint srcStride,
    const base::android::JavaParamRef<jobject>& dstY,
    jint dstStrideY,
    const base::android::JavaParamRef<jobject>& dstU,
    jint dstStrideU,
    const base::android::JavaParamRef<jobject>& dstV,
    jint dstStrideV,
    jint width,
    jint height);

JNI_GENERATOR_EXPORT void Java_org_webrtc_YuvHelper_nativeABGRToI420(
    JNIEnv* env,
    jclass jcaller,
    jobject src,
    jint srcStride,
    jobject dstY,
    jint dstStrideY,
    jobject dstU,
    jint dstStrideU,
    jobject dstV,
    jint dstStrideV,
    jint width,
    jint height) {
  return JNI_YuvHelper_ABGRToI420(env, base::android::JavaParamRef<jobject>(env, src), srcStride,
      base::android::JavaParamRef<jobject>(env, dstY), dstStrideY,
      base::android::JavaParamRef<jobject>(env, dstU), dstStrideU,
      base::android::JavaParamRef<jobject>(env, dstV), dstStrideV, width, height);
}


}  // namespace jni
}  // namespace  webrtc

// Step 4: Generated test functions (optional).


#endif  // org_webrtc_YuvHelper_JNI
