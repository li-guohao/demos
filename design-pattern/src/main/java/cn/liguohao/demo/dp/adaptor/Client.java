package cn.liguohao.demo.dp.adaptor;

/**
 * @Description TODO 适配器模式-客户端
 * @Author liguohao
 * @Date 2020/9/30 9:30
 */
public class Client {
    public static void main(String[] args) {
//        Target target = new Adaptor(new Adaptes() {
//            @Override
//            public void specificRequest() {
//                System.out.println("This is specific request method...");
//            }
//        });
        Target target = new Adaptor(()-> System.out.println("This is specific request method..."));

        target.request();
        //before...
        //This is specific request method...
        //after...
    }
}
