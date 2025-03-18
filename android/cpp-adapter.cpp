#include <jni.h>
#include "react-native-keep-awake.h"

extern "C"
JNIEXPORT jdouble JNICALL
Java_com_keepawake_KeepAwakeModule_nativeMultiply(JNIEnv *env, jclass type, jdouble a, jdouble b) {
    return keepawake::multiply(a, b);
}
