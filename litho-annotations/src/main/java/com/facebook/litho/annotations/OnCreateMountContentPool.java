/*
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.litho.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * The annotated method will be called to create a custom MountContentPool for this mount spec. If a
 * method with this annotation isn't provided, a DefaultMountContentPool will be used to recycle the
 * mount content of this mount spec, which is almost always sufficient.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface OnCreateMountContentPool {}
