package com.tg.rpc.breaker.concurrent.task;

/**
 * Created by twogoods on 2017/7/27.
 */
@FunctionalInterface
public interface ArgsHook {
    Object[] getCallArgs();
}
