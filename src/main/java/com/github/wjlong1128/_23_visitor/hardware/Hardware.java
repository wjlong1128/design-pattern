package com.github.wjlong1128._23_visitor.hardware;

import com.github.wjlong1128._23_visitor.visit.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
@Getter
@Setter
public abstract class Hardware {
    String command;

    public Hardware(String command) {
        this.command = command;
    }

    /**
     * 运行命令
     */
    public void run(){
        System.out.println(command);
    }

    public abstract void accept(Visitor visitor);

}
