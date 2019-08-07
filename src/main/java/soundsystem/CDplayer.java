package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDplayer {
    private CompacDisc cd;
    public CDplayer() {
        super();
        System.out.println("CDplayer的无参构造函数");
    }

    @Autowired
    public CDplayer(CompacDisc cd) {
        this.cd = cd;
        System.out.println("CDplayer的有参构造函数");
    }

    public void play(){
        cd.play();
    }
}
