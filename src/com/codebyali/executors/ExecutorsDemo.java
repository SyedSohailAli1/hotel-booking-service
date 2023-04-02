package com.codebyali.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class ExecutorsDemo {
    public static void show() {
        Supplier<Integer> task = () -> 5;
        var future = CompletableFuture.supplyAsync(task);
        try {
           var result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}


