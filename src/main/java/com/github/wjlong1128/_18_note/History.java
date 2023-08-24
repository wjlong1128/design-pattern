package com.github.wjlong1128._18_note;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class History {

    private Stack<BackUp> backUpStack = new Stack<>();

    public BackUp getLastVersion() {
        return backUpStack.pop();
    }

    public void add(BackUp backUp) {
        this.backUpStack.add(backUp);
    }


    public static class Stack<T> {
        private Deque<T> queue = new ArrayDeque<>();

        public void add(T e) {
            queue.addFirst(e);
        }

        public T pop() {
            return queue.pop();
        }
    }

}
