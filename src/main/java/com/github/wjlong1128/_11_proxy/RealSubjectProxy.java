package com.github.wjlong1128._11_proxy;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
public class RealSubjectProxy implements Subject {
    private final RealSubject subject;

    public RealSubjectProxy() {
        try {
            this.subject = (RealSubject) this.getClass()
                    .getClassLoader()
                    .loadClass(RealSubject.class.getName())
                    .newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void doWork() {
        this.preWork();
        this.subject.doWork();
        this.afterWork();
    }

    public void afterWork() {
        System.out.println("after...");
    }

    public void preWork() {
        System.out.println("pre...");
    }
}
