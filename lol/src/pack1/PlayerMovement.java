package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
    Timer movement;

    public PlayerMovement() {
        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Var.moveup == true) {
                    if (Var.y > 0) {
                        Var.y -= Var.movespeed;
                    }

                } else if (Var.movedown == true) {
                    if (Var.y < 1000) {
                        Var.y += Var.movespeed;
                    }
                }
                if (Var.moveleft == true) {
                    if (Var.x > 0) {
                        Var.x -= Var.movespeed;
                    }

                } else if (Var.moveright == true) {
                    if (Var.x < 1900) {
                        Var.x += Var.movespeed;
                    }
                }
            }

        }, 0, 10);
    }

}