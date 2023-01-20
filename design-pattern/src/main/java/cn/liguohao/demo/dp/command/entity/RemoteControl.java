package cn.liguohao.demo.dp.command.entity;

import cn.liguohao.demo.dp.command.Command;

/**
 * @Description  遥控器
 * @Author liguohao
 * @Date 2020/9/24 23:03
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPress(){
        command.execute();
    }
}
