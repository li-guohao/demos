package cn.liguohao.demo.dp.command.entity;

/**
 * @Description  汽车
 * @Author liguohao
 * @Date 2020/9/24 23:10
 */
public class Garage {
    private Door door = new Door();

    class Door {
        private boolean open;

        public void turnOn(){
            open = true;
            System.out.println("汽车门打开了！！！");
        }
    }

    public void doorTurnOn(){
        door.turnOn();
    }

}
