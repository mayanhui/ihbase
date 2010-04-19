/*
 * Copyright 2010 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.regionserver;

import org.apache.hadoop.hbase.HBaseTestCase;
import org.apache.hadoop.hbase.regionserver.idx.support.IdxClassSize;
import org.apache.hadoop.hbase.util.ClassSize;

/**
 * Tests for the index manager.
 */
public class TestIdxRegionIndexManager extends HBaseTestCase {

    /**
     * Verifies the fixed heap size.
     */
    public void testHeapSize() {
        assertEquals(IdxRegionIndexManager.FIXED_SIZE,
                ClassSize.estimateBase(IdxRegionIndexManager.class, true) +
                        IdxClassSize.HASHMAP + IdxClassSize.OBJECT_ARRAY_LIST +
                        ClassSize.REENTRANT_LOCK);
    }
}
