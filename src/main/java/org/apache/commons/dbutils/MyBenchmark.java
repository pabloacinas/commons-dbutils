/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
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

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(org.openjdk.jmh.annotations.Scope.Thread)
@Fork(1)
@Threads(1)
@Warmup(iterations = 5)
@Measurement(iterations = 5)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class MyBenchmark {

    // Variable de control para imprimir el mensaje solo una vez
    private boolean printedThroughput;

    /**
     * Configuraci�n inicial antes de ejecutar las iteraciones del benchmark.
     */
    @Setup(Level.Trial)
    public void setup() {
        if (!printedThroughput) {
            System.out.println("Executing Throughput");
            printedThroughput = true;
        }
    }

    /**
     * Benchmark que mide el throughput (operaciones por segundo).
     */
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void measureThroughput() {
        // Simulando una operaci�n costosa
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            result += i;
        }
    }

    /**
     * M�todo principal para ejecutar el benchmark.
     */
    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
            .include(MyBenchmark.class.getSimpleName()) // Ejecutar este benchmark espec�fico
            .forks(1) // Ejecutar una sola vez
            .build();

        new Runner(options).run(); // Ejecutar el benchmark
    }
}
