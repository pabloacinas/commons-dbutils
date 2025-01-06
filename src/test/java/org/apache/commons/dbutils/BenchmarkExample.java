/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.dbutils;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput) // Medir rendimiento en operaciones/segundo
@Warmup(iterations = 3) // Número de iteraciones de calentamiento
@Measurement(iterations = 5) // Número de iteraciones reales
@Fork(1) // Número de forks
@State(Scope.Thread) // Estado por hilo
@OutputTimeUnit(TimeUnit.MILLISECONDS) // Unidad de tiempo de salida
public class BenchmarkExample {
	private int[] array;

	@Setup(Level.Iteration)
	public void setUp() {
		array = new int[1_000];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}

	@Benchmark
	public int sumArray() {
		int sum = 0;
		for (int value : array) {
			sum += value;
		}
		return sum;
	}
}
