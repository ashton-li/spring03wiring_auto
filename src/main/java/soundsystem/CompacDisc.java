package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class CompacDisc {
    public CompacDisc() {
        super();
        System.out.println("CompacDisc无参构造函数");
    }

    public void play(){
        System.out.println("正在播放音乐");
    }
}
