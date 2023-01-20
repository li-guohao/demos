package cn.liguohao.demo.dp.command;

import cn.liguohao.demo.dp.command.entity.Garage;

/**
 * @Description 
 * @Author liguohao
 * @Date 2020/9/24 23:14
 */
public class GarageDoorOnCommand implements Command{

    private Garage garage;

    public GarageDoorOnCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.doorTurnOn();
    }
}
