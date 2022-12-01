
import model.Group;
import model.players;
import model.Team;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ArrayList<players> playerList = new ArrayList<players>();
        players p1 = new players("Mbappe", 12, 31, 10);
        players p2 = new players("Olivier", 10, 40, 9);
        players p3 = new players("Jules", 10, 36, 10);
        players p4 = new players("Messi", 10, 28, 9);
        players p5 = new players("De Paul", 10, 28, 9);
        players p6 = new players("Di Maria", 10, 28, 9);
        players p7 = new players("Neymar", 10, 28, 9);
        players p8 = new players("Thiago silva", 10, 28, 9);
        players p9 = new players("richarlison", 10, 28, 9);
        players p10 = new players("Son Heung-min", 10, 28, 9);
        players p11 = new players("Kim min jae", 10, 28, 9);
        players p12 = new players("lee kang in", 10, 28, 9);

        ArrayList<players> franceplayer = new ArrayList<>();
        franceplayer.add(p1);
        franceplayer.add(p2);
        franceplayer.add(p3);

        ArrayList<players> argentinaplayer = new ArrayList<>();
        argentinaplayer.add(p4);
        argentinaplayer.add(p5);
        argentinaplayer.add(p6);

        ArrayList<players> brazilplayer = new ArrayList<>();
        brazilplayer.add(p7);
        brazilplayer.add(p8);
        brazilplayer.add(p9);

        ArrayList<players> koreaplayer = new ArrayList<>();
        koreaplayer.add(p10);
        koreaplayer.add(p11);
        koreaplayer.add(p12);

        Team t1= new Team(franceplayer,"France","dark blue","third");
        Team t2= new Team(franceplayer,"argentina","light blue","third");
        Team t3= new Team(franceplayer,"brazil","yellow","third");
        Team t4= new Team(franceplayer,"korea","white","third");

    }

}
