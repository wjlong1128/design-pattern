package com.github.wjlong1128._15_command;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */

// 定义命令接口
interface Command {
    void execute();
    void undo();
}

// 实现具体命令对象
class LightOnCommand implements Command {
    private final Light light;
    private boolean lastState;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        lastState = light.isOn();
        light.turnOn();
    }

    @Override
    public void undo() {
        if (lastState) {
            light.turnOn();
        } else {
            light.turnOff();
        }
    }
}

// 实现接收者对象
class Light {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is off");
    }
}

// 实现调用者对象
class RemoteControl {
    private final Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }
}

// 客户端代码
public class Client {
    public static void main(String[] args) {
        // 创建接收者对象
        Light light = new Light();

        // 创建具体命令对象
        Command onCommand = new LightOnCommand(light);

        // 创建调用者对象，并设置命令对象
        RemoteControl remoteControl = new RemoteControl(onCommand);

        // 发起请求
        remoteControl.pressButton();

        // 撤销请求
        remoteControl.pressUndo();
    }
}

